import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testCaculate4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
        double F=0; //������ֵ
        double i=0.3;//����
        double n=1;	//ʱ��
        double N=1;
        for(int j=1;j<=n;j++){
            N=(1+i)*N;
        }		            
        System.out.println("��Ҫ����"+F/N);
	}

}
