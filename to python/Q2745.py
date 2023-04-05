import sys

if __name__ == '__main__':
    n, b = map(str, sys.stdin.readline().split())
    total = 0
    dic = dict()
    num = 10

    for i in range(65, 91):
        dic[chr(i)] = num
        num += 1

    del num

    num = list(n)

    k = len(num)

    for i in range(len(num)):
        if num[i] <= "9" and "0" <= num[i]:
            nm = int(num[i])
        else:
            nm = int(dic[num[i]])
            
        for i in range(k-1):
            nm *= int(b)

        total += nm
        k -= 1

    print(total)
