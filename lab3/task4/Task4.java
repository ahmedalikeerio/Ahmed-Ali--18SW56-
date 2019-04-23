public class Task4{
	public static void main(String[] args) {
		int a,b,c;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	String s=args[2];
	if(s=="+"){
		System.out.print("Addition of numbers is: "+(a+b));
	}
	else if(s=="-"){
		System.out.print("Substraction of numbers is: "+(a-b));
	}
	else if(s=="*"){
		System.out.print("Mulltilication of numbers is: "+(a*b));
	}
	else if(s=="/"){
		System.out.print("Division of numbers is: "+(a/b));
	}
	} 
}