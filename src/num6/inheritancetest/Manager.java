package num6.inheritancetest;

public class Manager extends Employee {
	String department;

	public Manager(String na, int sa, String de) {
		super(na, sa);	 // Employee 클래스의 생성자에게 이름과 월급 전달
		department = de; // 부서 저장
	}

	public void getInformation() {
		System.out.println("이름 : " + name + ", 부서 : " + department + ", 연봉 : " + salary);
		//Employee 클래스에 있는 name과 salary 변수를 사용
	}
}
