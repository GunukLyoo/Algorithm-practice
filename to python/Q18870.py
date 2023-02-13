import sys

if __name__ == "__main__":

    m = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))
    id = 0
    c = 0
    ind = 0

    arr1 = sorted(list(set(arr)))

    for i in range(len(arr1)):
        if arr.count(arr1[i]) > 1:
            while ind < len(arr):#arr.count(arr1[i]):
                arr[arr.index(arr1[i], ind)] = id
                print(id)
                ind = arr.index(arr1[i], ind)
        else:
            arr[arr.index(arr1[i])] = id
        id += 1
        ind = 0

    for i in range(m):
        print(arr[i], end = ' ')
