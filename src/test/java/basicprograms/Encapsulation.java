package basicprograms;
class Student {
    private String name;   // data hidden

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Riya");
        System.out.println(s.getName());
    }
}
