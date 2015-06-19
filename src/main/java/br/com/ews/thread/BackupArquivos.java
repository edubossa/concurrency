package br.com.ews.thread;

import java.util.concurrent.Callable;

public class BackupArquivos implements Callable<Retorno> {
	
	private final int codigoRetorno;

	public BackupArquivos(int codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public Retorno call() throws Exception {
		Thread.sleep(1000*5);
		Retorno retorno = new Retorno(this.codigoRetorno, 
				"Nome Thread :" +Thread.currentThread().getName() + " - " + this.codigoRetorno);
		System.out.println(retorno);
		return retorno; 	
				
	}
	
}