class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  //1: printing a string
  void print(String s){
    System.out.println(s);
  }

  //2: Fahrenheit to Celsius temperature conversion
  double FtoC(double F){
    double C = (F-32)*(5/9.0);
    return C;
    
  }

  //3: Sphere volume
  double sphereVolume(double r){
    double V = (4/3) * Math.PI * Math.pow(r, 3);
    return V;
  }
  
  //4: Cone volume
  double coneVolume(double r1, double h){
    double V = Math.PI * Math.pow(r1, 2) * (h/3);
    return V;
  }

  //5: Distance between two coordinate points
  double distance(double p1, double p2){
    double D = p1-p2;
    return D;
  }



  
  void init(){
    //1
    System.out.println("Enter your name ");
    String name = Input.readString();
    print("Welcome "+name);

    //2
    System.out.println("Enter a temperature in Fahrenheit");
    double F = Input.readDouble();
    System.out.println("Temperature in Celsius is "+FtoC(F));

    //3
    System.out.println("Enter the radius of your sphere");
    double r = Input.readDouble();
    System.out.println("Your volume is "+sphereVolume(r));

    //4
    System.out.println("Enter the radius and height of your cone");
    double r1 = Input.readDouble();
    double h = Input.readDouble();
    System.out.println("The volume of your cone is "+coneVolume(r1, h));

    //5
    System.out.println("Enter the coordinates of the two points");
    double p1 = Input.readDouble();
    double p2 = Input.readDouble();
    System.out.println("The distance between the two points is "+distance(p1, p2));
    
  }
 
}