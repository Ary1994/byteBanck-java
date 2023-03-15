
public class Administrador extends Funcionario implements Autenticable{
	 private AutentiicacionUtil util;
	 
	 

	    public Administrador() {

	    	this.util = new AutentiicacionUtil();
	}


	    @Override
	    public void setContraseña(int contraseña) {
	        this .util.setContraseña(contraseña);

	    }

	    @Override
	    public boolean autenticar(int contraseña) {
	      return this.util.autenticar(contraseña);
	    }

		@Override
		public double getBonificacion() {
			// TODO Auto-generated method stub
			return 0;
		}
}
