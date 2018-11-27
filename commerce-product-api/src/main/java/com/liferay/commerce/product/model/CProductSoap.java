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

package com.liferay.commerce.product.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Marco Leo
 * @generated
 */
@ProviderType
public class CProductSoap implements Serializable {
	public static CProductSoap toSoapModel(CProduct model) {
		CProductSoap soapModel = new CProductSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCProductId(model.getCProductId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDraftDefinitionId(model.getDraftDefinitionId());
		soapModel.setPublishedDefinitionId(model.getPublishedDefinitionId());

		return soapModel;
	}

	public static CProductSoap[] toSoapModels(CProduct[] models) {
		CProductSoap[] soapModels = new CProductSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CProductSoap[][] toSoapModels(CProduct[][] models) {
		CProductSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CProductSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CProductSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CProductSoap[] toSoapModels(List<CProduct> models) {
		List<CProductSoap> soapModels = new ArrayList<CProductSoap>(models.size());

		for (CProduct model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CProductSoap[soapModels.size()]);
	}

	public CProductSoap() {
	}

	public long getPrimaryKey() {
		return _CProductId;
	}

	public void setPrimaryKey(long pk) {
		setCProductId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCProductId() {
		return _CProductId;
	}

	public void setCProductId(long CProductId) {
		_CProductId = CProductId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getDraftDefinitionId() {
		return _draftDefinitionId;
	}

	public void setDraftDefinitionId(long draftDefinitionId) {
		_draftDefinitionId = draftDefinitionId;
	}

	public long getPublishedDefinitionId() {
		return _publishedDefinitionId;
	}

	public void setPublishedDefinitionId(long publishedDefinitionId) {
		_publishedDefinitionId = publishedDefinitionId;
	}

	private String _uuid;
	private long _CProductId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _draftDefinitionId;
	private long _publishedDefinitionId;
}