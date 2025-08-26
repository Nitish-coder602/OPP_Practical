abstract class College {
    abstract void printInfo();
    void display() {
        System.out.println("In abstract class");
    }
}

class Employee extends College {
    void printInfo() {
        String name = "Avinash";
        int age = 21;
        float salary = 222.2F;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

class Base {
    public static void main(String[] args) {
        College s = new Employee();
        s.printInfo();
        s.display();
    }
}
