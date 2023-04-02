package Sample;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6;j++) {
				if(i>=j) {
					System.out.print("* ");
				}
				else if(i+1>=j && i>5/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
