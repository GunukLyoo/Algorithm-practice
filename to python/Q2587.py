import sys

if __name__ == "__main__":

    arr1 = list()
    sum = 0

    for i in range(5):
        n = int(sys.stdin.readline())
        arr1.append(n)
        sum += n

    for i in range(5):
        min = arr1[i]
        mini = i
        for j in range(i+1, 5):
            if min > arr1[j]:
                min = arr1[j]
                mini = j

        x = arr1[i]
        arr1[i] = min
        arr1[mini] = x

    print(int(sum/5))
    print(arr1[2])
