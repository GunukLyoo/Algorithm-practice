def solution(array, commands):
    answer = []
    li = []
    
    for i in range(len(commands)):
        li = array.copy()
        li = li[commands[i][0]-1:commands[i][1]]
        li.sort()
        answer.append(li[commands[i][2]-1])
        
    return answer
