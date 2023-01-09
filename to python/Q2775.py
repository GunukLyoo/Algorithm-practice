import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    sum = 0
    maxk = 0
    maxn = 0

    num = list()

    for i in range(n):
        a = list()
        a.append(int(sys.stdin.readline()))
        a.append(int(sys.stdin.readline()))
        num.append(a)
    

    maxk = num[0][0]
    maxn = num[0][1]

    for i in range(1,n):
        if maxk < num[i][0]:
            maxk = num[i][0]
        elif maxn < num[i][1]:
            maxn = num[i][1]

    table = list()

    for i in range(maxn+1):
        a = list()
        sum += 1
        a.append(sum)

    table.append(a)

    for i in range(maxk):
        a = list()
        for j in range(maxn):
            sum += table[i][j]
            a.append(sum)
        table.append(a)

    for i in range(n):
        print(table[num[i][0]][num[i][1] - 1])
