public class ReturnType {
    

    static void show(char ch){
        System.out.println("No return type ");
    }
    static int show(int z){
        System.out.println("With return type ");
        return z;
    }

    public static void main(String[] args) {
        show('a');
        //show(200);
          int z = show(10);
          System.out.println(z);
    }
}
