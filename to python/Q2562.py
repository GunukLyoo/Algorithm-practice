import sys

if __name__ == "__main__":

    num_list = []

    for i in range(0, 9):
        num_list.append(int(sys.stdin.readline()))

    max = num_list[0]
    maxi = 1

    for i in range(1, 9):
        if num_list[i] > max:
            max = num_list[i]
            maxi = i + 1

    print(max)
    print(maxi)
    
    
        
