package class_4;

public class Circle_loop {

	public static void main(String[] args) {
		int i,j,k;
		for (i=1;i<5;i++) {
			for(j=1;j<5;j++) {
				if(i==1||i==4) {
				System.out.print("*");
				}
				else {
					for(i=2;i<4;i++) {
						System.out.print("*");
				}
			}
			
			}
			System.out.println();
		}

	}

}
