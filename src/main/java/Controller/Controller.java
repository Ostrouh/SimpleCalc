package Controller;

import Model.Calc;
import Model.ReversePolishNotation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Created by ostrouh on 21.05.2017.
 */
public class Controller {
    String text = "";
    String operators = ReversePolishNotation.getOperators();
    @FXML
    private TextField textField;
    @FXML
    private Button buttonC;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button0;
    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonMinus;
    @FXML
    private Button buttonMultiply;
    @FXML
    private Button buttonDivide;
    @FXML
    private Button buttonDot;
    @FXML
    private Button buttonToDegrees;
    @FXML
    private Button buttonEqual;

    @FXML
    public void onClickButtonC(){
        text = "";
        setText(text);
    }
    @FXML
    public void onClickButton1(){
        text += "1";
        setText(text);
    }
    @FXML
    public void onClickButton2(){
        text += "2";
        setText(text);
    }
    @FXML
    public void onClickButton3(){
        text += "3";
        setText(text);
    }
    @FXML
    public void onClickButton4(){
        text += "4";
        setText(text);
    }
    @FXML
    public void onClickButton5(){
        text += "5";
        setText(text);
    }
    @FXML
    public void onClickButton6(){
        text += "6";
        setText(text);
    }
    @FXML
    public void onClickButton7(){
        text += "7";
        setText(text);
    }
    @FXML
    public void onClickButton8(){
        text += "8";
        setText(text);
    }
    @FXML
    public void onClickButton9(){
        text += "9";
        setText(text);
    }
    @FXML
    public void onClickButton0(){
        text += "0";
        setText(text);
    }
    @FXML
    public void onClickButtonPlus(){
        if (text.length() != 0 && !operators.contains(text.substring(text.length()-1))) {
            text += "+";
            setText(text);
        }
    }
    @FXML
    public void onClickButtonMinus(){
        if (text.length() != 0 && !operators.contains(text.substring(text.length()-1))) {
            text += "-";
            setText(text);
        }
    }
    @FXML
    public void onClickButtonMultiply(){
        if (text.length() != 0 && !operators.contains(text.substring(text.length()-1))) {
            text += "*";
            setText(text);
        }
    }
    @FXML
    public void onClickButtonDivide(){
        if (text.length() != 0 && !operators.contains(text.substring(text.length()-1))) {
            text += "/";
            setText(text);
        }
    }
    @FXML
    public void onClickButtonToDegrees(){
        if (text.length() != 0 && !operators.contains(text.substring(text.length()-1))) {
            text += "^";
            setText(text);
        }
    }
    @FXML
    public void onClickButtonEqual(){
        if (text.length() != 0 && !operators.contains(text.substring(text.length()-1))) {
            String output = ReversePolishNotation.createOutput(text);
            double result = new Calc().getResult(output);
            text = result + "";
            setText(text);
            text = "";
        }
    }
    @FXML
    public void onClickButtonDot(){
        String[] numbers = text.split("[+\\-*/^]+");
        if (numbers[numbers.length-1].length() != 0 && !numbers[numbers.length-1].contains(".")) {
            text += ".";
            setText(text);
        }
    }
    @FXML
    public void onClickButtonBS(){
        text = delLastChar(text);
        textField.setText(text);
    }

    private void setText(String text){
        textField.setText(text);
    }

    private String delLastChar(String text){
        if (text == null || text.length() == 0) {
            return text;
        }
        return text.substring(0, text.length()-1);

    }
}
