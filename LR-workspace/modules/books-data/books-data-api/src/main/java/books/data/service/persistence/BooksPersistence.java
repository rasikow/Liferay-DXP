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

package books.data.service.persistence;

import aQute.bnd.annotation.ProviderType;

import books.data.exception.NoSuchBooksException;

import books.data.model.Books;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the books service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zubair
 * @see books.data.service.persistence.impl.BooksPersistenceImpl
 * @see BooksUtil
 * @generated
 */
@ProviderType
public interface BooksPersistence extends BasePersistence<Books> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BooksUtil} to access the books persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the bookses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching bookses
	*/
	public java.util.List<Books> findByUuid(String uuid);

	/**
	* Returns a range of all the bookses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @return the range of matching bookses
	*/
	public java.util.List<Books> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the bookses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookses
	*/
	public java.util.List<Books> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator);

	/**
	* Returns an ordered range of all the bookses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookses
	*/
	public java.util.List<Books> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first books in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching books
	* @throws NoSuchBooksException if a matching books could not be found
	*/
	public Books findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator)
		throws NoSuchBooksException;

	/**
	* Returns the first books in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching books, or <code>null</code> if a matching books could not be found
	*/
	public Books fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator);

	/**
	* Returns the last books in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching books
	* @throws NoSuchBooksException if a matching books could not be found
	*/
	public Books findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator)
		throws NoSuchBooksException;

	/**
	* Returns the last books in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching books, or <code>null</code> if a matching books could not be found
	*/
	public Books fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator);

	/**
	* Returns the bookses before and after the current books in the ordered set where uuid = &#63;.
	*
	* @param bookId the primary key of the current books
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next books
	* @throws NoSuchBooksException if a books with the primary key could not be found
	*/
	public Books[] findByUuid_PrevAndNext(long bookId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator)
		throws NoSuchBooksException;

	/**
	* Removes all the bookses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of bookses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching bookses
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the books where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchBooksException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching books
	* @throws NoSuchBooksException if a matching books could not be found
	*/
	public Books findByUUID_G(String uuid, long groupId)
		throws NoSuchBooksException;

	/**
	* Returns the books where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching books, or <code>null</code> if a matching books could not be found
	*/
	public Books fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the books where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching books, or <code>null</code> if a matching books could not be found
	*/
	public Books fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the books where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the books that was removed
	*/
	public Books removeByUUID_G(String uuid, long groupId)
		throws NoSuchBooksException;

	/**
	* Returns the number of bookses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching bookses
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the bookses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching bookses
	*/
	public java.util.List<Books> findByUuid_C(String uuid, long companyId);

	/**
	* Returns a range of all the bookses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @return the range of matching bookses
	*/
	public java.util.List<Books> findByUuid_C(String uuid, long companyId,
		int start, int end);

	/**
	* Returns an ordered range of all the bookses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookses
	*/
	public java.util.List<Books> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator);

	/**
	* Returns an ordered range of all the bookses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookses
	*/
	public java.util.List<Books> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first books in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching books
	* @throws NoSuchBooksException if a matching books could not be found
	*/
	public Books findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator)
		throws NoSuchBooksException;

	/**
	* Returns the first books in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching books, or <code>null</code> if a matching books could not be found
	*/
	public Books fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator);

	/**
	* Returns the last books in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching books
	* @throws NoSuchBooksException if a matching books could not be found
	*/
	public Books findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator)
		throws NoSuchBooksException;

	/**
	* Returns the last books in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching books, or <code>null</code> if a matching books could not be found
	*/
	public Books fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator);

	/**
	* Returns the bookses before and after the current books in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param bookId the primary key of the current books
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next books
	* @throws NoSuchBooksException if a books with the primary key could not be found
	*/
	public Books[] findByUuid_C_PrevAndNext(long bookId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator)
		throws NoSuchBooksException;

	/**
	* Removes all the bookses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of bookses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching bookses
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the bookses where title = &#63;.
	*
	* @param title the title
	* @return the matching bookses
	*/
	public java.util.List<Books> findByTitle(String title);

	/**
	* Returns a range of all the bookses where title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param title the title
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @return the range of matching bookses
	*/
	public java.util.List<Books> findByTitle(String title, int start, int end);

	/**
	* Returns an ordered range of all the bookses where title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param title the title
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookses
	*/
	public java.util.List<Books> findByTitle(String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator);

	/**
	* Returns an ordered range of all the bookses where title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param title the title
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookses
	*/
	public java.util.List<Books> findByTitle(String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first books in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching books
	* @throws NoSuchBooksException if a matching books could not be found
	*/
	public Books findByTitle_First(String title,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator)
		throws NoSuchBooksException;

	/**
	* Returns the first books in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching books, or <code>null</code> if a matching books could not be found
	*/
	public Books fetchByTitle_First(String title,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator);

	/**
	* Returns the last books in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching books
	* @throws NoSuchBooksException if a matching books could not be found
	*/
	public Books findByTitle_Last(String title,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator)
		throws NoSuchBooksException;

	/**
	* Returns the last books in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching books, or <code>null</code> if a matching books could not be found
	*/
	public Books fetchByTitle_Last(String title,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator);

	/**
	* Returns the bookses before and after the current books in the ordered set where title = &#63;.
	*
	* @param bookId the primary key of the current books
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next books
	* @throws NoSuchBooksException if a books with the primary key could not be found
	*/
	public Books[] findByTitle_PrevAndNext(long bookId, String title,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator)
		throws NoSuchBooksException;

	/**
	* Removes all the bookses where title = &#63; from the database.
	*
	* @param title the title
	*/
	public void removeByTitle(String title);

	/**
	* Returns the number of bookses where title = &#63;.
	*
	* @param title the title
	* @return the number of matching bookses
	*/
	public int countByTitle(String title);

	/**
	* Returns all the bookses where author = &#63;.
	*
	* @param author the author
	* @return the matching bookses
	*/
	public java.util.List<Books> findByAuthor(String author);

	/**
	* Returns a range of all the bookses where author = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param author the author
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @return the range of matching bookses
	*/
	public java.util.List<Books> findByAuthor(String author, int start, int end);

	/**
	* Returns an ordered range of all the bookses where author = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param author the author
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookses
	*/
	public java.util.List<Books> findByAuthor(String author, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator);

	/**
	* Returns an ordered range of all the bookses where author = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param author the author
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookses
	*/
	public java.util.List<Books> findByAuthor(String author, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first books in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching books
	* @throws NoSuchBooksException if a matching books could not be found
	*/
	public Books findByAuthor_First(String author,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator)
		throws NoSuchBooksException;

	/**
	* Returns the first books in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching books, or <code>null</code> if a matching books could not be found
	*/
	public Books fetchByAuthor_First(String author,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator);

	/**
	* Returns the last books in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching books
	* @throws NoSuchBooksException if a matching books could not be found
	*/
	public Books findByAuthor_Last(String author,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator)
		throws NoSuchBooksException;

	/**
	* Returns the last books in the ordered set where author = &#63;.
	*
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching books, or <code>null</code> if a matching books could not be found
	*/
	public Books fetchByAuthor_Last(String author,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator);

	/**
	* Returns the bookses before and after the current books in the ordered set where author = &#63;.
	*
	* @param bookId the primary key of the current books
	* @param author the author
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next books
	* @throws NoSuchBooksException if a books with the primary key could not be found
	*/
	public Books[] findByAuthor_PrevAndNext(long bookId, String author,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator)
		throws NoSuchBooksException;

	/**
	* Removes all the bookses where author = &#63; from the database.
	*
	* @param author the author
	*/
	public void removeByAuthor(String author);

	/**
	* Returns the number of bookses where author = &#63;.
	*
	* @param author the author
	* @return the number of matching bookses
	*/
	public int countByAuthor(String author);

	/**
	* Returns the books where author = &#63; and title = &#63; or throws a {@link NoSuchBooksException} if it could not be found.
	*
	* @param author the author
	* @param title the title
	* @return the matching books
	* @throws NoSuchBooksException if a matching books could not be found
	*/
	public Books findByAuthorAndTitle(String author, String title)
		throws NoSuchBooksException;

	/**
	* Returns the books where author = &#63; and title = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param author the author
	* @param title the title
	* @return the matching books, or <code>null</code> if a matching books could not be found
	*/
	public Books fetchByAuthorAndTitle(String author, String title);

	/**
	* Returns the books where author = &#63; and title = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param author the author
	* @param title the title
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching books, or <code>null</code> if a matching books could not be found
	*/
	public Books fetchByAuthorAndTitle(String author, String title,
		boolean retrieveFromCache);

	/**
	* Removes the books where author = &#63; and title = &#63; from the database.
	*
	* @param author the author
	* @param title the title
	* @return the books that was removed
	*/
	public Books removeByAuthorAndTitle(String author, String title)
		throws NoSuchBooksException;

	/**
	* Returns the number of bookses where author = &#63; and title = &#63;.
	*
	* @param author the author
	* @param title the title
	* @return the number of matching bookses
	*/
	public int countByAuthorAndTitle(String author, String title);

	/**
	* Caches the books in the entity cache if it is enabled.
	*
	* @param books the books
	*/
	public void cacheResult(Books books);

	/**
	* Caches the bookses in the entity cache if it is enabled.
	*
	* @param bookses the bookses
	*/
	public void cacheResult(java.util.List<Books> bookses);

	/**
	* Creates a new books with the primary key. Does not add the books to the database.
	*
	* @param bookId the primary key for the new books
	* @return the new books
	*/
	public Books create(long bookId);

	/**
	* Removes the books with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookId the primary key of the books
	* @return the books that was removed
	* @throws NoSuchBooksException if a books with the primary key could not be found
	*/
	public Books remove(long bookId) throws NoSuchBooksException;

	public Books updateImpl(Books books);

	/**
	* Returns the books with the primary key or throws a {@link NoSuchBooksException} if it could not be found.
	*
	* @param bookId the primary key of the books
	* @return the books
	* @throws NoSuchBooksException if a books with the primary key could not be found
	*/
	public Books findByPrimaryKey(long bookId) throws NoSuchBooksException;

	/**
	* Returns the books with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookId the primary key of the books
	* @return the books, or <code>null</code> if a books with the primary key could not be found
	*/
	public Books fetchByPrimaryKey(long bookId);

	@Override
	public java.util.Map<java.io.Serializable, Books> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the bookses.
	*
	* @return the bookses
	*/
	public java.util.List<Books> findAll();

	/**
	* Returns a range of all the bookses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @return the range of bookses
	*/
	public java.util.List<Books> findAll(int start, int end);

	/**
	* Returns an ordered range of all the bookses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bookses
	*/
	public java.util.List<Books> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator);

	/**
	* Returns an ordered range of all the bookses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BooksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookses
	* @param end the upper bound of the range of bookses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bookses
	*/
	public java.util.List<Books> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Books> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the bookses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of bookses.
	*
	* @return the number of bookses
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}