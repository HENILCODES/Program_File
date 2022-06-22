from tkinter import Scale
import pyqrcode
s ="hhtp"
url = pyqrcode.create(s)
url.svg("myqr.svg",Scale =8)