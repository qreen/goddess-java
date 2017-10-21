package com.bjike.goddess.financeinit.vo;

/**
* 设置币别表现层对象
* @Author:			[ lijuntao ]
* @Date:			[  2017-10-10 02:17 ]
* @Description:	[ 设置币别表现层对象 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class CurrencyVO { 

/**
* id
*/
 private String  id; 
/**
* 代码
*/
 private String  code; 

/**
* 名称
*/
 private String  name; 

/**
* 记账汇率
*/
 private Double  rate; 

/**
* 是否本位币
*/
 private Boolean  standardMoney; 



 public String getId () { 
 return id;
 } 
 public void setId (String id ) { 
 this.id = id ; 
 } 
 public String getCode () { 
 return code;
 } 
 public void setCode (String code ) { 
 this.code = code ; 
 } 
 public String getName () { 
 return name;
 } 
 public void setName (String name ) { 
 this.name = name ; 
 } 
 public Double getRate () { 
 return rate;
 } 
 public void setRate (Double rate ) { 
 this.rate = rate ; 
 } 
 public Boolean getStandardMoney () { 
 return standardMoney;
 } 
 public void setStandardMoney (Boolean standardMoney ) { 
 this.standardMoney = standardMoney ; 
 } 
 }