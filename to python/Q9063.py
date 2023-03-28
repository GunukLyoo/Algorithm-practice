import sys

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    xy = list()

    for i in range(n):
        xy.append(list(map(int, sys.stdin.readline().split())))

    maxx = xy[0][0]
    maxy = xy[0][1]
    minx = xy[0][0]
    miny = xy[0][1]
    
    
