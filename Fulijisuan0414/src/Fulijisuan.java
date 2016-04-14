import java.text.DecimalFormat;
import java.util.Scanner;
		
		public class Fulijisuan {

		    public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        double N=1;
		        Scanner scanner=new Scanner(System.in);
		        System.out.print("请选择复利计算(1)or单利计算(2)or计算本金(3)or投资年数(4)or报酬率(5)or年资产总值(6)or月资产总值(7)or等额还款(8)or记录投资(9):");
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
		        	System.out.print("请输入复利终值：");
			        float F=scanner.nextInt();
			        System.out.print("请输入利率：");
			        float i=scanner.nextFloat();
			        System.out.print("存入时间：");
			        float n=scanner.nextFloat();		            
		            for(int j=1;j<=n;j++){
		                N=(1+i)*N;
		            }		            
		            System.out.println("需要本金："+F/N);
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
		        	System.out.println("请输入存入本金：");
		            double P=scanner.nextDouble();
		            System.out.println("请输入利率：");
		            double i=scanner.nextDouble();
		            System.out.println("请输入年限：");
		            double year=scanner.nextDouble();
		        	for(int j=1;j<=year;j++)
		        	{
		        		P=(P*i)+P;
		        	}
		        	System.out.print("30年后的总产值为："+P);
		        }
		        if(choose==7)
		        { 
		        	System.out.println("请输入存入本金：");
		            double P=scanner.nextDouble();
		            System.out.println("请输入利率：");
		            double i=scanner.nextDouble();
		            System.out.println("请输入年限：");
		            double year=scanner.nextDouble();
		        	for(int j=1;j<=year*12;j++)
		        	{
		        		P=(P*i)+P;
		        	}
		        	System.out.print("30年后的总产值为："+P);
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
		        if(choose==9){
		        	DecimalFormat df = new DecimalFormat( "0.00 ");
		        	double [] P=new double [10];
		        	double [] i=new double [10];
		        	double [] n=new double [10];
		        	double [] F=new double [10];
		        	System.out.print("请输入多少种投资方式：");
		        	double way=scanner.nextDouble();
		        	for(int a=1;a<=way;a++){
		        		System.out.print("请输入第"+a+"个本金：");
				         P[a]=scanner.nextDouble();
				        System.out.print("请输入第"+a+"个利率：");
				        i[a]=scanner.nextFloat();
				        System.out.print("第"+a+"个存入时间：");
				        n[a]=scanner.nextFloat();
				        for(int j=1;j<=n[a];j++){
				            
				            N=(1+i[a])*N;
				        }
				        
				        F[a]=P[a]*N;
				        System.out.print("复利终值为："+F[a]);
				        System.out.println("\n");
		        	}
		        	System.out.println("      \t\t本金 \t\t利率\t时间\t终值");
		        	for(int a=1;a<=way;a++){
		        		System.out.println("第"+a+"个投资方式"+"\t"+df.format(P[a])+"\t"+df.format(i[a])+"\t"+df.format(n[a])+"\t"+df.format(F[a]));        		
		        	}
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
	

