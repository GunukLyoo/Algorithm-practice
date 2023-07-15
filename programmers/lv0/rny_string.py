def solution(rny_string):
    li = ['rn' if i == 'm' else i for i in rny_string]
    answer = ''.join(map(str, li))
    return answer
