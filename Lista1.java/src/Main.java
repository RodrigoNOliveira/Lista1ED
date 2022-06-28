import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        try {
			Scanner scanner = new Scanner(System.in);


				

			// Lista<Contato> lista = new Lista<>(10);
			// // Lista<String> lista2 = new Lista<>(10);
			// //  Lista<Integer> lista3 = new Lista<>(10);

			// Contato c1 = new Contato("c1", "111-1111", "c1@email.com.br");
			// Contato c2 = new Contato("c2", "222-2222", "c2@email.com.br");
			// Contato c3 = new Contato("c3", "333-3333", "c3@email.com.br");
			// Contato c4 = new Contato("c4", "444-4444", "c4@email.com.br");
			// Contato c5 = new Contato("c5", "555-5555", "c5@email.com.br");
			// lista.adiciona(c1);
			// lista.adiciona(c2);
			// lista.adiciona(c3);
			// lista.adiciona(c4);
			// lista.adiciona(c5); 
			// System.out.println(lista);


			// //Teste Questão 1
			//  System.out.println(lista.contem(c1));
			 

			// //Teste Questão 2
			// System.out.println(lista.ultimaOcorrencia(c4));


			// //Teste Questão 3
			// System.out.println(lista);
			// lista.removeLast();
			// System.out.println();
			// System.out.println(lista);
			

			// //Teste Questão 4
			
			// lista.removeFirst();
			// System.out.println();
			// System.out.println(lista);


			// //Teste Questao 5
			//  lista.limpar();
			// System.out.println();
			// System.out.println(lista);
	



			//QUESTÃO 6


			// Lista<Contato> lista = new Lista<>(20);

			// Contato c1 = new Contato("c1", "111-1111", "c1@email.com.br");
			// Contato c2 = new Contato("c2", "222-2222", "c2@email.com.br");
			// Contato c3 = new Contato("c3", "333-3333", "c3@email.com.br");
			// Contato c4 = new Contato("c4", "444-4444", "c4@email.com.br");
			// Contato c5 = new Contato("c5", "555-5555", "c5@email.com.br");
			// Contato c6 = new Contato("c6", "111-1111", "c6@email.com.br");
			// Contato c7 = new Contato("c7", "222-2222", "c7@email.com.br");
			// Contato c8 = new Contato("c8", "333-3333", "c8@email.com.br");
			// Contato c9 = new Contato("c9", "444-4444", "c9@email.com.br");
			// Contato c10 = new Contato("c10", "555-5555", "c10@email.com.br");
			// Contato c11 = new Contato("c11", "111-1111", "c11@email.com.br");
			// Contato c12 = new Contato("c12", "222-2222", "c12@email.com.br");
			// Contato c13 = new Contato("c13", "333-3333", "c13@email.com.br");
			// Contato c14= new Contato("c14", "444-4444", "c14@email.com.br");
			// Contato c15 = new Contato("c15", "555-5555", "c15@email.com.br");
			// Contato c16 = new Contato("c16", "111-1111", "c16@email.com.br");
			// Contato c17 = new Contato("c17", "222-2222", "c17@email.com.br");
			// Contato c18 = new Contato("c18", "333-3333", "c18@email.com.br");
			// Contato c19 = new Contato("c19", "444-4444", "c19@email.com.br");
			// Contato c20 = new Contato("c20", "555-5555", "c20@email.com.br");
			// Contato c21 = new Contato("c21", "111-1111", "c21@email.com.br");
			// Contato c22 = new Contato("c22", "222-2222", "c22@email.com.br");
			// Contato c23 = new Contato("c23", "333-3333", "c23@email.com.br");
			// Contato c24 = new Contato("c24", "444-4444", "c24@email.com.br");
			// Contato c25 = new Contato("c25", "555-5555", "c25@email.com.br");
			// Contato c26 = new Contato("c26", "111-1111", "c26@email.com.br");
			// Contato c27 = new Contato("c27", "222-2222", "c27@email.com.br");
			// Contato c28 = new Contato("c28", "333-3333", "c28@email.com.br");
			// Contato c29 = new Contato("c29", "444-4444", "c29@email.com.br");
			// Contato c30 = new Contato("c30", "555-5555", "c30@email.com.br");


			// lista.adiciona(c1);
			// lista.adiciona(c2);
			// lista.adiciona(c3);
			// lista.adiciona(c4);
			// lista.adiciona(c5);
			// lista.adiciona(c6);
			// lista.adiciona(c7);
			// lista.adiciona(c8);
			// lista.adiciona(c9);
			// lista.adiciona(c10);
			// lista.adiciona(c11);
			// lista.adiciona(c12);
			// lista.adiciona(c13);
			// lista.adiciona(c14);
			// lista.adiciona(c15);
			// lista.adiciona(c16);
			// lista.adiciona(c17);
			// lista.adiciona(c18);
			// lista.adiciona(c19);
			// lista.adiciona(c20);
			// lista.adiciona(c21);
			// lista.adiciona(c22);
			// lista.adiciona(c23);
			// lista.adiciona(c24);
			// lista.adiciona(c25);
			// lista.adiciona(c26);
			// lista.adiciona(c27);
			// lista.adiciona(c28);
			// lista.adiciona(c29);
			// lista.adiciona(c30);

			// System.out.println(lista);




						//QUESTAO 7

			/*LinkedList<Contato> listaEncadeada = new LinkedList<>();

			Contato c1 = new Contato("c1", "111-1111", "c1@email.com.br");
			Contato c2 = new Contato("c2", "222-2222", "c2@email.com.br");
			Contato c3 = new Contato("c3", "333-3333", "c3@email.com.br");
			Contato c4 = new Contato("c4", "444-4444", "c4@email.com.br");
			Contato c5 = new Contato("c5", "555-5555", "c5@email.com.br");
			Contato c6 = new Contato("c6", "111-1111", "c6@email.com.br");
			Contato c7 = new Contato("c7", "222-2222", "c7@email.com.br");
			Contato c8 = new Contato("c8", "333-3333", "c8@email.com.br");
			Contato c9 = new Contato("c9", "444-4444", "c9@email.com.br");
			Contato c10 = new Contato("c10", "555-5555", "c10@email.com.br");
			Contato c11 = new Contato("c11", "111-1111", "c11@email.com.br");
			Contato c12 = new Contato("c12", "222-2222", "c12@email.com.br");
			Contato c13 = new Contato("c13", "333-3333", "c13@email.com.br");
			Contato c14= new Contato("c14", "444-4444", "c14@email.com.br");
			Contato c15 = new Contato("c15", "555-5555", "c15@email.com.br");
			Contato c16 = new Contato("c16", "111-1111", "c16@email.com.br");
			Contato c17 = new Contato("c17", "222-2222", "c17@email.com.br");
			Contato c18 = new Contato("c18", "333-3333", "c18@email.com.br");
			Contato c19 = new Contato("c19", "444-4444", "c19@email.com.br");
			Contato c20 = new Contato("c20", "555-5555", "c20@email.com.br");
			Contato c21 = new Contato("c21", "111-1111", "c21@email.com.br");
			Contato c22 = new Contato("c22", "222-2222", "c22@email.com.br");
			Contato c23 = new Contato("c23", "333-3333", "c23@email.com.br");
			Contato c24 = new Contato("c24", "444-4444", "c24@email.com.br");
			Contato c25 = new Contato("c25", "555-5555", "c25@email.com.br");
			Contato c26 = new Contato("c26", "111-1111", "c26@email.com.br");
			Contato c27 = new Contato("c27", "222-2222", "c27@email.com.br");
			Contato c28 = new Contato("c28", "333-3333", "c28@email.com.br");
			Contato c29 = new Contato("c29", "444-4444", "c29@email.com.br");
			Contato c30 = new Contato("c30", "555-5555", "c30@email.com.br");
			
			listaEncadeada.add(c1);
			listaEncadeada.add(c2);
			listaEncadeada.add(c3);
			listaEncadeada.add(c4);
			listaEncadeada.add(c5);
			listaEncadeada.add(c6);
			listaEncadeada.add(c7);
			listaEncadeada.add(c8);
			listaEncadeada.add(c9);
			listaEncadeada.add(c10);
			listaEncadeada.add(c11);
			listaEncadeada.add(c12);
			listaEncadeada.add(c13);
			listaEncadeada.add(c14);
			listaEncadeada.add(c15);
			listaEncadeada.add(c16);
			listaEncadeada.add(c17);
			listaEncadeada.add(c18);
			listaEncadeada.add(c19);
			listaEncadeada.add(c20);
			listaEncadeada.add(c21);
			listaEncadeada.add(c22);
			listaEncadeada.add(c23);
			listaEncadeada.add(c24);
			listaEncadeada.add(c25);
			listaEncadeada.add(c26);
			listaEncadeada.add(c27);
			listaEncadeada.add(c28);
			listaEncadeada.add(c29);
			listaEncadeada.add(c30);

			System.out.println(listaEncadeada);*/











            /*  Questão 8

            int [] vetor = new int[10];
			Pilha<Integer> pilha = new Pilha<Integer>();

            System.out.println("Pilha");

            System.out.println("Digite 10 numeros para serem inseridos: ");
            for (int i = 0; i < vetor.length; i++) {
                int x = scanner.nextInt();
                vetor[i] = x;
                if(x%2==0){
                    pilha.empilha(x);
                }
                else {
                    if(pilha.estaVazia()!= false){
                        System.out.println("A pilha está vazia");
                    }
                    else {
                        pilha.desempilha();
                    }
                }
            }
            
            if (pilha.estaVazia() == false){
                System.out.println(pilha.toString());
                for (int i = pilha.tamanho(); i > 0; i--) {
                    pilha.desempilha();
                }
                System.out.println(pilha.tamanho());
                System.out.println(pilha.toString());
            
            }*/


            //Questão 9

            // int [] vetor = new int[10];
			// Pilha<Integer> pilhaPar = new Pilha<Integer>();
            // Pilha<Integer> pilhaImpar = new Pilha<Integer>();

            // System.out.println("Pilha");

            // System.out.println("Digite 10 numeros para serem inseridos: ");
            // for (int i = 0; i < vetor.length; i++) {
            //     int x = scanner.nextInt();
            //     vetor[i] = x;
            //     if(x%2==0 && x!=0){
            //         pilhaPar.empilha(x);
            //     }
            //     else if(x%2!=0 && x!=0){
            //         pilhaImpar.empilha(x);
            //     }

            //     else {

            //         pilhaImpar.desempilha();
            //         pilhaPar.desempilha();
            //         if (pilhaPar.estaVazia() == true || pilhaImpar.estaVazia() ==true){
            //             System.out.println("Uma das pilhas está vazia");
            //         }
                    
                   
            //     }
            // }
            
           
            //     System.out.println("A pilha par: " + pilhaPar.toString());
            //     System.out.println("A pilha impar: " + pilhaImpar.toString());
            //     for (int i = pilhaPar.tamanho(); i > 0; i-- ) {
            //         pilhaPar.desempilha();
            //     }
            //     for (int i = pilhaImpar.tamanho(); i > 0; i-- ) {
            //         pilhaImpar.desempilha();
            //     }
                



            // Questão 10

        //     Pilha<Livro> pilha = new Pilha<Livro>(20);
            
        //    for (int i = 0; i < 6; i++) {
        //     System.out.println();
        //      System.out.print("Nome do livro: ");
        //      String nome = scanner.nextLine();
        //      System.out.print("isbn: ");
        //      String isbn = scanner.nextLine();
        //      System.out.print("Digite o ano de lançamento: ");
        //      int ano = scanner.nextInt();
        //      scanner.nextLine();
        //      System.out.print("Digite o nome do autor: ");
        //      String autor = scanner.nextLine();
        //      Livro l= new Livro(nome, isbn, ano, autor);
        //      System.out.println();
        //      pilha.empilha(l);
        //    }

        //     System.out.println(pilha);
        //     System.out.println(pilha.estaVazia());
        //     System.out.println(pilha.tamanho());
        //     System.out.println(pilha.topo());
        //     System.out.println(pilha.desempilha());
        //     System.out.println(pilha);
            

        

        //Questão 11
        
        Stack<Livro> pilhaClasse = new Stack<Livro>();

           for (int i = 0; i < 2; i++) {
            System.out.println();
             System.out.print("Nome do livro: ");
             String nome = scanner.nextLine();
             System.out.print("isbn: ");
             String isbn = scanner.nextLine();
             System.out.print("Digite o ano de lançamento: ");
             int ano = scanner.nextInt();
             scanner.nextLine();
             System.out.print("Digite o nome do autor: ");
             String autor = scanner.nextLine();
             Livro l= new Livro(nome, isbn, ano, autor);
             System.out.println();
             pilhaClasse.push(l);
           }

           System.out.println(pilhaClasse);
           System.out.println(pilhaClasse.capacity());
           System.out.println(pilhaClasse.size());
           System.out.println(pilhaClasse.isEmpty());
           System.out.println(pilhaClasse.peek());
           System.out.println(pilhaClasse.pop());
           System.out.println(pilhaClasse);

		} catch (Exception e) {			
			e.printStackTrace();
		}
        
       
    }
}

