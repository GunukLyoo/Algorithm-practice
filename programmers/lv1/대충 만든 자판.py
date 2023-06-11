def solution(keymap, targets):
    answer = []
    count = 0
    x = [0 for i in range(len(keymap))]
    print(x)
    
    for i in range(len(targets)):
        try:
            for j in range(len(targets[i])):
                for k in range(len(keymap)):
                    #index 쓰니 안됨
                #x = sorted(x)
                #count += x[0]
            answer.append(count)
            count = 0
        except ValueError:
            answer.append(-1)
    
    return answer
