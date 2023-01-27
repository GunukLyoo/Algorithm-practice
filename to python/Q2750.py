import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    arr1 = list()

    for i in range(n):
        arr1.append(int(sys.stdin.readline()))

    for i in range(n):
        min = arr1[i]
        mini = i
        for j in range(i+1, n):
            if min > arr1[j]:
                min = arr1[j]
                mini = j

        x = arr1[i]
        arr1[i] = min
        arr1[mini] = x

    for i in range(n):
        print(arr1[i])
