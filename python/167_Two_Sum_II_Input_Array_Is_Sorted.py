
def twoSum(numbers, target):
    left, right = 0, len(numbers) - 1
    while left < right:
        curr_val = numbers[right] + numbers[left]

        if curr_val == target:
            return [left, right]

        if curr_val > target:
            right -= 1

        else:
            left += 1

    return []


print(twoSum([2, 7, 11, 15], 9))
