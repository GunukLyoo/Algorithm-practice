import sys

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    li = list()

    for i in range(n):
        li.append(sys.stdin.readline().strip())

    check = list()
    count = 0

    for i in range(n):
        if li[i] == "ENTER":
            li1 = list()
        else:
            li1.append(li[i])

    print(count)
                
