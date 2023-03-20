import sys

def maxprime(big, low):
    r = 0

    while low != 0:
        r = big % low
        big = low
        low = r

    return big
            

if __name__ == '__main__':
    a, b = map(int, sys.stdin.readline().split())
    maxp = 0
    
    if a > b:
        maxp = maxprime(a,b)
    else:
        maxp = maxprime(b,a)

    minm = a * b / maxp

    print(int(minm))
