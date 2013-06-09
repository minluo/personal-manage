package com.amith.personal.webapp.controller.dictionary;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amith.personal.domain.Dictionary;
import com.amith.personal.domain.DictionaryCategory;
import com.amith.personal.webapp.controller.BaseController;

/**
 * 字典
 * 
 * @author amith
 * 
 */
@Controller
@RequestMapping(value = "/dictionary/")
public class DictionaryController extends BaseController {

	@RequestMapping(value = "findByCategory")
	public @ResponseBody List<Dictionary> findByCategory(String category) {
		if (isNotNull(category)) {
			return Dictionary.findByCategory(DictionaryCategory.valueOf(category));
		}
		return Dictionary.findAll(Dictionary.class);
	}
	
}
