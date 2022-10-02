from datetime import *
from tkinter import CURRENT
ti_for = datetime.now()

CURRENT_TiME = ti_for.strftime("%d") +"-"+ti_for.strftime("%b")+"-"+ti_for.strftime("%Y")+" "+ti_for.strftime("%I")+":"+ti_for.strftime("%M")+" "+ti_for.strftime("%p")
print(CURRENT_TiME)