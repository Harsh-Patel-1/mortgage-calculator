# Mortgage Calculator

A simple Java-based Mortgage Calculator that computes monthly loan payments based on principal, annual interest rate, and loan period.

## Features

- Accepts **principal amount**, **annual interest rate**, and **loan period** as input.
- Calculates the **monthly mortgage payment**.
- Displays the result in **Indian Rupees (₹)** format.

## Installation & Usage

### Prerequisites

- **Java JDK 8+** installed
- **Git** installed (optional)

### Steps to Run

1. **Clone the Repository**

   ```sh
   git clone https://github.com/Harsh-Patel-1/mortgage-calculator.git
   cd mortgage-calculator
   ```

2. **Compile the Java Program**

   ```sh
   javac Mortgage.java
   ```

3. **Run the Program**

   ```sh
   java Mortgage
   ```

4. **Enter the Required Inputs:**

   ```
   Principal: 1000000
   Annual Interest Rate: 7
   Period (Years): 15
   ```

5. **Example Output:**
   ```
   Your monthly payment is: ₹8,988.83
   ```

## Formula Used

The monthly mortgage payment is calculated using the formula:

\[ M = P \times \frac{r(1 + r)^n}{(1 + r)^n - 1} \]

Where:

- **M** = Monthly payment
- **P** = Principal amount (Loan Amount)
- **r** = Monthly interest rate (Annual Rate / 12 / 100)
- **n** = Total number of payments (Years \* 12)

## Contributing

Feel free to **fork this repository**, improve the code, and submit a **pull request**.

## License

This project is **open-source** and available under the **MIT License**.

---

💡 _Built with Java_ ☕
