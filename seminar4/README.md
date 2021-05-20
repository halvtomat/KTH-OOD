# Seminar 4
**Object-Oriented Design, IV1350**

Daniel Gustafsson

danielg8@kth.se

18/5 - 21

## Introduction
The task is to modify the code from seminar 3 to handle exceptions and to integrate some observer-pattern classes. Collaborated with Valerio Akman.

## Method
The implementation was done by following the instrutions in the seminar tasks document. 

I reasoned that adding 2 new Exception classes would be appropriate, these would then be thrown from the *EIS* and caught in the *View* or *Controller*.

I also reasoned that the Logwriter should be in the *util* package, because that is what the task says it should.

In addittion to this, I reasoned that the *TotalRevenueFileOutput* class should be in the *util* package because it writes to file.
I also reasoned that the observer pattern shall be implemented in the same way that it is implemented in the book.

## Result

[Git Repo](https://github.com/halvtomat/KTH-OOD/tree/main/seminar4)

The exceptions were handled with 2 new classes *ItemNotFoundException* and *DatabaseNotRespondingException*, which both extends the built in java class *Exception*. Both exceptions are thrown in the *EIS*, first one when trying to get an item which doesn't exist and second one when trying to get item with identifier 42069.

The observer pattern was implemented with a *RevenueObserver* class in the *model* pacakge. Changes were made to the *Sale* class to include a list of *RevenueObservers* and a method to notify them.

2 new classes to print total revenue were added, one in the *view* and one in *util*. These were created in the view and added as observers when starting a new sale.

### Sample run

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
    INPUT: 2

    ----- SALE INFO -----
    hot dog: 1x 
    Total Price: 3
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
    INPUT: 10

    ----- SALE INFO -----
    hot dog: 1x 
    toilet paper: 10x 
    Total Price: 23
    ----- SALE INFO -----


    1. Initiate Sale
    2. Add item
    3. Add item with quantity
    4. End Sale
    5. Discount Request
    6. Payment
    7. Shutdown

    INPUT: 2 
    INPUT: 42069

    --------
    BEGIN LOG
    LOG ENTRY | Database can not be reached | 2021-05-18T17:42:21.459656
    END LOG
    --------


    --------
    BEGIN USER ERROR
    Internal error
    END USER ERROR
    --------


    ----- SALE INFO -----
    hot dog: 1x 
    toilet paper: 10x 
    Total Price: 23
    ----- SALE INFO -----


    1. Initiate Sale
    2. Add item
    3. Add item with quantity
    4. End Sale
    5. Discount Request
    6. Payment
    7. Shutdown

    INPUT: 2
    INPUT: 9

    --------
    BEGIN USER ERROR
    The item with identifier 9 does not exist!
    END USER ERROR
    --------


    ----- SALE INFO -----
    hot dog: 1x 
    toilet paper: 10x 
    Total Price: 23
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
    TOTAL PRICE: 23
    ----------


    1. Initiate Sale
    2. Add item
    3. Add item with quantity
    4. End Sale
    5. Discount Request
    6. Payment
    7. Shutdown

    INPUT: 6
    INPUT: 40

    Printing Receipt...
    Total Revenue: 23 pesos
    EIS completing sale
    EAS completing sale

    ----------
    CHANGE: 17
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

According to my calculations and experts in the field, all nine bullets about exception are followed. In addition to this, all best practices from chapter eight are also followed.

The observer pattern is correctly implemented with an observable and 2 observers which are notified when the observable does something critical.

Design patterns are explained in the tasks doc and the motivation for using them is that it is required.

I agree fully with the choices of observer and observed object.

The reference to observer are passed from the *View* to the *Controller* and then finally to *Sale* chich is the observed object. This doens't affect coupling or cohesion much.

The only passed data from observed object to observer is the total price of a *Sale*, the *Sale* returns this value to the *View* anyway so it doens't break encapsulation.

The method and results are explained and this discussion is very existing and relevant.