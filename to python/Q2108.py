import sys

if __name__ == "__main__":

    m = int(sys.stdin.readline())
    arr1 = list()
    dic = list()
    sum = 0

    for i in range(m):
        n = int(sys.stdin.readline())
        arr1.append(n)
        sum += n

    dic = [[i, arr1.count(i)] for i in set(arr1)]

    arr1.sort()

    dic.sort(key = lambda x: x[1],reverse = True)
    
    print(round(sum/m))
    print(arr1[int(m/2)])
    if len(dic) == 1 or dic[0][1] != dic[1][1]:
        print(dic[0][0])
    else:
        print(dic[1][0])
    print(arr1[m-1] - arr1[0])
