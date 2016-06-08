package com.prot.test;

public class ProtVar {
	public static void main(String[] args){
		ProtectedInstances pi = new ProtectedInstances();
		System.out.println("ProtectedInstances var can be seen locally " + pi.protInt);
	}

}
