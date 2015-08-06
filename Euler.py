# Jonathan Monreal

def problem_1():
    multiples = set()
    
    for i in range(3, 1000, 3):
        multiples.add(i)
    
    for i in range(5, 1000, 5):
        multiples.add(i)
    
    print sum(multiples)
