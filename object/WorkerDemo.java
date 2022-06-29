package object;

public class WorkerDemo {
    public static void main(String[] args) {
        Worker viktor=new Worker();
        viktor.name="Viktor";
        viktor.surname="Fdovorovs";
        viktor.gender="Male";
        viktor.martialStatus="Alone";
        viktor.age=25;
        viktor.workExperience=2;
        viktor.weightKg=75.5;
        viktor.heightCm=170.8;
        viktor.desiredSalaryNetto=1750.50;
        viktor.profession="Chemist";
        //Soutv --->text+class
        System.out.println("viktor.name = " + viktor.name);
        System.out.println("viktor.surname = " + viktor.surname);
        System.out.println("viktor.gender = " + viktor.gender);
        System.out.println("viktor.martialStatus = " + viktor.martialStatus);
        System.out.println("viktor.age = " + viktor.age);
        System.out.println("viktor.workExperience = " + viktor.workExperience);
        System.out.println("viktor.weightKg = " + viktor.weightKg);
        System.out.println("viktor.heightCm = " + viktor.heightCm);
        System.out.println("viktor.desiredSalaryNetto = " + viktor.desiredSalaryNetto);
        System.out.println("viktor.profession = " + viktor.profession);




    }
}
