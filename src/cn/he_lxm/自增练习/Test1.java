package cn.he_lxm.自增练习;

public class Test1 {
	public static void main(String[] args) {
		int x = 5;
		System.out.println("----------1----------------");
		int y = ++x*10;
		System.out.println(y);//60
		System.out.println("----------1----------------");
		x=5;
		y = x++*10;//表达式为5，x为6
		System.out.println(y);//50
		System.out.println("----------1----------------");
		x=5;
		System.out.println(++x);//表达式为6,x为6
		System.out.println();
		int y2 = x*10;
		System.out.println(y2);
		System.out.println("----------1----------------");
		x=5;
		System.out.println(x++);//表达式为5,x为6
		System.out.println();
		y2 = x*10;
		System.out.println(y2);
		/**
		 * ++总结：
		 * ++x，x++，x都会加1
		 * 前者表达式也加1，后者表达式不变
		 * 
		 * 记住：++在后，表达式不加，其它都要加
		 */
	}
}
