'''result = int (input())
tax= float(result*0.4)
emergency_fund= float((result-tax)*0.10)
print("Tax: "+"{:.2f}".format(tax))
print("Emergency Fund: "+"{:.2f}".format(emergency_fund))
print("Accommodation: "+"{:.2f}".format(result-(tax+)))


result= (24.95-(float(result*0.4)))*int(input("number of books:"))
'''

'''number_of_books= int(input("number of books:"))
result=(24.95-(float(24.95*0.4)))*number_of_books
shipping=float(3+(max(0, (number_of_books-1))*0.75))
print(result+shipping)
'''


'''import math
velocity = float(input())
degree = float(input())
time = float(input())
g = 9.81
x = round((velocity*(math.cos(degree))*time) )
y = round((velocity*(math.sin(degree))*time) - ((0.5*g)*(time*2)))
x = int(x)
y = int(y)
print(x,y)'''


'''human_Age = int(input())
dog_Age =0

if human_Age >= 10.5 and human_Age <= 21:
    dog_Age = int(human_Age/10.5)
elif human_Age > 21:
    dog_Age = 2 + int((human_Age - 21)/4)
print(dog_Age)

if dog_Age > 2:
  print("Human age: ",(((dog_Age-2) * 4)+21),"and in \nDog Age:" ,dog_Age)
elif not dog_Age ==0 :
  print(dog_Age)
else:
  print("Dog is still a baby")'''

'''year = int(input())

if year % 12 == 0:
    animal = "Monkey"
elif year % 12 == 1:
    animal = "Rooster"
elif year % 12 == 2:
    animal = "Dog"
elif year % 12 == 3:
    animal = "Pig"
elif year % 12 == 4:
    animal = "Rat"
elif year % 12 == 5:
    animal = "Ox"
elif year % 12 == 6:
    animal = "Tiger"
elif year % 12 == 7:
    animal = "Hare"
elif year % 12 == 8:
    animal = "Dragon"
elif year % 12 == 9:
    animal = "Snake"
elif year % 12 == 10:
    animal = "Horse"
elif year % 12 == 11:
    animal = "Sheep"

print(animal)'''


'''month = int(input())
leapYear = ((month-2)/48)
if month>12:
    month = int(month)%12
if month in {1, 3, 5, 7, 8, 10, 12}:
    print("31 days")
elif month ==2 and  leapYear%1 ==0:
    print("29 days")
elif month ==2 and  leapYear%1 !=0:
    print("28 days")
else :print("30 days")'''

'''magnitude = input()

if magnitude < 2.0:
    print("Micro")
elif magnitude > 2.0 and magnitude < 3.0:
    print("Very minor")
elif magnitude > 3.0 and magnitude < 4.0:
    print("Minor")
elif magnitude > 4.0 and magnitude < 5.0:
    print("Light")
elif magnitude > 5.0 and magnitude < 6.0:
    print("Moderate")
elif magnitude > 6.0 and magnitude < 7.0:
    print("Strong")
elif magnitude > 7.0 and magnitude < 8.0:
    print("Major")
elif magnitude > 8.0 and magnitude < 10.0:
    print("Great")
elif magnitude> 10.0:
    print("Meteoric")'''


'''Donation = int(input())
Puzzles = int(input())
Talking_Dolls = int(input())
Teddy_Bears = int(input())
Pokemon_Plushies = int(input())
Big_Toy_Truck = int(input())

total_Order = Puzzles+Talking_Dolls+Teddy_Bears+Pokemon_Plushies+Big_Toy_Truck
if total_Order < 50:
    Puzzles = Puzzles*14
    Talking_Dolls = Talking_Dolls*3
    Teddy_Bears = Teddy_Bears*20.2
    Pokemon_Plushies = Pokemon_Plushies*8.20
    Big_Toy_Truck = Big_Toy_Truck*10.65
elif total_Order > 50:
    Puzzles = Puzzles*10.5
    Talking_Dolls = Talking_Dolls*0.75
    Teddy_Bears = Teddy_Bears*15.15
    Pokemon_Plushies = Pokemon_Plushies*6.15
    Big_Toy_Truck = Big_Toy_Truck*7.9875
total_Order_Amount = Puzzles+Talking_Dolls + \
    Teddy_Bears+Pokemon_Plushies+Big_Toy_Truck

if(total_Order_Amount >= Donation):
    total_Order_Amount = total_Order_Amount*0.10
    print("Yes! "+"{:.2f}".format(total_Order_Amount-Donation),
          " dollars left")
else:
    total_Order_Amount = total_Order_Amount*0.10
    print(" Not enough money!."+ \
          "{:.2f}".format((Donation-total_Order_Amount)), " dollars needed")


# 56.05 140.125 196.175'''

'''athlete1 = int(input())
athlete2 = int(input())
athlete3 = int(input())


result = athlete1+athlete2+athlete3


mins=result/60
secs=result%60

print(min,":","0"+str(secs)if (secs<10) else (secs),sep='')'''

'''day = int(input())
month = input()

zodiac = ""
if month.lower() == 'december' and day >= 22 and day <= 31:
    zodiac = "Capricorn"
elif month.lower() == 'january' and day >= 1 and day <= 19:
    zodiac = "Capricorn"
elif month.lower() == 'january' and day >= 20 and day <= 31:
    zodiac = "Aquarius"
elif month.lower() == 'february' and day >= 1 and day <= 18:
    zodiac = "Aquarius"
elif month.lower() == 'february' and day >= 19 and day <= 29:
    zodiac = "Pisces"
elif month.lower() == 'march' and day >= 1 and day <= 20:
    zodiac = "Pisces"
elif month.lower() == 'march' and day >= 21 and day <= 31:
    zodiac = "Aries"
elif month.lower() == 'april' and day >= 1 and day <= 19:
    zodiac = "Aries"
elif month.lower() == 'april' and day >= 20 and day <= 30:
    zodiac = "Taurus"
elif month.lower() == 'may' and day >= 1 and day <= 20:
    zodiac = "Taurus"
elif month.lower() == 'may' and day >= 21 and day <= 31:
    zodiac = "Gemini"
elif month.lower() == 'june' and day >= 1 and day <= 20:
    zodiac = "Gemini"
elif month.lower() == 'june' and day >= 21 and day <= 30:
    zodiac = "Cancer"
elif month.lower() == 'july' and day >= 1 and day <= 22:
    zodiac = "Cancer"
elif month.lower() == 'july' and day >= 23 and day <= 31:
    zodiac = "Leo"
elif month.lower() == 'august' and day >= 1 and day <= 22:
    zodiac = "Leo"
elif month.lower() == 'august' and day >= 23 and day <= 31:
    zodiac = "Virgo"
elif month.lower() == 'september' and day >= 1 and day <= 22:
    zodiac = "Virgo"
elif month.lower() == 'september' and day >= 23 and day <= 30:
    zodiac = "Libra"
elif month.lower() == 'october' and day >= 1 and day <= 22:
    zodiac = "Libra"
elif month.lower() == 'october' and day >= 23 and day <= 31:
    zodiac = "Scorpio"
elif month.lower() == 'november' and day >= 1 and day <= 21:
    zodiac = "Scorpio"
elif month.lower() == 'november' and day >= 22 and day <= 30:
    zodiac = "Sagittarius"
elif month.lower() == 'december' and day >= 1 and day <= 21:
    zodiac = "Sagittarius"

print("Your Astrological sign is :",zodiac)
'''


'''minutes = float(input())
messages = float(input())
subtotal = 799
excess_minutes = 0.00
excess_sms = 0.00
fee = 25
if minutes > 60:
    excess_minutes += (minutes-60)*6.50
if messages > 100:
    excess_sms += messages-100

subtotal += excess_minutes+excess_sms+fee
tax = subtotal*0.05
subtotal += tax
print("Call minutes:", minutes)
print("Text messages:", messages)
print("Excess minutes charges: "+"{:.2f}".format(float(excess_minutes)))
print("Excess SMS charges: "+"{:.2f}".format(float(excess_sms)))
print("911 fee: "+"{:.2f}".format(fee))
print("Tax: "+"{:.2f}".format(tax))
print("Total bill: "+"{:.2f}".format(subtotal))
print("Call minutes:", minutes, "\nText messages:", messages, "\nExcess minutes charges: "+"{:.2f}".format(excess_minutes), "\nExcess SMS charges: "+"{:.2f}".format(
    float(excess_sms)), "\n911 fee: "+"{:.2f}".format(fee), "\nTax: "+"{:.2f}".format(tax), "\nTotal bill: "+"{:.2f}".format(subtotal))'''

'''month = input()
nights = int(input())

month =month.lower()
delux = 0
premium = 0

if month == 'may' or month == 'october':
    delux = 100 * nights
    premium = 85 * nights
    if nights >14:
        delux = delux-(delux*0.3)
        premium = premium-(premium*0.1)
    elif nights >7:
         delux = delux-(delux*0.05)
elif month == 'july' or month == 'september':
    delux = 112.50 * nights
    premium = 90.58 * nights
    if nights > 14:
        delux = delux-(delux*0.2)
        premium = premium-(premium*0.1)
elif month == 'june' or month == 'august':
    delux = 125.66  * nights
    premium = 100.50 * nights
    if nights > 14:
        premium = premium-(premium*0.1)


print("Deluxe: "+"{:.2f}".format(delux)," dollars")
print("Premium: "+"{:.2f}".format(premium)," dollars")'''


'''try:
    grade = int(input())
    grade = round(grade * 2) / 2
    if grade >=8.5 and grade <10.1:
        print("Grade A")
    elif grade >=7.5 and grade <8.1:
        print("Grade B")
    elif grade >=6.5 and grade <7.1:
        print("Grade C")
    elif grade >=5.5 and grade <6.1:
        print("Grade D")
    elif grade <5.5 and grade >=0:
        print("Grade D")
except Exception as e: print(e)'''

'''a = str(input())
b = int(input())


message =""


for letter in a:
    if ord(letter) < ord("a"):
        message +=letter
    elif ord(letter)+b>ord("z"):
        message += chr(ord(letter)+b-26)
    else:
        message += chr(ord(letter)+b)

print(message)

'''
'''highest = 0
lowest = 0
divisible = 0
for x in range(10):
    a = int(input())
    if a > highest:
        highest = a
    if lowest == 0 or a < lowest:
        lowest = a
    if a % 3 == 0 and a!=0:
        divisible += 1

print(f"Highest: {highest}\nLowest: {lowest}\n{divisible} numbers divisible by 3")'''


'''num = int(input())
primeChecker = False
if num > 1:
    for i in range(2, num):
        if (num % i) == 0:
            primeChecker = True
            break
if primeChecker:
    print("Not Prime")
else:
    print("Prime")
'''

'''n = int(input())
x = int(input())  # washing machine price
p = int(input())
moneySave = 0

for x in range(n):
    print(x+1)
    if x+1 % 2 == 0 :
        moneySave += 10-1
    else:
        moneySave += p

if moneySave > x:
    print(f"Yes! you still have {moneySave-x} left")
'''
'''n = int(input())


while n != 0:
    print(n)
    n -= 1
    if n == 0:
        print("Blast off!")
'''

'''n = int(input())
average = n
if n == 0:
    print("No entries")
else:
    counter = 0
    while n != 0:
        n = int(input())
        average += n
        counter += 1

    print(int(average/counter))
print(counter,average)'''
'''n = int(input())
num = 1
while n >= 1:
    num = num * n
    n = n - 1
print(num)'''

'''result = 0

my_list = []
 while True:
    a = input()
    if(a != 'stop'):
        my_list.append(int(input()))
    else:
        break

print(my_list)
x = 2

while x <= len(my_list):
    print(my_list[x-2], "asdsadsad")
    result += (my_list[x-2]*my_list[x+1])
    result += (my_list[x-1]*my_list[x])
    x += 2

print(result, "asdsadsas2d")'''


'''n = input()
average=0
if n == 'end':
    print(f"0.00")
else:
    while n != 'end':
        if int(n)>64:
            average += 18.00
        elif int(n)>12:
            average += 23.00
        elif int(n)>2:
            average += 14.00
        else:
            average+=0
        n = input()

print("{:.2f}".format(average))'''
'''n = input()
male = 0
female = 0
for x in range(int(n)):
    n = input()
    if(n.lower() == 'm'):
        male += 1
    elif(n.lower() == 'f'):
        female += 1
print(f"Males: {male}\nFemales: {female}")

if male == 0:
    print(f"All females")
elif female == 0:
    print(f"All males")
else:
    for i in range(1, female+1):
        if male % i == 0 and female % i == 0:
            gcd = i
    print(f"{int(male/gcd)}:{int(female/gcd)}")'''

'''m = int(input())
n = int(input())
p = int(input())

for i in range(m, n+1):
    for j in range(2, p+1):
        print(f"{i**j} ", end='')
        if j < p:
            print(",", end='')
    print("\n",end = '')
                '''

                
import time
import random
words = ['rainbow', 'computer', 'science', 'programming',
         'python', 'mathematics', 'player', 'condition',
         'reverse', 'water', 'board', 'geeks']
word = random.choice(words)
print("Guess the word")
guesses = ''
t = int(30)
guessesCount = 5
while t:
    mins, secs = divmod(t, 60)
    timer = '{:02d}:{:02d}'.format(mins, secs)
    print(timer, end="\r")
    time.sleep(1)
    t -= 1
    print(f"Word starts with {word[0]}")
    guess = input("guess a word: ")
    if guess == word:
        print("You Win")
        print(f"The word is: {word}")
        break
    elif guess != word and guessesCount != 0:
        print("Wrong")
        print(f"You have {timer} left and {guessesCount} more guesses")
        guessesCount -= 1
    else:
        print(f"You Loose the word is {word}")
        break
