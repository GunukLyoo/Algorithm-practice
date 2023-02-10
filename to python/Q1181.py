import sys

if __name__ == "__main__":

    m = int(sys.stdin.readline())
    arr = list()
    c = 0

    for i in range(m):
        st = sys.stdin.readline()
        if arr.count(st) == 0:
            arr.append(st)
            c += 1

    arr1 = sorted(arr, key = lambda x : (len(x), x))

    for i in range(c):
        print(arr1[i], end = '')
        

    
