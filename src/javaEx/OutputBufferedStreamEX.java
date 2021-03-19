package javaEx;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputBufferedStreamEX {

	public static void main(String[] args) throws IOException {

		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("/Users/seungjumaeng/Output1.txt"));

			String str = "오늘 날씨는 아주 좋습니다.\n";
			bs.write(str.getBytes());
			String str1 = "잠이와\n";
			bs.write(str1.getBytes());
			String str2 = "자고 싶어\n";
			bs.write(str2.getBytes());

		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		} finally {
			bs.close();
		}

	}
}
