package mahesh.Interface;

public class Fortuner implements Car {
    @Override
    public float price() {
        float p=5300000;
        return p;
    }

    @Override
    public void gear() {
        System.out.println("Six ");

    }

    @Override
    public void fuel() {
        System.out.println("Petrol");

    }

    @Override
    public void model() {
        System.out.println("Top");
    }

    @Override
    public void speed() {
        System.out.println("240");

    }

    @Override
    public void color() {
        System.out.println("Black");

    }
}
