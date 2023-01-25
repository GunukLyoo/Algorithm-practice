import sys

if __name__ == "__main__":

    nm = list(map(int, sys.stdin.readline().split()))

    arr1 = list()

    arr2 = list()

    arr3 = list()

    for i in range(nm[0]):
        arr1.append(list(map(int, sys.stdin.readline().split())))

    for i in range(nm[0]):
        arr2.append(list(map(int, sys.stdin.readline().split())))

    for i in range(nm[0]):
        arr = list()
        for j in range(nm[1]):
            arr.append(arr1[i][j] + arr2[i][j])

        arr3.append(arr)

    for i in range(nm[0]):
        for j in range(nm[1]):
            print(arr3[i][j], end = ' ')
        print()
    
            
