import sys
from bisect import bisect_left, bisect_right
    
if __name__ == "__main__":
    arr = list(sys.stdin.readline())
    n = int(sys.stdin.readline())
    c = 0

    for i in range(n):
        arr2 = list(sys.stdin.readline().split())
        c = 0
        arr3 = arr[int(arr2[1]):int(arr2[2])+1]
        arr3.sort()
        l = bisect_left(arr3, arr2[0])
        r = bisect_right(arr3, arr2[0])
        if arr3[l] != arr2[0]:
            print('0')
        else:
            print(r-l)
      
