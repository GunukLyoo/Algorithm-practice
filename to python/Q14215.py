import sys

if __name__ == '__main__':
    l = list(map(int, sys.stdin.readline().split()))
    total = 0

    l.sort()

    if l[2] >= l[0] +l[1]:
        total = (l[0] + l[1]) * 2 - 1
    else:
        total = l[0] + l[1] + l[2]

    print(total)
