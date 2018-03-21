package simpleform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class form
 */
public class form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public form() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = (String) request.getParameter("name");
		if (name == null) {
			sendNameNotRecievedResponse(response);
			System.out.println("Aqui " + request.getParameter("name"));
		} else {
			sendHelloResponse(response, name);
		}

	}

	private void sendHelloResponse(HttpServletResponse response, String name) throws IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.append("<!doctype html public \"-//w3c//dtd html 4.0" + "transitional//en\">\n");

		pw.append("<html>\n" + "<head><title>Hellow</title></head>\n" + "<body>\n" + "<h1 align = \"center\"> Hello "
				+ name + "!</h1>\n" + "</body>\n" + "</html>");

	}

	private void sendNameNotRecievedResponse(HttpServletResponse response) {
		response.setStatus(HttpServletResponse.SC_BAD_GATEWAY);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
