package homework;

public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int head = 1;
		int mid =1;
		int rear =1;
		
		for(int i = 0; i <15; i++) {
			System.out.println(head);
			rear = head + mid;
			head = mid;
			mid = rear;
		}
	}

}
