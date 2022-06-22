import tkinter as tk
root = tk.Tk()
root.geometry("500x500")
root.title("Henil")
root.maxsize(700,700)
root.minsize(400,300)
name = tk.Label(text="Heloo",bg="red", font=35)
name.pack()
button = tk.Button(root,text='Stop',width=5,height=2,bg="green",font="35",activebackground="red")
button.pack()
root.mainloop()



