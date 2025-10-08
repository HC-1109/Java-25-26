class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  // define the functions
void madlib(String noun, String adj, String verb){
  System.out.println("The "+adj+" "+noun+" "+verb);
}

double areaSq(double side){
  return side*side;
}

double areaSph(double radius){
  return Math.PI*Math.pow(radius, 2);
}

    // call the functions


void init(){
  madlib("1", "2", "3");

}
}