import java.util.Scanner;

public class Fulijisuan {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double N=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("请选择复利计算(1)or单利计算(2)or计算本金(3)or投资年数(4)or报酬率(5)or年资产总值(6)or月资产总值(7):");
        int choose=scanner.nextInt();
      
        if(choose==1){
        	System.out.print("请输入本金：");
	        float P=scanner.nextInt();
	        System.out.print("请输入利率：");
	        float i=scanner.nextFloat();
	        System.out.print("存入时间：");
	        float n=scanner.nextFloat();
            fuli(N, P, i, n);
        }
        if(choose==2){
        	System.out.print("请输入本金：");
	        float P=scanner.nextInt();
	        System.out.print("请输入利率：");
	        float i=scanner.nextFloat();
	        System.out.print("存入时间：");
	        float n=scanner.nextFloat();
            danli(P, i,n);
        }
        if(choose==3){
            double money;
            float year=30;
            float total=3000000;
            double a=0.30;
            for(int j=1;j<=year;j++){
                N=(1+a)*N;
            }
            money=total/N;
            System.out.println("需要本金："+money);
        }
        if(choose==4){
        	double baochoulv=0.1;
	        double money=1000000;
	        double year;
	        year=2000000/(money*baochoulv);
	        System.out.print("经过"+year+"年100万变成200万");
        }
        if(choose==5)
        {
        	double money1=1000000;
        	double money2=2000000;
        	double year=10;
        	double baochoulv;
        	baochoulv=money2/(money1*year);
        	System.out.print("报酬率为："+baochoulv);
        }
        if(choose==6)
        { 
        	double money=30000;
        	for(int i=1;i<=30;i++)
        	{
        		money=(money*0.03)+money;
        	}
        	System.out.print("30年后的总产值为："+money);
        }
        if(choose==7)
        { 
        	double money=3000;
        	for(int i=1;i<=30*12;i++)
        	{
        		money=(money*0.03)+money;
        	}
        	System.out.print("30年后的总产值为："+money);
        }
        
    }

    private static void danli(double P, double i,double n) {
        double G; 
        
        G=P+P*i*n;
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