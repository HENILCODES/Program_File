from ast import Num
from flask import Flask , render_template
App = Flask(__name__)

@App.route("/")
def home():
    return "<h1>That is home</h1>"

@App.route("/C")
def Product():
    Num = {'php':70,'java':55,'Python':60}
    return render_template("delimeter.html",n=Num)

@App.route("/User/<name>")
def User(name):
    return "<h1> Welcome back " + name + " ."
App.run(debug=True)