import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    c = 2

    while n != 1:
        if n%c == 0:
            n /= c
            print(c)
        else:
            c += 1
