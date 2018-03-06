package test;

/**
 * 测试静态代码块
 * 
 * 静态成员-->普通成员-->构造函数执行完成
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
	Book book1 = new Book("book1初始化");

	static Book book2 = new Book("static book2初始化");

	public TestPerson4(String message) {
		System.out.println(message);
	}

	Book book3 = new Book("book3初始化");

	static Book book4 = new Book("static book4初始化");

	private static void function(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		TestPerson4.function("本类静态方法执行");
		System.out.println("----------------");
		TestPerson4 testPerson = new TestPerson4("构造函数初始化");
	}

}
