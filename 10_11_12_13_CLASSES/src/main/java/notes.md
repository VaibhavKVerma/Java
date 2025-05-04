https://drive.google.com/file/d/1eE5Pculcp0qem6tMPHDz9h-jhMclzGIt/view
https://notebook.zohopublic.in/public/notes/u3i1se962d56445eb4118ab4e4c0ca99e4728
https://notebook.zohopublic.in/public/notes/u3i1s340edd3a883b4ef7ac90874731c865b0

# Concrete Class
- It is a class which is not abstract and implements all the abstract methods
- Must be instantiated using new keyword
# Abstract Class
- Cannot be instantiated using new keyword
- Interface/Abstract Class
- Abstract class can have child as a abstract class
- There are abstract methods and non-abstract methods
- Concrete class has to implement all the abstract methods
# Super and Sub Class
- Parent class is called Super Class
- Child class is called Sub Class
- If there is a single class then the Super Class will be <b>Object Class</b>(Java Predefined Class)
# Nested Class
Class within a Class
- Static Nested Class - Static Class within a class
- Non-Static Nested Class/Inner Class
  - Local Inner Class - Inner Class within a method
  - Member Inner Class - Inner Class within a class
  - Anonymous Inner Class - Inner Class without name(when we want to override the method without creating any subclass)
# Generic Class
- It is a class which is parameterized with type parameters using <T> keyword
- Bounded Generics
  - Upper Bound(<T extends Number>) meaning T can be a member of Number class or its subclass. Here we can use interface.
  - Multi Bound(<T extends Class & Interface1 & Interface2 ...)
  - Wildcards
    - Upper Bounded Wildcard: <? extends 
    - Lower Bounded Wildcard
    - Unbounded Wildcard: <?> only you can read
# POJO Class
  - Plain Old Java Object
  - Contains variables and its getter and setter methods
  - Class should be public
  - No annotations
  - Public default constructor
  - Should not extend any class or interface
# Enum Class
  - Cannot extend any class as in internally extends java.lang.Enum class
  - Can implement interfaces
  - No public constructor
# Final Class
  - Cannot be inherited
# Singleton Class
  - Create one and only one object
  - Different ways of initializing:
    - Eager initialization
    - Lazy initialization
    - Synchronization Block - Handle cases for concurrency by locking and unlocking, kind of slow
    - Double Check Loop(there is memory issue, resolved through Volatile(read & write happens from memory not from cache) instance variable)
    - Bill Pugh Solution
    - Enum Singleton
# Immutable Class
  - Cannot change the object once it is created
  - Class as 'final', members as private and final.
  - Members are initialized using constructor
  - No setter methods, only getter methods(copy).