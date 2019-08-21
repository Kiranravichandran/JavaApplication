package sqr;

public class sqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 public static void sqr(int n)
		    { int t;
		    	for(int i=1;i<=n;i++) {
					t=i;
					for(int j=1;j<=5;j++) {
						System.out.print(t+"\t");
						t*=t;
					}
					System.out.println("");
				}
				System.out.println("***");
		    }
	}

}
