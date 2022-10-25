from flask import *
import mysql.connector
app = Flask(__name__)

conn = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="test"
)

@app.route("/")
def s():
    cusr = conn.cursor()
    quer= "INSERT INTO temp(name) VALUES (%s)"
    a=("Henil")
    cusr.execute(quer,"a")
    cusr.commit()
    cusr.close()
    return "Hello"

app.run(debug=True,host="localhost")