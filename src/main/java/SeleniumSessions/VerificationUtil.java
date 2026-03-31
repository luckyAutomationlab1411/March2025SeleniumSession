package SeleniumSessions;

public class VerificationUtil {
	//Verification for String Value
	public static boolean verifyEquals(String actualValue, String expectedValue) {
		if(actualValue.equals(expectedValue)) {
			System.out.println("actual value "+ actualValue + " is equal to "+ expectedValue);
			return true;
		}
		else {
			System.out.println("actual value "+ actualValue + " is not equal to "+ expectedValue);
			return false;
		}
	}
	
	//Verification for integer Value
	public static boolean verifyEquals(int actualValue, int expectedValue) {
		if(actualValue == expectedValue) {
			System.out.println("actual value "+ actualValue + " is equal to "+ expectedValue);
			return true;
		}
		else {
			System.out.println("actual value "+ actualValue + " is not equal to "+ expectedValue);
			return false;
		}
	}
	
	public static boolean verifyContains(String actulaValue, String fractionValue) {
		if(actulaValue.contains(fractionValue)) {
			System.out.println("fraction value : "+ fractionValue+ " is present in :"+ actulaValue);
			return true;
		}
		else {
			System.out.println("fraction value "+ fractionValue + " is not present in "+ actulaValue);
			return false;
		}
	}
	
	

}
