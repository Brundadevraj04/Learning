package temperature;

public class TempearatureConverter 
{
	public double convertFahrenHeitToCelsius(double fahrenheit)
	{
		double C=(fahrenheit-32)*5/9;
		return C;
	}
}