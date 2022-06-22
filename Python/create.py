import sqlite3 as s
data=s.connect('henil.db')
print("database created")
data.execute('''create table detail
             (id int primary key,
              name text not null);''')
print("create table in henil.db")
data.close()
