import sys

def maxprime(big, low):
    r = 0

    while low != 0:
        r = big % low
        big = low
        low = r

    return big
            

if __name__ == '__main__':
    x1, y1 = map(int, sys.stdin.readline().split())
    x2, y2 = map(int, sys.stdin.readline().split())
    maxp = 0
    
    if y1 > y2:
        maxp = maxprime(y1,y2)
    else:
        maxp = maxprime(y2,y1)

    y = int(y1 * y2 / maxp)

    x1 *= y/y1
    x2 *= y/y2

    x = int(x1 + x2)

    if x > y:
        maxp = maxprime(x,y)
    else:
        maxp = maxprime(y,x)

    print("{0} {1}".format(int(x/maxp), int(y/maxp)))
