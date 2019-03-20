
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controle.ControleAluno;
import entidade.Aluno;

@WebServlet("/Inicial")
public class Inicial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Inicial() {
		super();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		System.out.println("Acionado o método GET");
		String Nome = request.getParameter("nom");
		String Fone = request.getParameter("fon");
		
		ControleAluno.AddAluno(new Aluno(Nome, Fone));
		

		PrintWriter saida = response.getWriter();
		saida.println("Nome recebido: " + Nome);
		saida.println("Telefone: " + Fone);
		saida.println("Recebido pelo método GET");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Acionado o método POST");

		String Tipo = request.getParameter("tipo");
		String Nome = request.getParameter("nom");
		String Fone = request.getParameter("fon");

		PrintWriter saida = response.getWriter();

		if (Tipo.equals("funcionário"))
			saida.println("Cadastro para Funcionário");

		if (Tipo.equals("aluno"))
			saida.println("Cadastro para Aluno");

		saida.println("Nome recebido: " + Nome);
		saida.println("Telefone: " + Fone);
		saida.println("Recebido pelo método POST");
	}

}
