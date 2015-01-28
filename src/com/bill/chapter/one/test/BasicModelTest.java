package com.bill.chapter.one.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bill.chapter.one.BasicModel;

public class BasicModelTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGdc() {
		assertTrue(BasicModel.gdc(24, 32) == 8);
		assertTrue(BasicModel.gdc(24, 60) == 12);
		assertTrue(BasicModel.gdc(319, 377) == 29);
	}

}
