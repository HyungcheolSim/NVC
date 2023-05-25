package java_grammer.homework.hw3;

public class Calculator {
    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }
    public void setOperation(AbstractOperation operation){
        this.operation=operation;
    }

    public double calculate(int firstNumber,int secondNumber){
        double answer=0;
        answer = operation.operate(firstNumber,secondNumber);
        return answer;
        /*switch(operator){
            case "+":
                answer= abstractOperation.operate(firstNumber,secondNumber);
                break;
            case "-":
                answer=substractOperation.operate(firstNumber,secondNumber);
                break;
            case "/":
                answer= multiplyOperation.operate(firstNumber,secondNumber);
                break;
            case "*":
                answer= divideOperation.operate(firstNumber,secondNumber);
                break;
            case "%":
                answer= firstNumber%secondNumber;
                break;
        }*/

    }
}
