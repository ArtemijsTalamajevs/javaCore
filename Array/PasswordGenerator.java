package Array;


import java.util.Random;

class PasswordGenerator {
    char[] allowedSymbols = {
            '0', '1', '2', '3', '4', '5',
            'A', 's', 'D', 'F', 'Z'
    };             //Example how to use allowedSymbols into random Generator
    Random random;

    PasswordGenerator(Random random) {
        this.random = random;
    }

    String generate(int passwordlength) {
        char[] password = new char[passwordlength];
        for (int i = 0; i < password.length; i++) {
            //First example : password[i] =(char)(33+ random.nextInt(126-33));
            password[i] = allowedSymbols[random.nextInt(allowedSymbols.length)]; //Second example with allowedSymbols


        }
        return new String(password);
    }
}
//Code->Reformat code
