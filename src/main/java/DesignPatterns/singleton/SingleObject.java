package DesignPatterns.singleton;

public class SingleObject {
    private static SingleObject ourInstance = new SingleObject();

    public static SingleObject getInstance() {
        return ourInstance;
    }

    private SingleObject() {
    }

    public void showMessage(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
