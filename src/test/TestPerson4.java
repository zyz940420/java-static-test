package test;

/**
 * ���Ծ�̬�����
 * 
 * ��̬��Ա-->��ͨ��Ա-->���캯��ִ�����
 * 
 * @author zhangyuzhou
 * 
 *
 */
class Book {
	public Book(String message) {
		System.out.println(message);
	}
}

public class TestPerson4 {
	Book book1 = new Book("book1��ʼ��");

	static Book book2 = new Book("static book2��ʼ��");

	public TestPerson4(String message) {
		System.out.println(message);
	}

	Book book3 = new Book("book3��ʼ��");

	static Book book4 = new Book("static book4��ʼ��");

	private static void function(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		TestPerson4.function("���ྲ̬����ִ��");
		System.out.println("----------------");
		TestPerson4 testPerson = new TestPerson4("���캯����ʼ��");
	}

}
