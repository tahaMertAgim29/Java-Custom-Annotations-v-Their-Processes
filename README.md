# Java-Custom-Annotations-v-Their-Processes

## Introduction
This project demonstrates the creation of custom annotations in Java depending on their types such as
Class, Field (Variable) or Method etc and the processing of them during execution. In this project; class, field and method annotations have been demonstrated


## Features
- Creating custom annotations based on types (class, field or a method)
- Applying the custom annotations
- Processing the custom annotations

## Prerequisities
- Java
- IDE (VScode is used)

## Project Structure
```
+--- Annotations
  |
  +---classAnnotation
  |       Entity.java
  |       LessThan.java
  |       Main.java
  |       MoreThan.java
  |       OutOfIntervalException.java
  |       Processor.java
  |       User.java
  |
  +---fieldAnnotation
  |       AutoIncrement.java
  |       Character.java
  |       Main.java
  |       Printable.java
  |       Processor.java
  |       Required.java
  |       UnidentifiedValueException.java
  |
  \---methodAnnotation
          Divisions.java
          Evaluate.java
          Main.java
          Processor.java
```

>[!NOTE]
> You do not have to create a Springboot or any kind of infrastructure working via Java.
> It's enough to create simple Java files.
> Project Structure command to create in `Windows`
>```
> tree /f /a
>```

>[!IMPORTANT]
> `Processor.java` classes in each package are to process the annotations those classes are independent to each other based on the package. Also,
> Some annotations are dependent to some classes in another package to make it easier to read

## Technologies
![Java](https://img.shields.io/badge/Java%20-%20%23000000?style=for-the-badge&logo=openjdk&logoColor=white)




