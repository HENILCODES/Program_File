from flask import *
App = Flask(__name__)

@App.route("/")
def home():
    return render_template("main.html")

@App.route("/g")
def hp():
    leng = request.args.get('lan')
    return "tn {}".format(leng)
App.run(debug=True)