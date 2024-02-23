//Least common multiple

class LCM {
    public static void main(String[] args) {

    int a, b;
    System.out.println("Enter two number: ");
    a = new java.util.Scanner(System.in).nextInt();
    b = new java.util.Scanner(System.in).nextInt();

    int lcm = (a>b)? a:b;
    while(true){
        if(lcm%a==0 && lcm%b==0){
            System.out.println("LCM of entered number :"+lcm);
            break;
        }
        ++lcm;
    }
    }
}
