import java.util.Scanner;

public class Fulijisuan {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double N=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("��ѡ��������(1)or��������(2)or���㱾��(3)orͶ������(4)or������(5)or���ʲ���ֵ(6)or���ʲ���ֵ(7)or�ȶ��(8):");
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
            double money;
            float year=30;
            float total=3000000;
            double a=0.30;
            for(int j=1;j<=year;j++){
                N=(1+a)*N;
            }
            money=total/N;
            System.out.println("��Ҫ����"+money);
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
        	double money=30000;
        	for(int i=1;i<=30;i++)
        	{
        		money=(money*0.03)+money;
        	}
        	System.out.print("30�����ܲ�ֵΪ��"+money);
        }
        if(choose==7)
        { 
        	double money=3000;
        	for(int i=1;i<=30*12;i++)
        	{
        		money=(money*0.03)+money;
        	}
        	System.out.print("30�����ܲ�ֵΪ��"+money);
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