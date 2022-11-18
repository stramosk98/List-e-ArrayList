import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ListaPessoa {
	
	private List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}
	
	public boolean add(Pessoa pessoa) {
		if(pessoa.getNome() != null) {
			if(pessoa.getNome().length() < 3) {
//				pessoa.setNome(null);
				return false;
		}
				for (int i = 0; i < lista.size(); i++) {
				
				if(lista.get(i).getNome().equalsIgnoreCase(pessoa.getNome()))
				return false;
			}
		}
		
		lista.add(pessoa);
		return true;
	}
	
	public boolean del(String nome) {
		if(nome != null) {
			for (int i = 0; i < lista.size(); i++) {
				if(lista.get(i).getNome().equalsIgnoreCase(nome)) {
					lista.remove(lista.get(i));
				}
			}
			return true;
		}
		return false;
	}
	
	public boolean alt(int index, String nome, String email, String data) {
		if(lista.get(index) != null && nome != null && email != null) {
			
			//Verifica se o nome já existe na lista
			for (int i = 0; i < lista.size(); i++) {
				if(lista.get(i).getNome().equalsIgnoreCase(nome))
					return false;
			}
			
			lista.get(index).setNome(nome);
			lista.get(index).setEmail(email);
			lista.get(index).setNascimento(data);
			
			return true;
		}
		
		return false;
	}
	
	public String buscarEmail() {
		String emails = "";
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getEmail() != null)
				emails += lista.get(i).getEmail() + "\n";
		}
		
		return emails;
	}
	
	public String idade(int index) {
		Calendar calendario = Calendar.getInstance();
		int anoAtual = calendario.get(Calendar.YEAR);
		int mesAtual = calendario.get(Calendar.MONTH) +1;
		
		if(lista.get(index).getNascimento() != null) {
			String auxAno = String.valueOf(lista.get(index).getNascimento().charAt(6) + "" + lista.get(index).getNascimento().charAt(7) + "" + lista.get(index).getNascimento().charAt(8) + "" + lista.get(index).getNascimento().charAt(9));
			int ano = Integer.parseInt(auxAno);
			
			String auxMes = String.valueOf(lista.get(index).getNascimento().charAt(3) + "" + lista.get(index).getNascimento().charAt(4));
			int mes = Integer.parseInt(auxMes);
			
			if(mesAtual < mes) {
				anoAtual--;
			}
		
			return (anoAtual - ano) + " anos";
		}
		
		return null;
	}
	
	public String buscarIdadeMaior(int num) {
		String sum = "";
		int idade = 0;
		
		Calendar calendario = Calendar.getInstance();
		int anoAtual = calendario.get(Calendar.YEAR);
		
		for (int i = 0; i < lista.size(); i++) {
				String auxAno = String.valueOf(lista.get(i).getNascimento().charAt(6) + "" + lista.get(i).getNascimento().charAt(7) + "" + lista.get(i).getNascimento().charAt(8) + "" + lista.get(i).getNascimento().charAt(9));
				int ano = Integer.parseInt(auxAno);
			
				idade = anoAtual - ano ;
				
				if(num < idade) {
					sum += idade + " | ";
				}
			}
		
		return sum;
		}
	
	public String aniversario(int num) {
		String sum = "";
	
		for (int i = 0; i < lista.size(); i++) {
			String auxMes = String.valueOf(lista.get(i).getNascimento().charAt(3) + "" + lista.get(i).getNascimento().charAt(4));
			int mes = Integer.parseInt(auxMes);
			
			if(mes == num) {
				sum += lista.get(i).getNome() + " | ";
		}
		}
		
		return sum;
	}
	
	/**
	 * [X] nao permitir nome iguais ou com menos de 3 letras
	 * [X] buscar todos os domínios de email
	 * [X] remover pelo nome
	 * [X] alterar pessoa
	 * [] fazer uma busca usando 'like' inicial do nome
	 * [X] mostrar idade
	 * [X] buscar idade > ?
	 * [X] aniversariante do mes ? 1 - janeiro, 2 - fevereiro
	 */
}
