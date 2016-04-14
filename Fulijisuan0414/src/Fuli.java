import java.text.DecimalFormat;

public class Fuli {
	DecimalFormat df = new DecimalFormat( "0.00 ");
	double sum2;
	public String sum;
	double N=1;
	double F;
	public void calculate(String p2,String i2,String year2){
		double p=Double.parseDouble(p2);
		double year=Double.parseDouble(year2);
		double i=Double.parseDouble(i2);
		for(int j=1;j<=year;j++){
			N=(1+i)*N;
		}
		F=p*N;
		sum2=F;
		sum=String.valueOf(df.format(sum2));

		
	}

}
