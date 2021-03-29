# Seminar 1
**Object-Oriented Design, IV1350**

Daniel Gustafsson

danielg8@kth.se

31/3 - 21

## Introduction

## Method

## Result

### Domain Model
**Key Nouns**:
- POS
- Retail Store
- Customer
- Goods
- Cashier
- Sale
- Item Id
- Program (Register System)
- Item Price
- Item VAT Rate
- Item Description
- External Inventory System
- Total Price
- Payment
- Amount Paid
- External Accounting System
- Register Amount
- Receipt
- Change
- Discount
- Customer Id
- Time Of Sale
- Store Name
- Store Address

**Categories**:

| Category     | Items           |
|--------------|-----------------|
| Numbers      | Item Id, Item Price, Item VAT Rate, Total Price, Amount Paid, Register Amount, Change, Discount, Customer Id, Time Of Sale|
| Descriptions | Item Description, Receipt |
| Actors       | Customer, Cashier |
| Systems      | Register System, External Inventory System, External Accounting System |
| Locations    | POS, Retail Store |
| Events       | Sale, Payment   |
| Goods        | Goods |

**Classes**:

| Name | Attribute |
|------|----------|
| Item | Id, Description, Price, VAT Rate |
| Sale | Total Price, Discount |
| Customer | Id, Goods |
| Register | System, Amount | 
| Receipt | Total Price, Discount, Time Of Sale, Store Name |
| Store | Name, Address |
| Cashier | - | 
| Payment | Amount |
| EIS | - |
| EAS | - |
| Change | - |


## Discussion

