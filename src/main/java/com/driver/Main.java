// Task 1: Create class A
class A {
    String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create class B which extends A
class B extends A {

    // Task 4: Override method meth
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}

// Task 5: Main class to test everything
public class Main {
    public static void main(String[] args) {

        // Task 3: Create object of B
        B obj = new B();

        // Calling overridden method (Task 5)
        System.out.println(obj.meth());
    }
}