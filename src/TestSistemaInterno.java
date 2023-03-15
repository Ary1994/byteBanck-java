
public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema =new SistemaInterno();
		Gerente gerente =new Gerente();
		Administrador adm =new Administrador();
		sistema.autenticar(gerente);
		sistema.autenticar(adm);
	}
}
