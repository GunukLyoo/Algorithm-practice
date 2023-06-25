def solution(nums):
    answer = 0
    c = 1
    x = len(nums)//2
    nums.sort()
    for i in range(1, len(nums)):
        if nums[i-1] != nums[i]:
            c += 1

    if x > c:
        answer = c
    else:
        answer = x
    return answer
