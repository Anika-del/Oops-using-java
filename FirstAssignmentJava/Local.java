//How to make sub package
package L1.sub.sub1; //class file in sub package p1\sub\sub1\Temp1.class
public class Local {

    public void show(){
        System.out.println("create Sub Package in p1/sub/sub1/Local.class");
    }
        public static void main(String[] args) {
            new Temp1().show();    //call member function of Temp1
    }
}
/*
D:\1CoreJava\Package\StaticInstant\SubPackage>javac -d . Temp1.java
>java p1.sub.sub1.Temp1

//output
create Sub Package in p1/sub/sub1/Temp1.class

*/
/*
D:\1CoreJava\Package\StaticInstant\SubPackage>set classpath=D:\1CoreJava\Package\StaticInstant\SubPackage;

>javac -d D:\1CoreJava\Package\StaticInstant\SubPackage Tempp1.java

>java p1.sub.sub1.Tempp1
//output

import sub package of p1.sub.sub1.Temp1 in Tempp1
create Sub Package in p1/sub/sub1/Temp1.class
 */