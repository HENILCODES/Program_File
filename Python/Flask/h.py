from flask import *
import mysql.connector
app = Flask(__name__)

conn = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="temp"
)

@app.route("/")
def s():
    cusr = conn.cursor()
    quer= "INSERT INTO temp (name) VALUES ('sss')"
    cusr.execute(quer)
    cusr.commit()
    cusr.close()
    return "Hello"

app.run(debug=True,host="localhost")