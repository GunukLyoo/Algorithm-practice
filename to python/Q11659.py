import sys

if __name__ == "__main__":
    arr = list(map(int, sys.stdin.readline().split()))
    arr1 = list(map(int, sys.stdin.readline().split()))
    total = 0
    sum = list()

    for i in range(len(arr1)):
        if i == 0:
            sum.append(arr1[i])
        else:
            sum.append(sum[i-1] + arr1[i])

    for i in range(arr[1]):
        arr2 = list(map(int, sys.stdin.readline().split()))

        if arr2[0] == 1:
            print(sum[arr2[1]-1])
        else:
            print(sum[arr2[1]-1] - sum[arr2[0]-2])
        
