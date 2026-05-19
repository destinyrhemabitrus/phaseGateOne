#Task 1
def sum(numberOne, numberTwo):
    return numberOne + numberTwo

print(sum(4,4))



#Task 2
def evenNumber(number):
    if(number%2 == 0):
        print("Number is even")
    else: print("Number is odd")

print(evenNumber(3))



#Task 3
def square(number):
    return number * number

print(square(4))




#Task 4
def fahrenheit(celcius):
    fahrenheit = (celcius * (9/5)) + 32
    return fahrenheit

print(fahrenheit(8))




#Task 6
def largest(numberOne, numberTwo, numberThree):
    largest = numberOne
    if(numberTwo > numberOne):
        largest = numberTwo
        print(f"Largest is {largest}")
    elif(numberThree > numberTwo):
        largest = numberThree
        print(f"Largest is {largest}")
    else: print(f"Largest is {largest}")

print(largest(87,23,400))




#Task 7
def simpleInterest(principal, rate, term):
    simple_interest = (principal * rate * term)/100
    return simple_interest

print(simpleInterest(10000,10,2))




#Task 8
def areaRectangle(length, width):
    area = length * width
    return area

print(areaRectangle(3,10))



#Task 9
def reverseNumber(number):
    extract = 0
    while(number != 0):
        remainder = number%10
        number = number//10
        extract = extract * 10 + remainder
    print(f"Reversal = {extract} ")
    
print(reverseNumber(567))
