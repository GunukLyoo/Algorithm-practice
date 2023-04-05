import sys

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    li = list()

    for i in range(n):
        li.append(sys.stdin.readline().strip())

    check = list()
    count = 0

    li1 = list()
    li2 = list()

    for i in range(1,n):
        if li[i] == "ENTER":
            setl = set(li1)
            del li1
            li1 = list(setl)
            li2.append(li1)
            del li1
            li1 = list()
        else:
            li1.append(li[i])

    setl = set(li1)
    del li1
    li1 = list(setl)
    li2.append(li1)

    for i in range(len(li2)):
        count += len(li2[i])

    print(count)
                
