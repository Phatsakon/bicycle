class Bicycle {
  
    public int cadence =0;
    public int gear =0;
    public int speed =1;
     
    }
    public void changCadence(int newValue) {
        cadence = newValue;
    }
        
    public void changGear(int newValue) {
        gear = newValue;
    }
        
    public void speedUp(int increment) {
        speed = speed + increment;
    }
    public void applyBreak(int decrement) {
        speed = speed - decrement;
        
}
    void printStates (){
      System.out.println("cadence:"+cadence+"speed:"+speed+"gear:"+gear);
    }
}
