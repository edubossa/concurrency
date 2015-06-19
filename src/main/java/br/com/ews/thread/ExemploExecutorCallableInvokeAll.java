package br.com.ews.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExemploExecutorCallableInvokeAll {
	
	public static void main(String[] args) throws Exception {
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		List<Callable<Retorno>> lista = new ArrayList<Callable<Retorno>>();
		
		int count = 1;
		while(count <= 20) {
			lista.add(new BackupArquivos(count));
			count++;
		}
		
		List<Future<Retorno>> futures = executor.invokeAll(lista);
		
		System.out.println();
		System.out.println("========================================================");
		System.out.println();
		
		for(Future<Retorno> future : futures) {
			System.out.println(future.get());
		}
		
		executor.shutdown();
	}
	
}