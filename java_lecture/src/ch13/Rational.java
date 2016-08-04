package ch13;

public class Rational extends Number implements Comparable<Rational> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long numerator = 0;
	private long denominator = 1; 
	
	public Rational() {
		this(0,1);
	}
	public Rational(long numerator, long denominator){
		long gcd = gcd(numerator, denominator);
		this.denominator = Math.abs(denominator);
		this.numerator = ((denominator > 0) ? 1 : -1)*numerator/gcd;
	}
	private static long gcd(long n, long d){
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		for (int i = 1; i<= n1&&i<=n2; i++) {
			if (n1%i == 0&& n2%i == 0) {
				gcd = i;
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
	public Rational add(Rational secondRational) {
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
		long n = numerator*secondRational.getNumerator();
		long d = denominator*secondRational.getDenominator();
		return new Rational(n,d);
	}
	public Rational divide(Rational secondRational) {
		long n = numerator*secondRational.getNumerator();
		long d = denominator*secondRational.getDenominator();
		return new Rational(n,d);
	}
	@Override
	public String toString() {
		if (denominator == 1) {
			return numerator+"";
		} else {
			return numerator+"/"+denominator;
		}
	}
	@Override
	public boolean equals(Object other) {
		if ((this.subtract((Rational)other)).getDenominator() == 0) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int intValue() {
		return (int)doubleValue();
	}
	@Override
	public float floatValue() {
		return (float)doubleValue();
	}
	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return numerator*1.0/denominator;
	}
	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return (long)doubleValue();
	}
	@Override
	public int compareTo(Rational o) {
		if (this.subtract(o).getDenominator() > 0) {
			return 1;
		}
		else  if(this.subtract(o).getDenominator() < 0){
			return -1;
		}
		else {
			return 0;
		}
	}
}
