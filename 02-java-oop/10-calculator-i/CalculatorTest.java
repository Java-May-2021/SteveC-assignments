public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOperandOne(10);
        c.setOperandTwo(20);
        c.setOperator("+");
        c.performOperation();
        c.getResults();
    }
}
