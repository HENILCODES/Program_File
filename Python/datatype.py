def chartype():
    a=input("enter first name :")
    b=input("enter last  name :")
    print(a, " " , b)
chartype()

def floatype():
    a=float(input("entter :"))
    b=float(input("enter  :"))
    c=a+b
    print("add=",c)
floatype()

def inttype():
    a=int(input("enter number :"))
    b=int(input("enter number :"))
    c=a+b
    print("sum",c)
inttype()    

def classtype():
    a=1
    print(type(a))
    b=2.5
    print(type(b))
    c=5j
    print(type(c))
    d="henil"
    print(type(d))
classtype()    