
public class Danli {
	double sum2;
	public String sum;
	double F;
	public void calculate(String p2,String i2,String year2){
		double p=Double.parseDouble(p2);
		double year=Double.parseDouble(year2);
		double i=Double.parseDouble(i2);
		
		F=p+p*i*year;
		sum2=F;
		sum=String.valueOf(sum2);

		
	}

}
