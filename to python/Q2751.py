import sys

if __name__ == "__main__":

    m = int(sys.stdin.readline())
    arr1 = list()
    sum = 0

    for i in range(m):
        n = int(sys.stdin.readline())
        arr1.append(n)
        sum += n

    for i in range(m):
        min = arr1[i]
        mini = i
        for j in range(i+1, m):
            if min > arr1[j]:
                min = arr1[j]
                mini = j

        x = arr1[i]
        arr1[i] = min
        arr1[mini] = x

    
    for i in range(m):
        print(arr1[i])
