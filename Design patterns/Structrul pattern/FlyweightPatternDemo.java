/*
Flyweight pattern is primarily used to reduce the u and Increase performance. This type of design ban sonated to decrease remory Footsi structural 
pattern as ways to decrease objects count thus Improving applicamen required objects structure this pattern provides.

 Flyweight pattern try to reuse already existing similar kind objects by storing them and creates new object when no matching object is found. 
We'll demonstrate this pattern by drawing 20 circle of different locations but we'll creating only 5 objects. 
Only 5 colors are available so color property is used to check already existing Circle objects.
Implementation

We're going to create a Shape interface and concrete class Circle implementing the Shape Interface. A factory class ShapeFactory is defined as a next step.

ShapeFactory have a HashMap of Circle having key as color of the Circle object. Whenever a request comes to create a circle of particular color to 
ShapeFactory. ShapeFactory checks the circle object in its HashMap, if object of Circle found, that object is returned otherwise a new object is created, 
stored in hashmap for future use and returned to client.

Fly WeightPatternDemo, our demo class will use ShapeFactory to get a Shape object. It will pass information (red/green / blue/ black / white) to 
ShapeFactory to get the circle of desired color it needs.

*/

import java.util.HashMap;

interface Shape {
void draw();
}

class Circle implements Shape {
private String color;
private int x;
private int y;
private int radius;

public Circle(String color) {
this.color = color;
}
public void setX(int x) {
this.x = x;
}

public void setY(int y) {
this.y = y;
}

public void setRadius(int radius) {
this.radius = radius;
}

@Override
public void draw() {
System.out.println("Circle: Draw() [Color:" + color 
 +", x:"+ x +", y:" + y +", radius:" + radius);
}
}

class ShapeFactory {
private static final HashMap<String, Shape> circleMap = new HashMap();

public static Shape getCircle(String color) { 
Circle circle = (Circle)circleMap.get(color);

if(circle == null) {
circle = new Circle(color);
circleMap.put(color, circle);
System.out.println("Creating circle of color:" + color);
}
return circle; 
}
}

class FlyweightPatternDemo {

private static final String colors[] = {"Red", "Green", "Blue", "White", "Black" };

public static void main(String[] args) {

for(int i=0; i < 20; ++i) {
Circle circle =
(Circle) ShapeFactory.getCircle(getRandomColor()); 
circle.setX(getRandomX());
circle.setY(getRandomY()); 
circle.setRadius(100); 
circle.draw();
}
}

private static String getRandomColor() { 
 return colors[(int)(Math.random()*colors.length)]; 
 }
private static int getRandomX() { 
return (int)(Math.random()*100);
}
private static int getRandomY()
{
return (int)(Math.random()*100);
}
}
/*

D:\Design patterns\Structrul pattern>javac FlyweightPatternDemo.java
Note: FlyweightPatternDemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

D:\Design patterns\Structrul pattern>java FlyweightPatternDemo
Creating circle of color:Blue
Circle: Draw() [Color:Blue, x:61, y:80, radius:100
Creating circle of color:Black
Circle: Draw() [Color:Black, x:75, y:90, radius:100
Creating circle of color:Red
Circle: Draw() [Color:Red, x:63, y:91, radius:100
Circle: Draw() [Color:Black, x:4, y:12, radius:100
Circle: Draw() [Color:Red, x:63, y:82, radius:100
Creating circle of color:Green
Circle: Draw() [Color:Green, x:69, y:75, radius:100
Circle: Draw() [Color:Green, x:52, y:81, radius:100
Circle: Draw() [Color:Green, x:8, y:44, radius:100
Circle: Draw() [Color:Red, x:5, y:91, radius:100
Circle: Draw() [Color:Blue, x:83, y:37, radius:100
Circle: Draw() [Color:Blue, x:73, y:2, radius:100
Circle: Draw() [Color:Black, x:73, y:94, radius:100
Creating circle of color:White
Circle: Draw() [Color:White, x:78, y:77, radius:100
Circle: Draw() [Color:Blue, x:64, y:90, radius:100
Circle: Draw() [Color:White, x:22, y:8, radius:100
Circle: Draw() [Color:Black, x:79, y:97, radius:100
Circle: Draw() [Color:Green, x:98, y:66, radius:100
Circle: Draw() [Color:Black, x:40, y:58, radius:100
Circle: Draw() [Color:Blue, x:36, y:22, radius:100
Circle: Draw() [Color:White, x:27, y:8, radius:100

D:\Design patterns\Structrul pattern>
*/