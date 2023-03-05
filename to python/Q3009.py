import sys

if __name__ == "__main__":
    arr = list()
    x = 0
    y = 0
    for i in range(3):
        arr.append(list(sys.stdin.readline().split()))

    arr.sort()

    if arr[0][0] == arr[1][0]:
        x = arr[2][0]
    else:
        x = arr[0][0]

    print(x, end=' ')

    arr.sort(key=lambda x: (x[1], x[0]))

    if arr[0][1] == arr[1][1]:
        y = arr[2][1]
    else:
        y = arr[0][1]

    print(y)
    
