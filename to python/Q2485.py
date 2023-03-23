import sys

def maxprime(big, low):
    r = 0

    while low != 0:
        r = big % low
        big = low
        low = r

    return big
            

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    arr = list()

    for i in range(n):
        arr.append(int(sys.stdin.readline()))

    arr2 = list()

    for i in range(1,n):
        arr2.append(arr[i] - arr[i-1])

    arr2.sort()

    for i in range(1,len(arr2)):
        if i == 1:
            maxp = maxprime(arr2[i-1], arr2[i])
        else:
            maxp = maxprime(maxp, arr2[i])
    

    count = 0

    for i in range(len(arr2)):
        count += int(arr2[i] / maxp -1)

    print(count)
