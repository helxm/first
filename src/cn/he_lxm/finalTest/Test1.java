package cn.he_lxm.finalTest;
/**
 * final只对实例对象的引用有效，对引用指向的对象的变化不起限制所用
 * @author Administrator
 *
 */
public class Test1 {
	public static void main(String[] args) {
		final StringBuffer s1 = new StringBuffer("123");
		final StringBuffer s2 = new StringBuffer("456");
		//s1 = s2;//报错
		s1.append("456");
		System.out.println(s1);//123456
	}
}
