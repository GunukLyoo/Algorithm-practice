import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    num_list = list(map(int, sys.stdin.readline().split()))
    max = num_list[0];
    min = num_list[0];
    

    for i in range(1, n):
        if num_list[i] < min:
            min = num_list[i]
        elif num_list[i] > max:
            max = num_list[i]

    print(str(min) + ' ' + str(max))
    
    
        
