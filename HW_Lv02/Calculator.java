package HW_Lv02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 양의 정수 2개(0포함)와 연산 기호를 매개변수로 받아 사칙연산 기능을 수행
// 결과 값을 반환하는 메서드와 연산결과를 저장하는 컬렉션 타입 필드를 가진 calculator class 생성
public class Calculator {

    // 결과값 저장하기 위해 컬렉션 사용(List 생성)
    // 아무나 값에 접근 못하게 private 처리
    // final..??
    private final Queue<Double> result = new LinkedList<Double>();

    // 계산 수행 메서드 만들기
    public double calculate(int a, int b, char operator) {
        if(operator == '+'){
            result.add((double)(a+b));
            return a + b;
        } else if (operator == '-'){
            result.add((double)(a-b));
            return a - b;
        } else if (operator == '*'){
            result.add((double)(a*b));
            return a * b;
        }else if (operator == '/'){
            if (b == 0){
                System.out.println("0으로는 나눌 수 없습니다.");
            } else {
                result.add((double)(a/b));
                return(double) a / b;
            }
        } else {
            System.out.println("잘못된 기호를 입력했습니다.");
        }
        return 0.0;
    }

    public Queue<Double>getResult(){
        return result;
    }
    public void setResult(Double result){
        this.result.add(result);
    }
    public void removeResult(){
        this.result.poll();
    }
}
