/*
Facade pattern hides the complexities of the systems and prays an interface to the client using which the client can access the system. This type of design 
pattern cumes under structural pattern as this pattern adds an interface to exiting system to hide its complexities
This pattern involves a single class which provides simplified methods which are required by client and delegates calls to existing system classes methods. 
Implementation
We're going to create a Shape interface and concrete classes implementing the Shape interface, & facade
class ShapeMaker is defined as a next step.

ShapeMaker class uses the concrete classes to delegates user calls to these classes, FacadePatternDemo, our demo class will use ShapeMaker class to show 
the results.*/



interface Shape {

void draw();
}

class Rectangle implements Shape {
@Override
public void draw() {
System.out.println("Rectangle::draw()");
}
}

class Square implements Shape {
@Override
public void draw() {
System.out.println("Square::draw()");
}
}

class Circle implements Shape {
@Override
public void draw() {
System.out.println("Circle::draw()");
}
}

class ShapeMaker
{
private Shape circle;
private Shape rectangle;
private Shape square;

public ShapeMaker() {

circle = new Circle();
rectangle = new Rectangle(); 
square = new Square();
}

public void drawCircle(){
circle.draw();
}
public void drawRectangle(){
rectangle.draw();
 }
public void drawSquare(){
square.draw();
 }
 }

class FacadePatternDemo {

public static void main(String[] args) {

ShapeMaker shapeMaker = new ShapeMaker();

shapeMaker.drawCircle();
shapeMaker.drawRectangle();
shapeMaker.drawSquare();

}
}
/*
D:\Design patterns\Structrul pattern>java FacadePatternDemo
Circle::draw()
Rectangle::draw()
Square::draw()
*/