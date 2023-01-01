import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    c = 0

    if n == 1:
        c = 1
    else:
        while 3*c*c-3*c+2 <= n:
            c += 1

    print(c)
    
     
