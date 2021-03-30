# Seminar 1
**Object-Oriented Design, IV1350**

Daniel Gustafsson

danielg8@kth.se

31/3 - 21

## Introduction

## Method

### Domain Model (Task 1)
I begun by identifying all key nouns from the Requirements Specification.

**Key Nouns**:
- POS
- RetailStore
- Customer
- Goods
- Item
- Cashier
- Sale
- ItemIdentifier
- Program
- Price
- VATRate
- ItemDescription
- ExternalInventorySystem (EIS)
- TotalPrice
- Payment
- AmountPaid
- ExternalAccountingSystem (EAS)
- RegisterAmount
- Receipt
- Change
- Discount
- CustomerIdentifier
- DateOfSale
- TimeOfSale
- StoreName
- StoreAddress
- SaleLog

Following that I used a category list to try and find some other useful classes.

**Categories**:

| Category     | Items           |
|--------------|-----------------|
| Transactions | Payment, Sale |
| Products, Services | Goods |
| Roles, People, Organizations| Customer, Cashier, Store |
| Places | Store, POS |
| Records | Receipt, EIS, EAS, RegisterLog |
| Events | Sale, DiscountRequest |
| Physical Objects | Goods, Receipt, Cash, Register, Store, Cart |
| Devices | Register |
| Descriptions | PriceTag, ItemDescription, CustomerIdentifier, ItemIdentifier |
| Catalogs | - |
| Systems | EIS, EAS, RegisterSystem |
| Quantities, Units | ItemQuantity, ItemPrice, TotalPrice, VATRate, Discount, Change, Currency, RegisterAmount, AmountPaid |
| Resources | - |

When all classes where found I removed classes which didn't fit into the model.

**Removing irrelevant classes**:
- Cart, never mentioned in the specification and seems irrelevant.
- PriceTag, same as ItemPrice.
- Program, same as RegisterSystem.
- SaleLog, same as RegisterLog.
- Price, same as ItemPrice.
- RetailStore, same as Store.
- Goods, same as Item.
- DateOfSale, exists within TimeOfSale.

Now I changed some classes to be attributes of other classes instead, further removing uneccesary classes.

**Changing classes to attributes**:
- ItemIdentifier, -> item attribute.
- ItemPrice, -> item attribute.
- VATRate, -> item attribute.
- ItemDescription, -> item attribute.
- CustomerIdentifier, -> customer attribute.
- RegisterAmount, -> register attribute.
- RegisterLog, -> register attribute.
- StoreName, -> store attribute.
- StoreAddress, -> store attribute.
- TimeOfSale, -> receipt attribute.
- AmountPaid, -> payment attribute.
- ItemQuantity, -> sale attribute.
- TotalPrice, -> receipt & sale attribute.

### System Sequence Diagram (Task 2)
## Result

### Domain Model


**Classes**:

## Discussion

