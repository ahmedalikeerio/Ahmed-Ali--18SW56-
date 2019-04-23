import java.util.*;
public class Task2{
	public static void main(String[] args) {
		int bill,unit;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of unit consumed: ");
		unit=sc.nextInt();
		if(unit==50){
			bill=50*10;
			System.out.print("Your bill is: "+bill);
		}
		else if(unit<=100){
			bill=(50*10)+(50*15);
			System.out.print("Your bill is: "+bill);
		}
		else if(unit<=200){
			bill=(50*10)+(50*15)+(100*20);
			System.out.print("Your bill is: "+bill);
		}
		else if(unit<=300){
		bill=(50*10)+(50*15)+(100*20)+(200*25);
		System.out.print("Your bill is: "+bill);	
		}
		else if(unit>300){
		bill=(50*10)+(50*15)+(100*20)+(200*25)+(unit*30);
		System.out.print("Your bill is: "+bill);	
		}
	}
}
