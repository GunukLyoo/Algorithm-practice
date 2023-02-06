import sys

if __name__ == "__main__":

    arr = sys.stdin.readline()

    #arr.sort()

    arr = list(arr)

    arr.sort(reverse = True)

    for i in range(len(arr)):
        print(arr[i], end = '')
