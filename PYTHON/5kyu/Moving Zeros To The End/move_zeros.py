def move_zeros(lst):
    non_zero_index = 0

    for num in lst:
        if num != 0:
            lst[non_zero_index] = num
            non_zero_index += 1

    for i in range(non_zero_index, len(lst)):
        lst[i] = 0

    return lst