package rutuja;

public class ParamConstructor {
    int a;
    float b;
    public ParamConstructor(int a,float b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println("a is ="+a);
        System.out.println("b is ="+b);
    }

    public static void main(String[] args) {
        ParamConstructor obj=new ParamConstructor(10,10.5f);
        obj.display();
    }
}
