import sys
import math

if __name__ == '__main__':
    n = int(sys.stdin.readline())

    while n != -1:
        arr = list()
        sum = 0
        x = 0
        for i in range(1, int(math.sqrt(n))+1):
            if n % i == 0:
                arr.append(i)
                sum += i

        for i in range(len(arr)-1, 0, -1):
            x = int(n/arr[i])
            arr.append(x)
            sum += x

        if sum == n:
            print("{0} = {1}".format(n, arr[0]), end = '')
            for i in range(1, len(arr)):
                if i == len(arr)-1:
                    print(" + {0}".format(arr[i]))
                else:
                    print(" + {0}".format(arr[i]), end = '')
        else:
            print("{0} is NOT perfect.".format(n))

        del arr
        n = int(sys.stdin.readline())
            
                
