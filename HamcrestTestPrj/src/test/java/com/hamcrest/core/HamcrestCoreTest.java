package com.hamcrest.core;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.core.IsAnything.anything;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import static org.hamcrest.core.IsSame.sameInstance;

import org.hamcrest.core.StringContains;
import org.hamcrest.core.StringStartsWith;
import org.junit.Test;

public class HamcrestCoreTest {

	@Test
	public void allOfTest() {

		assertThat("TestValue", allOf(is(equalTo("TestValue")), startsWith("Test")));

	}

	@Test
	public void anyOfTest() {

		assertThat("TestValue", anyOf(is(equalTo("TestValue")), startsWith("Be")));

	}

	@Test
	public void bothTest() {

		assertThat("TestValue", both(is(equalTo("TestValue"))).and(startsWith("Te")));

	}

	@Test
	public void eitherTest() {

		assertThat("TestValue", either(is(equalTo("TestValue"))).or(startsWith("Be")));

	}

	@Test
	public void everyItemTest() {
		assertThat(Arrays.asList("bar", "baz"), everyItem(startsWith("ba")));
	}
	
	@Test
	public void isAnythingTest() {
		assertThat("bar" ,anything("Test Description"));
	}
	
	@Test
	public void hasItemTest() {
		assertThat(Arrays.asList("foo", "bar"), hasItem(startsWith("ba")));
		assertThat(Arrays.asList("foo", "bar"), hasItem("bar"));
	}
	
	@Test
	public void hasItemsTest() {
		assertThat(Arrays.asList("foo", "bar", "baz"), hasItems(endsWith("z"), endsWith("o")));
		assertThat(Arrays.asList("foo", "bar", "baz"), hasItems("baz", "foo"));
	}
	
	@Test
	public void instanceOfTest() {
		assertThat("Str", instanceOf(String.class));
	}
	
	@Test
	public void isNullTest() {
		assertThat(null, is(nullValue()));
	}
	
	@Test
	public void isSameTest() {
		String obj = new String("obj");
		//String obj1= new String("obj1");
		assertThat(obj, sameInstance(obj));
	}
	
	@Test
	public void stringContainsTest() {
		String obj = new String("obj");
		assertThat(obj, StringContains.containsString("bj"));
		
	}
	
	@Test
	public void stringStartsWithTest() {
		String obj = new String("obj");
		//String obj1= new String("obj1");
		assertThat(obj, StringStartsWith.startsWith("o"));
	}
	
	
	
}
