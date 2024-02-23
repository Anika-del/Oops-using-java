public class Attendence {

    public static void main(String[] args) {
        
        int held;
        int att;
        System.out.println("Enter attendence : ");
        held = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter attendence : ");
        att = new java.util.Scanner(System.in).nextInt();

        float perc = (att/held)*100;

        if(perc >= 75)
        System.out.println("Sit in the Exam : "+perc);
        else
        System.out.println("Not sit in the Exam"+perc);
    }
}
