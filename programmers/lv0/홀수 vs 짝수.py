def solution(num_list):
    answer = 0
    li = [0, 0]
    for i in range(len(num_list)):
        if (i + 1) % 2 == 0:
            li[0] += num_list[i]
        elif (i + 1) % 2 == 1:
            li[1] += num_list[i]
    answer = max(li)
    return answer
