package javaEx;

import java.util.Scanner;

public class Bank {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //int menuNo;
    int sum = 0;
    boolean run = true;
    while(run){
      System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
      System.out.print("선택>");
      
      int menuNo = sc.nextInt();
      int inputNum = 0;
      
      switch(menuNo){
        case 1:
          System.out.print("예금액>");
          inputNum = sc.nextInt();
          sum += inputNum;
          break;
        case 2:
          System.out.print("출금액>");
          inputNum = sc.nextInt();
          if(sum >= inputNum ) {
            sum -= inputNum;
          }else {
            System.out.print("잔액이 부족합니다.");
          }
          break;
        case 3:
          System.out.print("잔고액>");
          System.out.println(sum);
          break;
        case 4:
          System.out.print("");
          run = false;
          break;
        default :
          System.out.println("다시 입력해주세요");
          break;
          
      }//switch 
      
    }//while
    System.out.println("프로그램 종료");
    sc.close();
  }
 
  

}
