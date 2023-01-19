import sys
import math

def prime(x):
    for i in range(2, int(math.sqrt(x)+1)):
        if x % i == 0:
            return False
    return True

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    c = 2
    max = n

    while n != 1:
        if n%c == 0:
            n /= c
            print(c)
        else:
            c += 1
            if prime(c) == False:
                while prime(c) == False:
                    c += 1
