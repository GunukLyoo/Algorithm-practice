def solution(numbers, hand):
    answer = ''
    l = '*'
    r = '#'
    ll = 0
    rl = 0
    nl = {str(i+1):i//3 for i in range(9)}
    nl['*'] = 3
    nl['0'] = 3
    nl['#'] = 3
    for i in numbers:
        if str(i) in '147':
            answer += 'L'
            l = '147'['147'.index(str(i))]
        elif str(i) in '369':
            answer += 'R'
            r = '369'['369'.index(str(i))]
        elif str(i) in '2580':
            ll = abs(nl[l] - nl[str(i)]) + 1
            rl = abs(nl[r] - nl[str(i)]) + 1
            if l in '2580':
                ll -= 1
            if r in '2580':
                rl -= 1
            if ll < rl:
                answer += 'L'
                l = '2580'['2580'.index(str(i))]
            elif ll > rl:
                answer += 'R'
                r = '2580'['2580'.index(str(i))]
            else:
                if hand == 'right':
                    answer += 'R'
                    r = '2580'['2580'.index(str(i))]
                elif hand == 'left':
                    answer += 'L'
                    l = '2580'['2580'.index(str(i))]
            
    return answer
