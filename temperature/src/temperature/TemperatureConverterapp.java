package temperature;

import java.util.Scanner;

public class TemperatureConverterapp 
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the temperature");
		double fahrenheit=scan.nextDouble();
		TempearatureConverter temperatureConverter=new TempearatureConverter();
		double C=temperatureConverter.convertFahrenHeitToCelsius(fahrenheit);
		System.out.println(C);
	}
}