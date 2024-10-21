abstract class shape{
     int a;
     int b;
     shape (int a){
      this.a=a;
      }
   shape(int a, int b){
     this.a =a;
     this.b=b;
    } 
      
     abstract void printArea();

}

class rectangle extends shape{

     rectangle(int a, int b){
         super(a,b);
       }
      
      @Override
      void printArea(){
          System.out.println("the area  of rectangle is "+(this.a*this.b));
        }


}

class triangle extends shape{

    triangle(int a, int b){
         super(a,b);
       }
      
     @Override
      void printArea(){
          System.out.println("the area of triangle is "+0.5*(this.a*this.b));
        }


}

class circle extends shape{

    circle(int a){
         super(a);
       }
      
      @Override
      void printArea(){
          System.out.println("the area of circle is "+(3.14*this.a*this.a));
        }


}


class shapeDemo{
  public static void main(String args[]){

     rectangle r1=new rectangle(10,20);
      triangle t1=new triangle(10,20);
     circle c1=new circle(10);
    r1.printArea();
     t1.printArea();
    c1.printArea();

}
}
    
   



  
