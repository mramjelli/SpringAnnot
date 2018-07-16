package com.spring.test2;

public class SpringAnnot2 {
	private String annot3;
	public void display2()
	{
		annot3="new daata";
		System.out.println(" value changed to :"+annot3);
	}
	public String getAnnot3() {
		return annot3;
	}
	public void setAnnot3(String annot3) {
		this.annot3 = annot3;
	}
	public SpringAnnot2()
{
	
	System.out.println("Consturctor class");
}
}
