package mahesh.inheritance;

public class Swift extends Car {
    public void demoSwift(){
        System.out.println(" i am in demoSwift()");
    }

    public static void main(String[] args) {
        Swift obj= new Swift();
        obj.demoSwift();
        obj.carInfo();
        Alto obj2=new Alto();
        obj2.carInfo();
        Fortuner obj3 = new Fortuner();
        obj3.carInfo();
    }
}
