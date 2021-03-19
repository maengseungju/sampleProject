package javaEx;

import java.util.Scanner;

public class inputNumberEven {

  public static void main(String[] args) {
    int num=0, sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("정수를 입력하세요 마지막 입력 -1 로... ");
    
    int count = 0;      // 입력한 정수들의 갯수
    
    while(num != -1) {
      num = sc.nextInt();
      if(num %2 == 0) {
        sum += num;
        if(count != 0) {
          System.out.print(" + " + num);
        }else {
          System.out.print( num);
        }
        count++;
      }
    }
      
    System.out.println(" = " + sum);
    sc.close();
  }
}