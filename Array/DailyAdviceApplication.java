package Array;


class DailyAdviceApplication {
    public static void main(String[] args) {
        DailyAdviceGenerator generator=new DailyAdviceGenerator();
        Advice advice=generator.getAdvice();
        System.out.println("Here is your advice: "+advice.text + "," +advice.author);

    }
}
