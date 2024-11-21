package com.yang.book;

public abstract class AbstractMachine 
{
   private String name;
   private boolean on;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public abstract void turnOn();
	public abstract void turnOff();
   
}
