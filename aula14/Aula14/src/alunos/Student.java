package alunos;

public class Student {

	public String nome;
	public double n1, n2, n3;
	
	public void somarNotas() {
		double total = n1 + n2 + n3;
		
		if (total >= 60) {
			System.out.println("FINAL GRADE = " + total);
			System.out.println("PASS");
		} else {
			double pontos = 60 - total;
			System.out.println("FINAL GRADE = " + total);
			System.out.println("FAILED");
			System.out.println("MISSING " + pontos + " POINTS");
		}
	}
	
}
