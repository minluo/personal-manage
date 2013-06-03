package com.amith.personal.domain;

import org.junit.Test;
import static org.junit.Assert.*;

import com.amith.personal.AbstractIntegrationTest;

public class DictionaryTest extends AbstractIntegrationTest {

	@Test
	public void testSave() {
		Dictionary dictionary = new Dictionary("字典测试", DictionaryCategory.INCOME, 100);
		dictionary.save();
		assertEquals(1, Dictionary.findAll(Dictionary.class).size());
		dictionary.remove();
	}
	
	@Test
	public void testFindByCategory() {
		Dictionary dictionary = new Dictionary("字典测试", DictionaryCategory.INCOME, 100);
		Dictionary dictionary2 = new Dictionary("字典测试2", DictionaryCategory.EXPENDITURE, 100);
		dictionary.save();
		dictionary2.save();
		assertEquals(2, Dictionary.findAll(Dictionary.class).size());
		assertEquals(1, Dictionary.findByCategory(DictionaryCategory.INCOME).size());
		dictionary.remove();
		dictionary2.remove();
	}
	
}
