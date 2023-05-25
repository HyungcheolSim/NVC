package java_grammer.homework.hw4;

import java_grammer.homework.hw3.AddOperation;
import java_grammer.homework.hw3.DivideOperation;
import java_grammer.homework.hw3.MultiplyOperation;
import java_grammer.homework.hw3.SubstractOperation;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public void parseFirstNum(String firstInput) throws Exception {
        /*try {
            if(!Pattern.matches(NUMBER_REG, firstInput))
                //정규 표현식 내에 일치하는 게 없으면 BadInputException 발생시킴
                throw new BadInputException("정수값");
            calculator.setFirstNumber(Integer.parseInt(firstInput));
        } catch (BadInputException e) {//BadInputException 처리하고 Exception에러를 또 발생시켜서 이어나가지 못하도록 하는데 이러면 트라이 캐치문을 벗기면 되는거 아닌가?
            e.printStackTrace();
            System.out.println("firstInput의 입력값이 잘못됐습니다.");
            //throw new Exception(e);
        }*/
        if (!Pattern.matches(NUMBER_REG, firstInput))
            //정규 표현식 내에 일치하는 게 없으면 BadInputException 발생시킴
            throw new BadInputException("정수값");
        calculator.setFirstNumber(Integer.parseInt(firstInput));
    }

    public void parseSecondNum(String secondInput) throws Exception {
        /*try {
            if(!Pattern.matches(NUMBER_REG, secondInput))
                throw new BadInputException("정수값");
            calculator.setSecondNumber(Integer.parseInt(secondInput));
        } catch (BadInputException e) { //에러를 상세하게 다루고 싶을 떄?
            e.printStackTrace();
            System.out.println("secondInput의 입력값이 잘못됐습니다.");
            throw new Exception(e);
        }*/
        if (!Pattern.matches(NUMBER_REG, secondInput))
            throw new BadInputException("정수값"); //예외 복구(에러로 넘겨주면 Main에서 다시한번 값을 입력받으면서 정상 처리되도록 한다.
        calculator.setSecondNumber(Integer.parseInt(secondInput));
    }

    public void parseOperator(String operationInput) throws Exception {
        /*try {
            //알맞은 operation 값이 들어갔는지 확인
            if(!Pattern.matches(OPERATION_REG, operationInput)) {
                throw new BadInputException("정확한 연산자 값");
            }
                //input이 뭐냐에 따라 다른 abstract operator 생성
            switch (operationInput) {
                case "+" -> calculator.setOperation(new AddOperation());
                case "-" -> calculator.setOperation(new SubstractOperation());
                case "/" -> calculator.setOperation(new DivideOperation());
                case "*" -> calculator.setOperation(new MultiplyOperation());
            }
        } catch (BadInputException e) {
            e.printStackTrace();
            System.out.println("operator의 입력값이 잘못됐습니다.");
            //throw new Exception(e);
        }*/
        //알맞은 operation 값이 들어갔는지 확인
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("정확한 연산자 값");
        }
        //input이 뭐냐에 따라 다른 abstract operator 생성
        switch (operationInput) {
            case "+" -> calculator.setOperation(new AddOperation());
            case "-" -> calculator.setOperation(new SubstractOperation());
            case "/" -> calculator.setOperation(new DivideOperation());
            case "*" -> calculator.setOperation(new MultiplyOperation());
        }
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
