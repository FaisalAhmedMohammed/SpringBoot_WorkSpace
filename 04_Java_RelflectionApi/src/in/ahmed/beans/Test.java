package in.ahmed.beans;

import java.lang.reflect.Field;

public class Test {

    public static void main(String[] args) throws Exception {

        // Load the User class into memory
        Class<?> forName = Class.forName("in.ahmed.beans.User");

        // Get the declared field "age"
        Field field = forName.getDeclaredField("age");

        // Make the private field accessible
        field.setAccessible(true);

        // Create a new instance of the User class using a modern approach
        Object newInstance = forName.getDeclaredConstructor().newInstance();

        // Cast the instance to User
        User u = (User) newInstance;

        // Invoke the getAge() method
        u.getAge();

        // Set the value of the private "age" field
        field.set(newInstance, 30);

        // Invoke the getAge() method again to check the updated value
        u.getAge();
    }
}
