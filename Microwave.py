'''
---------------------------------------
-- Created by:     Alireza Teimoori  --
-- Created on:     Feb 9 2019        --
-- Created for:    Unit 1-04         --
-- Course Code:    ICS4U             --
-- Teacher Name:   Chris Atkinson    --
---------------------------------------
This program calculates the amount of time that is required for certain types of foods
The code written in this program demonstrates the use of dictionaries (Map)
'''
# Intro Dictionaries:
foodDict = {
    'pizza' : 0.75,
    'sub' : 1,
    'soup' : 1.75
}
timeDict = {
    1 : 1,
    2 : 1.5,
    3 : 2
}

# Ask for and store values:
food = input("What food do you want?     (sub, pizza, soup) \n")
time = input("How many do you want?    (1, 2, 3) \n")

# Calculations:
answer = float(foodDict[str(food)]) * float(timeDict[int(time)])

# Output:
print("It will be ready in %a minute(s)" %answer)

# way easier that thousands of if statements :)
# it took a long time to learn how to use and debug it though :\