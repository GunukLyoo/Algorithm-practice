import sys

if __name__ == '__main__':
    n, d, k, c = map(int, sys.stdin.readline().split())
    li = list()
    lp = 0
    rp = k

    for i in range(n):
        li.append(int(sys.stdin.readline()))

    for i in range(k-1):
        li.append(li[i])

    check = list()

    for i in range(k):
        li2 = list()
        li2.append(li[i])
    li2.append(c)
    check.append(len(set(li2)))

    for i in range(1, n):
        del li2[0]
        li2.append(li2[rp])

        li2.append(c)
        check.append(len(set(li2)))
        del li2


    max = check[0]
    for i in range(1, len(check)):
        if max < check[i]:
            max = check[i]

    print(max)
