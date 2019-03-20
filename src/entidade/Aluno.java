package entidade;

public class Aluno {
	private String Nome;
	private String Fone;
	
	
	public Aluno(String nome, String fone) {
		super();
		Nome = nome;
		Fone = fone;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getFone() {
		return Fone;
	}


	public void setFone(String fone) {
		Fone = fone;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Fone == null) ? 0 : Fone.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (Fone == null) {
			if (other.Fone != null)
				return false;
		} else if (!Fone.equals(other.Fone))
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Aluno [Nome=" + Nome + ", Fone=" + Fone + "]";
	}
	
	

}
