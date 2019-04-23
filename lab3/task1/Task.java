import java.util.*;
public class Task{
public static void main(String args[]){
int m1,m2,m3,total;
Scanner scan=new Scanner(System.in);
System.out.print("Enter mark of c++:");
m1=scan.nextInt();
System.out.print("Enter mark of Data Structure:");
m2=scan.nextInt();
System.out.print("Enter mark of Operating System:");
m3=scan.nextInt();
total=(m1+m2+m3);
System.out.println("Total marks obtained:"+total);
double perct=(total*100)/300;
System.out.println("Percentage :"+perct);
if(perct>90){
System.out.println("Grade: A");
}
else if(perct>=80){
System.out.println("Grade: B");
}
else if(perct>=70){
System.out.println("Grade: C");
}
else if(perct>=60){
System.out.println("Grade: D");
}
else if(perct<60){
System.out.println("You are fail");
}
}

}