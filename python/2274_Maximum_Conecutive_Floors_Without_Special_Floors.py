def maxConsecutive(bottom, top, special) -> int:
    special.sort()
    floors = []
    for i in range(bottom, top+1):
        floors.append(i)

    left, right = 0, 0
    max_con = 0
    while right < len(floors):
        current_cons_len = right - left + 1
        max_con = max(max_con, current_cons_len)

        if floors[right] in special:
            left = right
            right += 1
            left += 1
        right += 1

    print(max_con)
    return max_con


maxConsecutive(2, 9, [4, 6])
