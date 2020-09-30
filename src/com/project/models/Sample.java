package com.project.models;

import org.springframework.stereotype.Component;

@Component
public class Sample {

	String item;
	String vname;
	
	
	public Sample()
	{
		this("","");
	}
	public Sample(String item,String vname)
	{
		this.item=item;
		this.vname=vname;
	}

	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	@Override
	public String toString() {
		return "Sample [item=" + item + ", vname=" + vname + "]";
	}
	
	
	
}
