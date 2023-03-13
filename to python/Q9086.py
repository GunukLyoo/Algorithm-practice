import sys

if __name__ == '__main__':
    n = int(sys.stdin.readline())

    for i in range(n):
        str1 = sys.stdin.readline()
        print(str1[0], end='')
        print(str1[len(str1)-2])
