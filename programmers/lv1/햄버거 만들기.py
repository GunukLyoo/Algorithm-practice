def solution(ingredient):
    answer = 0
    rec = [1,2,3,1]
    i = 0
    while i < len(ingredient):
        if ingredient[i:i+4] == rec:
            answer += 1
            del ingredient[i:i+4]
            i -= 3
        else:
            i += 1
        
    return answer
