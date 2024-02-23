//Instance using static method
interface My {
    static void show(){
        System.out.println("My");
    } 
// }
// class Child implements My{ 
    //we don't need to implement My in static because it is access by class name directly 

    //Jdk execute program if in program a MAIN METHOD not matter it is a Interface or it is a Class.
      public static void main(String[] args) {
        show();
    }
    
}
