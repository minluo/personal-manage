package com.amith.personal.applicaiton.impl;

import org.junit.Test;
import static org.junit.Assert.*;

import com.amith.personal.AbstractIntegrationTest;
import com.amith.personal.domain.Dictionary;
import com.amith.personal.domain.DictionaryCategory;

public class PersonalApplicationImplTest extends AbstractIntegrationTest {

	@Test
	public void testSaveAndRemoveEntity() {
		Dictionary dictionary = new Dictionary("家用", DictionaryCategory.EXPENDITURE, 100);
		personalApplication.saveEntity(dictionary);
		assertEquals(1, Dictionary.findAll(Dictionary.class).size());
		personalApplication.removeEntity(dictionary);
		assertEquals(0, Dictionary.findAll(Dictionary.class).size());
	}
	
}
