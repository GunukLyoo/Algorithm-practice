def solution(a, b, n):
    answer = 0
    left = 0
    
    while n + left >= a:
        n += left
        left = n % a
        n = (n // a) * b
        answer += n
        print("{0} {1} {2} {3}".format(n, left, answer, n + left))
    
        
    return answer
