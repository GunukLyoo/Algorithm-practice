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
    arr = list()

    for i in range(n):
        arr.append(int(sys.stdin.readline()))

    for i in range(n):
        num = arr[i]
        count = 0
        for j in range(2, int(num/2)+1):
            if isprime(j) == True and isprime(num-j) == True:
                print("{0} {1}".format(j, int(num-j)))
                count += 1

        print(count)
