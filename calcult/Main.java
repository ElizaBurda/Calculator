package calcult;
public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);              //  BinaryOperator<Integer> plus
        int b = calc.minus.apply(1, 1);             //  BinaryOperator<Integer> minus
        try {
            int c = calc.devide.apply(a, b);        // BinaryOperator<Integer> devide
            calc.println.accept(c);                 // Деление на ноль нельзя
        } catch (ArithmeticException exception) {
            System.out.println("Делить на ноль нельзя");
        }
    }
}