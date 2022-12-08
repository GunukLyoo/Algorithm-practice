import sys

if __name__ == "__main__":

    n, x = map(int, sys.stdin.readline().split())
    num_list = list(map(int, sys.stdin.readline().split()))
    pr_str = ''

    for i in range(n):
        if(num_list[i]<x):
            pr_str += str(num_list[i]) + ' '

    print(pr_str)
    
    
        
