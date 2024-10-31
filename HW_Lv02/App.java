package HW_Lv02;

import java.util.*;
// 클래스에서 import 해줘도 또 해줘야하나?


public class App {
    public static void main(String[] args) {

        // Calculator 클래스로 부터 객체 생성(Calculator 클래스의 객체인 calculator 인스턴스 생성)
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        char operator;



        // exit 변수 지정
        String exit = "";
        while (!exit.equals("exit")) {

            System.out.println("첫 번째 숫자: ");
            a = sc.nextInt();
            System.out.println("사칙 연산기호: ");
            operator = sc.next().charAt(0);
            System.out.println("두 번째 숫자: ");
            b = sc.nextInt();

            // 클래스에서 메서드 가져오기 , 결과값 리턴
            double result = calculator.calculate(a, b, operator);

            // 결과값 출력
            System.out.println(result);

            System.out.println("종료를 원하면 exit");
            // 안쓰면 바로 다음 줄로 넘어감
            sc.nextLine();
            exit = sc.nextLine();
        }


        // 결과값 저장됐는지 확인 근데 왜 Double인지는 모르겠음 null 초기화 필요?
        // 결과값 저장용 컬렉션을 private으로 생성 -> getResult()를 통해서만 접근 가능
        Queue<Double> resultList = calculator.getResult();
        for (Double result : resultList) {
            System.out.println(result);
        }
        while (!resultList.isEmpty()) {
            System.out.println(resultList.poll());
        }

    }
}    