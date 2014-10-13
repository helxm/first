package cn.he_lxm.字符串;

public class StringBufferTest {
	private  void test(StringBuffer s1) {
		s1.append("abc");
	}
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("def");
		new StringBufferTest().test(s1);
		System.err.println(s1);//defabc

	}
}
