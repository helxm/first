package cn.he_lxm.integer;
/**
 * 原因：每个类都有一个常量池，
 * @author Administrator
 *
 */
public class TestInteger常量池 {
	private static void test(Integer i) {
		//i=5;
		i = new Integer(10);
	}
	public static void main(String[] args) {
		//int i = 1234538576;
		Integer i = 1234538576;
		test(i);
		System.out.println(i);//1234538576，和String类型一样
		
		System.out.println(true + "");
		
		
		Integer i2 =null;
		test2(i2);
		System.out.println(i2);//null
	}
	private static void test2(Integer i2) {
		i2 = new Integer(4);
		
	}
}
