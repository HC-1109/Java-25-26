class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  // define the functions
String madlib(String noun)

double areaSq(double side){
  double area = side*side;
  return area;
}

double areaSph(double radius){
  double areaC = Math.pow(radius, 2) * Math.pi;
  return areaC;
}

    // call the functions


double result = areaSq(2.5);
System.out.println("Area is "+result);

System.out.println("Area is "+areaC);

  }

 
  
}