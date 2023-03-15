
public class TestCuenta {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1, 10);
		CuentaAhorros ca=new CuentaAhorros(2, 3);
		cc.depositar(3000);
		cc.tranferir(1000, ca);
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
}
