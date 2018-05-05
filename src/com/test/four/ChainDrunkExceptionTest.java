package com.test.four;
/*
 * 异常链测试类
 * test1：抛出DrunkExpectation异常
 * test2: 尝试捕获test1的异常并包装成RuntimeException继续抛出
 * 
 */
public class ChainDrunkExceptionTest {
	public void test1() throws DrunkException {//声明将要抛出DrunkException这种异常
		throw new DrunkException("喝酒别开车！！！");
	}
	public void test2() {
		try {
			test1();
		} catch (DrunkException e) {
			RuntimeException newExc= new RuntimeException("这是运行时异常");
			newExc.initCause(e);//这种异常是由DrunkException造成的
			throw newExc;
			//RuntimeException newExc= new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		try {
			new ChainDrunkExceptionTest().test2();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
