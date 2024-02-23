
public class DiffDataTyoe {

    static void show(int x, long l){
        System.out.println("int long");
    }
     static void show(long f, int y){
        System.out.println("long int");
    }
    
    public static void main(String[] args) {
        show(10, 10l);
        show(10l, 10);
        
    }
    
}
