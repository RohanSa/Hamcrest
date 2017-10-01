package com.hamcrest.object;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.object.HasToString.*;
import static org.hamcrest.object.IsCompatibleType.*;

public class HamcrestObjectTest {

	@Test
	public void hasToStringTest() {

		assertThat(Boolean.TRUE, hasToString(equalTo("true")));
	}

	@Test
	public void typeCompatibleWithTest(){
		
		assertThat(Double.class, typeCompatibleWith(Number.class));
	}

}
