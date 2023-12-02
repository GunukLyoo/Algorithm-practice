def solution(A,B):
    answer = 0

    As = sorted(A)
    Bs = sorted(B, reverse = True)
    
    for i in range(0, len(A)):
        answer += As[i] * Bs[i]

    return answer
