/*
1- Create a base class Vehicle with fields brand and method start().

Create subclasses Car and Bike with additional methods (openTrunk(), kickStart()).

Demonstrate using both.

class Vehicles{
    private String brand;

    void start(){
        System.out.println("The car is starting");
    }
}

class Cars extends Vehicles {

    void openTrunk(){
        System.out.println("Trunk is open");
    }

}
class Bike extends Vehicles{

    void kickStart(){
        System.out.println("Kick to start");

    }
}
public class Machine {
    public static void main(String[] args){
        Vehicles obj1 = new Vehicles();
        Bike obj2 = new Bike();
        Cars obj3 = new Cars();

        obj1.start();
        obj2.kickStart();
        obj3.openTrunk();

    }
}






2-Create a class Car with attributes brand, model, and year. Write a method displayDetails() to print car info.

In the main method, create two Car objects and display their details.


class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m , int y){
        this.brand=b;
        this.model=m;
        this.year=y;

    }
    public void   displayDetails(){
       System.out.println("Brand : " + brand + "Model :" + model+ " Year : " + year);
    }

public static void main(String[] args){
        Car obj = new Car("Unknown" , "123AB" , 2006);

        obj.displayDetails();
      }

    }





3- this keyword

  Beginner

Create a class Book with fields title and author.

Use this keyword inside constructor to differentiate between instance variables and parameters.


class Book{
    private String title;
    private String author;

    public  Book( String title , String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

}
public class Machine {
    public static void main(String[] args){
       Book obj = new Book("Harry Potter" ,"Unknown");

        System.out.println(obj.getTitle());
        System.out.println(obj.getAuthor());
    }
}





4- Beginner-Intermediate

Create a class Employee with fields id, name, and salary.

Add a method setSalary(double salary) that uses this.salary = salary.

Add a method display() to print details.

Demonstrate updating salary.

class Employees{
    private String id;
    private String name;
    private double salary;

    public Employees(String id, String name){
        this.id=id;
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public void display(){

        System.out.println("Employee ID :" + name + "\nEmployee name "+ name +"\nEmployee salary : INR " + salary);
    }
}
public class Machine {
    public static void main(String[] args){
        Employees obj = new Employees("123A","unknown");
        obj.setSalary(1000);

        obj.display();

    }
}






5. Method Overloading & Overriding

 Beginner

Create a class Calculator with methods add(int a, int b) and add(double a, double b) (overloading).

Call both methods.


class Calculators{

    public int add (int a,int b) {
        return a+b;
    }
        public double  add(double a, double b){
        return a + b;

    }
}
public class Machine {
    public static void main(String[] args){
        Calculators obj= new Calculators();

        System.out.println(obj.add(23,23));
        System.out.println(obj.add(23.3,56.4));

    }
}





6-Beginner-Intermediate

Create a base class Shape with method area().

Create subclasses Circle and Rectangle overriding area().

Demonstrate overriding with different objects.



class Shape{

    public void area(){

        System.out.println("Area of the shape");
    }
}
class Circle extends Shape{

    public void area(){
        System.out.println("Area of the circle");
    }
}
class Rectangle extends Shape{

    public void area(){
        System.out.println("Area of the Rectangle");
    }
}
public class Machine {
    public static void main(String[] args){

        Shape obj = new Shape();
        Shape obj1= new Circle();
        Shape obj2= new Rectangle();

        obj.area();
        obj1.area();
        obj2.area();
    }
}







7. super keyword

 Beginner

Create a base class Person with a constructor taking name.

Create subclass Student which uses super(name) to call parent constructor.

class Person {

   protected  String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }
}

class Student extends Person {

    private int age;
    public Student(String name, int age) {
        super(name);
        this.age=age;
    }


    public void display() {
        System.out.println(super.name);
        System.out.println(age);
    }
}

public class Machine {
    public static void main(String[] args) {

        Person obj = new Person("Rahul");
        Student obj1= new Student("Unknown" , 23);

        obj.display();
        obj1.display();

    }
}







8-Beginner-Intermediate

Create a base class Animal with method eat().

Create subclass Dog that overrides eat(), but still calls super.eat() before its own message.



class Animal{

    public void eat(){
        System.out.println("Eating");
    }
}
class Dogs extends Animal{

    public void eat(){
        super.eat();
        System.out.println("Dog eating");
    }
}

public class Machine {
    public static void main(String[] args) {
        Dogs obj = new Dogs();
        obj.eat();

    }
}








 9. Polymorphism (Compile-time & Runtime)

Beginner

Compile-time: Implement method overloading in a class Printer → print(String) and print(int).

Runtime: Create a class Bird with method fly(). Subclass Parrot overrides it. Call with Bird b = new Parrot();



class Printer{

    public void print(String name){
        System.out.println(name);
    }
    public void  print(int num) {
        System.out.println(num);
    }
}

public class Machine {
    public static void main(String[] args) {
      Printer obj = new Printer();

      obj.print("Daisy");
      obj.print(23);

    }
}


class Bird{

    public void fly(){
        System.out.println("Birds are flying......");
    }
}
class Parrot extends Bird{

    public void fly(){
        System.out.println("Parrot has huge feather...");
    }
}

public class Machine {
    public static void main(String[] args) {
        Bird b = new Parrot();
        b.fly();


    }
}








10-Beginner-Intermediate

Create a class hierarchy:

Shape (base)

Circle, Rectangle, Triangle (subclasses).

Store objects in a Shape[] array and loop to call area() (runtime polymorphism).

abstract  class Shape{

    public abstract double area();


}
class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double area(){
        System.out.print("Area of Circle : ");
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double area(){
        System.out.print("Area of Rectangle : ");
        return length*breadth;
    }
}
class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }

    public double area(){
        System.out.print("Area of Triangle : ");
        return 0.5*base*height;
    }
}
public class Machine {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];

        s[0]=new Circle(25.5);
        s[1]=new Rectangle(35.3,45.4);
        s[2]=new Triangle(22.2, 25.2);

        for (int i = 0; i < s.length; i++) {

            System.out.printf("%.3f\n", s[i].area());

        }
    }
}
 */