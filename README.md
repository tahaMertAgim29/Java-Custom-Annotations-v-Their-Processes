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

## Custom Annotations

Here is the table of custom annotations below declared, used and processed during runtime in the project

|#|Annotation Name|Annotation Level|Packages used in|Explanation|
|-|----------------|---------------|----------------|-----------|
|1|Evaluate|Method|methodAnnotation|It is used to make it clear the process of the annotations, showing a simple example for annotations to process during `runtime`|
|2|AutoIncrement|Field|fieldAnnotation & classAnnotation|It is used to increase the ID value or any type of number value attribute automatically, just like in databases|
|3|Required|Field|fieldAnnotation & classAnnotation|It is used to make it clear whether the attribute must be valid or not which is in similar to `Not Null` in databases|
|4|Printable|Method|fieldAnnotation & classAnnotation|It is used to print the relative class variables in packages, in similar to print `toString()` via Annotations|
|5|Entity|Class|classAnnotation|It is used to imply database entities in custom where there is a parameter named `name` to set the name of table/entity|
|6|MoreThan|Field|classAnnotation|It is used to imply that the number variable must be more than the variable entered in annottation via `limit` parameter e.g. @MoreThan(limit = 12)|
|7|LessThan|Field|classAnnotation|It is used to imply that the number variable must be less than the variable entered in annotation via `limit` parameter e.g. @LessThan(limit = 12)|


>[!WARNING]
> Annotations do not have to have only one annotation level. For example an annotation may have both field and parameter level at the same time depending on how you work with them.
>In this project, it is just not represented.

## Technologies
![Java](https://img.shields.io/badge/Java%20-%20%23000000?style=for-the-badge&logo=openjdk&logoColor=white)




