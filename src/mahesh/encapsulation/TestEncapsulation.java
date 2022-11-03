package mahesh.encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        String str;
        int id;
        Student s1 = new Student();
        s1.setId(100);
       // System.out.println(s1.getId());
        id=s1.getId();
        System.out.println(id);
        s1.setName("Gita");
        //System.out.println(s1.getName());
        str=s1.getName();
        System.out.println(str);

    }
}
