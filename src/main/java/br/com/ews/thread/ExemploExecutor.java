package br.com.ews.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExemploExecutor {
	
	
	public static void main(String[] args) throws Exception {
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		int count = 1;
		while(count <= 20) {
			Retorno retorno = new Retorno(count, "Nome Thread :" +Thread.currentThread().getName() + " - " +count);
			executor.execute(new Download(retorno));
			count++;
		}
		
		executor.shutdown();
		
	}
		
}
