package cn.he_lxm.子父类;

import java.util.Date;
public class Test extends Date{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
       new Test().test();
    }
   
    public void test(){
       System.out.println(super.getClass().getName());//cn.he_lxm.子父类.Test
    }
}
