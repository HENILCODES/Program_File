import numpy as np
import pandas as pl
df=pl.DataFrame({
'name':['Henil','Sivam','Raj'],
'age':[19,20,22]})
salary=np.array([86000,75000,65000])
df['salary']=salary.tolist()
print (df)