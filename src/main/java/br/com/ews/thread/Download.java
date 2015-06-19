package br.com.ews.thread;

public class Download implements Runnable {
	
	private Retorno retorno;
		
	public Download(Retorno retorno) {
		this.retorno = retorno;
	}

	private synchronized void download() {		
		try {
			Thread.sleep(1000*10);	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}			
	}
	
	public void run() {
		 download();
		 System.out.println(this.retorno);
	}
	
}