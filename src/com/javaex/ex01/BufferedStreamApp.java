package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamApp {

	public static void main(String[] args) throws IOException { // 오류처리
		// 보조 스트림 : BufferedInputStream BufferedOutputStream
		
		/* 바이트(사진, 소리) / 문자열
		 [[HDD]] ---InputStream(←FileInputStream) / Reader(←FileReader)---> [[프로그램]] ---OutputStream(←FileOutputStream) / Writer(←FileWriter)--> [[HDD]]
		 						/ InputStreamReader												/ OutputStreamWriter
		 			BufferedInputStream / BufferedReader							BufferedOutputStream / BufferedWriter
		 [[HDD]] --------------(불러오기)Input 이동경로 생성--------------> [[프로그램]] --------------(내보내기)Output 이동경로 생성--------------> [[HDD]]
		*/
		
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in); // 섞어쓰기 안 하고 바로 씀. bin은 변수명. in(InputStream 주소)으로 둘을 연결함.

		OutputStream out = new FileOutputStream("C:\\javaStudy\\bufferedimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);

		System.out.println("복사시작(버퍼)");
		while (true) {
			int bData = bin.read(); // buffered의 read라서 이미 속도 개선이 된 상태.
			if (bData == -1) {
				System.out.println("복사끝(버퍼)");
				break;
			}
			bout.write(bData); // 내보내기
		}

		// 버퍼를 인풋스트림과 연결했기 때문에 인풋스트림을 건드릴 필요는 없고 버퍼로 조종하면 됨. 
		// in.read()도 직접 접근하지 말고 bin.read()로 써먹으라고 버퍼랑 연결한 거.
		bin.close();
		bout.close();

	}

}
