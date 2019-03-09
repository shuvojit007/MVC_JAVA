package Calculator.Controller;

import Calculator.Model.Calculator_Model;
import Calculator.View.Calculator_View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    Calculator_View mView;
    Calculator_Model Model;

    public CalculatorController(Calculator_View mView, Calculator_Model Model) {
        this.mView = mView;
        this.Model = Model;

        this.mView.AddListener(new CalculateListener());
    }

    public class CalculateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int firstNumber ,SecondNumber =0;

            try {
                firstNumber = mView.getFirstNumber();
                SecondNumber = mView.getSecondNumber();

                Model.AddTwoNumber(firstNumber,SecondNumber);
                mView.setCalcSolution(Model.GetNumber());
            }
            catch (NumberFormatException ex){
                System.out.println(ex);
                mView.DisplayErrorMsg("You need to enter 2 integers");
            }
        }
    }
}
