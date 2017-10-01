package com.hamcrest.number;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.BigDecimalCloseTo.closeTo;
import static org.hamcrest.number.IsCloseTo.closeTo; 
import static org.hamcrest.number.IsNaN.notANumber;
import static org.hamcrest.number.OrderingComparison.*;
import java.math.BigDecimal;

import org.junit.Test;


public class HamcrestNumberTest {

	@Test
	public void bigDecimalCloseToTest(){
		
		BigDecimal bigDecimal= new BigDecimal(50.25);
		
		assertThat(bigDecimal, is(closeTo(new BigDecimal(49), new BigDecimal(2))));
		
	}
	
	@Test
	public void isCloseToTest(){
		
		double dbl = 50.25;
		
		assertThat(dbl, is(closeTo(46.50,5 )));
		
	}
	
	@Test
	public void isNanTest(){
		
		assertThat(Double.NaN, is(notANumber()));
		
	}
	
	@Test
	public void comparesEqualToTest(){
		
		assertThat(1, comparesEqualTo(1));
		
	}
	@Test
	public void greaterThanTest(){
		
		assertThat(2, is(greaterThan(1)));
		
	}
	@Test
	public void greaterThanOrEqualToTest(){
		
		assertThat(3, is(greaterThanOrEqualTo(3)));
		
	}	
	@Test
	public void lessThanTest(){
		
		assertThat(4, is(lessThan(6)));
		
	}
	@Test
	public void lessThanOrEqualToTest(){
		
		assertThat(5, is(lessThanOrEqualTo(6)));
		
	}
	
}
