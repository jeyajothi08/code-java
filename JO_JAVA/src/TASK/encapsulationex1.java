package TASK;

class Student {
    private int age = 10;  
    private int age2 = 28;  

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge2() {
        return age2;
    }

    public void setAge2(int newAge2) {
        age2 = newAge2;
    }
}

public class encapsulationex1 {
    public static void main(String[] args) {
        Student S = new Student();
        Student B = new Student();

        System.out.println(S.getAge2());  

        S.setAge(20);
        B.setAge(200);

        System.out.println(S.getAge());   
        System.out.println(B.getAge());  
    }
}

