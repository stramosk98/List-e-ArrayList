import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ListaPessoa l = new ListaPessoa();
		
		Pessoa p = new Pessoa("str", "str@mail.com", "28/05/1900");
		l.add(p);
		
		p = new Pessoa("Tereza1", "tereza1@email.com", "12/02/1950");
		l.add(p);
		
		p = new Pessoa("Tereza", "tereze@email.com", "12/03/1960");
		l.add(p);
		
		p = new Pessoa("Tereza", "terezona@email.com", "22/10/1985");
		l.add(p);
		
		p = new Pessoa("Pedro", "pedro@email.com", "18/08/1999");
		l.add(p);
		
		p = new Pessoa("Maria", "Maria@email.com", "10/05/2005");
		l.add(p);
		
		l.del("ast");
		
		l.alt(0, "Jorge", "jorge@mail.com", "24/12/2004");
	
		List<Pessoa> lista = l.getLista();
		
		for(Pessoa item : lista) {
			System.out.println(item.toString());
		}
		
		System.out.println(l.buscarEmail());
			
		System.out.println(l.idade(1));
		
		System.out.println(l.buscarIdadeMaior(20));
		
		System.out.println(l.aniversario(8));
		
	}
}
