/*
Decorator design pattern is used to modify the functionality of an object at runtime. At the same time other Instances of the same class will not be
 affected by this, so individual object gets the modified behavior.
 
Decorator pattern allows to add new functionality an existing object without altering its structure. This type of design pattern comes under structural
 pattern as this pattern acts as a wrapper to existing class.
 


This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

Decorator design pattern is used to enhance the functionality of a particular object at run-time or dynamically.

At the same time other instance of same class will not be affected by this so individual object gets the new behavior.
 Basically we wrap the original object through decorator object. Decorator design pattern is based on abstract classes and we derive concrete 
 implementation from that classes,

We are demonstrating use of Decorator pattern via following crample in which we'll decorate a shape with some color without alter shape class. 
Implementation
We're going to create a Shape interface and concrete classes implementing the Shape interface. We then create a abstract decorator class ShapeDecorator 
implementing the Shape interface and having Shape object as its instance variable.

RedShape Decorator is concrete class implementing ShapeDecorator.
Decorator PatternDemo, our demo class will use RedShapeDecorator to decorate Shape objects.
*/


interface Shape {

void draw();
}

class Rectangle implements Shape {
@Override

public void draw() {
System.out.println("Shape: Rectangle");
}
}

class Circle implements Shape {
@Override
public void draw() {
System.out.println("Shape: Circle");
}
}

abstract class ShapeDecorator implements Shape {
protected Shape decoratedShape;

public ShapeDecorator(Shape decoratedShape){ 
this.decoratedShape = decoratedShape;
}

public void draw(){
decoratedShape.draw();
 }
 }
 
class RedShapeDecorator extends ShapeDecorator {
public RedShapeDecorator (Shape decoratedShape) {
super(decoratedShape);
}
@Override
public void draw() {
decoratedShape.draw();
setRedBorder(decoratedShape);
}

private void setRedBorder(Shape decoratedShape) { 
  System.out.println("Border Color: Red");
}
}


class DecoratorPatternDemo
{
public static void main(String[] args) {
	
Shape circle = new Circle();

Shape redCircle = new RedShapeDecorator(new Circle());
Shape redRectangle = new RedShapeDecorator(new Rectangle()); 
System.out.println("Circle with normal border"); 
circle.draw();

System.out.println("\nCircle of red border"); 
redCircle.draw();
System.out.println("\nRectangle of red border"); 
redRectangle.draw();
}
}


/*D:\Design patterns\Structrul pattern>java DecoratorPatternDemo
Circle with normal border
Shape: Circle

Circle of red border
Shape: Circle
Border Color: Red

Rectangle of red border
Shape: Rectangle
Border Color: Red
*/		a