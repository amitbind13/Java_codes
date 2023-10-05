class Name {
    private String value;
    void fun(String a) {
        this.value = a;
    }
    void show() {
        System.out.println(value);
    }
}
public class Example4 {
    public static void main(String[] args) {
        Name n = new Name();
        n.fun("Google");
        n.show();
        n.fun("Microsoft");
        n.show();
        n.fun("Dell");
        n.show();
    }
}
