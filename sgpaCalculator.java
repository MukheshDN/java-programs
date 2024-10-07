import java.util.*;

class student{
    String usn;
     String name;
     int num;
     int arrCredits[]=new int[10];
     int arrMarks[]=new int[10];

     
   
    
    student( String u,String n,int numOfSubjects){
         this.usn=u;
         this.name=n;        
        this.num=numOfSubjects;
        
    }
   
    void scpa(){
        Scanner sc =new Scanner(System.in);
         // int arrayMarks[] =new int [num];
        int credits[]=new int[num];
        for (int i=0;i<num;i++){
            System.out.println("enter the " +(i+1)+"subject marks");
            arrMarks[i]=sc.nextInt();
            System.err.println("enter the credits");
            credits[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            if (arrMarks[i] <=100 && arrMarks[i]>=90){
                 switch(credits[i]){
                    case 4:
                      arrCredits[i]=40;
                      break;
                    case 3:
                      arrCredits[i]=30;
                      break;
                    case 2:
                      arrCredits[i]=20;
                      break;
                    case 1:
                      arrCredits[i]=10;
                      break;
                    default:
                       System.out.println("enter the correct credits of the subject");
                       break;
                 }
            }
            else if(arrMarks[i] <90 && arrMarks[i]>=80){
                switch(credits[i]){
                    case 4:
                      arrCredits[i]=36;
                      break;
                    case 3:
                      arrCredits[i]=27;
                      break;
                    case 2:
                      arrCredits[i]=18;
                      break;
                    case 1:
                      arrCredits[i]=9;
                      break;
                    default:
                       System.out.println("enter the correct credits of the subject");
                       break;
                 }
            }
            else if(arrMarks[i] <80 && arrMarks[i]>=70){
                switch(credits[i]){
                    case 4:
                      arrCredits[i]=32;
                      break;
                    case 3:
                      arrCredits[i]=24;
                      break;
                    case 2:
                      arrCredits[i]=16;
                      break;
                    case 1:
                      arrCredits[i]=8;
                      break;
                    default:
                       System.out.println("enter the correct credits of the subject");
                       break;
                 }
            }
            else if(arrMarks[i] <70 && arrMarks[i]>=60){
                switch(credits[i]){
                    case 4:
                      arrCredits[i]=28;
                      break;
                    case 3:
                      arrCredits[i]=21;
                      break;
                    case 2:
                      arrCredits[i]=14;
                      break;
                    case 1:
                      arrCredits[i]=7;
                      break;
                    default:
                       System.out.println("enter the correct credits of the subject");
                       break;
                 }
            }
            else if(arrMarks[i] <60&& arrMarks[i]>=50){
                switch(credits[i]){
                    case 4:
                      arrCredits[i]=24;
                      break;
                    case 3:
                      arrCredits[i]=18;
                      break;
                    case 2:
                      arrCredits[i]=12;
                      break;
                    case 1:
                      arrCredits[i]=6;
                      break;
                    default:
                       System.out.println("enter the correct credits of the subject");
                       break;
                 }
            }
            else if(arrMarks[i] <50&& arrMarks[i]>=40){
                switch(credits[i]){
                    case 4:
                      arrCredits[i]=22;
                      break;
                    case 3:
                      arrCredits[i]=15;
                      break;
                    case 2:
                      arrCredits[i]=9;
                      break;
                    case 1:
                      arrCredits[i]=5;
                      break;
                    default:
                       System.out.println("enter the correct credits of the subject");
                       break;
                 }
            }
            else if( arrMarks[i] <40 && arrMarks[i]>=30){
                switch(credits[i]){
                    case 4:
                      arrCredits[i]=18;
                      break;
                    case 3:
                      arrCredits[i]=12;
                      break;
                    case 2:
                      arrCredits[i]=6;
                      break;
                    case 1:
                      arrCredits[i]=4;
                      break;
                    default:
                       System.out.println("enter the correct credits of the subject");
                       break;
                 }
            }
            else if (arrMarks[i]<30){
                    System.out.println(" fail ");
                    continue;
            }
        }
        int sum=0;
        for (int k=0;k<num;k++){
            sum=sum+credits[k]*10;
        }
        int cSum=0;
        for(int m=0;m<num;m++){
           cSum=cSum+arrCredits[m];
        }
        float scpa1=(float)(cSum)/(sum);
        System.out.println(scpa1*10);
        
    
    }
    void display(){
        System.out.println(usn);
        System.out.println(name);
        

 }

}
class studentinfo{
    public static void main(String [] args){
        Scanner nc=new Scanner(System.in);
        student s[]=new student[3];
        for(int k=0 ;k<3;k++){
           System.out.println("enter the usn");
           String usn=nc.next();
           System.out.println("enter the number of subjects");
             int n=nc.nextInt();
           System.out.println("enter the name of the student ");
           String name=nc.next();
            

         s[k]=new student (usn,name,n);
         
         s[k].scpa();

    }

 
        
    }
}
