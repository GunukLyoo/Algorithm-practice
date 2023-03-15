import sys

if __name__ == '__main__':
    arr = list()
    n = int(sys.stdin.readline())

    for i in range(n):
        arr.append(list(map(int, sys.stdin.readline().split())))

    print(arr)
