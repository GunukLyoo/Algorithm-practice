def solution(num_list):
    answer = num_list.copy()
    l = len(answer)
    if answer[l-2] < answer[l-1]:
        answer.append(answer[l-1] - answer[l-2])
    else:
        answer.append(answer[l-1] * 2)
    return answer
