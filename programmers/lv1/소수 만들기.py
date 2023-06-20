import math

def solution(nums):
    answer = -1
    n1 = 0
    n2 = 0
    c = 0
    prime = [True for i in range(1001)]
    
    prime[0] = False
    prime[1] = False
    
    for i in range(2, int(math.sqrt(1000)) + 1):
        if prime[i] == True:
            j = 2
            while i*j <= 1000:
                prime[i*j] = False
                j += 1
    
    for i in range(len(nums) - 2):
        n1 = nums[i]
        for j in range(i+1, len(nums) - 1):
            n2 = n1 + nums[j]
            for k in range(j+1, len(nums)):
                if prime[n2 + nums[k]] == True:
                    c += 1
                
    answer = c

    return answer
