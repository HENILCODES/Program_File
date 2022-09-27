from flask import *
App = Flask(__name__)


@App.route("/")
def home():
    return "<h1> Home <a href='/login'> Log in</a> </h1>"


@App.route("/login")
def login():
    return render_template("login.html")


@App.route("/signup")
def signup():
    return render_template("signup.html")


@App.route("/login/check", methods=['POST', 'GET'])
def checkLogin():
    if request.method == 'GET':
        name = request.args.get['U_name']
        password = request.args.get['U_password']
        return "Login via the login Form"

    if request.method == 'POST':
        name = request.form['U_name']
        password = request.form['U_password']
    return "name {} , password {}".format(name, password)


@App.route("/signup/check", methods=['POST', 'GET'])
def checkSignup():
    if request.method == 'GET':
        name = request.args.get['U_name']
        password = request.args.get['U_password']
        email = request.args.get['U_email']
        return "Login via the login Form"

    if request.method == 'POST':
        name = request.form['U_name']
        password = request.form['U_password']
        email = request.form['U_email']
    return "name {} , password {} , email {}".format(name, password, email)


App.run(debug=True)
