import sys

if __name__ == '__main__':
    n = int(sys.stdin.readline())

    c = 2

    while True:
        if c * 2 < n:
            c *= 2
        else:
            break

    if n <= 2:
        print(n)
    else:
        print((n-c)*2)
    
