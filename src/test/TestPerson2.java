package test;

/**
 * static 修饰成员变量测试
 * 
 * @author zhangyuzhou
 *
 */
public class TestPerson2 {
	String name;

	static int age;

	@Override
	public String toString() {
		return "TestPerson2 [name=" + name + "]";
	}

	public static void main(String[] args) {
		TestPerson2 testPerson1 = new TestPerson2();
		testPerson1.name = "zhangsan";
//		testPerson1.age = 10;

		System.out.println(testPerson1);

		TestPerson2 testPerson2 = new TestPerson2();
		testPerson2.name = "lisi";
//		testPerson2.age = 11;

		System.out.println(testPerson2 + "----" + age);

	}

}
