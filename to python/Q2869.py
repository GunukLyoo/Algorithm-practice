import sys

if __name__ == "__main__":

    n = list(map(int, sys.stdin.readline().split()))
    c = 0
    ct = 0

    if (n[2] - n[1])%(n[0] - n[1]) == 0:
        ct = int((n[2] - n[1])/(n[0] - n[1]))
    else:
        ct = int((n[2] - n[1])/(n[0] - n[1])) + 1
    

    print(ct)
    
    
     
