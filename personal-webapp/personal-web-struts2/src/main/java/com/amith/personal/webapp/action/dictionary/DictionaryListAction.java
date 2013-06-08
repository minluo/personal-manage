package com.amith.personal.webapp.action.dictionary;

import java.util.List;

import org.apache.struts2.convention.annotation.Result;

import com.amith.personal.domain.Dictionary;
import com.amith.personal.webapp.action.BaseAction;

/**
 * 字典列表
 * 
 * @author amith
 * 
 */
@Result(name = "success", type = "json")
public class DictionaryListAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private List<Dictionary> dictionaries;
	
	public String execute() throws Exception {
		dictionaries = Dictionary.findAll(Dictionary.class);
		return SUCCESS;
	}

	public List<Dictionary> getDictionaries() {
		return dictionaries;
	}
	
}
