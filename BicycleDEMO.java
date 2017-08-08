class BicycleDEMO{
  public static void main (String[] args){
    Bicycle bike1 =new Bicycle();
    Bicycle bike2 =new Bicycle();
    
    bike1.changCadence(50);
    bike1.speedUp(20);
    bike1.changGear(2);
    bike1.printStates();
    
    bike2.changCadence(50);
    bike2.speedUp(10);
    bike2.changGear(2);
    bike2.changCadence(40);
    bike2.speedUp(10);
    bike2.changGear(3);
    bike2.printStates();
  }
}
 