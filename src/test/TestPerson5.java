package test;

/**
 * 静态代码块 static{...}
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
	Book1 book1 = new Book1("book1 普通对象初始化");

	static Book1 book2;

	static {
		book2 = new Book1("static block book2初始化");
		book4 = new Book1("static block book4初始化");
	}

	public TestPerson5(String message) {
		System.out.println(message);
	}

	static Book1 book4;

	public static void funStatic() {
		System.out.println("static修饰的funStatic 方法");
	}

	public static void main(String[] args) {
		TestPerson5.funStatic();
		System.out.println("***********");
		TestPerson5 testPerson5 = new TestPerson5("testPerson5构造方法执行！");
	}

}
