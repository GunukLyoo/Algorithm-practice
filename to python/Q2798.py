import sys

if __name__ == "__main__":

    arr = list(map(int, sys.stdin.readline().split()))
    arrn = list(map(int, sys.stdin.readline().split()))
    sum = 0
    minb = arr[1]

    for i in range(arr[0]):
        for j in range(i+1, arr[0]):
            for k in range(j+1, arr[0]):
                sum = sum = arrn[i] + arrn[j] + arrn[k]
                if sum <= arr[1] and arr[1] - sum < minb:
                    minb = arr[1] - sum
                    
    print(int(arr[1] - minb))
    
