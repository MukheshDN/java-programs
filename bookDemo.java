import java.util.*;
class book{
    String name;
    String author;
    double price;
    int num_pages;

   

  void setName(String name){
    this.name=name;
   }



void setAuthor(String author){
    this.author=author;
   }
  

void setPrice(double price){
      this.price= price;
   }


void setNumPages(int num_pages){
      this.num_pages=num_pages;

   }



void getName(){
System.out.println("the  book name is "+name);
}

void getAuthor(){
System.out.println("the  author name is "+author);
}

void getPrice(){
System.out.println("the book price is "+price);
}

void getNumPages(){
System.out.println("the  number of pages is "+num_pages);
}


public String toString() {
        return "Book{" +
               "name='" + name + '\'' +
               ", author='" + author + '\'' +
               ", price=" + price +
               ", numPages=" + num_pages +
               '}';
    }


}


 


class bookDemo{
  public static void main(String args[]){
Scanner sc =new Scanner (System.in);
int n;
System.out.println("enter how many enteries you want");
n=sc.nextInt();
book b[] = new book[n];

for(int i=0;i<n;i++){
  b[i] = new book();
  System.out.println("enter the name of the book");
  String Name=sc.next();
  b[i].setName(Name);

  System.out.println("enter the author name of the book");
  String Author=sc.next();
  b[i].setAuthor(Author);

  System.out.println("enter the price  of the book");
  double Price=sc.nextDouble();
  b[i].setPrice(Price);


  System.out.println("enter the number of pages of the book");
  int  NumPages=sc.nextInt();
  b[i].setNumPages(NumPages);


 System.out.println(b[i]);


}

}
}



  

  




  


