package test;

/**
 * 基本用法测试
 * 
 * @author zhangyuzhou
 *
 */
public class TestPerson1 {

	/**
	 * 构造对象时，没有static关键字修饰的成员变量，属于具体的某个对象，而不是属于类所有，每个对象单独拥有该属性，受其他对象的干扰。
	 */
	
	String name;

	int age;

	// 方法区是对象共享的
	@Override
	public String toString() {
		return "TestPerson1 [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		TestPerson1 testPerson1 = new TestPerson1();
		testPerson1.name = "zhangsan";
		testPerson1.age = 10;

		System.out.println(testPerson1);

		TestPerson1 testPerson2 = new TestPerson1();
		testPerson2.name = "lisi";
		testPerson2.age = 11;

		System.out.println(testPerson2);

	}

}
