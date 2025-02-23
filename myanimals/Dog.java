package myanimals;

public class Dog {
    private static int dogCount = 0;
    String name;
    String age;
    Boolean isGoodBoy;

    public void bark(){
        System.out.println("Bark");
    }

    public Dog(){
        dogCount++;
    }

    public static int getDogCount(){
        return dogCount;
    }
}