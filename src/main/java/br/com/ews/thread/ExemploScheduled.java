package br.com.ews.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExemploScheduled {
	
	
	static class Processo implements Callable<Retorno>, Runnable {
		public Retorno call() throws Exception {
			return new Retorno(12, "Processo concluido com Sucesso!");
		}

		public void run() {			
			try {
				call();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(10);
		ScheduledFuture<Retorno> future = (ScheduledFuture<Retorno>) scheduler.scheduleAtFixedRate(new Processo(), 1, 10, TimeUnit.SECONDS);
		
		System.out.println(future.get());
		
	}
	
}