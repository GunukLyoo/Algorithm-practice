import sys

if __name__ == '__main__':
    n, d, k, c = map(int, sys.stdin.readline().split())
    li = list()
    rp = k
    lp = 0

    for i in range(n):
        li.append(int(sys.stdin.readline()))

    check = list()

    li2 = li[0:k]
    li3 = li[0:k-1] + li[n-1:n]
    li2.append(c)
    check.append(len(set(li2)))
    li2.pop()
    rp += 1

    while lp + k != rp:
        if lp < 0 and -lp <k:
            lp = n-1
        

    for i in range(1, n):
        if i + k == n:
            rp = 0
        del li2[0]
        li2.append(li[rp-1])
        li2.append(c)
        check.append(len(set(li2)))
        li2.pop()
        rp += 1

    print(check)


    max = check[0]
    for i in range(1, len(check)):
        if max < check[i]:
            max = check[i]

    print(max)
