mport java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i;
		int sum=0;
		
		Scanner snc=new Scanner(System.in);
		System.out.println("Ener the size of number Element:");
		num=snc.nextInt();
		int array[]=new int[num];
		for(i=0;i<num;i++) {
			System.out.println("Enter the   Array:");

			array[i]=snc.nextInt();
			
		}
		for(i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println("Enter the submission:"+sum);
		
	}

}


