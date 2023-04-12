import sys

if __name__ == '__main__':
    n, m, v = map(int, sys.stdin.readline().split())
    li = list()

    for i in range(m):
        li.append(list(map(int, sys.stdin.readline().split())))

    dfs = sorted(li, key = lambda x: (x[0], v))

    bfs = sorted(li, key = lambda x: (x[1], v))

    print(dfs)
    print(bfs)

    
