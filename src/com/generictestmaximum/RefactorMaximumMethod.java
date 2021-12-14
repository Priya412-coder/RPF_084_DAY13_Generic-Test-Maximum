package com.generictestmaximum;

public class RefactorMaximumMethod <M>{
	M a , b , c ;
	
	public RefactorMaximumMethod(M a, M b,M c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//public M maximum() {
		//return RefactorMaximumMethod.maximum();
	//}
public static Integer getMaxint(Integer a , Integer b , Integer c ) {
	if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
		return a;
	} else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
		return b;
	} else {
		return c;
}
}
	public static String getMaxStr(String a , String b , String c ) {
		if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
			return a;
		} else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
			return b;
		} else {
			return c;
	}	
}
	public static Float getMaxDoub(Float a , Float b , Float c ) {
		if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
			return a;
		} else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
			return b;
		} else {
			return c;
	}	
}
	public static void main(String[] args) {
		Integer aInt = 1 , bInt = 2 ,cInt = 3 ;
		Float aFl = 1.2f , bFl = 8.2f , cFl = 60.2f ;
		String aStr = "Priyanka" , bStr = "Sonu" , cStr = "Muffin" ;
		
		RefactorMaximumMethod.getMaxStr(aStr, bStr, cStr);
		RefactorMaximumMethod.getMaxint(aInt, bInt, cInt);
		RefactorMaximumMethod.getMaxDoub(aFl, bFl, cFl);
	}
	
}
