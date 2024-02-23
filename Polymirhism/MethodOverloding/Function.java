//import java.util.*;

public class Function {

    static void show(){
        System.out.println("No argument ");
    }
    static void show(int a){
        System.out.println("Single arrgument ");
    }
    static void show(int a, int b){
        System.out.println("Two arguments ");
    }
    static void show(int a, int b, int c){
        System.out.println("Three arguments ");
    }

    public static void main(String[] args) {
       
        show();
        show(10);
        show(10, 20);
        show(10, 20, 30);

    }   
}
