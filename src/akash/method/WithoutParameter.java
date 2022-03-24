package akash.method;

public class WithoutParameter {
    int a ,b,c;
    WithoutParameter(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        System.out.println("The addition is "+a+b);
    }

    public static void main(String[] args) {
        WithoutParameter obj=new WithoutParameter(10,30);
        obj.add();
    }
}
