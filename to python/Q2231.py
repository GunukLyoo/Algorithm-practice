import sys

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    m = n - (len(str(n))*9)
    check = False

    while True:
        arr = list(map(int, str(m)))
        total = m
        for i in range(len(arr)):
            total += arr[i]

        if total == n:
            check = True
            break
        else:
            m += 1

    if check == True:
        print(m)
    else:
        print(0)
