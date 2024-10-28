// passing one parameter     
class Gen<T>{

     T ob;

    Gen(T O){
       ob=O;
     }

    T getOb(){
     return ob;
    }

    void showType(){
     System.out.println(" type of T is " +ob.getClass().getName());
    }


}


class genDemo{
      public static void main(String args[]){
      Gen<Integer> iob;
     iob=new Gen<Integer>(99);// autoboxing 
      iob.showType();
     

     int v =iob.getOb() ; // autounboxing
      System.out.println("autoboxed value of integer is "+v);

     Gen<Double> dob=new  Gen<Double>(3.14);
     dob.showType();
     double m=dob.getOb();
      System.out.println("autoboxed value double is is "+m);
}
}

// passing two parameters 
class Gen<T,B>{

     T ob;
     B oj;

    Gen(T O,B M){
       ob=O;
       oj=M;
     }

    T getOb(){
     return ob;
    }
     B getOj(){
     return oj;
    }

    void showType(){
     System.out.println(" type of B is " +oj.getClass().getName());

     System.out.println(" type of T is " +ob.getClass().getName());
    }


}


class genDemo2{
      public static void main(String args[]){
      Gen<Integer, Double> iob=new Gen<> (88,3.14);

     int m=iob.getOb();
    double n =iob.getOj();
     iob.showType();
     System.out.println("the value of m is "+m);   
    System.out.println("the value of n is "+n);



 
    }
}
