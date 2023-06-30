st = input()
s = ''

for i in st:
    if i.islower() == True:
        s += i.upper()
    elif i.isupper() == True:
        s += i.lower()
        
print(s)
