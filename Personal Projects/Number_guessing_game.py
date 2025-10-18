#Random number guessing game
import random as rnd
print(".............Welcome to the Number Guessing Game!...................")
guess_no=rnd.randint(1,10)
print("Enter the number of attempts:")
attempts=int(input())

while attempts>0:
    print("Guessa number between 1 and 10: ")
    guess=int(input())
    if guess<guess_no:
        print("Your guess is too low")
    elif guess>guess_no:
        print("Your guess is too high")
    else:
        print("Congratulations! You guessed it right.")
        break
    attempts-=1

if attempts==0:
    print("Sorry, you've used all your attempts. The correct number was", guess_no)



