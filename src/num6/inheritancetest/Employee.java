package num6.inheritancetest;

public class Employee {
	String name;
	int salary;

	public Employee(String na, int sa) {	//생성자가 이름과 월급을 인수로 받음
		name = na;		// 이름과 월급을 저장
		salary = sa;
	}

	public void getInformation() {
		System.out.println("이름 : " + name + "연봉 : " + salary);
	}
}
