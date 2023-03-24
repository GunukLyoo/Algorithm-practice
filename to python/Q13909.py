import sys
import math

def isprime(n):
    if n == 0:
        return False
    elif n == 1:
        return False
    elif n == 2:
        return True
    else:
        for i in range(2, int(math.sqrt(n)) + 1):
            if n % i == 0:
                return False

        return True
            

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    wd = [0 for i in range(n)]
