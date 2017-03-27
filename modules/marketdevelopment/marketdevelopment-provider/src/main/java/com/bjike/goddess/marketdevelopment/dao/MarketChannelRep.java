package com.bjike.goddess.marketdevelopment.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.marketdevelopment.dto.MarketChannelDTO;
import com.bjike.goddess.marketdevelopment.entity.MarketChannel;

/**
* 市场挖掘持久化接口, 继承基类可使用ｊｐａ命名查询
* @Author:			[ dengjunren ]
* @Date:			[  2017-03-22 07:15 ]
* @Description:	[ 市场挖掘持久化接口, 继承基类可使用ｊｐａ命名查询 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface MarketChannelRep extends JpaRep<MarketChannel ,MarketChannelDTO> { 

 }