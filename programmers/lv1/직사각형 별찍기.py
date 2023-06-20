a, b = map(int, input().strip().split(' '))
li = ''

for i in range(b):
    li = ''
    for j in range(a):
        li += '*'
    print(li)
        
