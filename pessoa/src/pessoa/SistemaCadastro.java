package pessoa;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("123", "Emanuel");
		
		marcos.setEndereço("RUA DAS MARIAS");
		
		System.out.println(marcos.getNome()+ " - " + marcos.getCpf());
	}
}