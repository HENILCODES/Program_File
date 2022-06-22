import sqlite3 as s
con=s.connect('henil.db')
ss=con.execute(" select * from hh")
for st in ss:
    print("sid  name")
    print(st[0],st[1])
con.commit()
con.close()
