def solution(participant, completion):
    answer = ''
    participant.sort()
    completion.sort()
    cp = 0
    cc = 0
    
    while cc < len(completion):
        if participant[cp] == completion[cc]:
            cp += 1
            cc += 1
        elif participant[cp] != completion[cc]:
            answer = participant[cp]
            break
            
    if answer == '':
        answer = participant[cp]
    
    return answer
