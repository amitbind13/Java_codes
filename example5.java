package pack2;
import pack1.Sum;
public class Example5 {
    public static void main(String[] args) {
        Sum sumInstance = new Sum();
        sumInstance.input(1, 2);
        sumInstance.process();
        sumInstance.output();
    }
}
