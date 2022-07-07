package object;

public class Robot {

    private String hello;
    private String name;

    public Robot(){

    }
    public void sayHello(String hello){
        this.hello=hello;
    }
    public String getHello() {
        return hello;
    }
    public void sayYourName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}