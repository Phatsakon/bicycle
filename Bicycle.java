class Bicycle {
     int cadence =0;
     int gear =0;
     int speed =1;
     
     void changCadence(int newValue) {
        cadence = newValue;
    }
        
    void changGear(int newValue) {
        gear = newValue;
    }
        
     void speedUp(int increment) {
        speed = speed + increment;
    }
     void applyBreak(int decrement) {
        speed = speed - decrement;
        
}
    void printStates (){
      System.out.println("cadence"+cadence+"speed"+speed+"gear"+gear);
    }
}