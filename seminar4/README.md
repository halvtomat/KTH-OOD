# Seminar 4
**Object-Oriented Design, IV1350**

Daniel Gustafsson

danielg8@kth.se

18/5 - 21

## Introduction
The task is to modify the code from seminar 3 to handle exceptions and to integrate some observer-pattern classes. Collaborated with Valerio Akman.

## Method
The implementation was done by following the instrutions in the seminar tasks document. 

The exceptions were handled with 2 new classes *ItemNotFoundException* and *DatabaseNotRespondingException*, which both extends the built in java class *Exception*. Both exceptions are thrown in the *EIS*, first one when trying to get an item which doesn't exist and second one when trying to get item with identifier 42069.


## Result

[Git Repo](https://github.com/halvtomat/KTH-OOD/tree/main/seminar4)


## Discussion