package test;

/**
 * static 修饰成员方法，可以通过“类名.方法名”访问
 * 
 * 一个static修饰的方法中，不能使用非static 修饰的成员方法和变量（静态方法不能访问非静态的成员属性）
 * 
 * 因为static成员方法和变量，抓在Class的时候首先完成，比构造方法早，此时非static的属性和方法还没有完成初始化
 * 
 * 静态方法中不能使用this、super方法
 * 
 * 因为static方法独立于任何实例，因此static方法必须被实现，而不能是抽象的abstract
 * 
 * static和final一起用：全局常量，对于变量不可修改，通过类名访问；对于方法：不可覆盖，类名访问
 * 
 * @author zhangyuzhou
 *
 */
public class TestPrintHelper {
	public static void print(Object object) {
		int other = testParam;
		System.out.println("private static 可以在类的静态方法中：" + other);
		System.out.println(object);
	}

	public static void main(String[] args) {
		// this.testParam;
		TestPrintHelper.print("hello world");
	}

	private static int testParam = 0;

	static {
		int other = testParam;
		System.out.println("private static 可以在静态代码块中：" + other);
	}

	private void testOther() {
		int other = testParam;
		System.out.println("private static 可以用于本类的非静态方法中：" + other);
	}

}
