import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    
    for i in range(n):
        arr = list(map(int, sys.stdin.readline().split()))
        m = arr[0]
        sc = 0
        for j in range(1, m+1):
            sc += arr[j]
        avg = sc / m
        sc = 0
        for j in range(1, m+1):
            if arr[j] > avg:
                sc += 1
        avg = format(round(sc/m*100, 3)        , '.3f')

        print(str(avg) + "%")
     
