n = 600851475143
x = 3 
while ( n > 1 ):
        if n % x == 0:
            n /= x
        else:
            x += 2
print(x)
