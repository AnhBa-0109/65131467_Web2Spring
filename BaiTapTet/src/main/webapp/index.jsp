<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String yearStr = request.getParameter("year");
	
	try {
	    int year = Integer.parseInt(yearStr);

	    String[] canArray = {"Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ"};

	    String[] chiArray = {"Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi"};
	
	    String can = canArray[year % 10];
	    String chi = chiArray[year % 12];
	    
	    String ketQua = can + " " + chi;
	
	    out.print("success|" + ketQua);
	
	} catch (NumberFormatException e) {

	    out.print("error|Vui lòng nhập một năm sinh hợp lệ (ví dụ: 2004)!");
	}
%>
