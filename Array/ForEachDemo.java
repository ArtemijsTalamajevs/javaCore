package Array;

class ForEachDemo {
    public static void main(String[] args) {
        String[] strings = {"zoo", "kelvins", "zipo", "plich"};

        System.out.println("Fori");
        for (int i = 0; i < strings.length; i++) {
            String text = strings[i];
            System.out.println(text); // First option fori

        }
        System.out.println();

        System.out.println("For each");
        for (String text : strings) {
            System.out.println(text);


        }
    }
}

