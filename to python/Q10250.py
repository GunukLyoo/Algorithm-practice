import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())

    for i in range(n):
        num = list(map(int, sys.stdin.readline().split()))
        x = 0
        y = 0
        n = 0

        if num[2]%num[0] == 0:
            y = int(num[0])
            x = int(num[2]/num[0])
        else:
            y = int(num[2]%num[0])
            x = int(num[2]/num[0] + 1)

        if x < 10:
            print(str(y) + "0" + str(x))
        else:
            print(str(y) + str(x))
