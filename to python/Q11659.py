import sys

if __name__ == "__main__":
    arr = list(map(int, sys.stdin.readline().split()))
    arr1 = list(map(int, sys.stdin.readline().split()))

    for i in range(arr[1]):
        arr2 = list(map(int, sys.stdin.readline().split()))
        if arr2[0] == arr2[1]:
            print(arr1[arr2[0]-1])
        else:
            sum = 0
            for j in range(arr2[0]-1, arr2[1]):
                sum += arr1[j]
            print(sum)
