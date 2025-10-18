
#18-10-2025
#Program to calculate rent amount to be paid per person
def calculate_rent(total_rent, total_electric_units, num_people):
    charge_per_unit=30
    Amount_per_person = (total_rent + (total_electric_units * charge_per_unit)) // num_people
    return Amount_per_person

input("Welcome to Rent Calculator! Press Enter to continue...")
total_rent = int(input("Enter the total rent amount: "))
total_electric_units = int(input("Enter the total electric units consumed: "))
num_people = int(input("Enter the number of people sharing the rent: "))
amount_per_person = calculate_rent(total_rent, total_electric_units, num_people)
print("Amount per person:", amount_per_person)
    