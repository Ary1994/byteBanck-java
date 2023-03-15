
public class AutentiicacionUtil {
	private int clave;
	 public void setContraseña(int contraseña) {
	        this.clave = contraseña;

	    }
	  public boolean autenticar(int contraseña) {
	         return this.clave==contraseña;
	        
	    }
}
