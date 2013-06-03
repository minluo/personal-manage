package com.amith.personal.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.amith.query.QueryObject;

/**
 * 字典实体,用于自定义数据
 * 
 * @author amith
 * 
 */
@Entity
@Table(name = "dictionaries")
public class Dictionary extends PersonalAggregateRootEntity {

	private static final long serialVersionUID = 1L;

	private String text;

	private DictionaryCategory category;

	private int sortNum;

	public Dictionary(String text, DictionaryCategory category, int sortNum) {
		this.text = text;
		this.category = category;
		this.sortNum = sortNum;
	}

	public Dictionary() {}

	public static List<Dictionary> findByCategory(DictionaryCategory category) {
		return getRepository().find(QueryObject.create(Dictionary.class).eq("category", category));
	}
	
	@Column(nullable = false)
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Column(name = "sort_num")
	public int getSortNum() {
		return sortNum;
	}

	public void setSortNum(int sortNum) {
		this.sortNum = sortNum;
	}

	@Enumerated(value = EnumType.STRING)
	@Column(nullable = false)
	public DictionaryCategory getCategory() {
		return category;
	}

	public void setCategory(DictionaryCategory category) {
		this.category = category;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Dictionary)) {
			return false;
		}
		Dictionary that = (Dictionary) other;
		return new EqualsBuilder().append(getText(), that.getText()).append(getUsername(), that.getUsername()).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getText()).append(getUsername()).hashCode();
	}

	@Override
	public String toString() {
		return getText();
	}

}
