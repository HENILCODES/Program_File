import pandas as pd
df=pd.DataFrame({"name":['henil','kevin','raj','raj','raj','raj'],
                "age":[19,28,22,23,55,22]
                })
d=pd.DataFrame([10,20,30,40,40,50,60,60,70])

print(d)
print("-------mean-----")
print(d.mean())
print("------------mode-----")
print(df.mode())
print("--------median-----")
print(d.median())
print("--------std------")
print(d.std())
print("--------var-------")
print(d.var())
