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
