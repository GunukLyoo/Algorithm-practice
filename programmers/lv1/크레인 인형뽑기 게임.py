def solution(board, moves):
    answer = 0
    b = [[x for x in i if x != 0] for i in board]
    li = []
    x = 0
    for i in moves:
        if len(b[i-1]) > 0:
            x = b[i-1].pop()
            if x != 0:
                if len(li) > 0 and x == li[len(li)-1]:
                    li.pop()
                    answer += 2
                else:
                    li.append(x)
    
    print(b)
    
    
    return answer
