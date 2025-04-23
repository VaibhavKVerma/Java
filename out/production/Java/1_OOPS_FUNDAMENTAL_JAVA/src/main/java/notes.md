# OOPS

https://drive.google.com/file/d/1eg_I2kdII2_KPtzGifky-YEvFcgaCX4H/view

Class -> Blueprint of object 
Object -> Instance of class

A Class can have multiple Objects

```java
class Student {
    int age; // data variable/property
    String name; // data variable/property
    updateAge(int age) {} // data method/behaviour
}

Student engineeringStudent = new Student();
Student medicalStudent = new Student();
```

## Pillar of OOPS

Encapsulation, Abstraction, Inheritance, Polymorphism

### Abstraction

* Abstraction is a process of hiding the details of implementation and showing only the functionality to the user.
* Can be achieved using abstract classes and interfaces.

ADVANTAGES
* Increase security and confidentiality
* Reduce complexity
* Simplify maintenance

```java

interface Car {
    void start();
    void stop();
    void accelerate();
}

class HondaCity implements Car {
    @Override
    public void start() {
        System.out.println("Starting Honda City");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Honda City");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Honda City");
    }
}

Car car = new HondaCity();
```

### Encapsulation

* Encapsulation is a process of wrapping data and methods into a single unit called class.
* It bundles the data and methods into a single entity.
* Also known as DATA HIDING.
* Steps to achieve encapsulation
    * Declare variables of class as private.
    * Provide public getter and setter methods to access and modify the value of variables.

ADVANTAGES
* Loosely coupled code
* Better access control and security

### Inheritance

* Capability of a class to inherit properties and methods from Parent class.
* It can inherit both functions and variables, so we don't need to rewrite the code in Child class.
* Can be achieved using extends keyword or through interface.
* Types of inheritance
    * Single Inheritance
    * Multiple Inheritance
    * Hierarchical Inheritance
    * Multilevel Inheritance

ADVANTAGES
* Code reusability
* Achieve Polymorphism using Inheritance


#### Single Inheritance

```java
class Parent {
     
}

class Child extends Parent {
    
}
```

#### Multiple Inheritance - Not allowed in java(Diamond problem)

why ?? let's say that both the parent has same member/function, then the child will have two same member/function.
```java
class Parent1 {
    
}

class Parent2 {
    
}

class Child extends Parent1, Parent2 {
    
}
```
can be done using Interface

```java
interface Parent1 {
    
}

interface Parent2 {
    
}

class Child implements Parent1, Parent2 {
    
}
```

#### Hierarchical Inheritance

```java
class Parent {
    
}

class Child1 extends Parent {
    
}

class Child2 extends Parent {
    
}
```

#### Multilevel Inheritance

```java
class GrandParent {
    
}

class Parent extends GrandParent {
    
}

class Child extends Parent {
    
}
```

### Polymorphism

* Polymorphism is a process of having many forms.
* Same function can have different implementations.
* Types of Polymorphism:
  * Method Overloading/ Compile Time/ Static Polymorphism
  * Method Overriding/ Run Time/ Dynamic Polymorphism

### Object Relationships

* IS-A Relationship
  * Achievable using Inheritance
  * Example: Employee is-a Person
* HAS-A Relationship
  * Whenever an Object is used as a member of another Object, it is called HAS-A Relationship
  * Can have one-to-one, one-to-many, many-to-one, many-to-many
  * Example: Employee has-a Address
  * Association: Association is a relationship between different objects.
    * Aggregation: Both objects can survive individually, means one object can exist without another object.
    * Composition: Both objects are destroyed together, means one object cannot exist without another object.