package org.str;

public class Sample5 {
	public static void main(String[] args) {
		String u = "Welcome to class java";
		String replace = u.replace("java", "sql");
		System.out.println(replace);
		
		
		String j = "Inmakes Kochi";
		String replace2 = j.replace("Kochi", "chennai");
		System.out.println(replace2);
		
		String m = "Welcome to java class";
		String replace3 = m.replace(" ", "#");
		System.out.println(replace3);
		
		
		String n = "INMAKES INFOTECH";
		String lowerCase = n.toLowerCase();
		System.out.println(lowerCase);
		
		String b = "Welcome to java class";
		boolean empty = b.isEmpty();
		System.out.println(empty);
		
		String s1 = "Nisha";
		String s2 = "nisha";
		
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		
		System.out.println("literal String : -");
		
		String h1 = "Nisha";
		String h2 = "Nisha";
		
		System.out.println("h1 : " + System.identityHashCode(h1));
		System.out.println("h2 : " + System.identityHashCode(h2));
		
		String v = "Welcome to java class";
		CharSequence sub = v.subSequence(0, 7);
		System.out.println(sub);
		
		
	}

}
