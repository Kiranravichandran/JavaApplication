package version;
import java.util.Scanner;
import exception.invalidconstraints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class main {
	private static final Logger logger=LoggerFactory.getLogger(main.class);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int t=0;
        Library li=new Library();
        logger.info("Logger testing");
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        try {
            if(n<1 || n>20)
            {
                throw new invalidconstraints("Your value is incorrect");
            }else {
                li.sqr(n);
                li.dble(n);
                li.fact(n);
            }
        } catch(invalidconstraints e)
        {
            logger.error(e.toString());
        }
        catch(Exception e)
        {
            logger.error(e.toString());
        }
        
    }
}