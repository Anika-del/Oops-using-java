//use super and this
class A {

    A(){                     //default Constructor
        System.out.println("A");    
    } 
}
class B extends A{
    B(int x){                  //parameterised Constructor
        System.out.println(x);
    }
    B(){                       //default Constructor
        System.out.println("B");
    }
}
class C extends B{
    C(){                //default Constructor
       super(10);
      // this(10);
      System.out.println("C");
    }
    C(int x){
      System.out.println(x);
    }
    public static void main(String[] args) {
       // new C();  //A 10 C
       new C(12);   //A B 12
    }
}
