class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){  
/*  
    Challenge 1: (done for you)
    Create two integer variables and assign values to them. 
    Calculate the sum of the two numbers, store the 
    calculated sum and then display it.    
*/
  int num1 = 5;
  int num2 = 100;
  int sum = num1 + num2;
  System.out.println("Sum is "+ sum); // the '+' represents string concatenation

/*  
    Challenge 2:
    Create three variables to assign three grades and assign values to each grade. 
    Calculate the sum of the three grades, store the 
    calculated sum and then display it.
    
*/
int grade1 = 100;
int grade2 = 98;
int grade3 = 96;
int gradeSum = grade1 + grade2 + grade3;
System.out.println("The sum of the three grades is "+gradeSum);

// ****NOTE**** Since the variable 'sum' was declared earlier as an integer, you 
// don't need to declare it again. If you do so, you will get a syntax error.



/*  
    Challenge 3:
    Calculate the average of the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables

    NOTE: Does it look correct, check with a calculator?
*/
double gradeAverage = gradeSum / 3.0;
System.out.println("The average of the three grades is "+gradeAverage);

// **** NOTE **** since sum is an integer we don't want to divide by another integer
// 3 because we get integer division and the decimal part will be truncated. 
// So we use 3.0 instead of 3

/*  
    Challenge 4:
    See file EQ1.PNG on the left. Write the equation shown in Java, 
    store the result and then display it.
    Declare and assign values to any new variables.

*/
double A = 6;
double x = 7;
double y = A / (x + 1);
System.out.println("y = "+y);

/*  
    Challenge 5:
    Using the same variables from challenge 4 above, write the equation in file EQ2.PNG
    in Java, store the result and the display it:
*/
 // **** NOTE **** The variable y is already declared above so we don't need to re-declare it.
y = ((2 * x) * (x + 1) * -(x/2))/A;
System.out.println("y = "+y);

/*  
    Challenge 6:
    Write the equation in file EQ3.PNG in Jave. Create appropriate variables as required.
    Declare and assign values to any new variables.
*/ 
double b = 6;
double h = 7;
double area = (1/2) * (b * h);
System.out.println ("area = "+area);

/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the Java code that will calculate how many baskets
    of 12 eggs we can fully fill. (Note: Think integer division)

    2) Write the Java code that will calculate how many eggs
    are left over after all baskets are filled with 12 eggs each.
*/
int eggs = 100;
int baskets = eggs/12;
int leftover = eggs%12;
System.out.println("Baskets of 12 eggs: "+baskets);
System.out.println("Leftover eggs: "+leftover);

    // Use integer division to give us the quotient when dividing by 12


    // use the modulus operator to give you the remainder.


  
    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}