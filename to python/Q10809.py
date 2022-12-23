import sys

if __name__ == "__main__":

    arr = list(sys.stdin.readline())

    loc = list()

    for i in range(26):
        loc.append(-1)

    for i in range(len(arr)-1):
        if loc[ord(arr[i]) - 97] == -1:
               loc[ord(arr[i]) - 97] = i



    arr1 = ''

    for i in range(26):
        arr1 += (str(loc[i]) + " ")

    print(arr1)
    
     
