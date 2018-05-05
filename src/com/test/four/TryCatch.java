package com.test.four;
import java.util.Scanner;

public class TryCatch {
	public int nn(int a, int b) {
		int c=0;
		try {
			System.out.println("I'm try");
			return c=a/b;
		}catch(Exception e) {
			System.err.println("Can't divide zero!!");
			e.printStackTrace();
		}finally {
			System.out.println("I'm finally");
			//return 0;
		}
		return c;
	}

	public static void main(String[] args) {
		int sum=new TryCatch().nn(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
		System.out.println(sum);
	}

}
