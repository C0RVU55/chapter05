package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {

	public static void main(String[] args) throws IOException {
		// I/O Stream : byte stream 이미지 등

		// InputStream은 추상부모클래스라 자식인 파일인풋스트림을 사용
		
		// [[[HDD]]] --Input 이동경로 생성--> [[[프로그램(메모리 스태틱/스택/힙 있는 곳)]]] --output 이동경로 생성 --> [[[HDD]]]
		
		// 파일이 없을 수도 있기 때문에 오류난 거 누르면 throws할지 예외처리할지 고를 수 있고 자동으로 써짐.
		/*
		 * try { InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg"); }
		 * catch(FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		/*
		// 근데 예외처리 배우는 거 아니니까 오류난 거 그냥 던짐 --> throws IOException
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg"); // 파일 끌어오기
		OutputStream out = new FileOutputStream("C:\\javaStudy\\byteimg.jpg"); // 저 이미지를 이걸로 복사. 이름 같으면 원본 깨질 수도 있음.

		// 읽어오기 : read(int) 등 --> 계속 데이터 가져오다가 더 가져올 게 없으면 -1 주기로 약속 --> while문 같이 씀.
		// 보내기 : write()
		// 꽤 오래걸림...

		System.out.println("복사시작");
		while (true) {
			int bData = in.read();
			if (bData == -1) { // 마지막 데이터인지 체크해서 반복문 탈출
				System.out.println("복사끝");
				break;
			}
			out.write(bData); // 데이터가 있으면 씀.
		}

		// 경로 연결하는 게 리소스를 많이 잡아먹어서 프로그램 끝나면 경로 끊어야 됨.
		in.close();
		out.close();
		*/
		
		//속도 개선 : 위처럼 데이터를 하나씩 읽어오면 오래 걸리니까 배열로 묶어서 옮김. --> bufferedStreamApp 보조스트림 BufferedInputStream, DataInputStream 사용
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg"); 
		OutputStream out = new FileOutputStream("C:\\javaStudy\\buffimg.jpg"); 
		
		byte[] buff = new byte[1024]; //배열 크기는 적당한 값 넣은 거.
		
		System.out.println("복사시작(배열)");
		while(true) {
			int bData = in.read(buff); //데이터를 배열이 꽉 찰 때까지 담아서 옮김.
			if(bData == -1) {
				System.out.println("복사끝(배열)");
				break;
			}
			out.write(buff); //배열째로 넘김.
		}
		in.close();
		out.close();
	}

}
