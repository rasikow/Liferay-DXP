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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Books service. Represents a row in the &quot;ZU_Books&quot; database table, with each column mapped to a property of this class.
 *
 * @author zubair
 * @see BooksModel
 * @see books.data.model.impl.BooksImpl
 * @see books.data.model.impl.BooksModelImpl
 * @generated
 */
@ImplementationClassName("books.data.model.impl.BooksImpl")
@ProviderType
public interface Books extends BooksModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link books.data.model.impl.BooksImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Books, Long> BOOK_ID_ACCESSOR = new Accessor<Books, Long>() {
			@Override
			public Long get(Books books) {
				return books.getBookId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Books> getTypeClass() {
				return Books.class;
			}
		};
}