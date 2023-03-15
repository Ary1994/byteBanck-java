
public class ControlBonificacion {
	private double suma;
	
	//metodos
	public double registrarSalario(Funcionario funcionario) {
		this.suma=funcionario.getBonificacion()+this.suma;
		System.out.println("calculo actual "+this.suma);
		return suma;
	}
	public double getSuma() {
	    return this.suma;
	}
}
