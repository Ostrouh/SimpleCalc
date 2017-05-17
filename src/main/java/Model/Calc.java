package Model;

/**
 * Created by ostrouh on 15.05.2017.
 */
public class Calc {
    private double result = createResult();
    public String input;

    public Calc(String input){
        this.input = input;
    }

    public double getResult(){
        return result;
    }

    public double createResult(){
        String[] inputArr = input.split(" ");

        double first;
        double second;

        for(int i = 0; i < inputArr.length; i++){
            int k = i-2;

            if(inputArr[i].equals("+")){
                while(inputArr[k] == null){
                    k--;
                }
                first = Double.valueOf(inputArr[k]);
                second = Double.valueOf(inputArr[i-1]);
                inputArr[i] = first + second + "";
                inputArr[k] = null;
                inputArr[i-1] = null;

            } else if(inputArr[i].equals("-")){

                while(inputArr[k] == null){
                    k--;
                }
                first = Double.valueOf(inputArr[k]);
                second = Double.valueOf(inputArr[i-1]);
                inputArr[i] = first - second + "";
                inputArr[k] = null;
                inputArr[i-1] = null;
            } else if(inputArr[i].equals("*")){

                while(inputArr[k] == null){
                    k--;
                }
                first = Double.valueOf(inputArr[k]);
                second = Double.valueOf(inputArr[i-1]);
                inputArr[i] = first * second + "";
                inputArr[k] = null;
                inputArr[i-1] = null;
            } else if(inputArr[i].equals("/")){

                while(inputArr[k] == null){
                    k--;
                }
                first = Double.valueOf(inputArr[k]);
                second = Double.valueOf(inputArr[i-1]);
                inputArr[i] = first / second + "";
                inputArr[k] = null;
                inputArr[i-1] = null;
            } else if(inputArr[i].equals("^")){

                while(inputArr[k] == null){
                    k--;
                }
                first = Double.valueOf(inputArr[k]);
                second = Double.valueOf(inputArr[i-1]);
                inputArr[i] = Math.pow(first, second) + "";
                inputArr[k] = null;
                inputArr[i-1] = null;
            }
        }
        return Double.valueOf(inputArr[inputArr.length-1]);
    }
}
