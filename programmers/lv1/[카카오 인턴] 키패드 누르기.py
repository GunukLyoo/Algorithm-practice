def solution(numbers, hand):
    answer = ''
    l = '*'
    r = '#'
    ll = 0
    rl = 0
    x = 1
    nl = {i:x for i in range(1,10): x + 1 if i%3 == 0}
    for i in numbers:
        if str(i) in '147':
            answer += 'L'
            l = '147'['147'.index(str(i))]
        elif str(i) in '369':
            answer += 'R'
            r = '369'['369'.index(str(i))]
        elif str(i) in '2580':
            continue
        print('{0} {1}'.format(l, r))
        print(nl)
            
    return answer
