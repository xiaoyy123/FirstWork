import java.util.Scanner;

public class Fulijisuan {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double N=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("��ѡ��������(1)or��������(2)or���㱾��(3)orͶ������(4)or������(5)or���ʲ���ֵ(6)or���ʲ���ֵ(7):");
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
        	double baochoulv=0.1;
	        double money=1000000;
	        double year;
	        year=2000000/(money*baochoulv);
	        System.out.print("����"+year+"��100����200��");
        }
        if(choose==5)
        {
        	double money1=1000000;
        	double money2=2000000;
        	double year=10;
        	double baochoulv;
        	baochoulv=money2/(money1*year);
        	System.out.print("������Ϊ��"+baochoulv);
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