import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	//	ArrayList<String> listaDeAlunos = new ArrayList<>();
			
	//	listaDeAlunos.add("Camila");
	//	listaDeAlunos.add("Davi");
	//	listaDeAlunos.add("Fernando");
	//	listaDeAlunos.add("Erom");	
	//	System.out.println(listaDeAlunos.get(2));	
	//	listaDeAlunos.remove(1);	
	//	listaDeAlunos.set(2, "Eron");
		
		ArrayList<Integer> notas = new ArrayList<>();
		
		notas.add(5);
		notas.add(8);
		notas.add(3);
		notas.add(10);
		notas.add(5);
		notas.add(4);
		notas.add(5);
		notas.add(1);
		
		//for (int i=0; i<notas.size(); i++)
		//	System.out.println(((i+1)+" - "+ notas.get(i)));
		for (Integer aluno : notas) {
			System.out.println(aluno);
		}
		
	}

}
