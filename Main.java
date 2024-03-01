class Student{
    private String name;
    private int rollno;
    static String University = "Comsats";
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRollno() {
            return rollno;
        }

        public void setRollno(int rollno) {
            this.rollno = rollno;
        }
    static int sum(int a, int b){
        return a + b;
    }
}
public class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("Ali");
        s1.setRollno(1);
        s1.University = "NUST";
        s2.setName("Ahmad");
        s2.setRollno(2);
        int num = Student.sum(5, 6);
        System.out.println("Sum: " + num);
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll No: " + s1.getRollno());
        System.out.println("University: " + s1.University);
        System.out.println("Name: " + s2.getName());
        System.out.println("Roll No: " + s2.getRollno());
        System.out.println("University: " + s2.University);
    }
}