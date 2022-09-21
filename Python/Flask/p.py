from flask import Flask , render_template
app = Flask(__name__)
@app.route('/')
def fy():
    return "<h1> hi</h1>"

@app.route('/<name>/<int:s>')
def ty(name,s):
    return render_template('a.html', n = name , ss = s)
    
app.run(debug=True)