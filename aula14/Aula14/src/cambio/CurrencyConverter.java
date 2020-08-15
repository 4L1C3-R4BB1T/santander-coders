package cambio;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static void converter(double dollar, double value) {
		double reais = (dollar * value * (1 + IOF));
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", reais));
	}
	
}

