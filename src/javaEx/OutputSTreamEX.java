package javaEx;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputSTreamEX {

	public static void main(String[] args) {

		try {
			OutputStream output = new FileOutputStream("/Users/seungjumaeng/Output.txt");
			
			String str = "오늘 날씨는 아주 좋습니다.\n";
			String str1 = "오늘은 몸 상태가 아주 별로네요.\n";
			String str2 = "점심시간이니 밥을 먹읍시다.\n";

			byte[] by = str.getBytes();
			output.write(by);

			byte[] by1 = str1.getBytes();
			output.write(by1);
			
			byte[] by2 = str2.getBytes();
			output.write(by2);
		
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
