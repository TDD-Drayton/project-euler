container = []

for i in range(100, 999):
    for o in range(100, 999):
        num = i * o
        if str(num) == str(num)[::-1]:
            container.append(num)

print(max(container))
