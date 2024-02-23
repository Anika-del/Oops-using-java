public class G_minmax {

    public static void main(String[] args) {
        
        System.out.println("Enter the numbers : ");
        int no1 = new java.util.Scanner(System.in).nextInt();
         int no2 = new java.util.Scanner(System.in).nextInt();

         int max = 0;
         int min = 0;
        // for(int i=0; i<=no; i++){
        //     System.out.print(" "+i);
            if(no1>no2){
                max = no1;
                min = no2;
                System.out.println(max);
                System.out.println(min);
            }else{
                max = no2;
                min = no1;
            }
        }


  
}
