public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(); // in order to call non-static variables and methods from class we have to first create an object from that class
//        System.out.println(car1); // to print the address of the object we're directly printing object

        car1.model = "E220"; // we can assign new value to non-static variable, if there is existing value of that variable inside of Car class, then created object copies that variable with value and changes the value. New value belongs to only created object, it will not change value of variable in Car class, basically it will not affect other created objects from Car class

        System.out.println(car1.brand); // in order to call non-static variable from class we have to first create an object
        System.out.println("Before changing number of doors in car1 obj: "+car1.numberDoors); //car1.numberDoors getting value from Car class



        car1.numberDoors = 2; // we are changing the value of numberDoors variable which comes from Car class

        System.out.println(car1.model);
        System.out.println("After changing number of doors in car1 obj: "+car1.numberDoors);

        car1.engine = "Enginex4"; //each object can call static variables by object name, but it is good practice, instead we are calling static variable by class name -> Car.engine -> because engine is static variable and belongs to class. If we try to change static variable value it will affect all other objects also. Because non-static variables has only one copy shared

        System.out.println(car1.engine);
        car1.drive();

        System.out.println("--------------------------------");

        Car car2 = new Car();
        car2.numberDoors = 3;
        car2.model = "C180";
        car2.drive();
        System.out.println(car2.model);
        System.out.println(car2.engine);//although inside Car class value of engine variable is "Enginex3", in this line it will print "Enginex4". Because engine is a static variable and it values has changed in car1 object. Basically, all other methods when will call engine variable it will print new assigned value (Enginex4)

        System.out.println("---------------------------");

        Car car3 = new Car(2,"i5"); //in order to pass some values to constructor while we are creating object there should be parametrized constructor inside of Car class. This constructor accepts 2 parameters (int numDoors-> 2, String modelName -> "i5" )

        System.out.println(car3.numberDoors);
        System.out.println(car3.model);

        System.out.println("---------------------------");


        Car car4 = new Car(3,"i3","BMW");
        System.out.println(Car.engine);
        System.out.println(car4.numberDoors);
        System.out.println(car4.model);
        System.out.println(car4.brand);



    }
}
