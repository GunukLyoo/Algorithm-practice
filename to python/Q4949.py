import sys            

if __name__ == '__main__':

    while True:
        arr = sys.stdin.readline().strip()
        arr1 = list()
        if arr[0] == '.':
            break

        for i in range(len(arr)):
            if arr[i] == '(' or arr[i] == ')' or arr[i] == '[' or arr[i] == ']':
                arr1.append(arr[i])

        '''for i in range(len(arr1)-1):
            if arr1[i] == '(' and arr1b[i] == True and arr1[i+1] == ')' and arr1b[i+1] == True:
                arr2.append(arr1[i])
                arr1b[i] = False
                arr2.append(arr1[i+1])
                arr1b[i+1] = False
                i -= 1
            elif arr1[i] == '[' and arr1[i+1] == ']':
                arr2.append(arr1[i])
                arr2.append(arr1[i+1])
                i -= 1
'''
        i = 0
        n = len(arr1)
        while i < n:
            if n < 2:
                break
           
            if arr1[i] == '[' and arr1[i+1] == ']':
                del arr1[i+1]
                del arr1[i]
                i -= 1
                n -= 2
            elif arr1[i] == '(' and arr1[i+1] == ')':
                del arr1[i+1]
                del arr1[i]
                i -= 1
                n -= 2
            else:
                i += 1
        print(arr1)
        if len(arr1) == 0:
            print("yes")
        else:
            print("no")

        del arr1
        del arr
