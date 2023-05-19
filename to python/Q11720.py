import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())

    num = list(map(int, sys.stdin.readline().strip()))

    sum = sum(num)

    print(sum)
     
