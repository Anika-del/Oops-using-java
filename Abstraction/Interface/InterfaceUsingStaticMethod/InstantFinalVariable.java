class InstantFinalVariable {

    final int x = 20;
    public static void main(String[] args) {
        InstantFinalVariable t = new InstantFinalVariable();

        //t.x = t.x+10;
        System.out.println(t.x);
        InstantFinalVariable t1 = new InstantFinalVariable();

        //t1.x = t1.x+10;
        System.out.println(t1.x);
    }
    
}
