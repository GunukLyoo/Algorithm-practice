import sys

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    total = 1

    for i in range(n):
        total *= 2

    print(total)
