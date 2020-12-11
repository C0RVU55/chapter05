package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// IO Stream 복습
		// 문자열도 처음에는 바이트로 전달되는데 이미 만들어져 있는 System.in이 자동으로 변환시켜줌.

		// 기존파일 --> 키보드(System.in 사용)
		// InputStream 안 쓰고 바로 아래처럼 쓸 수 있음.
		// Scanner의 기본원리인데 매번 이렇게 쓰면 기니까 Scanner로 쓰는 거. 외부에서 오는 파일을 이런 원리로 받을 수 있음.
		InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		String str = br.readLine();

		// 출력도 마찬가지 sysout의 원리라고 볼 수 있음.
		// System.out.println(str); 
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write(str);

		bw.close();
		br.close();

	}

}
