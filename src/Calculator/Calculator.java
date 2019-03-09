package Calculator;

import Calculator.Controller.CalculatorController;
import Calculator.Model.Calculator_Model;
import Calculator.View.Calculator_View;

public class Calculator {

    public static void main(String[] args) {
        Calculator_Model model = new Calculator_Model();
        Calculator_View mView = new Calculator_View();
        CalculatorController controller = new CalculatorController(mView,model);
        mView.setVisible(true);

    }

}
