package br.com.ews.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExemploScheduledCallable {
	
	public static void main(String[] args) throws Exception {
		
		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
		
		ScheduledFuture<Retorno> future = scheduler.schedule(new Callable<Retorno>() {
			public Retorno call() throws Exception {
				Retorno retorno = new Retorno(25, "Dados Atualizados com sucesso!");
				return retorno;
			}
		}, 
		
		5, TimeUnit.SECONDS);
		
		if (future.get().getStatus() == 25) {
			System.out.println("Result: " + future.get());
			scheduler.shutdown();
		} else {
			System.out.println("DADOS INVALIDOS");			
		}
				
	}
	
}