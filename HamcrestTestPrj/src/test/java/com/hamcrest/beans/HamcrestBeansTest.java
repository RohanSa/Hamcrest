package com.hamcrest.beans;

import static org.junit.Assert.*;

import static org.hamcrest.beans.SamePropertyValuesAs.samePropertyValuesAs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.beans.HasProperty.hasProperty;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
import org.junit.Test;
import com.dto.PersonDTO;

public class HamcrestBeansTest {

	@Test
	public void hasPropertyTest() {
		PersonDTO personDTO = new PersonDTO(1, "Abc", 150000.50);

		assertThat(personDTO, hasProperty("name"));

	}

	@Test
	public void hasPropertyWithValueTest() {
		PersonDTO personDTO = new PersonDTO(1, "Abc", 150000.50);

		assertThat(personDTO, hasProperty("name", equalTo("Abc")));

	}

	@Test
	public void samePropertyValuesAsTest() {
		PersonDTO personDTO = new PersonDTO(1, "Abc", 150000.50);

		PersonDTO expectedpersonDTO = new PersonDTO(1, "Abc", 150000.50);
		assertThat(personDTO, is(samePropertyValuesAs(expectedpersonDTO)));
	}

	 
}
