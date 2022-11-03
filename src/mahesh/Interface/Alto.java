package mahesh.Interface;

public class Alto implements Car {

    @Override
    public float price() {
        float p=650000;
        return p;
    }

    @Override
    public void gear() {
        System.out.println("Five");
    }

    @Override
    public void fuel() {
        System.out.println("CNG");

    }

    @Override
    public void model() {
        System.out.println("Top");
    }

    @Override
    public void speed() {
        System.out.println("180");
    }

    @Override
    public void color() {
        System.out.println("Red");
    }

    public static void main(String[] args) {
        Car a = new Alto();
    }

}
