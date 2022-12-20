import sys

if __name__ == "__main__":

    n_list = list()

    for i in range(28):
        n_list.append(int(sys.stdin.readline()))
    
    for i in range(1,31):
        if i not in n_list:
            print(i)
           
     
