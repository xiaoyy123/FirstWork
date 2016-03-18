import java.util.Scanner;

public class Fulijisuan {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double N=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("请选择复利计算(1)or单利计算(2)or计算本金(3)or投资年数(4)or报酬率(5)or年资产总值(6)or月资产总值(7)or等额还款(8):");
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
            System.out.println("请输入存入本金：");
            double P=scanner.nextDouble();
            System.out.println("请输入复利终值：");
            double F=scanner.nextDouble();
            System.out.println("请输入年利率：");
            double i=scanner.nextDouble();
            int year=(int)((Math.log(F)/Math.log(i+1))-(Math.log(P)/Math.log(1+i)));
            System.out.println("所需年限为："+year);
        }
        if(choose==5)
        {
        	System.out.println("请输入存入本金：");
            double P=scanner.nextDouble();
            System.out.println("请输入复利终值：");
            double F=scanner.nextDouble();
            System.out.println("请输入年限：");
            double year=scanner.nextDouble();
            double i=Math.pow(F/P, 1d/year)-1;
        	System.out.print("报酬率为："+i);
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
        if(choose==8){       	
            System.out.println("请输入本金：");
            double P=scanner.nextDouble();
            System.out.println("请输入年限：");
            double year=scanner.nextDouble();
            System.out.println("请输入年利率：");
            double i=scanner.nextDouble();
            double F=P*Math.pow(1+i, year);
            double monthP=F/(10*12);
            System.out.println("每月还款："+monthP);
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