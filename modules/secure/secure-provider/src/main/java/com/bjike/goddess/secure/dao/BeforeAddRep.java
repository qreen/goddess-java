package com.bjike.goddess.secure.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.secure.dto.BeforeAddDTO;
import com.bjike.goddess.secure.entity.BeforeAdd;

/**
* 增员前持久化接口, 继承基类可使用ｊｐａ命名查询
* @Author:			[ chenjunhao ]
* @Date:			[  2017-04-27 10:10 ]
* @Description:	[ 增员前持久化接口, 继承基类可使用ｊｐａ命名查询 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface BeforeAddRep extends JpaRep<BeforeAdd,BeforeAddDTO> {

 }