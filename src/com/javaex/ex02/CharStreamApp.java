package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharStreamApp {

	public static void main(String[] args) throws IOException { // 오류 뜰 때 throws 하든가 예외처리하든가 선택하면 자동생성해줌.
		// 문자 stream Writer(내보내기)

		Writer fw = new FileWriter("C:\\javaStudy\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		// 텍스트는 속도면에서 큰 차이는 없지만 각 운영체제에 맞게 알아서 변환시켜주는 게 장점.
		bw.write("깊고 작은 산골짜기 사이로"); // 자료형 맞는 write메소드 쓰면 됨.
		bw.newLine(); // 줄바꿈. 운영체제에 따라 줄바꿈 기호가 달라서 newLine() 쓰면 알아서 운영체제에 맞는 기호 써줌.
		bw.write("맑은 물 흐르는 작은 샘터에\n예쁜 꽃들 사이에 살짝 숨겨진\n이슬 먹고 피어난 네잎클로버"); // 이러면 리눅스에서 안 먹을 수도 있음.

		bw.close();

	}

}
