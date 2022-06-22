import pyautogui as p
import time
i =1
while True:
    time.sleep(0)
    i +=1
    p.typewrite("Hello")
    print(i)
    time.sleep(0)
    p.press('enter')
