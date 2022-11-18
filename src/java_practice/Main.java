package java_practice;

public class Main {

    public void objectexample() {
        System.out.println("hi");
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] intArr = { 0,1,2,3,4 };
        for (int num : intArr) {
            System.out.println("Enhanced for-each loop: i = " + num);
        }
        //creating object of main class
        Main get=new Main();
        //calling method of main class using object
        get.objectexample();

    }
}