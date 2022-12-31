import sys

if __name__ == "__main__":

    n = list(map(int,sys.stdin.readline().split()))

    
    if n[1] >= n[2]:
        print("-1")
    else:
        print(int(n[0]/(n[2]-n[1])+1))
    
    
    
     
