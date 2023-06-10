def solution(keymap, targets):
    answer = []
    count = 0
    x = [0 for i in range(len(keymap))]
    print(x)
    
    for i in range(len(targets)):
        try:
            for j in range(len(targets[i])):
                for k in range(len(keymap)):
                    x[k] = keymap[k].index(targets[j])
                x = sorted(x)
                count += x[0]
            answer += count
            count = 0
        except ValueError:
            answer += -1
    
    return answer
