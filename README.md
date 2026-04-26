# Constructor Chaining Assignment

---

## Q2: Examine the code below

```java
class Parent {
    Parent() { }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child Constructor");
    }
}
```

A) It initializes the Child class's own fields.
B) It invokes a method of the Parent class.
C) It calls the Parent class's no-argument constructor before executing the Child's constructor body.
D) It delays initialization until later in the Child constructor.

**Answer: C**

---

## Q3: Constructor Order

```java
class A {
    A() { System.out.println("A"); }
}

class B extends A {
    B() {
        super();
        System.out.println("B");
    }
}

class C extends B {
    C() {
        super();
        System.out.println("C");
    }
}
```

A) A, C, B
B) B, A, C
C) A, B, C
D) C, B, A

**Answer: C**

---

## Q4: Identify Error

```java
public class ErrorExample {

    public ErrorExample() {
        this(5);
        System.out.println("Default Constructor");
    }

    public ErrorExample(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }
}
```

A) this(5) should be replaced with super(5)
B) The call to this(5) must be the first statement in the constructor.
C) There is no error
D) Constructor should not print

**Answer: B**

---

## Q5: Output

A) Only Parameterized Constructor
B) Default first
C) Parameterized first, then Default
D) Runtime error

**Answer: C**

---

## Q6

A) 10 and 5
B) 5 and 10
C) 10 and 10
D) 5 and 5

**Answer: C**

---

## Q7

A) Dog field
B) Parent field
C) Compile error
D) Same value

**Answer: B**

---

## Q8

A) Compile error
B) Compiler inserts super()
C) Child not executed
D) Runtime error

**Answer: B**

---

## Q9

A) this() calls parent
B) super() calls parent, this() calls same class
C) Same function
D) Only for methods

**Answer: B**

---

## Q10

A) Initializes Manager
B) Delays execution
C) Calls Employee constructor first
D) Creates new object

**Answer: C**

---

## Q11

A) Faster execution
B) Reduces duplication
C) Multiple objects
D) Avoid super()

**Answer: B**

---

## Q12

A) Compile-time error
B) Runtime infinite recursion
C) Valid
D) Calls parent

**Answer: A**

---

## Q13

A) Independent constructors
B) Centralized initialization
C) Static method
D) Override

**Answer: B**

---

## Q14

A) C, P, G
B) G, P, C
C) P, G, C
D) G, C, P

**Answer: B**

---

## Q15

A) Skips subclass init
B) Must be first statement
C) Calls this()
D) Static issue

**Answer: B**
