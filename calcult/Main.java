package calcult;
public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);              //  а = 3
        int b = calc.minus.apply(1, 1);             //  b = 0, на ноль делить не можем, соответственно ловим ошибку
        try {
            int c = calc.devide.apply(a, b);        
            calc.println.accept(c);                 // Деление на ноль нельзя
        } catch (ArithmeticException exception) {
            System.out.println("Делить на ноль нельзя");  // выводим наше предупреждающее сообщение 
        }
    }
}
