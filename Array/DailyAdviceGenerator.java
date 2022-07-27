package Array;

import java.util.Random;

class DailyAdviceGenerator {
    Advice[] advices={
            new Advice("Z1","s.s","Lets have fun!!"),
            new Advice("L1","L.T","Threat your self"),
            new Advice("L1","Z.T","Take a coffe"),
            new Advice("L1","A.L","Take a seat"),
    };
    Random random=new Random();

    Advice getAdvice(){
        return advices[random.nextInt(advices.length)];
    }
}
