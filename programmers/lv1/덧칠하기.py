def solution(n, m, section):
    answer = 0
    

    for i in range(0, len(section), m):
        for j in range(i+1, i+1+m):
            if m >= section[j] - section[i]:
                answer += 1
                break

    return answer
