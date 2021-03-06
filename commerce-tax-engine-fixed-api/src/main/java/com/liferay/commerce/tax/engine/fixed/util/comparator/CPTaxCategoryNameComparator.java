/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.commerce.tax.engine.fixed.util.comparator;

import com.liferay.commerce.product.model.CPTaxCategory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringUtil;

/**
 * @author Marco Leo
 */
public class CPTaxCategoryNameComparator
	extends OrderByComparator<CPTaxCategory> {

	public static final String ORDER_BY_ASC = "CPTaxCategory.name ASC";

	public static final String ORDER_BY_DESC = "CPTaxCategory.name DESC";

	public static final String[] ORDER_BY_FIELDS = {"name"};

	public CPTaxCategoryNameComparator() {
		this(false);
	}

	public CPTaxCategoryNameComparator(boolean ascending) {
		_ascending = ascending;
	}

	@Override
	public int compare(
		CPTaxCategory cpTaxCategory1, CPTaxCategory cpTaxCategory2) {

		String name1 = StringUtil.toLowerCase(cpTaxCategory1.getName());
		String name2 = StringUtil.toLowerCase(cpTaxCategory2.getName());

		int value = name1.compareTo(name2);

		if (_ascending) {
			return value;
		}

		return Math.negateExact(value);
	}

	@Override
	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		}

		return ORDER_BY_DESC;
	}

	@Override
	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

	@Override
	public boolean isAscending() {
		return _ascending;
	}

	private final boolean _ascending;

}