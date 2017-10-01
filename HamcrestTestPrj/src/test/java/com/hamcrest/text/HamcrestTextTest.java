package com.hamcrest.text;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.text.IsBlankString.blankOrNullString;
import static org.hamcrest.text.IsBlankString.blankString;
import static org.hamcrest.text.IsEmptyString.isEmptyOrNullString;
import static org.hamcrest.text.IsEmptyString.isEmptyString;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;
import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;
import static org.hamcrest.text.MatchesPattern.matchesPattern;
import static org.hamcrest.text.StringContainsInOrder.stringContainsInOrder;

public class HamcrestTextTest {

	@Test
	public void blankorNullStringTest() {
		assertThat(null, is(blankOrNullString()));
	}

	@Test
	public void blankStringTest() {
		assertThat(" ", is(blankString()));
	}

	@Test
	public void emptyorNullStringTest() {
		assertThat(null, is(isEmptyOrNullString()));
	}

	@Test
	public void emptyStringTest() {
		assertThat("", is(isEmptyString()));
	}

	@Test
	public void equalToIgnoringCaseTest() {
		assertThat("ABC", is(equalToIgnoringCase("abc")));
	}

	@Test
	public void equalToIgnoringWhiteSpaceTest() {
		assertThat(" This is ham           crest ", is(equalToIgnoringWhiteSpace("This is ham   crest")));
	}

	@Test
	public void matchesPatternTest() {
		assertThat("Test", matchesPattern("[A-Z][a-z]*"));
	}

	@Test
	public void stringContainsInOrderTest() {
		assertThat("myfoobarbaz", stringContainsInOrder(Arrays.asList("bar", "foo")));

	}
}
