package test;

/**
 * ��̬����� static{...}
 * 
 * @author zhangyuzhou
 *
 */
class Book1 {
	public Book1(String message) {
		System.out.println(message);
	}
}

public class TestPerson5 {
	Book1 book1 = new Book1("book1 ��ͨ�����ʼ��");

	static Book1 book2;

	static {
		book2 = new Book1("static block book2��ʼ��");
		book4 = new Book1("static block book4��ʼ��");
	}

	public TestPerson5(String message) {
		System.out.println(message);
	}

	static Book1 book4;

	public static void funStatic() {
		System.out.println("static���ε�funStatic ����");
	}

	public static void main(String[] args) {
		TestPerson5.funStatic();
		System.out.println("***********");
		TestPerson5 testPerson5 = new TestPerson5("testPerson5���췽��ִ�У�");
	}

}
