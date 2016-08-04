package test02;

public class TestRational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational r1 = new Rational(2,1);
		Rational r2 = new Rational(2,3);
		System.out.println(r1+" + "+r2+" = "+r1.addRational(r2));
		System.out.println(r1+" - "+r2+" = "+r1.subtract(r2));
		System.out.println(r1+" * "+r2+" = "+r1.mutiply(r2));
		System.out.println(r1+" / "+r2+" = "+r1.divideRational(r2));
	}

}
