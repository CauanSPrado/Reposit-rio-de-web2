package br.edu.ifspcjo.web2.ads.project2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID =1L;
	
	public RegisterServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
			// codificação de caracteres
			req.setCharacterEncoding("UTF-8");
			// obter dados
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String[] options = req.getParameterValues("options");
			String selectedOptions = "";
			for(String option : options) {
				selectedOptions += option + "";
			}

			// gerar resposta
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter Writer = resp.getWriter();
			Writer.println("<!DOCTYPE html>");
			Writer.println("<html lang=\"pt-BR\">");
			Writer.println("<head>");
			Writer.println("\t<meta charset=\"UTF-8\">");
			Writer.println("\t<title>Página Principal</title>");
			Writer.println("</head>");
			Writer.println("<body>");
			Writer.println("\t <h1>Cadastro realizado com sucesso!</h1>");
			Writer.println("\t <h2>Nome: " + name +" </h2>");
			Writer.println("\t <h2>E-mail: " + email +" </h2>");
			Writer.println("\t <h2>Interesses: " + selectedOptions +" </h2>");
			Writer.println("</body>");
			Writer.println("</html>");

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		doGet(req, resp);
	}
}
