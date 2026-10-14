# 🛒 Shopping Bill Calculator — GST First, Discount After

![Java](https://img.shields.io/badge/Java-JDK-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![Task](https://img.shields.io/badge/Task-01-0052CC?style=for-the-badge)

**Java Programming Task | The Kiran Academy**

---

## 📌 Project Overview

The Shopping Bill Calculator is a Java-based console application developed as part of Task 01 of the programming internship at The Kiran Academy.

The program calculates shopping bills for Electronics, Fashion, and Food by applying the specified GST rates. After calculating the total amount including GST, it applies a 20% discount to determine the final payable amount.

## ✨ Features

- Calculates bills for Electronics, Fashion, and Food.
- Applies category-specific GST rates.
- Displays prices before and after GST.
- Calculates the total bill after GST.
- Applies a 20% discount.
- Displays the final payable amount.
- Demonstrates Java methods and return values.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Programming language |
| JDK | Compilation and execution |
| Visual Studio Code | Development environment |
| Git and GitHub | Version control and source-code hosting |

## 🧾 Product Details

| Category | Item Prices | GST Rate |
|---|---:|---:|
| Electronics | ₹400 + ₹500 | 18% |
| Fashion | ₹300 + ₹350 | 13% |
| Food | ₹100 | 7% |

**Discount Policy:** A 20% discount is applied after calculating the total bill including GST.

## 🧮 Calculation Breakdown

| Description | Amount |
|---|---:|
| Electronics after GST | ₹1,062.00 |
| Fashion after GST | ₹734.50 |
| Food after GST | ₹107.00 |
| **Total After GST** | **₹1,903.50** |
| 20% Discount | −₹380.70 |
| **Final Payable Amount** | **₹1,522.80** |

### Calculation Formulas

**GST Amount**
```text
GST = Original Price × GST Rate / 100
```

**Price After GST**
```text
Price After GST = Original Price + GST Amount
```

**Discount Amount**
```text
Discount = Total After GST × 20 / 100
```

**Final Payable Amount**
```text
Final Amount = Total After GST − Discount
```

## 📂 Project Structure

```text
Kiran-Academy-Task-01-Shopping-Bill/
├── Task1.java
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- [Java Development Kit (JDK)](https://adoptium.net/)
- [Visual Studio Code](https://code.visualstudio.com/) (optional)

### 1. Clone the Repository

```bash
git clone https://github.com/Rmy4143/Kiran-Academy-Task-01-Shopping-Bill.git
```

### 2. Open the Project Folder

```bash
cd Kiran-Academy-Task-01-Shopping-Bill
```

### 3. Compile the Java Program

```bash
javac Task1.java
```

### 4. Execute the Program

```bash
java Task1
```

## 💻 Sample Output

```text
2 Electric item value before GST applied = 900.0
2 Electric item value after GST applied = 1062.0

2 Fashion items total value before GST applied = 650.0
2 Fashion items total value after GST applied = 734.5

1 Food item total value before GST applied = 100.0
1 Food item total value after GST applied = 107.0

Total items value after GST = 1903.5
20% Discount = 380.7
Final payable amount = 1522.8
```

## 📚 Concepts Demonstrated

- Java classes and objects
- Methods and return statements
- Local variables and variable scope
- Method invocation
- Arithmetic operators
- Floating-point calculations
- GST and percentage calculations
- Discount calculations
- Console output using `System.out.println()`

## 🎯 Learning Outcomes

- Breaking calculations into reusable methods.
- Returning values from methods to the `main()` method.
- Combining returned values to calculate a total.
- Applying GST before calculating a discount.
- Developing and executing a Java console application.

## 👨‍💻 About the Author

**Bhagyesh Patil**

🎓 B.Tech — Information Technology

- **GitHub Profile:** https://github.com/Rmy4143/
- **LinkedIn Profile:** https://www.linkedin.com/in/bhagyeshrmy4143/

<p align="center">
  <a href="https://github.com/Rmy4143">
    <img src="https://img.shields.io/badge/GitHub-View_Profile-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub Profile">
  </a>
  <a href="https://www.linkedin.com/in/bhagyeshrmy4143/">
    <img src="https://img.shields.io/badge/LinkedIn-Connect-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn Profile">
  </a>
</p>

## 🏢 Internship Details

- **Organization:** The Kiran Academy
- **Task Number:** 01
- **Task Title:** Shopping Bill — GST First, Discount After
- **Programming Language:** Java
- **Submission:** GitHub repository URL

---

<p align="center">
  <strong>Shopping Bill Calculator | Task 01</strong>
  <br>
  Developed using Java at The Kiran Academy.
  <br><br>
  ⭐ Thank you for visiting this repository!
</p>
