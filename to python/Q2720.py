import sys            

if __name__ == '__main__':
    n = int(sys.stdin.readline())

    for i in range(n):
        total = int(sys.stdin.readline())

        qc = int(total / 25)
        dc = int((total % 25) / 10)
        nc = int(((total % 25) % 10) / 5)
        pc = int(((total % 25) % 10) % 5)

        print("{0} {1} {2} {3}".format(qc, dc, nc, pc))
