package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		// 텍스트파일 불러오기 > 배열 split > 리스트관리 및 출력 > 데이터추가(리스트3에 add로 1추가해서 전체를 다시 쓰는 방식)
		// 이름: 핸드폰: 회사:

		Reader in = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(in);

		// 추가???

		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			String[] sArr = str.split(",");
			System.out.println("이름: " + sArr[0]);
			System.out.println("핸드폰: " + sArr[1]);
			System.out.println("회사: " + sArr[2]);
			System.out.println("");
		}

		br.close();
	}

}
