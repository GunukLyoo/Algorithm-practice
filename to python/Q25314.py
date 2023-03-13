import sys

if __name__ == '__main__':
    n = int(sys.stdin.readline())

    for i in range(int(n/4)):
        print("long", end = ' ')

    print("int")
