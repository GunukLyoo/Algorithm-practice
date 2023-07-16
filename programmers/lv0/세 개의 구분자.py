def solution(myStr):
    answer = []
    answer = myStr.replace('a', 'c').replace('b', 'c').split('c')
    answer = list(filter(None, answer))
    if len(answer) == 0:
        answer.append("EMPTY")
    return answer
