from flask import Flask , render_template
App = Flask(__name__)

@App.route("/")
def home():
    return "Hello User"

@App.route("/henil")
def henil():
    return "Welcome Henil"

@App.route("/1")
def guest():
    return "Welcome Guest !"

@App.route("/User/<name>")
def getName(name):
    return "Hello " +  name

@App.route("/Num/<float:num>")
def getNum(num):
    return "Number %f"%num

@App.route("/login")
def userLogin():
    return render_template("login.html")

@App.route("/age")
def name():
    return render_template("deli.html",age=19)

App.run(debug=True)