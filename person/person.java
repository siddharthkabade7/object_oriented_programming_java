
class person {
    String name;
    int age;

    // Default constructor
    person() {
        name = "unknown";
        age = 0;
    }

    // Parameterized constructor
    person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    person(person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
    }
}
