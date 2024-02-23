package P1;
import P1.Temp1;   //D:\1CoreJava\Package location of Temp1.java
public class Temp2 {

    public void show(){
        System.out.println("import P1 package in Temp2");
    }
    public static void main(String[] args) {
        new Temp1().show();//call temp1 data
        new Temp2().show();//call temp2 data
    }
}
/*
Open cmd
C:\PackageC>set classpath=D:\1CoreJava\Package

C:\PackageC>javac -d D:\1CoreJava\Package Temp2.java

C:\PackageC>java P1.Temp2
PKI P1 To simple create a package
import P1 package in Temp2

*/