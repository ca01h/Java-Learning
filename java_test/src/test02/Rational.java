package test02;


public class Rational {

	private long numerator = 0;//·Ö×Ó
	private long denominator = 1;//·ÖÄ¸
	public Rational() {
		this(0,1);
	}
	public Rational(long numerator, long denominator) {
		// TODO Auto-generated constructor stub
		long gcd = gcd(numerator, denominator);
		this.numerator = ((denominator > 0) ? 1 : -1)*numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
	}
	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		
		for (int k = 1; k <= n1&&k <= n2; k++) {
			if (n1 % k == 0&& n2 % k == 0) {
				gcd = k;
			}
		}
		return gcd;
	}
	public long getNumerator() {
		return numerator;
	}
	public long getDenominator() {
		return denominator;
	}
	
	public Rational addRational(Rational secondRational) {
		long n = numerator*secondRational.getDenominator()+denominator*secondRational.getNumerator();
		long d = denominator*secondRational.getDenominator();
		return new Rational(n,d);
	}
	
	public Rational subtract(Rational secondRational) {
		long n = numerator*secondRational.getDenominator()-denominator*secondRational.getNumerator();
		long d = denominator*secondRational.getDenominator();
		return new Rational(n,d);
	}
	
	public Rational mutiply(Rational secondRational) {
		long n = numerator*secondRational.numerator;
		long d = denominator*secondRational.getDenominator();
		return new Rational(n, d);
	}
	
	public Rational divideRational(Rational secondRational) {
		long n = numerator*secondRational.getDenominator();
		long d = denominator*secondRational.getNumerator();
		return new Rational(n, d);
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		if (denominator == 1) {
			return numerator + "";
		} else {
			return numerator + "/" +denominator;
		}
	}
	
	
}
