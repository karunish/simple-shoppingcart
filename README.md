# simple-shoppingcart
This project is a simple Java program that simulates a shopping cart, where users can add items to their cart, and the program calculates the total cost, applies discounts if applicable, and displays the final bill.

## Features

- **User Input**:
  - Specify the number of items to purchase.
  - Enter the price and quantity for each item.

- **Calculations**:
  - Calculate the subtotal by summing the cost of all items (`price * quantity`).
  - Apply discounts based on the subtotal:
    - 15% discount if the subtotal exceeds 100.
    - 10% discount if the subtotal is between 50 and 100 (inclusive).
    - No discount if the subtotal is less than 50.

- **Output**:
  - Display the subtotal, any discount applied, and the final total.
  - Thank the user for shopping.

## Example Usage
```
Welcome to Shopping cart!
Please enter the amount of items in the cart: 3

Please enter the price of item 1: 20.50
Please enter the quantity of item 1: 2

Please enter the price of item 2: 15.75
Please enter the quantity of item 2: 1

Please enter the price of item 3: 12.30
Please enter the quantity of item 3: 3

Your subtotal is 88.15

You're eligible for a 10% discount!
Your new subtotal is 79.34
You have saved 8.81!

Thank you for shopping with us!
```

## Constraints kept
- No arrays or collections are used to store items.
- Primitive data types (e.g., `int`, `double`, `String`) are used.
