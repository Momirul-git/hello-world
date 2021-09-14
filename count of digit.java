import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int count=0;
		
		Scanner snc= new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		num=snc.nextInt();
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Number of digit"+count);

	}

}
