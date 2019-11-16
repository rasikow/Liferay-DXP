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

package books.data.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Books}.
 * </p>
 *
 * @author zubair
 * @see Books
 * @generated
 */
@ProviderType
public class BooksWrapper implements Books, ModelWrapper<Books> {
	public BooksWrapper(Books books) {
		_books = books;
	}

	@Override
	public Class<?> getModelClass() {
		return Books.class;
	}

	@Override
	public String getModelClassName() {
		return Books.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bookId", getBookId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("author", getAuthor());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}
	}

	@Override
	public Object clone() {
		return new BooksWrapper((Books)_books.clone());
	}

	@Override
	public int compareTo(Books books) {
		return _books.compareTo(books);
	}

	/**
	* Returns the author of this books.
	*
	* @return the author of this books
	*/
	@Override
	public String getAuthor() {
		return _books.getAuthor();
	}

	/**
	* Returns the book ID of this books.
	*
	* @return the book ID of this books
	*/
	@Override
	public long getBookId() {
		return _books.getBookId();
	}

	/**
	* Returns the company ID of this books.
	*
	* @return the company ID of this books
	*/
	@Override
	public long getCompanyId() {
		return _books.getCompanyId();
	}

	/**
	* Returns the create date of this books.
	*
	* @return the create date of this books
	*/
	@Override
	public Date getCreateDate() {
		return _books.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _books.getExpandoBridge();
	}

	/**
	* Returns the group ID of this books.
	*
	* @return the group ID of this books
	*/
	@Override
	public long getGroupId() {
		return _books.getGroupId();
	}

	/**
	* Returns the modified date of this books.
	*
	* @return the modified date of this books
	*/
	@Override
	public Date getModifiedDate() {
		return _books.getModifiedDate();
	}

	/**
	* Returns the primary key of this books.
	*
	* @return the primary key of this books
	*/
	@Override
	public long getPrimaryKey() {
		return _books.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _books.getPrimaryKeyObj();
	}

	/**
	* Returns the title of this books.
	*
	* @return the title of this books
	*/
	@Override
	public String getTitle() {
		return _books.getTitle();
	}

	/**
	* Returns the user ID of this books.
	*
	* @return the user ID of this books
	*/
	@Override
	public long getUserId() {
		return _books.getUserId();
	}

	/**
	* Returns the user name of this books.
	*
	* @return the user name of this books
	*/
	@Override
	public String getUserName() {
		return _books.getUserName();
	}

	/**
	* Returns the user uuid of this books.
	*
	* @return the user uuid of this books
	*/
	@Override
	public String getUserUuid() {
		return _books.getUserUuid();
	}

	/**
	* Returns the uuid of this books.
	*
	* @return the uuid of this books
	*/
	@Override
	public String getUuid() {
		return _books.getUuid();
	}

	@Override
	public int hashCode() {
		return _books.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _books.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _books.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _books.isNew();
	}

	@Override
	public void persist() {
		_books.persist();
	}

	/**
	* Sets the author of this books.
	*
	* @param author the author of this books
	*/
	@Override
	public void setAuthor(String author) {
		_books.setAuthor(author);
	}

	/**
	* Sets the book ID of this books.
	*
	* @param bookId the book ID of this books
	*/
	@Override
	public void setBookId(long bookId) {
		_books.setBookId(bookId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_books.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this books.
	*
	* @param companyId the company ID of this books
	*/
	@Override
	public void setCompanyId(long companyId) {
		_books.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this books.
	*
	* @param createDate the create date of this books
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_books.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_books.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_books.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_books.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this books.
	*
	* @param groupId the group ID of this books
	*/
	@Override
	public void setGroupId(long groupId) {
		_books.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this books.
	*
	* @param modifiedDate the modified date of this books
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_books.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_books.setNew(n);
	}

	/**
	* Sets the primary key of this books.
	*
	* @param primaryKey the primary key of this books
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_books.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_books.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the title of this books.
	*
	* @param title the title of this books
	*/
	@Override
	public void setTitle(String title) {
		_books.setTitle(title);
	}

	/**
	* Sets the user ID of this books.
	*
	* @param userId the user ID of this books
	*/
	@Override
	public void setUserId(long userId) {
		_books.setUserId(userId);
	}

	/**
	* Sets the user name of this books.
	*
	* @param userName the user name of this books
	*/
	@Override
	public void setUserName(String userName) {
		_books.setUserName(userName);
	}

	/**
	* Sets the user uuid of this books.
	*
	* @param userUuid the user uuid of this books
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_books.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this books.
	*
	* @param uuid the uuid of this books
	*/
	@Override
	public void setUuid(String uuid) {
		_books.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Books> toCacheModel() {
		return _books.toCacheModel();
	}

	@Override
	public Books toEscapedModel() {
		return new BooksWrapper(_books.toEscapedModel());
	}

	@Override
	public String toString() {
		return _books.toString();
	}

	@Override
	public Books toUnescapedModel() {
		return new BooksWrapper(_books.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _books.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BooksWrapper)) {
			return false;
		}

		BooksWrapper booksWrapper = (BooksWrapper)obj;

		if (Objects.equals(_books, booksWrapper._books)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _books.getStagedModelType();
	}

	@Override
	public Books getWrappedModel() {
		return _books;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _books.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _books.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_books.resetOriginalValues();
	}

	private final Books _books;
}