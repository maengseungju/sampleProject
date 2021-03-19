package javaEx;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        dollar = 1000000;
        won = 100;
        
        
        
        CConverter.setRate(1099.00);
        
        System.out.println("백만원은 " +
        		CConverter.toDollar(dollar) + "달러 입니다.");
        System.out.println("백달러는 " +
        		CConverter.toKRW(won) + "원 입니다.");
        //백만원을 달러로 출력

        
        //100달러를 원으로 출력
        
        
    }

}
