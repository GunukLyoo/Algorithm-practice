import sys

if __name__ == "__main__":

    m = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))
    id = 0

    arr1 = sorted(list(set(arr)))

    for i in range(len(arr1)):
        for j in range(m):
            if arr1[i] == arr[j]:
                arr[j] = id
        id += 1

    for i in range(m):
        print(arr[i], end = ' ')
