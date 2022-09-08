import os as s
# s.mkdir("D");
s.mkfifo("D.html")
print(s.getcwd())
s.chdir('../')
print(s.getcwd())