package version6;

import java.util.Scanner;
import ExeCeption.Arith;
public class mAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=0;
		Library li=new Library();
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt();
		try {
			if(n<1 || n>20)
			{
				throw new Arith("Constrait over");
			}else {
				li.sqr(n);
				li.dble(n);
				li.fact(n);
			}
		} catch(Arith e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
