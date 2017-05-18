package Model;

/**
 * Created by ostrouh on 15.05.2017.
 */
public class Calc {
    public double getResult(String input){
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
