from ast import Try
from multiprocessing.reduction import duplicate
from flask import *
from flask_mysqldb import *

App = Flask(__name__)

App.secret_key = "login"

App.config['MYSQL_HOST']="localhost"
App.config['MYSQL_USER']="root"
App.config['MYSQL_PASSWORD']=""
App.config['MYSQL_DB']="test"

mysql = MySQL(App)

@App.route("/")
def home():
    if not session.get("name"):
       return redirect("/login");
    return "<h1> Home <a href='/login'> Log in</a>  | <a href='/logout'> log out </a> </h1>"+session['name']

@App.route("/login")
def login():
    return render_template("login.html")

@App.route("/signup")
def signup():
    return render_template("signup.html")

@App.route("/login/check", methods=['POST', 'GET'])
def checkLogin():
    if request.method == 'POST':
        # name = request.form['U_name']
        # password = request.form['U_password']
        conn = mysql.connection.cursor()
        conn.execute("select * from user_detail")
        rv= conn.fetchall()
        conn.close()
    # if name == "Henil" and password =="123":
    #     session['name'] = name
    #     return "Login"
    return render_template("d.html",da=rv)


@App.route("/signup/check", methods=['POST', 'GET'])
def checkSignup():
    if request.method == 'POST':
        name = request.form['U_name']
        password = request.form['U_password']
        email = request.form['U_email']
        c = mysql.connection.cursor()
        try:
            c.execute("INSERT INTO user_detail (U_Name,U_Email,U_Password) VALUES(%s,%s,%s)",(name,email,password))
        except:
            return "duplicate"
        mysql.connection.commit()
        c.close()
    return redirect("/login")

@App.route("/logout")
def logout():
    session.pop("name","none")
    return redirect("/")
App.run(debug=True, host="localhost",port=5000)