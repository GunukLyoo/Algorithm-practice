import sys

if __name__ == "__main__":
    arr = list(map(int, sys.stdin.readline().split()))
    x = arr[2] - arr[0]
    y = arr[3] - arr[1]

    arr1 = list()
    arr1.append(arr[0])
    arr1.append(arr[1])
    arr1.append(x)
    arr1.append(y)

    arr1.sort()

    print(arr1[0])
