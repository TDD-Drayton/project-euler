n = 600851475143
x = 3 #why didn't I start with 2? Didn't work with two but three worked duh! Math is cool
while ( n > 1 ):
        if n % x == 0:
            n /= x
        else:
            x += 2
print(x)
