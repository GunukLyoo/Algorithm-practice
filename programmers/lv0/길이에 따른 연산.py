import numpy as np

def solution(num_list):
    answer = 0
    if len(num_list) > 10:
        answer = sum(num_list)
    else:
        answer = int(np.prod(num_list))
    return answer
