sum = 0
for i in range(999):
  if i % 3 == 0 or i % 5 == 0:
    sum += i
print('ex1: ', sum)

a = 1
b = 2
next = 3
sum = 2
while next <= 4000000:
  next = a + b
  a = b
  b = next
  if next % 2 == 0:
    sum += next
print('ex2: ', sum)
