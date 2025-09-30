
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/* For each of the challenges below:
    a) declare the variables, 
    b) ask the user for the variable values, 
    c) write the specified equation, and 
    d) display the equation value.
*/    
 
//    Challenge 1:  See file Actvy7_Eq1  (done for you)
      System.out.println("Enter the value for x ");
      double x = Input.readDouble();
      double y = Math.pow(x,7);
      System.out.println("Value of y is "+y);   
  
//    Challenge 2:  See file Actvy7_Eq2
      System.out.println("Enter the values of A and B ");
      double A = Input.readDouble();
      double B = Input.readDouble();
      double C = Math.sqrt(A + B);
      System.out.println("C = "+C);
  
//    Challenge 3:  See file Actvy7_Eq3
      System.out.println("Enter the value of z ");
      double z = Input.readDouble();
      double q = Math.pow(z, 3) + 5;
      System.out.println("q = "+q);
  
//    Challenge 4:  See file Actvy7_Eq4
      System.out.println("Enter the values of m and n ");
      double m = Input.readDouble();
      double n = Input.readDouble();
      double k = Math.pow(m, 5) / Math.sqrt(n + 1);
      System.out.println("k = "+k);

//    Challenge 5:  See file Actvy7_Eq5
      System.out.println("Enter the values of t and r ");
      double t = Input.readDouble();
      double r = Input.readDouble();
      double s = Math.pow(t, 5) * Math.pow((r + 2), 4);
      System.out.println("s = "+s);
    
  
//    Challenge 6:  See file Actvy7_Eq6
      System.out.println("Enter the values of x1, x2, y1, and y2 ");
      double x1 = Input.readDouble();
      double x2 = Input.readDouble();
      double y1 = Input.readDouble();
      double y2 = Input.readDouble();
      double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
      System.out.println("d = "+d);

//    Challenge 7:  See file Actvy7_Eq7    (HINT: What does the "plus minus: after "-b" mean?)
      System.out.println("Enter the values of a, b, and c ");
      double a = Input.readDouble();
      double b = Input.readDouble();
      double c = Input.readDouble();
      double xpos = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
      double xneg = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
      System.out.println("x = "+xpos+","+xneg);
    

    // **************************************************
    // ******** Don't write any code below here. ********
    // **************************************************
  }
}