public class Main {
    public static void main(String[] args){
        post p1 = new textpost();
        p1.post();
        p1.comment();

        post p2 = new imagepost();
        p2.post();
        p2.comment();
    }
    
}
