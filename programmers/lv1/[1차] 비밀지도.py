def solution(n, arr1, arr2):
    answer = []
    barr1 = []
    barr2 = []
    bas = []
    b1 = 0
    b2 = 0
    li1 = ''
    li2 = ''
    
    for i in range(len(arr1)):
        b1 = arr1[i]
        b2 = arr2[i]
        li1 = ''
        li2 = ''
        for j in range(n):
            li1 += str((b1 % 2))
            li2 += str((b2 % 2))
            b1 //= 2
            b2 //= 2
        li1 = li1[::-1]
        li2 = li2[::-1]
        barr1.append(li1)
        barr2.append(li2)
    
    for i in range(len(arr1)):
        li1 = ''
        for j in range(n):
            if barr1[i][j] == '0' and barr2[i][j] == '0':
                li1 += '0'
            elif barr1[i][j] == '0' and barr2 [i][j] == '1':
                li1 += '1'
            elif barr1[i][j] == '1' and barr2 [i][j] == '0':
                li1 += '1'
            elif barr1[i][j] == '1' and barr2 [i][j] == '1':
                li1 += '1'
        bas.append(li1)
    
    for i in range(len(bas)):
        li1 = ''
        for j in range(n):
            if bas[i][j] == '1':
                li1 += '#'
            else:
                li1 += ' '
        answer.append(li1)
    
    return answer
