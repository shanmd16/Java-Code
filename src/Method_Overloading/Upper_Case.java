package Method_Overloading;

public class Upper_Case {

    public static void main(String[] args) {
        Cat a = new Cat();           // Create a Cat object
        a.name = "bob";              // Set the name to "bob"
        makeCatNameUpperCase(a);     // Convert the name to uppercase
        System.out.println(a.name);  // Output: BOB
    }

    public static void makeCatNameUpperCase(Cat cat) {
        cat.name = cat.name.toUpperCase();
    }
}

// Define the Cat class
class Cat {
    String name;
}


