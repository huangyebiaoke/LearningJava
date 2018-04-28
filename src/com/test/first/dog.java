package com.test.first;

public class dog {
	String name;
	int size;
	public void bark(int num) {
		while(num>0) {
			if(size>60) {
				System.out.print("汪");
			}else if(size>20) {
				System.out.print("哇");
			}else {
				System.out.print("呜");
			}
			num-=1;
		}
	}

	public static void main(String[] args) {
		dog[] newDog=new dog[3];
		int[] weidth= {70,10,30};
		for(int i=0;i<newDog.length;i++) {
			newDog[i]=new dog();
			newDog[i].size=weidth[i];
		}
		for(dog e:newDog) {
			e.bark(3);
		}
	}

}
