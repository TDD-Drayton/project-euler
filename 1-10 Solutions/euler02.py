# Objective the sum of the even-valued terms that do not exceed four million
first = [1,2]
print(first)
evenSUM = 2
while first[0] <= 4000000:
  z = sum(first)
  if z%2 == 0:
    evenSUM= evenSUM + z
  first[0] = first[1]
  first[1] = z
print(first)
print(evenSUM)
#Solved
