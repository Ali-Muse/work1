
class Mobile
{
 public String student; // Declared Instance Variable
 public Mobile()
 { // Default Constructor
  this.student= "Ali Muse"; // initializing Instance Variable
 }
//Main Method
 public static void main(String[] args)
 {
  // Object Creation
 Mobile name = new Mobile();
  System.out.println("Student name is: " + name.student);
 }
}