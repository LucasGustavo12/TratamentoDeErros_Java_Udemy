package excecao.personalizadaB;

import excecao.Aluno;

public class testeValidacoes {
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("ana", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		
		} catch (StringVaziaException e) {
			
			System.out.println(e.getMessage());
		} catch(NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
}
