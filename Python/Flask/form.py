from crypt import methods
from urllib import request
from flask import Flask, render_template
App = Flask(__name__)
@App.route("/")
def home():
    return render_template("home.html")

@App.route("/login")
def login():
    return render_template("login.html")

@App.route("/log",methods=['post'])
def log():
    name = request.form['uname']
    passs = request.form['pass']
    return name + "D " + passs

App.run(debug=True)