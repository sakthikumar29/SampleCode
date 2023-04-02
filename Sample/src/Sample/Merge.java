package Sample;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,20,30,40,50};//5
		int [] b= {60,70,80,90,100};//5
		int [] c=new int[a.length+b.length];//10
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		int j=0;
		for(int i=a.length;i<c.length;i++) {
			c[i]=b[j];
			j++;
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}
