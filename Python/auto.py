import random
import pyautogui as p
import time
val = ['How Are You Bro ?','I am Fine ','Hello','Hi','Welcome','What are you doing']
i = 1
while True:
    time.sleep(1)
    p.typewrite(val[random.randint(0,4)])
    time.sleep(1)
    p.press('enter')

