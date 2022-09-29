from flask import *
App = Flask(__name__)
App.secret_key = "login"
@App.route("/")
def home():
    if not session.get("name"):
       return redirect("/login");
    return "<h1> Home <a href='/login'> Log in</a>  | <a href='/logout'> log out </a> </h1>"

@App.route("/login")
def login():
    return render_template("login.html")

@App.route("/signup")
def signup():
    return render_template("signup.html")

@App.route("/login/check", methods=['POST', 'GET'])
def checkLogin():
    if request.method == 'POST':
        name = request.form['U_name']
        password = request.form['U_password']
    if name == "Henil" and password =="123":
        session['name'] = name
        return "Login"
    return "Eroro s"


@App.route("/signup/check", methods=['POST', 'GET'])
def checkSignup():
    if request.method == 'POST':
        name = request.form['U_name']
        password = request.form['U_password']
        email = request.form['U_email']
    return "name {} , password {} , email {}".format(name, password, email)

@App.route("/logout")
def logout():
    session.pop("name","none")
    return redirect("/")
App.run(debug=True)