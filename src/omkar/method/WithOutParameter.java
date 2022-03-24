package omkar.method;

public class WithOutParameter {
    int a,b;

    WithOutParameter(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void add(){

        System.out.println("sum of two num= "+(a+b));
    }
    public void sub(){
        System.out.println(" subtraction of two number="+(a-b));

    }
    public static void main(String[] args) {
        WithOutParameter obj =new WithOutParameter( 10,20);
        obj.add();
        obj.sub();
    }


}
