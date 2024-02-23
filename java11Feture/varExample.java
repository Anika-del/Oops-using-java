//var can be used only with Local Variables and it can not be used as formal paramater
//and class level variable also
class varExample {

   // var s=10;   //Error

   public static void main(String[] args){
    System.out.println("Enter the number : ");
    var days= new java.util.Scanner(System.in).nextInt();
    System.out.println(days);
    System.out.println("Enter the Name : ");
    var no= new java.util.Scanner(System.in).nextInt();
    System.out.println(no);
byte b1 = 10;
byte b2 = 20;
var b3 = b1+b2;
System.out.println(b3);

var s1 = new varExample();
System.out.println(s1);

var ch = 10;
//ch = true;
var z = "Hello";
var b = true;
System.out.println(ch);
System.out.println(z);
System.out.println(b);

var a = 10;
var c = 3;
var d = a/c;
System.out.println(d);
 }     
}
//java 11 support karta h not any one version