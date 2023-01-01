import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    x = 0
    k = 0

    while(x-1)*x/2 < n:
        x += 1

    x -= 1
    k = int(n - (x-1)*x/2)

    if x%2 == 0:
        print(str(k) + "/" + str(x-k+1))
    else:
        print(str(x-k+1) + "/" + str(k))
    
     
