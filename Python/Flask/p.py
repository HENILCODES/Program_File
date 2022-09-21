from flask import Flask
App = Flask(__name__)

@App.route("/")
def home():
    return "<h1>That is home</h1>"

@App.route("/Product")
def Product():
    return "<h1>That is Product</h1>"

@App.route("/User/<name>")
def User(name):
    return "<h1> Welcome back " + name + " ."
App.run(debug=True)