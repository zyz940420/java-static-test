package test;

/**
 * �����÷�����
 * 
 * @author zhangyuzhou
 *
 */
public class TestPerson1 {

	/**
	 * �������ʱ��û��static�ؼ������εĳ�Ա���������ھ����ĳ�����󣬶��������������У�ÿ�����󵥶�ӵ�и����ԣ�����������ĸ��š�
	 */
	
	String name;

	int age;

	// �������Ƕ������
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
