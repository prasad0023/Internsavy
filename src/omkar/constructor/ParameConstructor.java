package omkar.constructor;

public class ParameConstructor {
  int a;
  float b;
  public ParameConstructor(int a,float b){
      this.a=a;
      this.b=b;
  }
  public void Display(){
      System.out.println("a is="+a);
      System.out.println("b is="+b);
  }

    public static void main(String[] args) {
        ParameConstructor obj = new ParameConstructor(10,15.5f);
        obj.Display();
    }
}
