package com.bjike.goddess.materialsummary.service;

import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.materialsummary.dto.MaterialClassifyMonthSumDTO;
import com.bjike.goddess.materialsummary.entity.MaterialClassifyMonthSum;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

/**
* 物资分类月汇总业务实现
* @Author:			[ sunfengtao ]
* @Date:			[  2017-05-22 10:46 ]
* @Description:	[ 物资分类月汇总业务实现 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
@CacheConfig(cacheNames ="materialsummarySerCache")
@Service
public class MaterialClassifyMonthSumSerImpl extends ServiceImpl<MaterialClassifyMonthSum, MaterialClassifyMonthSumDTO> implements MaterialClassifyMonthSumSer { 

 }