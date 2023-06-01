package aula6;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();

        for(int i = 0; i <= 10; i++) {
            fila.add(i);
        }

        System.out.println("\nPrimeiro número da fila: " + fila.peek());

        System.out.println("\nElementos na fila " + fila);

        System.out.println("\nRemover elemento " + fila.poll());

        System.out.println("\nFila atualizada: " + fila);

        System.out.println("\nAdicionar elemento: " + fila.add(11));

        System.out.println("\nExibir a fila atualizada" + fila);

        fila.clear();

        System.out.println("\nExibir a fila vazia" + fila);

		
	}

}
