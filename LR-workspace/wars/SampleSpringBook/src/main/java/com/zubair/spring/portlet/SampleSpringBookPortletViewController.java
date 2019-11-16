package com.zubair.spring.portlet;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.itextpdf.text.pdf.PdfAnnotation;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;

import books.data.model.Books;
import books.data.service.BooksLocalService;
import books.data.service.BooksLocalServiceUtil;

/**
 * @author rasik
 */
@Controller
@RequestMapping("VIEW")
public class SampleSpringBookPortletViewController {

	@RenderMapping
	public String view(RenderRequest request, RenderResponse response) {
		System.out.println(">>>>new itext jar>>>>>>>>>"+PdfAnnotation.AA_BLUR);
	
		try {
			System.out.println(">>>>adding books>>>>>>>>>");
			
			
			long bookId = CounterLocalServiceUtil.increment(Books.class.getName());
			System.out.println(">>>>bookId >>>>>>>>>"+bookId);
		//	System.out.println(">>>>total books >>>>>>>>>"+_booksLocalService.getBooksesCount());
			Books books = BooksLocalServiceUtil.createBooks(bookId);
		
			books.setAuthor("Rasikow");
			books.setTitle("Thokkam Vitra Kaasugal");
			BooksLocalServiceUtil.addBooks(books);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("exception:"+e.getMessage());
			
		}
		return "view";
	}
	
	@Reference(cardinality=ReferenceCardinality.MANDATORY)
	protected BooksLocalService _booksLocalService;
}