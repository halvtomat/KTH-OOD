# Seminar 1 peer assessment

This is an assessment of Jakob Götbergs seminar report.

## Domain Model assessment
In our opinion the DM is slightly naive, some associations are just taken from the specification. 

Jakob argues that their Transaction class isn't a "spider-in-the-web" class but it certainly feels like the class is in the middle of everything and has more associations than any other.

Overall the DM is understandable and a correct description of the problem domain.

The number of classes is alright, no important classes are missing although we felt that the AccountingDepartment class is unneccesary or wrong.

We believe that the AccountingDepartment class is supposed to replace the External Accounting system but we didn't feel that it was a correct replacement. 
We also believe that the pointOfSale attribute of the Transaction class is out of place, it should be an attribute of another class, maybe SaleInformation or Register.
Finally we thought that the Transaction and SaleInformation classes probably should be combined to a "Sale" class.

We believe the number of associations is too high, the model looks messy and is a little hard to read because of this. 

Naming conventions are followed and UML is correctly used.

## System Sequence Diagram
The system sequence diagram is state of the art, well done!

Nice structure, good names, all objects and operations correctly included.

Extra points for good comments.

## Report
We had mixed feelings about the Method chapter of the report, it feels like the method chapter doesn't explain the proces very well but instead it shows the result of different methods they used to finish the DM and SSD. Overall OK but less results and more description would have been preferred.

The Result chapter is good, some parts feels like they might fit better in the Discussion chapter but overall nice.

There is a Discussion chapter and it is relevant to the work done.