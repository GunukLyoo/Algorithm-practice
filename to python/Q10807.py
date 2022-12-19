import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())

    n_list = list(map(int, sys.stdin.readline().split()))

    c = int(sys.stdin.readline())

    ct = 0
    
    for i in range(n):
       if n_list[i] == c:
           ct += 1

    print(ct)
     
