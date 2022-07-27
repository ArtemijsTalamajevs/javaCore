package Array;

import java.util.Random;

class PasswordGeneratorApplication {
    public static void main(String[] args) {
        Random random = new Random();
        PasswordGenerator generator = new PasswordGenerator(new Random());
        String password = generator.generate(10);
        System.out.println("Your password is :" + password);
    }

}
