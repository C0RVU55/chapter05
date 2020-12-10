package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		// I/O Stream 과제
		// 텍스트파일 불러오기 > 배열 split > 리스트관리 및 출력 > 데이터추가(리스트3에 add로 1추가해서 전체를 다시 쓰는 방식)
		// 이름: 핸드폰: 회사:

		Reader in = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(in);

		List<Person> pList = new ArrayList<Person>();

		while (true) {
			String p = br.readLine();
			if (p == null) {
				break;
			}
			String[] pArr = p.split(","); // 이걸 조건문 전에 썼는데 NullPoint오류남. null을 배열에 넣을 수 없어서 그런듯.
			Person person = new Person(pArr[0], pArr[1], pArr[2]);
			pList.add(person);
		}
		for (int i = 0; i < pList.size(); i++) {
			pList.get(i).showInfo();
		}

		// 추가
		System.out.println("-----데이터 추가-----");

		Person pp = new Person("이다현", "000-0000-0000", "123-123123-22");
		pList.add(pp);
		for (int i = 0; i < pList.size(); i++) {
			pList.get(i).showInfo();
		}

		// 수정한 파일 내보내기 ???
		Writer out = new FileWriter("C:\\javaStudy\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(out);
		
		//bw.write();
		
		br.close();
		bw.close();
	}

}
