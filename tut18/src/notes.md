# Annotation
https://notebook.zohopublic.in/public/notes/u3i1sd9ea4e81ceef491cb4bd1ee221daa89f

- Kind of adding metadata to java code. It's Optional.
- We can use Metadata at runtime and add certain logic to our code, by using reflection.
- Can be applied anywhere Class, Methods, Interface, Fields

@Deprecated
@Override
@SuppressWarnings
@FunctionalInterface
@SafeVarargs // Suppress Heap Pollution Warning

Meta Annotation(Annotation over Annotation):
@Target // Where to apply the annotation using ElementType like ElementType.METHOD , ElementType.CONSTRUCTOR

@Retention // How annotation will be stored in java
- RetentionPolicy.SOURCE(Not available in .class)
- RetentionPolicy.CLASS(Available in .class but ignored by JVM in runtime)
- RetentionPolicy.RUNTIME(Available in .class and run by JVM in runtime. Use of reflection can be done here)

@Documented
- Annotations are ignored when Java Documentation is generated.
- With this annotations will be visible in Java Doc.

@Inherited
- By default, Annotations applied on Parent Class are not applied on Child Class.
- @Inherited on Annotation will be applied to Parent and all its Child.

@Repeatable
- Allow us to use same annotation more than once at same place.
- Java8 and above

```java
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Categories.class)
@interface Category {
    String name();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Categories {
    Category[] value();
}


@Category(name = "Bird")
@Category(name = "LivingThing")
@Category(name = "Carnivore")
public class Eagle{
    
}
```