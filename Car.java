
package com.Vehicle;

public class Car {
  // Fields
private double speedKph;
private float fuelLevel;
private int distanceTraveled;
   // Constructor
public Car(double speedKph, float fuelLevel,int distanceTraveled ) {
this.speedKph = speedKph;
this.fuelLevel = fuelLevel;
this.distanceTraveled = distanceTraveled;
} 
   // Method to set 

  public void setSpeed(double speed) {
   this.speedKph = speed;
}
public void setFuelLevel(float fuel) {
  this.fuelLevel = fuel;
}
public void drive(int distance) {
   this.distanceTraveled = distance;
}
public double getSpeedMph() {
  return this.SpeedMph / 1.60934 ;
}
public int getDistanceKm() {
  return this.DistanceKm / 1000;
} 
public int calculateRemainingFuel(double distanceKm) {
  double fuelConsumed = distanceKm * 0.5;
   this.fuelLevel = (float) Math.max(0, this.fuelLevel - fuelConsumed);
     return (int) this.fuelLevel;
}
}

    public static void main(String[] args) {
        // Test Car class
        Car car = new Car(90.0, 50.0f, 0);
        car.setSpeed(100.0);
        car.setFuelLevel(75.0f);
        car.drive(1000); // 1 kilometers

        System.out.println("Car Speed in MPH: " + car.getSpeedMph());
        System.out.println("Car Distance in KM: " + car.getDistanceKm());
        System.out.println("Car Remaining Fuel: " + car.calculateRemainingFuel(1) + "%");
 }
 
