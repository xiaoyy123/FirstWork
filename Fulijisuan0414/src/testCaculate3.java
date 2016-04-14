import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testCaculate3 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		double n=0.2;
		double N=0;
		double i=0.5632;
		double P=1000;
		for(int j=1;j<=n;j++){
            
            N=(1+i)*N;
        }
        double F;
        F=P*N;
        System.out.print("¸´ÀûÖÕÖµÎª£º"+F);
 //       Assert.assertTrue(true);
	}

}
