import sys

if __name__ == "__main__":

    arr = list(map(str, sys.stdin.readline().split()))

    x = ''
    y = ''

    for i in reversed(range(len(arr[0]))):
        x += arr[0][i]

    for i in reversed(range(len(arr[1]))):
        y += arr[1][i]

    if int(x) > int(y):
        print(x)
    else:
        print(y)

    
    
     
