/*
 * 
    Step 1: Create a class that represents a circle shape. The class should be named as Circle and include the following three integer fields:
        x : the x coordinate
        y : the y coordinate
        r : the radius
        Choose appropriate access modifiers for the fields so that they cannot be accessed by other classes.

    Step 2: Create methods that provide access and modification (getters and setters) to the x, y and r fields.
        Choose appropriate names that briefly describe the functionality of each method
        Choose appropriately the return type and access modifiers of your methods

    Step 3: Create a default constructor that initializes a Circle to x=y=0 and r=5
    Step 3.1: Create an overloaded constructor that initializes all three instance variables
    Step 4: Create a method printCircleDetails that prints the details of your circle in the following message

      * I'm a circle at point (x,y) with radius r

    Where x,y and r are the values of the current circle

    Step 5: Create a new class named TestCircles in the same package (directory) as your Circle class.
    Create a main method in your TestCircles class. In the main method:
        create a circle object,
        assign values (of your preference) to the object using the setter methods from Step 2 and
        print the details of your circle using the printCircleDetails method from Step 3

    Compile and run your program!

    Step 6: Create an overloaded constructor which will initialize the x & y instance variables. The r instance variable should be initialized by calling the constructor from Step 3
    In your main method, create objects using each one of the (now three) available constructors and print (using the print method) your objects

    Step 7: Extend the functionality of your class by adding the following two methods:
        the calculateArea which will calculates and returns the area (ð*radius*radius, ð=3.14) and
        the calculatePerimeter which will calculates and returns the perimeter (2*ð*radius, ð=3.14)
    Choose the appropriate return types for your methods
    Test the functionality of the two new methods with the Circles that you created earlier in your main method

Step 8: Add to your class a static and final field name pi (for ð). Initialize its value upon declaring the field. Then, modify your calculateArea and calculatePerimeter methods of Step 7 so that they make use of the new pi field.
 
    Step 9: Create a copy constructor for your Circle class.
        Create two circles where the second one will be a copy of the first one
        Print their details
        Change the values of the first circle and print again their details
        What do you observe? Explain your findings according to the memory allocation in slide #17

    Step 10: Create a method name cocentric that checks if two circles share the same centre (co-centric circles). The method should return true if circles are co-centric, or false if circles have different centres.
    What is the return type of the method?
    What type of argument should your method have?

    Step 11: Declare a field named numberOfCreatedCircles that is common to all instances of class Circle and counts the number of the created circles. Think carefully of:
        the type of your numberOfCreatedCircles field,
        any special modifiers that might need and,
        the place/places that the value of the field should be incremented

 */


package three_exerc1;

public class TestCircles {

	public static void main(String[] args) {
Circle c1=new Circle();
c1.setX(3);
c1.setY(3);
c1.setR(5);
c1.printCircleDetails();

Circle c2=new Circle();
Circle c3=new Circle(9,9,3);

Circle c4=new Circle(10,10);

System.out.print("\n");
c2.printCircleDetails();
System.out.println("Area of circle: "+c2.calculateArea());
System.out.println("Perimeter of circle: "+c2.calculatePerimeter());
System.out.print("\n");
c3.printCircleDetails();
System.out.println("Area of circle: "+c3.calculateArea());
System.out.println("Perimeter of circle: "+c3.calculatePerimeter());
System.out.print("\n");
c4.printCircleDetails();
System.out.println("Area of circle: "+c4.calculateArea());
System.out.println("Perimeter of circle: "+c4.calculatePerimeter());
System.out.print("\n");

Circle c5=new Circle(6,6,13);
c5.printCircleDetails();
System.out.println("Area of circle: "+c5.calculateArea());
System.out.println("Perimeter of circle: "+c5.calculatePerimeter());
System.out.print("\n");

Circle c6=new Circle(c5);
c6.printCircleDetails();
System.out.println("Area of circle: "+c6.calculateArea());
System.out.println("Perimeter of circle: "+c6.calculatePerimeter());
System.out.print("\n");
	
c5.setX(13);
c5.setY(13);
c5.setR(25);
c5.printCircleDetails();
System.out.println("Area of circle: "+c5.calculateArea());
System.out.println("Perimeter of circle: "+c5.calculatePerimeter());
System.out.print("\n");

c6.printCircleDetails();
System.out.println("Area of circle: "+c6.calculateArea());
System.out.println("Perimeter of circle: "+c6.calculatePerimeter());
System.out.print("\n");

Circle c7=new Circle(4,5,15);
Circle c8=new Circle(4,5,13);
System.out.println(c7.cocentric(c7, c8));
System.out.println("Number Of Created Circles: "+Circle.numberOfCreatedCircles);
	}
	
}
