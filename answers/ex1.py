# Calculate total cost of cinema tickets

total = 0 # starting value
num_tickets = int(input("How many tickets? "))
for i in range(num_tickets):
    price = float(input(f"Enter price for ticket {i+1}: RM"))
    total = total + price
    # total += price
# format for money 2 decimal point
print(f"Total cost: RM{total:.2f}") 