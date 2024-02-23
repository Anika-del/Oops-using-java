class FunctionAsClassName {

    FunctionAsClassName(){   //constructor
      System.out.println("Default");
    }
    void FunctionAsClassName(){    //function
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new FunctionAsClassName().FunctionAsClassName();
    }
    
}
