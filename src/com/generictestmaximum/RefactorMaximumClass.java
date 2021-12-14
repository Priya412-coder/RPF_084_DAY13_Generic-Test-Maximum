package com.generictestmaximum;

public class RefactorMaximumClass<M extends Comparable<M>> {
	M a , b , c ;

	public RefactorMaximumClass(M a, M b,M c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public static <M extends Comparable<M>> M getMaxint(M a , M b , M c ) {
		M max = a;
		if (b.compareTo(max) > 0 ) {
			max = b;
		} 
		if (c.compareTo(max) > 0){
			max = c;
		}
		printMax(a , b , c , max);
		return max;
	}
	public static String getMaxStr(String a , String b , String c ) {
		String max = a ; 
		if (b.compareTo(max) > 0 ) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		printMax(a , b , c , max);
		return max;
	}
	public static <M> void printMax(M a, M b, M c, M max) {
		System.out.printf("Max of %s, %s and %s is %s\n",a,b,c,max);
	}
	public static void main(String[] args) {
		Integer aInt = 1 , bInt = 2 ,cInt = 3 ;
		Float aFl = 1.2f , bFl = 8.2f , cFl = 60.2f ;
		String aStr = "Priyanka" , bStr = "Priyan" , cStr = "Priya" ;

		RefactorMaximumClass.getMaxStr(aStr, bStr, cStr);
		RefactorMaximumMethod.getMaxint(aInt, bInt, cInt);
		RefactorMaximumMethod.getMaxDoub(aFl, bFl, cFl);
	}
}
