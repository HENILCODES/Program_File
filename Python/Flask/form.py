from flask import *
App = Flask(__name__)

@App.route("/login")
def login():
    return render_template("login.html")

@App.route("/log",methods=['post'])
def log():
    name = request.form['uname']
    passs = request.form['pass']
    return name + " | " + passs

App.run(debug=True)