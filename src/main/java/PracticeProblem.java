public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String evenOrOdd(int a){
		if(a % 2 == 0){
			return "Even";
		}
		else{
			return "Odd";
		}
	}
	public static String teacherOrStudent(String word){
		if(word == "Kalisz"){
			return "Teacher";
		}
		else{
			return "Student";
		}
	}
	public static int fartherThanZero(int a){
		if(a > 0){
			return a + 5;
		}
		else if(a < 0){
			return a - 5;
		}
		else{
			return a;
		}
	}
	public static String isFive(int a){
		if(a == 5){
			return "The number is Five";
		}
		else{
			return "The number is not Five";
		}
	}
	//Write your functions here
	public static String positiveOrNegative(double b){
		if(b > 0){
			return "Positive";
		}
		else{
			return "Negative";
		}
	} 
	public static String highOrLow(int k){
		if(k > 100){
			return "High";
		}
		else{
			return "Low";
		}
	}
	public static String isHello(String a){
		if(a == "Hello"){
			return "The word is Hello";
		}
		else{
			return "The word is not Hello";
		}
	}
}
