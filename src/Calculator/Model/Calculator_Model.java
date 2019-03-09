package Calculator.Model;

public class Calculator_Model {
    private int number;

    public void AddTwoNumber(int a, int b) {
        number = a + b;
    }

    public int GetNumber(){
        return number;
    }
}
