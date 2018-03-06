package test;

/**
 * static ���γ�Ա����������ͨ��������.������������
 * 
 * һ��static���εķ����У�����ʹ�÷�static ���εĳ�Ա�����ͱ�������̬�������ܷ��ʷǾ�̬�ĳ�Ա���ԣ�
 * 
 * ��Ϊstatic��Ա�����ͱ�����ץ��Class��ʱ��������ɣ��ȹ��췽���磬��ʱ��static�����Ժͷ�����û����ɳ�ʼ��
 * 
 * ��̬�����в���ʹ��this��super����
 * 
 * ��Ϊstatic�����������κ�ʵ�������static�������뱻ʵ�֣��������ǳ����abstract
 * 
 * static��finalһ���ã�ȫ�ֳ��������ڱ��������޸ģ�ͨ���������ʣ����ڷ��������ɸ��ǣ���������
 * 
 * @author zhangyuzhou
 *
 */
public class TestPrintHelper {
	public static void print(Object object) {
		int other = testParam;
		System.out.println("private static ��������ľ�̬�����У�" + other);
		System.out.println(object);
	}

	public static void main(String[] args) {
		// this.testParam;
		TestPrintHelper.print("hello world");
	}

	private static int testParam = 0;

	static {
		int other = testParam;
		System.out.println("private static �����ھ�̬������У�" + other);
	}

	private void testOther() {
		int other = testParam;
		System.out.println("private static �������ڱ���ķǾ�̬�����У�" + other);
	}

}
