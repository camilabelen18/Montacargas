package ar.edu.unlam.pb2.montacargas;

public class Carga {

	private Integer peso;
	
	public Carga(Integer peso) {
		this.peso = peso;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Carga [peso=" + peso + "]";
	}
	
	
	
}
