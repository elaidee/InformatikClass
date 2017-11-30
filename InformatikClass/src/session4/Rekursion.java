package session4;

public class Rekursion {

	public int fac (int n){
		return (n > 0) ? n*fac (n - 1) : 1;
	}
	
	public double power (double x, int n){
		return (n>= 1) ? x*power(x, n-1) : 1;
	}
	
	public double expN (double x, int n){
		return (n>=1) ? expN(x,n-1) + (power(x,n)/fac(n)) : 1;
	}
}
