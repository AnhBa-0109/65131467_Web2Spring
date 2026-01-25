

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/testdoPost")
public class testdoPost extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			response.setCharacterEncoding("utf-8");
			PrintWriter traVe = response.getWriter();
			
			traVe.append("Ban vua gui yeu cau dang GET, day la dap ung cua toi");
			String noiDungHTML = "<form method = POST action = \"/ViDuHelloWorldServlet/testdoPost\""
						+ 		"	<label>Ho: </label>"
						+ 		"<input type=\"text\" name=\"fname\" ><br>\r\n"
						+ 		"<label>Ten: </label>"
						+ 		"<input type=\"text\" name=\"lname\"><br>"
						+ 		"<input type=\"submit\" value=\"Gui di\">"
						+ "</form>";
			traVe.append(noiDungHTML);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
