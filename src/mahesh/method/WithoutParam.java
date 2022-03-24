package mahesh.method;

public class WithoutParam {
    int a=10,b=20;
    WithoutParam(int a,int b){
       this.a=a;
        this.b=b;
        System.out.println((a+b));
    }
    public void add(){
        System.out.println("sum is ="+(a+b));

        }



    public static void main(String[] args) {
        WithoutParam obj=new WithoutParam(100,200);
        obj.add();
    }
}
