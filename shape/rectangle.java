class rectangle extends shape {
  
     void area(double l,double b){
        double result = l*b;
        System.out.println(result);
    }
  
    void perimeter(double l,double b){
        double result = 2*(l+b);
        System.out.println(result);

    }
}
