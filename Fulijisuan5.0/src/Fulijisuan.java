import java.text.DecimalFormat;
import java.util.Scanner;
		
		public class Fulijisuan {

		    public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        double N=1;
		        Scanner scanner=new Scanner(System.in);
		        System.out.print("��ѡ��������(1)or��������(2)or���㱾��(3)orͶ������(4)or������(5)or���ʲ���ֵ(6)or���ʲ���ֵ(7)or�ȶ��(8)or��¼Ͷ��(9):");
		        int choose=scanner.nextInt();
		      
		        if(choose==1){
		        	System.out.print("�����뱾��");
			        float P=scanner.nextInt();
			        System.out.print("���������ʣ�");
			        float i=scanner.nextFloat();
			        System.out.print("����ʱ�䣺");
			        float n=scanner.nextFloat();
		            fuli(N, P, i, n);
		        }
		        if(choose==2){
		        	System.out.print("�����뱾��");
			        float P=scanner.nextInt();
			        System.out.print("���������ʣ�");
			        float i=scanner.nextFloat();
			        System.out.print("����ʱ�䣺");
			        float n=scanner.nextFloat();
		            danli(P, i,n);
		        }
		        if(choose==3){
		        	System.out.print("�����븴����ֵ��");
			        float F=scanner.nextInt();
			        System.out.print("���������ʣ�");
			        float i=scanner.nextFloat();
			        System.out.print("����ʱ�䣺");
			        float n=scanner.nextFloat();		            
		            for(int j=1;j<=n;j++){
		                N=(1+i)*N;
		            }		            
		            System.out.println("��Ҫ����"+F/N);
		        }
		        if(choose==4){
		            System.out.println("��������뱾��");
		            double P=scanner.nextDouble();
		            System.out.println("�����븴����ֵ��");
		            double F=scanner.nextDouble();
		            System.out.println("�����������ʣ�");
		            double i=scanner.nextDouble();
		            int year=(int)((Math.log(F)/Math.log(i+1))-(Math.log(P)/Math.log(1+i)));
		            System.out.println("��������Ϊ��"+year);
		        }
		        if(choose==5)
		        {
		        	System.out.println("��������뱾��");
		            double P=scanner.nextDouble();
		            System.out.println("�����븴����ֵ��");
		            double F=scanner.nextDouble();
		            System.out.println("���������ޣ�");
		            double year=scanner.nextDouble();
		            double i=Math.pow(F/P, 1d/year)-1;
		        	System.out.print("������Ϊ��"+i);
		        }
		        if(choose==6)
		        { 
		        	System.out.println("��������뱾��");
		            double P=scanner.nextDouble();
		            System.out.println("���������ʣ�");
		            double i=scanner.nextDouble();
		            System.out.println("���������ޣ�");
		            double year=scanner.nextDouble();
		        	for(int j=1;j<=year;j++)
		        	{
		        		P=(P*i)+P;
		        	}
		        	System.out.print("30�����ܲ�ֵΪ��"+P);
		        }
		        if(choose==7)
		        { 
		        	System.out.println("��������뱾��");
		            double P=scanner.nextDouble();
		            System.out.println("���������ʣ�");
		            double i=scanner.nextDouble();
		            System.out.println("���������ޣ�");
		            double year=scanner.nextDouble();
		        	for(int j=1;j<=year*12;j++)
		        	{
		        		P=(P*i)+P;
		        	}
		        	System.out.print("30�����ܲ�ֵΪ��"+P);
		        }
		        if(choose==8){       	
		            System.out.println("�����뱾��");
		            double P=scanner.nextDouble();
		            System.out.println("���������ޣ�");
		            double year=scanner.nextDouble();
		            System.out.println("�����������ʣ�");
		            double i=scanner.nextDouble();
		            double F=P*Math.pow(1+i, year);
		            double monthP=F/(10*12);
		            System.out.println("ÿ�»��"+monthP);
		        }
		        if(choose==9){
		        	DecimalFormat df = new DecimalFormat( "0.00 ");
		        	double [] P=new double [10];
		        	double [] i=new double [10];
		        	double [] n=new double [10];
		        	double [] F=new double [10];
		        	System.out.print("�����������Ͷ�ʷ�ʽ��");
		        	double way=scanner.nextDouble();
		        	for(int a=1;a<=way;a++){
		        		System.out.print("�������"+a+"������");
				         P[a]=scanner.nextDouble();
				        System.out.print("�������"+a+"�����ʣ�");
				        i[a]=scanner.nextFloat();
				        System.out.print("��"+a+"������ʱ�䣺");
				        n[a]=scanner.nextFloat();
				        for(int j=1;j<=n[a];j++){
				            
				            N=(1+i[a])*N;
				        }
				        
				        F[a]=P[a]*N;
				        System.out.print("������ֵΪ��"+F[a]);
				        System.out.println("\n");
		        	}
		        	System.out.println("      \t\t���� \t\t����\tʱ��\t��ֵ");
		        	for(int a=1;a<=way;a++){
		        		System.out.println("��"+a+"��Ͷ�ʷ�ʽ"+"\t"+df.format(P[a])+"\t"+df.format(i[a])+"\t"+df.format(n[a])+"\t"+df.format(F[a]));        		
		        	}
		        }
		        
		    }

		    private static void danli(double P, double i,double n) {
		        double G; 
		        
		        G=P+P*i*n;
		        System.out.print("������ֵΪ��"+G);
		    }

		    private static void fuli(double N, double P, double i, double n) {
		        for(int j=1;j<=n;j++){
		            
		            N=(1+i)*N;
		        }
		        double F;
		        F=P*N;
		        System.out.print("������ֵΪ��"+F);
		    }


		}
	

