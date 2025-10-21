# Max without max()

#Simple version: only value
highest = 0

mark1 = int(input("Please input mark 1: "))
mark2 = int(input("Please input mark 2: "))
mark3 = int(input("Please input mark 3: "))

if (mark1 > highest): highest = mark1
if (mark2 > highest): highest = mark2
if (mark3 > highest): highest = mark3

print(f"Highest mark is: {highest}")


# Extended version: also says which one
# Method 1: Manual comparison (good for learning logic)
mark1 = float(input("Enter mark 1: "))
highest = mark1
highest_position = 1

mark2 = float(input("Enter mark 2: "))
if mark2 > highest:
    highest = mark2
    highest_position = 2

mark3 = float(input("Enter mark 3: "))
if mark3 > highest:
    highest = mark3
    highest_position = 3

mark4 = float(input("Enter mark 4: "))
if mark4 > highest:
    highest = mark4
    highest_position = 4

mark5 = float(input("Enter mark 5: "))
if mark5 > highest:
    highest = mark5
    highest_position = 5

print(f"Highest mark is: {highest}")
print(f"This was mark number: {highest_position}")
