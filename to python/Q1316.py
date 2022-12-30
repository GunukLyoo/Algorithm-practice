import sys

if __name__ == "__main__":

    n = int(sys.stdin.readline())
    arr = list()
    ct = 0
    check = True
    end = list()

    for i in range(26):
        end.append(False)

    for i in range(n):
        arr.append(sys.stdin.readline())

        for j in range(1, len(arr[i]) - 1):
            if arr[i][j-1] == arr[i][j]:
                continue
            else:
                if end[ord(arr[i][j]) -  97] == True:
                    check = False
                    break
                elif end[ord(arr[i][j]) -  97] == False:
                    end[ord(arr[i][j-1]) -  97] = True

        if check == True:
            ct += 1
        else:
            check = True

        for i in range(26):
            end[i] = False

    print(ct)
    
    
     
