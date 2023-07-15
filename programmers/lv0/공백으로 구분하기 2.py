def solution(my_string):
    answer = my_string.strip().split(" ")
    answer = list(filter(None, answer))
    return answer
