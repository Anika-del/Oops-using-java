class first50prime {

    //Number is first 50 prime no.
    public static void main(String[] args) {
        
    int count = 0;
    System.out.println("Enter no : ");
    int no = new java.util.Scanner(System.in).nextInt();

    for(int i=1; i<=no; i++){
      for(int j=2; j<=i-1; j++){
        if(i%j == 0){
           count++; 
    }
    }
    if(count == 0)
        System.out.print(" "+i);
    else
    count = 0;
}
}

}   
    

