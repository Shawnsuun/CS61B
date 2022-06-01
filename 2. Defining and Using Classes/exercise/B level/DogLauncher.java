public class DogLauncher {
    public static void main(String[] args) {
         Dog poppa = new Dog();
         poppa.bark();
         
         //this can't work
         //bark() is a non-static method
         //can't use in a class
         //Dog.bark();  
         
         poppa.runFast();
         Dog.runFast();
    }
}