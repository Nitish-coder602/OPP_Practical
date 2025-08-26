abstract class Subject {
    Subject() {
        System.out.println("Learning Subject");
    }
    abstract void syllabus();
    void learn() {
        System.out.println("Preparing Right Now!");
    }
}

class IT extends Subject {
    void syllabus() {
        System.out.println("C, Java, C++");
    }
}

class Test {
    public static void main(String[] args) {
        Subject x = new IT();
        x.syllabus();
        x.learn();
    }
}
