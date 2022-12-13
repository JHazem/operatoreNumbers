package com.perscholas.operatoreNumbers;

public class HomeOperatorsNumbers {

	public static void main(String[] args) {
		question2();
	}

	//  

	// question1
	
	//Write the following integers in binary notation. 
	//Do not use any Java functions or online conversion applications to calculate the answer, 
	//as this will hinder the learning process and your understanding of the concept.
	//However, you may check your answers using Java methods.
	
		//	1	-------> 1
		//	8	-------> 1000
		//	33	-------> 100001
		//	78	-------> 1001110
		//	787	-------> 1100010011
		//	33,987	---> 1000010011000011
	//----------------------
 		 public static void question1(){
 
 			int nums[] = {1, 8, 33, 78, 787, 33987};

 	        for (int x = 0; x < nums.length; x++) {
 	            String binary = "";       
 	            while (nums[x] > 0) {
 	                int rightBit = (int) (nums[x] & 1);

 	                binary = rightBit + binary;

 	                nums[x] = nums[x] >> 1;
 	            }
 	            System.out.println(binary);
 	        }
 		 }
	 
 
  
	// question2
	
	//Convert the following binary numbers to decimal notation. 
	//Do not use any Java functions or online conversion applications to calculate the answer, as this will hinder the learning process and your understanding of the concept. However, you may check your answers using Java methods.
	 public static void question2() {	 
		//	0010		---------> 2	
		//	1001		---------> 9
		//	0011 0100	---------> 52
		//	0111 0010	---------> 114
		//	0010 0001 1111 ------> 543
		//	0010 1100 0110 0111	-> 11367

		 long[] binNum = new long[6];
	        binNum[0] = 10L;
	        binNum[1] = 1001L;
	        binNum[2] = 110100L;
	        binNum[3] = 1110010L;
	        binNum[4] = 1000011111L;
	        binNum[5] = 10110001100111L;

	        for (int i =0 ; i <binNum.length ; i++) {
	            long currentBinary = binNum[i];

	            int dNum = 0;
	            int power = 0;
	            int remainder = 0;

	            while (currentBinary > 0) {
	                remainder = (int) (currentBinary % 10);
	                dNum += remainder * Math.pow(2, power);
	                power++;
	                currentBinary = currentBinary / 10;
	            }

	            System.out.println(dNum);
	        }
			 
	 }
		


	public static void question3() {
	 /* 3
	Write a program that declares an integer a variable x and assigns the value 2 to it 
	and prints out the binary string version of the number ( Integer.toBinaryString(x) ). 
	Now, use the left shift operator (<<) to shift by 1 and assign the result to x. 
	Before printing the results, write a comment with the predicted decimal value and binary string. 
	Now, print out x in decimal form and in binary notation.
	Do the preceding exercise with the following values:
	9
	17
	88
	 */
	
	 int x = 2;
	 System.out.println(Integer.toBinaryString(x));
	 System.out.println(x<<1);
	
	 }
	 
	public static void question4() {
	/* 4
	Write a program that declares a variable x and assigns 150 to it, 
	and prints out the binary string version of the number. 
	Now use the right shift operator (>>) to shift by 2 and assign the result to x. 
	Write a comment indicating what you anticipate the decimal and binary values to be. 
	Now print the value of x and the binary string.
	Do the preceding exercise with the following values:
	225
	1555
	32456
	 */
		
	int x = 150;
	System.out.println(Integer.toBinaryString(x));
	x = x >> 2;  

	}

	public static void question5() {
	/* 5
	Write a program that declares three int variables x, y, and z. 
	Assign 7 to x and 17 to y. Write a comment that indicates what you predict will be 
	the result of the bitwise & operation on x and y. 
	Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
	Now, with the preceding values, use the bitwise | operator to calculate the “or” 
	value between x and y. As before, write a comment that indicates what you predict 
	the values to be before printing them out.
	 */
		
	int x = 7;
	int y = 17;
	int k = x & y ;
	System.out.print("The result with bitwise & operator is : " + k);

	int z = x | y;
	System.out.print("The result with bitwise | operator is : " + z);
	
	}

	public static void question6() {
	/* 6
	Write a program that declares an integer variable, assigns a number, 
	and uses a postfix increment operator to increase the value. Print the value before 
	and after the increment operator.
	 */
		
 	int x = 7;
	System.out.println("The value of x = " + x); 
	++x;
	System.out.println("The value of x after postfix is = " + x); 

	 }
	public static void question7() {
	/* 7
	Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times. 
	Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, 
	and then print it again.
	 */
		
		int x = 7;
		System.out.println("The value of x = " + x); 
		
		x++;
		System.out.println("The first value of x is = " + x); 
		
		x = x + 1;
		System.out.println("The second value of x is = " + x);
		
		x +=1;
		System.out.println("The third value of x is = " + x); 

	 }
	
	public static void question8() {
	/* 8
	Write a program that declares 2 integer variables, x, and y, 
	and then assigns 5 to x and 8 to y. Create another variable sum and assign 
	the value of ++x added to y, and print the result. 
	Notice the value of the sum (should be 14).
	Now change the increment operator to postfix (x++) and re-run the program. 
	Notice what the value of the sum is. The first configuration incremented x and 
	then calculated the sum, while the second configuration calculated the sum and then incremented x.
	*/

	int x = 5;
	int y = 8;
	int sum= ++x;
	sum = sum + y;
	System.out.println("The value of sum = " + sum); 

	 } 
	 
}