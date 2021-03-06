package com.zving.declarationform.tax.schema;

import java.util.List;

import com.zving.declarationform.tax.model.TaxRate;

/**
 * 税率服务
 * 
 * @author 王育春
 * @mail wyuch@zving.com
 * @date 2017年10月18日
 */
public interface TaxRateService {
	/**
	 * 添加税率规则
	 */
	String add(TaxRate rate);

	/**
	 * 修改税率规则
	 */
	String update(TaxRate rate);

	/**
	 * 删除税率规则
	 */
	String delete(String goodsType);

	/**
	 * 获取指定商品类型下的税率规则
	 */
	TaxRate get(String goodsType);

	/**
	 * 获取所有税率规则
	 */
	List<TaxRate> list();
}
