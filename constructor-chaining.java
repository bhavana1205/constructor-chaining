15. Accessing Parent and Child Variables
class Person {
   String name;

   Person() {
       name = "John Doe";
   }
}

class Student extends Person {
   String name;

   Student() {
       name = "Alice Smith";
   }

   void display() {
       System.out.println("Parent Name: " + super.name);
       System.out.println("Child Name: " + this.name);
   }
}

public class Main {
   public static void main(String[] args) {
       Student s = new Student();
       s.display();
   }
}
Output:
Parent Name: John Doe
Child Name: Alice Smith

16. Calling Parent Method using super
class Vehicle {
   void describe() {
       System.out.println("This is a vehicle");
   }
}

class Car extends Vehicle {
   void describe() {
       System.out.println("This is a car");
       super.describe();
   }
}

public class Main {
   public static void main(String[] args) {
       new Car().describe();
   }
}
Output:
This is a car
This is a vehicle

17. Constructor chaining using this()
class Book {
   Book() {
       System.out.println("Default Book Constructor");
   }

   Book(String title) {
       System.out.println("Book Title: " + title);
   }
}

class EBook extends Book {
   EBook() {
       this("Java Programming");
   }

   EBook(String title) {
       System.out.println("EBook Title: " + title);
   }
}

public class Main {
   public static void main(String[] args) {
       new EBook();
   }
}



Output:
Default Book Constructor
EBook Title: Java Programming

18. Using super() in constructor
class Employee {
   Employee() {
       System.out.println("Employee Created");
   }
}

class Manager extends Employee {
   Manager() {
       super();
       System.out.println("Manager Created");
   }
}

public class Main {
   public static void main(String[] args) {
       new Manager();
   }
}
Output:
Employee Created
Manager Created

