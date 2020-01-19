package practiceProblems.general;

//Read more: http://www.java67.com/2014/01/how-to-check-if-given-number-is-prime.html#ixzz5pB4lt6yK

public class General_PrimeNumber {
	
	public static boolean isPrime(int number) {

		int sqrt = (int) Math.sqrt(number);

		for (int i = 2; i <= sqrt; i++) {
			if (number % i == 0) { 
				// number is perfectly divisible - no prime 
				return false; 
			} 
		} 
		return true; 
	}

	public static void main(String[] args) {

		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(5));
		System.out.println(isPrime(7));
		System.out.println(isPrime(11));
		System.out.println(isPrime(19));
		System.out.println(isPrime(23));
		System.out.println(isPrime(29));

		System.out.println(isPrime(20));
		System.out.println(isPrime(15));
		System.out.println(isPrime(12));
		System.out.println(isPrime(8));
		System.out.println(isPrime(100));


	}

}
