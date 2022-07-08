package modelo;

public class CuentaJoven extends Cuenta {

	public CuentaJoven(Persona titular) {
		super(titular);
		
	}

	//Atributos:
	
	double bonificacion;
	boolean estudiante;
	
	
	//Métodos:
	
	//1.Constructor con todos los parámetros.
	
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

	
	//3. Método toString
	@Override
	public String toString() {
		return String.format("CuentaJoven [bonificacion=%s, estudiante=%s]", bonificacion, estudiante);
	}
	
	//4.Sobreescribe el método calculaIntereses de la superclase...


	public int hashCode() {
		return calculaIntereses.hashCode();
	}

	public boolean equals(Object obj) {
		return calculaIntereses.equals(obj);
	}
	
	//5.Sobreescribe método transferir...
	

	
	
	
	
	
	
}
