package com.lab.lab3;
import java.util.*;

public class Lab3Ex2 {

		public void getImage(String str) {
			StringBuffer sb = new StringBuffer(str);
			sb.reverse();
			System.out.println(str + "|" + sb);
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String ");
			String str = sc.next();
			sc.close();
			Lab3Ex2 lb = new Lab3Ex2();
			lb.getImage(str);
			
		}
	}


