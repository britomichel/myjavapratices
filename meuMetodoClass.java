public class meuMetodoClass {
	
	/* um método (com 2 atributos) que imprime nome e idade */
	static void meuMetodoImp(String nome, int idade) {
		System.out.println("Nome: " + nome + ", Idade: " + idade);
	}
	
	public static void main(String[] args) {
		meuMetodoImp("Alice", 7);
		meuMetodoImp("Michel", 48);
		meuMetodoImp("Cibelle", 56);
	}
	
}