package modelo;

public class CuentaJoven extends Cuenta {

	public CuentaJoven(Persona titular) {
		super(titular);
		
	}

	//Atributos:
	
	double bonificacion;
	boolean estudiante;
	
	
	//M�todos:
	
	//1.Constructor con todos los par�metros.
	
	public CuentaJoven(Persona titular, double saldo,double bonificacion,boolean estudiante) {
		super(titular, saldo);
		this.titular=titular;
		this.saldo=saldo;
		this.bonificacion=bonificacion;
		this.estudiante=estudiante;
	}

	//2.Getters and setters

	public double getBonificacion() {
		return bonificacion;
	}


	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}


	public boolean isEstudiante() {
		return estudiante;
	}


	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}

	
	//3. M�todo toString
	@Override
	public String toString() {
		return String.format("CuentaJoven [bonificacion=%s, estudiante=%s]", bonificacion, estudiante);
	}
	
	//4.Sobreescribe el m�todo calculaIntereses de la superclase...


	public int hashCode() {
		return calculaIntereses.hashCode();
	}

	public boolean equals(Object obj) {
		return calculaIntereses.equals(obj);
	}
	
	//5.Sobreescribe m�todo transferir...
	

	
	
	
	
	
	
}
