package cn.he_lxm.字符串;
/**
 * 原因：会先从String类型的常量池中查找常量信息，再查找引用
 * @author Administrator
 *
 */
public class Test2 {
	private  String test(String s1,String s2,StringBuffer s3) {
		s1 += "abc";
		System.out.println("test: "+s1);//defabc
		s1.concat("ght");
		System.out.println("test: "+s1);//defabc
		s2 = s2+new String("abc");
		s3.append("abc");
		return s1;
	}
	public static void main(String[] args) {
		String s1 = "def";
		String s2 = new String("def");
		StringBuffer s3 = new StringBuffer("def");
		
		s1 = new Test2().test(s1,s2,s3);
		
		System.out.println(s1);//没有return:def,有return：defabc
		System.out.println(s2);//def
		System.out.println(s3);//defabc
	}
}
