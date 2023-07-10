def solution(q, r, code):
    answer = ''
    li = [code[i] for i in range(len(code)) if i % q == r]
    for i in li:
        answer += i
    return answer
