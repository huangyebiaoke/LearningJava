package com.test.four;

import java.util.Scanner;

public class RentBook {
	
	public static void main(String[] args) {
		String[] book= {
				"数据结构",
				"think in java",
				"first head java"
		};
		System.out.println("input command: 1.search with name; 2.search with serial number");
		int inputNum=0;
		try {
			inputNum=new Scanner(System.in).nextInt();
		} catch (Exception e) {
			System.err.println("input number!!");
			main(args);
		}
		
		switch(inputNum) {
			case 1:{
				System.out.println("input book name what you want:");
				String name=new Scanner(System.in).next();
				for (int i = 0; i < book.length; i++) {
					if(name.equals(book[i])) {
						System.out.println("book:"+book[i]);
					}
				}
				System.err.println("book is not exist");
			}break;
			case 2:{
				int number=0;
				try {
					System.out.println("input book number what you want:");
					number=new Scanner(System.in).nextInt();
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.println("arrays index out of number!!!");
					number=new Scanner(System.in).nextInt();
				}catch (Exception e) {
					System.err.println("input number!!");
					number=new Scanner(System.in).nextInt();
				}
				System.out.println("book name: "+book[number-1]);
			}break;
			default:{
				System.err.println("input 1 or 2!!");
				main(args);
			}
		}

	}

}
