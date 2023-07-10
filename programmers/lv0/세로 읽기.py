def solution(my_string, m, c):
    answer = ''
    li = [my_string[i:i+m] for i in range(0,len(my_string),m)]
    for i in range(len(li)):
        answer += li[i][c-1]
    return answer
