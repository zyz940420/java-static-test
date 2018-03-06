package test;

public class TestPerson3 {
	private static int count = 0;

	int id;

	String name;

	int age;

	public TestPerson3() {
		id = ++count;
	}

	@Override
	public String toString() {
		return "TestPerson3 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		TestPerson3 person1 = new TestPerson3();
		person1.name = "zhangsan";
		person1.age = 20;
		System.out.println(person1);

		TestPerson3 person2 = new TestPerson3();
		person2.name = "lisi";
		person2.age = 21;
		System.out.println(person2);
	}
}
