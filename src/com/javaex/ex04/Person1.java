package com.javaex.ex04;

public class Person1 {

	// 전화번호 텍스트파일 불러오기 해설

	// 필드
	private String name;
	private String hp;
	private String company;

	// 생성자
	public Person1() {
	}

	public Person1(String name, String hp, String company) {
		super();
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	// 메소드 겟셋
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}

}
