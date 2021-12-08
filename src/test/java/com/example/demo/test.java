package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		countA test =new countA();
		int output = test.countA("alphabet");
		assertEquals(2,output);

	}

}
