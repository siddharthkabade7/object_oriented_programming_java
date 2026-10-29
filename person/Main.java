
public class Main {
    public static void main(String[] args) {
        person p1 = new person("siddharth", 19);
        person p2 = new person(p1);

        p1.display();
        p2.display();
    }
}
