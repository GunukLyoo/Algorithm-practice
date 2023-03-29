import sys

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    xy = list()

    for i in range(n):
        xy.append(list(map(int, sys.stdin.readline().split())))

    if n == 1:
        print(0)
    else:

        maxx = xy[0][0]
        maxy = xy[0][1]
        minx = xy[0][0]
        miny = xy[0][1]

        for i in range(n):
            if maxx < xy[i][0]:
                maxx = xy[i][0]

            if maxy < xy[i][1]:
                maxy = xy[i][1]

            if minx > xy[i][0]:
                minx = xy[i][0]

            if miny > xy[i][1]:
                miny = xy[i][1]
        
        print((maxx-minx) * (maxy - miny))
    
