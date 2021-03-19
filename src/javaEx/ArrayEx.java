package javaEx;

public class ArrayEx {

	public static void main(String[] args) {
	     int[] leftArray = new int[] {10, 20, 30};
	      int[] rightArray = new int[]{10, 40, 30};
	  
	      //코드작성
	      if(leftArray.length != rightArray.length) {
	        System.out.println("두배열의 길이(크기)가 다릅니다 ");
	      }else {
	        System.out.println("두배열의 길이(크기)가 같습니다 ");
	        for(int i=0; i<rightArray.length; i++ ) {
	          if(leftArray[i] != rightArray[i]) {
	            System.out.println( (i+1) + "번째 원소가 다릅니다");
	          }
	        }
	        
	      }
	    }
	}