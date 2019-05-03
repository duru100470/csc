package homework;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=1;
		
		for(int i = 1; i < 10; i++) {
			result = 1;
			for(int j = 1; j <= i; j++) {
				result = result*j;
			}
			System.out.print(result + "\n");
		}
	}

}
