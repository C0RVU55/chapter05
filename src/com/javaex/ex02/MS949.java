package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MS949 {

	public static void main(String[] args) throws IOException {
		// 인코딩 변환 : InputStream --> InputStreamReader(연결할 주소, 번역할 포맷) --> BufferedReader
		
		/* FileInputStream을 InputStreamReader에 연결하고 InputStreamReader을 BufferedReader에 연결해서 최종적으로 br로만 조종함.
		[[텍스트파일]] --- InputStream(←FileInputStream in) --- InputStreamReader isr --- BufferedReader br ---> [[프로그램]]
		*/
		
		// song은 UTF-8이라 바로 출력되는데 이거는 MS949라서 이클립스에서는 처리가 안 됨 --> InputStreamReader 사용
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949"); // 어떤 포맷으로 번역할지 문자열로 씀
		BufferedReader br = new BufferedReader(isr); // 순서대로 연결시켜서 조종은 버퍼로만 하면 됨.

		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			System.out.println(str);
		}

		br.close();

	}

}
