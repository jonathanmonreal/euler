# Jonathan Monreal
# My practice problems from Project Euler in Python.

def problem_1():
    multiples = set()
    
    for i in range(3, 1000, 3):
        multiples.add(i)
    
    for i in range(5, 1000, 5):
        multiples.add(i)
    
    return sum(multiples)

def problem_2():
    total = 0
    current = 1
    previous = 1

    while current < 4000000:
        if current % 2 == 0:
            total += current
        temp = current
        current = current + previous
        previous = temp

    return total

def problem_4():
    largest = -1
    for i in range(100, 1000):
        for j in range(100, 1000):
            if i * j > largest and str(i * j) == str(i * j)[::-1]:
                largest = i * j
    return largest

def problem_5():
    n = 20
    not_found = True
    
    while not_found:
        n += 20
        not_found = False
        for i in range(1, 21):
            if float(n) / i % 1 != 0:
                not_found = True
                break

    return n

def problem_6():
    sum_of_squares = 0
    square_of_sum = 0

    for i in range(1, 101):
        sum_of_squares += i ** 2
        square_of_sum += i
    square_of_sum **= 2

    return square_of_sum - sum_of_squares
