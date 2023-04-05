import sys

if __name__ == '__main__':
    n, m = map(int, sys.stdin.readline().split())
    dict = dict()
    li = list()
    

    for i in range(n):
        li.append(sys.stdin.readline().strip())

    stl = set(li)

    for i in stl:
        if len(i) >= m:
            dict[i] = 0

    for i in range(n):
        if len(li[i]) >= m:
            dict[li[i]] += 1

    sdt = sorted(dict.items(), key = lambda item: (-item[1], -len(item[0]), item[0]))

    for key in sdt:
        print(key[0])
            
        
                
