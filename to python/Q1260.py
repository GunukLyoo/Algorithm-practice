import sys

if __name__ == '__main__':
    n, m, v = map(int, sys.stdin.readline().split())
    li = list()

    for i in range(m):
        li.append(list(map(int, sys.stdin.readline().split())))

    dfs = sorted(li, key = lambda x: x[0])

    bfs = sorted(li, key = lambda x: x[1])

    print(dfs)
    print(bfs)

    ct = m
    p = 0

    for i in range(n):
        if dfs[i][0] == v:
            p = i
    
