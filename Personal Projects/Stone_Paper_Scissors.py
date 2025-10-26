#Stone Paper Scissors Game in Python

import random
print(".............Welcome to the Stone Paper Scissors Game!...................")
options=["Stone","Paper","Scissors"]

attempts=int(input("Enter the number of rounds you want to play: "))
user_score=0
computer_score=0

while attempts>0:
    user_choice=input("Enter your choice (Stone/Paper/Scissors): ")
    comp_choice=random.choice(options)
    print(f"User chose: {user_choice}, Computer chose: {comp_choice}")
    if user_choice not in options:
        print("Invalid choice! Please choose Stone, Paper, or Scissors.")
        continue
    if user_choice==comp_choice:
        print("Both players chose the same option. It's a tie!")
    elif user_choice=="Stone":
        if comp_choice=="Scissors":
            print("Stone smashes scissors!, You Win")
            user_score+=1
        else:
            print("Paper covers stone!, Computer Wins")
            computer_score+=1
    elif user_choice=="Paper":
        if comp_choice=="Stone":
            print("Paper covers stone!, You Win")
            user_score+=1
        else:
            print("Scissors cut paper!, Computer Wins")
            computer_score+=1
    elif user_choice=="Scissors":
        if comp_choice=="Paper":
            print("Scissors cut paper!, You Win")
            user_score+=1
        else:
            print("Stone smashes scissors!, Computer Wins")
            computer_score+=1
    attempts-=1
    print(f"No of rounds left: {attempts}")

print(f"Final Scores - User: {user_score}, Computer: {computer_score}")
if user_score>computer_score:
    print("Congratulations! You are the overall winner!")
elif user_score<computer_score: 
    print("Computer wins overall! Better luck next time.")
else:
    print("It's an overall tie!")
    

        