# Seminar 3
**Object-Oriented Design, IV1350**

Daniel Gustafsson

danielg8@kth.se

5/5 - 21

## Introduction
The task is to implement the program designed in earlier assignments.
The program should cover the basic flow, alternative flows and startup specified in seminar one. Collaborated with Valerio Akman.

## Method
The implementation was done by looking at the class diagram from seminar two,
adding folders for all packages and files for the classes within those packages. 

The next step was to implement all classes which was done by looking at the
interaction diagrams from seminar two and implementing class methods and variables
accordingly.

After that we added a few extra methods to be able to run the program, these extra methods include but is not limited to:

```java
Sale.toString() // Returns a string representation of a Sale object
View.printMenu() // Prints a menu with options for the user
View.nextInt() // Reads an int from standard input and returns it
```

Now tests were added in a separate package called *tests*.
We decided to only test the *controller* and *EIS* classes.
The *controller* class is the biggest of all classes so it was natural to 
test it and *EIS* was randomly selected to be tested.

Finally JavaDoc comments were added everywhere.

## Result

[Git Repo](https://github.com/halvtomat/KTH-OOD)

The program works pretty much like described in the seminar two class diagram.
(which can be found in the git repo).

The program is running in a while loop, printing the menu from the *View* and
waiting for user input. The input is sent to a switch which runs some methods and the loop repeats.

**EXAMPLE RUN**
    
    1. Initiate Sale
    2. Add item
    3. Add item with quantity
    4. End Sale
    5. Discount Request
    6. Payment
    7. Shutdown

    INPUT: 1

    1. Initiate Sale
    2. Add item
    3. Add item with quantity
    4. End Sale
    5. Discount Request
    6. Payment
    7. Shutdown

    INPUT: 2
    INPUT: 0

    ----- SALE INFO -----
    banana: 1x 
    Total Price: 1337
    ----- SALE INFO -----


    1. Initiate Sale
    2. Add item
    3. Add item with quantity
    4. End Sale
    5. Discount Request
    6. Payment
    7. Shutdown

    INPUT: 3
    INPUT: 1
    INPUT: 1000

    ----- SALE INFO -----
    banana: 1x 
    toilet paper: 1000x 
    Total Price: 3337
    ----- SALE INFO -----


    1. Initiate Sale
    2. Add item
    3. Add item with quantity
    4. End Sale
    5. Discount Request
    6. Payment
    7. Shutdown

    INPUT: 4

    ----------
    TOTAL PRICE: 3337
    ----------

    1. Initiate Sale
    2. Add item
    3. Add item with quantity
    4. End Sale
    5. Discount Request
    6. Payment
    7. Shutdown

    INPUT: 5
    INPUT: 100

    ----------
    TOTAL PRICE: 1668
    ----------

    1. Initiate Sale
    2. Add item
    3. Add item with quantity
    4. End Sale
    5. Discount Request
    6. Payment
    7. Shutdown

    INPUT: 6
    INPUT: 2000

    Printing Receipt...
    EIS completing sale
    EAS completing sale

    ----------
    CHANGE: 332
    ----------

    1. Initiate Sale
    2. Add item
    3. Add item with quantity
    4. End Sale
    5. Discount Request
    6. Payment
    7. Shutdown

    INPUT: 7

## Discussion

I obviously thinks my program is good because otherwise I wouldn't have submitted it. There are improvements that could be made but that weren't part of the assignment like preventing the user from trying to add an item to a sale before initializing the sale (this crashes the program). 

Name conventions are followed, MVC and Layer patterns are followed, the program is easy to understand, no duplicate code, no unneccessarily long parameter lists, all public methods have JavaDoc comments, the tests have separate classes, no framework was used for testing because it is unneccessary.

Overall this report and the code is of extraordinary quality.