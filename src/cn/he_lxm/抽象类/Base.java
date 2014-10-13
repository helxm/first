package cn.he_lxm.抽象类;

import java.io.Serializable;

abstract class Base implements Serializable{

	private static final long serialVersionUID = 1L;
	//abstract Integer id;//不能定义在成员属性上
	private String data;
	public String getData(){
		return data;
	}
	abstract void setData();//抽象方法无默认行为，必须加abstract
}
