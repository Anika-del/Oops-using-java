class CunsMethod {

    CunsMethod(){   //Constructor     //method call by
        System.out.println("default");
    }
    void CunsMethod(){    //Method     //.Cunstructor have a return type
        System.out.println("Hellow");
    }
    public static void main(String[] args) {
        CunsMethod cm = new CunsMethod();
        new CunsMethod().CunsMethod();
    }
    
}
