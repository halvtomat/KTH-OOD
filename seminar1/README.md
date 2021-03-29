# Seminar 1
**Object-Oriented Design, IV1350**

Daniel Gustafsson

danielg8@kth.se

31/3 - 21

## Introduction

## Method

## Result

### Domain Model
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

**Removing irrelevant classes**:
- Cart, never mentioned in the specification and seems irrelevant.
- PriceTag, same as ItemPrice.
- Program, same as RegisterSystem.
- SaleLog, same as RegisterLog.
- Price, same as ItemPrice.
- RetailStore, same as Store.
- Goods, same as Item.
- DateOfSale, exists within TimeOfSale.

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

**Classes**:

| Name | Attribute |
|------|-----------|
| Item | Id, Description, Price, VATRate |
| Sale | TotalPrice, Discount |
| Customer | Id, Goods |
| Register | Amount, Log | 
| Receipt | TotalPrice, Discount, DateOfSale, TimeOfSale, StoreName |
| Store | Name, Address |
| Cashier | - | 
| Payment | Amount |
| EIS | - |
| EAS | - |
| Change | - |


## Discussion

