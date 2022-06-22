import imp


import pyqrcode
h = "https://henilcodes.github.io/PH/"
url = pyqrcode.create(h)
url.svg("m.svg",scale=8)