package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharStreamApp2 {

	public static void main(String[] args) throws IOException {
		// 문자 stream Reader(불러오기)
		// 원하는 텍스트파일 --- Reader (←FileReader) fr + BufferedReader br ---> 프로그램

		Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String str = br.readLine(); // (줄바꿈기호는 생략하고) 줄마다 읽어오기
			if (str == null) { // 문자는 -1이 아니라 null이 마지막값
				break;
			}
			System.out.println(str);
		}

		fr.close();

	}

}
