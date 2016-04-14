import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testCaculate2 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int n=999;
		double N=9999;
		double i=9999;
		double P=999999999;
		for(int j=1;j<=n;j++){
            
            N=(1+i)*N;
        }
        double F;
        F=P*N;
        System.out.print("¸´ÀûÖÕÖµÎª£º"+F);
        Assert.assertTrue(true);
	}

}
