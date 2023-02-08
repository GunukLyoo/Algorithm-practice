import sys

if __name__ == "__main__":

    m = int(sys.stdin.readline())
    arr = list()

    for i in range(m):
        arr.append(list(map(int, sys.stdin.readline().split())))

    arr1 = sorted(arr, key = lambda x : (x[1], x[0]))

    for i in range(m):
        print(arr1[i][0], end = ' ')
        print(arr1[i][1])
        

    
