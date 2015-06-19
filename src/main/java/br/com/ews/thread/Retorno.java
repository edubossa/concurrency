package br.com.ews.thread;

public class Retorno {

	private int status;
	private String mensagem;

	public Retorno() {
	}

	public Retorno(int status, String mensagem) {
		this.status = status;
		this.mensagem = mensagem;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "Retorno [status=" + status + ", mensagem=" + mensagem + "]";
	}

}