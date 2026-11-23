public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Database db = new Database();
        db.connect();
        db.disconnect();
    }
}