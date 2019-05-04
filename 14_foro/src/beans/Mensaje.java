package beans;

public class Mensaje {
	private String ip;
	private String texto;
	public Mensaje(String ip, String texto) {
		super();
		this.ip = ip;
		this.texto = texto;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
