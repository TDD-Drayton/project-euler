#What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
import math

#returns least common multiple of a and  #helper function
def lcm(a,b):
    return a*b // math.gcd(a, b)

#Uses helper function to iteratively find the least common multiple of numbers 1 to 'n'
def smallest_multiple(n):
    result = 1
    for i in range(1, n+1):
        result = lcm(result, i)
    return result
#
