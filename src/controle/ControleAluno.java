package controle;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import entidade.Aluno;

public class ControleAluno {

	private static List<Aluno> ListaAluno = new ArrayList<>();
	
	

	public static void AddAluno(Aluno aluno) {
		ListaAluno.add(aluno);
	}

	public static List<Aluno> getListaAluno() {
		return ListaAluno;
	}

	public static String getArrayJsonAluno() {

		// Passando de ArrayList para Json(String)
		Gson gson = new GsonBuilder().create();
		return gson.toJson(ListaAluno);

	}

}
