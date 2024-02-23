class Prime {

    public static void main(String[] args) {
        
        int no = 50;
        int count = 0;
        for(int i=1; i<=no; i++){
            for(int j=2; j<=i-1; j++){
                if(i%j==0){
                    count++;
                }
            }
                if(count == 0){
                    System.out.println(i);
                }else{
                    count = 0;
                }
            }
        }
}


