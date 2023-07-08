def solution(intStrs, k, s, l):
    answer = []
    n = 0
    for i in  intStrs:
        n = int(''.join(map(str, list(i[s:s+l]))))
        if n > k:
            answer.append(n)
    return answer
