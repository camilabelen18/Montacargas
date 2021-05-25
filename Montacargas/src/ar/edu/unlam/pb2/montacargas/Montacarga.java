package ar.edu.unlam.pb2.montacargas;

import java.util.ArrayList;
import java.util.List;

public class Montacarga {

	private Integer pesoMaximo;
	private Integer pesoDeCargas;
	private List <Carga> listaCargas = new ArrayList<Carga>();

	public Montacarga(Integer pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
		this.pesoDeCargas = 0;
	}
	
	public Boolean agregarCargasAlMontacargas(Carga carga1) {
		if(carga1.getPeso() <= this.pesoMaximo) {
			this.pesoDeCargas += carga1.getPeso();
			return listaCargas.add(carga1);
		}
		
		return false;
	}
	
	public Carga obtenerUnaCarga(Carga carga2) {
		if(this.listaCargas.contains(carga2))
			return carga2;
		
		return null;
	}
	
	public boolean eliminarCarga(Carga carga1) {
		return this.listaCargas.remove(carga1);
	}
	
	public Integer cantidadDeCargas() {
		return this.listaCargas.size();
	}
	
	public Object obtenerPesoPromedioDeCargas() {
		return this.pesoDeCargas/this.listaCargas.size();
	}

	public Integer getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(Integer pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

}
