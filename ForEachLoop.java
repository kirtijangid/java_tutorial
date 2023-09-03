package java_tutorials;

//print array elements 

//class ForEachLoop {
//public static void main(String[] args) {
//   
// // create an array
// int[] numbers = {3, 9, 5, -5};
// 
// // for each loop 
// for (int number: numbers) {
//   System.out.println(number);
// }
//}
//}

               //Calculate the sum of all elements of an array

class ForEachLoop {
	public static void main(String[] args) {

// an array of numbers
		int[] numbers = { 3, 4, 5, -5, 0, 12 };
		int sum = 0;

// iterating through each element of the array 
		for (int number : numbers) {
			sum += number;
		}

		System.out.println("Sum = " + sum);
	}
}