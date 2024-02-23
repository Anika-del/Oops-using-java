class LocalFinalVariable {

    public static void main(String[] args) {
        final int x = 10;
       // x = x+10; //you can't modify the  value after Final
        System.out.println(x);

        LocalFinalVariable f1 = new LocalFinalVariable();
       // f1 new LocalFinalVariable();
    }
    
}
