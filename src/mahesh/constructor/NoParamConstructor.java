package mahesh.constructor;

public class NoParamConstructor {
    int a;
    float b;
    //no args constructor
    public NoParamConstructor(){
        a=10;
        b=20;
        System.out.println("a is = "+a);
        System.out.println("b is ="+b);
    }
    public void NoParamConstructor(){
        System.out.println("i am NoParamConstructor() method");

    }

    public static void main(String[] args) {
        NoParamConstructor obj= new NoParamConstructor();
        obj.NoParamConstructor();
    }
}
