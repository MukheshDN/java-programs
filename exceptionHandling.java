class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    int age;

    Father(int age) throws WrongAgeException {
        if (age < 0) throw new WrongAgeException("Age cannot be negative");
        this.age = age;
    }
}

class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);
        if (sonAge >= fatherAge) throw new WrongAgeException("Son's age cannot be greater than or equal to Father's age");
        this.sonAge = sonAge;
    }
}

public class eDemo {
    public static void main(String[] args) {
        try {
            Father father = new Father(0);
            Son son = new Son(0, 50);
            System.out.println("Father's Age: " + father.age);
            System.out.println("Son's Age: " + son.sonAge);
        } catch (WrongAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
