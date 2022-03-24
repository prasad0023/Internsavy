package prasad.constructor;

public class NoParamConstructor {
    int a;
    float b;
    public NoParamConstructor(){
        int a=10;
        int b=20;
        System.out.println("a is = "+a);
        System.out.println("b is = "+b);
    }
    public void NoParamconstructor(){
        System.out.println(" i am NoParamConstructor() method");
    }

    public static void main(String[] args) {
        NoParamConstructor obj = new NoParamConstructor();
        obj.NoParamconstructor();
    }
}
