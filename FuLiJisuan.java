import java.util.Scanner;

public class FuLiJisuan {
 @SuppressWarnings("resource")
static void main(String[] args) {
		// TODO 自动生成的方法存根
		float F,P = 0,i=0,N=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入本金："+P);
		scanner.nextFloat();
		System.out.println("请输入利率："+i);
		scanner.nextFloat();
		System.out.println("请输入利率获取时间的整数倍："+N);
		scanner.nextFloat();
		for(int j=0;j<N;j++){
			N=(1+i)*N;
		}
		F=P*N;
		System.out.print("复利终值为："+F);
			

	}

}
