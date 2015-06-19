package br.com.ews.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExemploExecutorCallable {
	
	public static void main(String[] args) throws Exception {
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		int count = 1;
		while(count <= 20) {
			Future<Retorno> future = executor.submit(new BackupArquivos(count));
			System.out.println(future.get());
			count++;
		}
		
		executor.shutdown();
	}
	
}