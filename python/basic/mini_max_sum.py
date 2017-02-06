#!/bin/python

import sys


a,b,c,d,e = raw_input().strip().split(' ')
a,b,c,d,e = [int(a), int(b), int(c), int(d), int(e)]


current_total = 0
min_total = 0
max_total = 0
arr = [a, b, c, d, e]
temp_arr = []
i = 0

is_first_loop = True

for e in range(len(arr)):
    temp_arr = list(arr)
    del temp_arr[i]

    i += 1
    for e in temp_arr:
        current_total += e

    if not is_first_loop:
        if current_total > max_total:
            max_total = current_total
        if current_total < min_total:
            min_total = current_total
    else:
        min_total = current_total
        max_total = current_total
        is_first_loop = False

    current_total = 0

print str(min_total) + " " + str(max_total)

