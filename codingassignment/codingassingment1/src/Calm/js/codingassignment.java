package Calm.js;

public class codingassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Sam";
		String lastName = "stanley";
		String fullName = firstAndLastName(firstName, lastName);
		boolean heat = true;
		double moneyIHave = 11;
		
		
		double[] age = { 1};
		double[] ages1 = { 1, 2, 3};
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob."}; 
		int[] nameLengths = {0,0,0,0,0,0};
		int averageLetters = 0;
		
		for(String name : names)	{
			averageLetters += name.length();
			double total = averageLetters / names.length;
			
			//int averageLetters = name.length() / name;
		
			//use a loop to iterate through the array and calculate the avearge number of letters per name. Print the result to the console.
		}
		double total = averageLetters / names.length;
		System.out.println(total);
		//String instances = names[0] + " " + names[1] + " " + names[2] + " " + names[3] + " " + names[4] + " " + names[5];
		String result = " ";
		for(int i = 0; i < names.length; i++)	{
			result += names;
			
			System.out.print(names[i] + " ");
			
		}
		
			int[] ages = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 18;
		
		//ages[8] is the new value I added to make sure that it is dynamic.
	//System.out.println(ages[ages.length - 1]); "this is how to grab the last element in an array
	int firstAndLast = ages[ages.length - 1] -= ages[0];	{
	System.out.println(" ");
		System.out.println(firstAndLast);
	
		int sum = 0;
	for(int number : ages) {
		 sum += number;
		 
		 
	}
	double average = sum / ages.length; 
	
	System.out.println(average);
	}
	for(int i =0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
		System.out.println(nameLengths[i]);
	
	}
	int sum1= 0;
	for(int elements : nameLengths)	{
		
		
	}
	int sum = 0;
	for(int i = 0; i < nameLengths.length; i++)	{
		sum += nameLengths[i];
		
	}
	System.out.println(sum);
	System.out.println(concatenatedString("hello", 4));
	System.out.println(fullName);
	System.out.println(isSumGreater(ages));
	//13
	double[] something = {1, 2, 8, 9, 3, 15};
	
	double[] numbers = { 1, 2, 5, 6, 2, 8};
	
	System.out.println(averageOfArray(numbers));
	System.out.println(firstArrayCompared(age, ages1));
	System.out.println(willBuyDrink(heat, moneyIHave));
	System.out.println(averageOfTotal(something));
	}
	
	public static String concatenatedString(String string2, int n)	{
		String string = " ";
		for(int i =0; i < n; i++) {
			string += string2;
		}
			return string;
	}
	public static String firstAndLastName(String string, String next)	{
		String fullName = string + " " + next; 
		return fullName;
	
}
	public static boolean isSumGreater(int[] number)	{
		int sum = 0;
		for(int numbers : number)	{
		sum += numbers;
		if(sum > 100);	{
		return true;
		} 
	}
		if(sum < 100)
		
		return false;
		return false;
		
	}
	public static double averageOfArray(double[] array2)	{
		double average = 0;
		for (double number : array2)	{
			average += number;
			
		}
	return average / array2.length;
	}
	static public boolean firstArrayCompared(double[] array1, double[] array2)	{
		double averageElements1 =0;
		double averageElements2 =0;
	for(double numbers: array2)	{
		averageElements2 += numbers;
	}	
		for(double number : array1)	{
		averageElements1 += number;
	
	if (averageElements1 > averageElements2) {
		return true;
	}	else	{
		return false;
	}
	}
		return false;
	
}
	public static boolean willBuyDrink(boolean isHotOutSide, double moneyInPocket )	{
		boolean bool = true || false;
		double money = 0;
		boolean hot = bool;
		if (isHotOutSide == true && moneyInPocket > 10.5) {
			return true;
		}
		return false;
	}
// question 13
	public static double averageOfTotal(double[] anything)	{
		double sum = 0;
		for( double number3 : anything) {
			 sum += number3;
			
		}
		return sum / anything.length;
	}
}