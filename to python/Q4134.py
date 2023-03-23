import sys
import math

def isprime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False

    return True
            

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    arr = list()

    for i in range(n):
        arr.append(int(sys.stdin.readline()))

    for i in range(n):
        num = arr[i]
        check = False
        while True:
            if num < 2:
                num = 2
            check = isprime(num)
            if check == False:
                num += 1
            else:
                break
        print(num)
