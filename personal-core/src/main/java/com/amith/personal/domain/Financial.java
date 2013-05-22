package com.amith.personal.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 财务实体,个人财务记录、汇总
 * 
 * @author amith
 * 
 */
@Entity
@Table(name = "financials")
public class Financial extends PersonalAggregateRootEntity {

	private static final long serialVersionUID = 1L;

	private DictionaryCategory category;
	
	private String financialItem;
	
	private long money;
	
	private String remark;
	
	private Date happenDate;

	public Financial(DictionaryCategory category, String financialItem, long money, String remark) {
		this.category = category;
		this.financialItem = financialItem;
		this.money = money;
		this.remark = remark;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "happen_date")
	public Date getHappenDate() {
		return happenDate;
	}

	public void setHappenDate(Date happenDate) {
		this.happenDate = happenDate;
	}

	@Enumerated(EnumType.STRING)
	public DictionaryCategory getCategory() {
		return category;
	}

	public void setCategory(DictionaryCategory category) {
		this.category = category;
	}

	@Column(name = "financial_item")
	public String getFinancialItem() {
		return financialItem;
	}

	public void setFinancialItem(String financialItem) {
		this.financialItem = financialItem;
	}
	
}
