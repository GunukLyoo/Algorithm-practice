import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())

    for i in range(n):
        arr = list(map(str, sys.stdin.readline().split()))
        ct = int(arr[0])
        arr1 = arr[1]

        arr2 = ''

        for j in range(len(arr1)):
            for k in range(ct):
                arr2 += arr1[j]

        print(arr2)
    
     
