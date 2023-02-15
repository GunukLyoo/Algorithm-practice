import sys

if __name__ == "__main__":

    m = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))
    id = 0

    arr1 = sorted(list(set(arr)))

    for i in range(len(arr1)):
        c = arr.count(arr1[i])
        ind = 0
        n = 0
        if c > 1:
            while c != 0:
                n = arr.index(arr1[i], ind)
                arr[n] = id
                ind = n + 1
                c -= 1
        else:
            arr[arr.index(arr1[i])] = id
        id += 1

    for i in range(m):
        print(arr[i], end = ' ')
