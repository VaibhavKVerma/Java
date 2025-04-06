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