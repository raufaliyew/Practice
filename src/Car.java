public class Car {

    int numberDoors = 4; //instance variable belongs to Object
    static String engine = "Enginex3"; //static variable belongs to Class
    int numberTear = 4;

    String brand = "Mercedes";
    String model; // default is Null


    public Car(){ //Constructors are for creating objects, when we create an Object, constructor will be invoked. If there is no Constructor inside of class, Java will create it by itself implicitly. But if we have created parametrized Constructor (next example), then we have to create default Constructor by ourselves. Java doesn't want to take responsibility to create default (empty) constructor if you have created parametrized Constructor(with parameters).

    }

    public Car(int numDoors, String modelName){// this constructor accepts 2 parameters -> int numDoors, String modelName. When we create an Object we are invoking related Constructor. To invoke this Constructor we have to create an object which accepts 2 parameters -> Car car1 = new Car (int numDoors, String modelName)
        numberDoors = numDoors; // to assign new values to variables which is inside of Car class we have to assign new values to them. New value of numberDoors will be changed by the value coming from Object when created
        model = modelName;
    }

    public Car(int numDoors, String modelName, String brandName){// this constructor accepts 3 parameters -> int numDoors, String modelName, String brandName
        numberDoors = numDoors;
        model = modelName;
        brand = brandName;
    }



    public void park(){ //instance method
        System.out.println("Car is parking");
    }
    public void drive(){
        System.out.println("Car is driving");

    }

    public static void stop(){ // static method belongs to class and can be called by class name -> Car.stop();
        System.out.println("Car is stopping");
    }




}
