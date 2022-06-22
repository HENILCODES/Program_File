import matplotlib.pyplot as plt
x = [2017, 2018, 2019, 2020, 2021]
y = [ 150000, 350000, 600000, 500000, 800000]
plt.bar(x,y)
plt.xlabel("Year ")
plt.ylabel("total student in college ")
plt.title("r.k. desai college student detail")
plt.bar(x,y, color='skyblue')
plt.show()	
