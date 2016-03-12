import java.util.Scanner;

public class Fulijisuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double N=1;
		Scanner scanner=new Scanner(System.in);
		System.out.print("若要计算本金请按3否则按0:");
		int num=scanner.nextInt();
		if(num==3){
			double money;
			float year=30;
			float total=3000000;
			double a=0.3;
			for(int j=1;j<=year;j++){
				N=(1+a)*N;
			}
			money=total/N;
			System.out.println("需要本金："+money);
		}
		System.out.print("请选择复利计算(1)or单利计算(2):");
		int choose=scanner.nextInt();
		
		System.out.print("请输入本金：");
		double P=scanner.nextInt();
		System.out.print("请输入利率：");
		double i=scanner.nextFloat();
		System.out.print("存入时间：");
		double n=scanner.nextFloat();
		
		if(choose==1){
			fuli(N, P, i, n);
		}
		else if(choose==2){
			danli(P, i);
		}
	    
	}

	private static void danli(double P, double i) {
		double G;       
        G=P+P*i;
        System.out.print("单利终值为："+G);
	}

	private static void fuli(double N, double P, double i, double n) {
		for(int j=1;j<=n;j++){
			
			N=(1+i)*N;
		}
	    double F;
		F=P*N;
		System.out.print("复利终值为："+F);
	}


}
