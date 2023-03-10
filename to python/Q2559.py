import sys

if __name__ == "__main__":
    arr = list(map(int, sys.stdin.readline().split()))
    arr1 = list(map(int, sys.stdin.readline().split()))
    total = 0
    l = 0
    r = arr[1]-1
    sum = list()

    for i in range(arr[1]):
        total += arr1[i]

    sum.append(total)

    while r < len(arr1)-1:
        total -= arr1[l]
        l += 1
        r += 1
        total += arr1[r]
        sum.append(total)

    max = sum[0]

    for i in range(1, len(sum)):
        if max < sum[i]:
            max = sum[i]

    print(max)
        
