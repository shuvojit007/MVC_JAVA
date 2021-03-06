package Calculator.View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Calculator_View extends JFrame {

    private JTextField firstNumber  = new JTextField(10);
    private JLabel additionLabel = new JLabel("+",10);
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);


    public Calculator_View(){
        // Sets up the view and adds the components
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);

        // End of setting up the components --------
    }


    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }

    public int getCalcSolution(){
        return Integer.parseInt(calcSolution.getText());
    }



    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }


    public void AddListener(ActionListener listener){
        calculateButton.addActionListener(listener);
    }

    public void DisplayErrorMsg(String errMsg){
        JOptionPane.showMessageDialog(this,errMsg);
    }

}
