/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.xslttest.controller;

import com.mycompany.xslttest.pojo.Cat;
import com.mycompany.xslttest.service.TestService;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author COSH
 */
@Controller
@RequestMapping("/")
public class TestController {
	
	@Autowired
	private TestService testService;

	@GetMapping("/")
	@ResponseBody
	public String indexInfo() {
		return "welcome";
	}

	@GetMapping("/fromTest")
	@ResponseBody
	public void xmlTest(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = null;

			documentBuilder = builderFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			Element html = document.createElement("HTML");
			Element header = document.createElement("HEADER");
			Element body = document.createElement("BODY");
			html.appendChild(header);
			html.appendChild(body);

			Element from = document.createElement("FORM");
			body.appendChild(from);

			Element nameTag = document.createElement("SPAN");
			nameTag.setTextContent("姓名");
			Element nameInput = document.createElement("INPUT");
			nameInput.setAttribute("type", "text");
			from.appendChild(nameTag);
			from.appendChild(nameInput);
			from.appendChild(document.createElement("BR"));

			Element sexTeg = document.createElement("SPAN");
			sexTeg.setTextContent("性別");
			Element sexInput1 = document.createElement("INPUT");
			sexInput1.setAttribute("type", "radio");
			sexInput1.setAttribute("name", "sex");
			sexInput1.setTextContent("男");
			Element sexInput2 = document.createElement("INPUT");
			sexInput2.setAttribute("type", "radio");
			sexInput2.setAttribute("name", "sex");
			sexInput2.setTextContent("女");

			from.appendChild(sexTeg);
			from.appendChild(sexInput1);
			from.appendChild(sexInput2);
			from.appendChild(document.createElement("BR"));

			Element rankTag = document.createElement("SPAN");
			rankTag.setTextContent("地區");
			Element rankInput1 = document.createElement("INPUT");
			rankInput1.setAttribute("type", "checkbox");
			rankInput1.setTextContent("P區");
			Element rankInput2 = document.createElement("INPUT");
			rankInput2.setAttribute("type", "checkbox");
			rankInput2.setTextContent("B區");
			Element rankInput3 = document.createElement("INPUT");
			rankInput3.setAttribute("type", "checkbox");
			rankInput3.setTextContent("C區");

			from.appendChild(rankTag);
			from.appendChild(rankInput1);
			from.appendChild(rankInput2);
			from.appendChild(rankInput3);
			from.appendChild(document.createElement("BR"));

			Element fileInput = document.createElement("INPUT");
			fileInput.setAttribute("type", "file");
			from.appendChild(fileInput);
			from.appendChild(document.createElement("BR"));

			Element button1 = document.createElement("BUTTON");
			button1.setTextContent("取消");
			button1.setAttribute("type", "reset");
			Element button2 = document.createElement("BUTTON");
			button2.setTextContent("確定");
			button2.setAttribute("type", "submit");
			from.appendChild(button1);
			from.appendChild(button2);

			document.appendChild(html);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			transformer.transform(new DOMSource(document), new StreamResult(out));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@GetMapping("/xsltTest")
	@ResponseBody
	public void xsltTest(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			DocumentBuilderFactory documentBuilderFactory
				= DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder
				= documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			Element root = document.createElement("root");
			document.appendChild(root);
			Element cats = document.createElement("cats");
			root.appendChild(cats);
			
			List<Cat> catList = new ArrayList<Cat>();
			catList.add(new Cat(1L, "小白", "黑色", testService.getRandomAge(15)));
			catList.add(new Cat(2L, "小黑", "白色", testService.getRandomAge(15)));
			catList.add(new Cat(3L, "小花", "黑底白斑", testService.getRandomAge(15)));
			catList.add(new Cat(4L, "子軒", "黃色", testService.getRandomAge(15)));
			catList.add(new Cat(5L, "冷氣遙控器", "藍色", testService.getRandomAge(15)));
			
			for(Cat cat:catList){
				Element catElement = document.createElement("cat");
				Element catId = document.createElement("id");
				catId.setTextContent(cat.getId().toString());
				Element catName = document.createElement("name");
				catName.setTextContent(cat.getName());
				Element catColor = document.createElement("color");
				catColor.setTextContent(cat.getColor());
				Element catAge = document.createElement("age");
				catAge.setTextContent(cat.getAge().toString());
				catElement.appendChild(catId);
				catElement.appendChild(catName);
				catElement.appendChild(catColor);
				catElement.appendChild(catAge);
				cats.appendChild(catElement);
			}
			
			TransformerFactory transformerFactory
				= TransformerFactory.newInstance();
			StreamSource xslSource
				= new StreamSource(request.getRealPath("/WEB-INF/xsl/TestXSL.xsl"));
			Transformer transformer = transformerFactory.newTransformer(xslSource);
			transformer.transform(new DOMSource(document), new StreamResult(out));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
