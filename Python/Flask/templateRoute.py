from flask import Flask , render_template
App = Flask(__name__)
@App.route("/")
def home():
    return "<h1>That is Home Page</h1>"

@App.route("/About")
def about():
    return render_template("About.html")

App.run(debug=True)