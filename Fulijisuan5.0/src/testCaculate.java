

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testCaculate {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int n=3;
		double N=1;
		double i=0.03;
		double P=10000;
		for(int j=1;j<=n;j++){
            
            N=(1+i)*N;
        }
        double F;
        F=P*N;
        System.out.print("¸´ÀûÖÕÖµÎª£º"+F);
        Assert.assertEquals(10927, 10927.27, 1.0);
	}

}
