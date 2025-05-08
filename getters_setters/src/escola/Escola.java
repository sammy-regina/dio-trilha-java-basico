package escola;

public class Escola {
	public static void main(String[]args) {
		Aluno felipe = new Aluno();
		
		felipe.setNome("Pedro");
		felipe.setIdade(17);
		
		System.out.println("O aluno "  + felipe.getNome() + " tem " + felipe.getIdade() + " de idade." );
	}
}
