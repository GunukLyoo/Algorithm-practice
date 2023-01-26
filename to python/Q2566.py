import sys

if __name__ == "__main__":


    arr1 = list()

    for i in range(9):
        arr1.append(list(map(int, sys.stdin.readline().split())))

    max = 0
    maxi = 0
    maxj = 0

    for i in range(9):
        for j in range(9):
            if arr1[i][j] > max:
                max = arr1[i][j]
                maxi = i
                maxj = j

    print(max)
    print(str(maxi+1) + " " + str(maxj+1))
            
