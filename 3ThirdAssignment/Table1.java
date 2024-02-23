//1 to n teble
class Table1 {

    public static void main(String[] args) {
        
        System.out.println("Enter no. : ");
        int n = new java.util.Scanner(System.in).nextInt();

        for(int i=2; i<=n; i++){
            for(int j=1; j<=10; j++){
                System.out.println(i+" * "+j+" = "+(i*j));

            }
        }
    }

    
}
