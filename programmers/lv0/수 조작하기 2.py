def solution(numLog):
    answer = ''
    n = 0
    for i in range(1, len(numLog)):
        n = numLog[i] - numLog[i-1]
        if n == 1:
            answer += 'w'
        elif n == -1:
            answer += 's'
        elif n == 10:
            answer += 'd'
        elif n == -10:
            answer += 'a'
    return answer
