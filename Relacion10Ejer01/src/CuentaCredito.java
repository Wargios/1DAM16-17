
public class CuentaCredito extends Cuenta {
	private static final int CREDITO_POR_DEFECTO = 100;
	private static final int CREDITO_MAX = 300;
	private double credito;

	public CuentaCredito() {
		super();
		credito = CREDITO_POR_DEFECTO;

	}

	public CuentaCredito(double saldoInicial, double creditoInicial) throws CuentaException {
		super(saldoInicial);
		setCredito(creditoInicial);

	}

	private void setCredito(double credito) throws CuentaException {
		if (credito < 0 || credito > CREDITO_MAX)
			throw new CuentaException("Credito incorreto.");
		this.credito = credito;
	}

	public double getCredito() {
		return credito;
	}

	@Override
	public void retirar(double dineroSacar) throws CuentaException {
		if (dineroSacar < 0)
			throw new CuentaException("Cantidad incorrecta.");
		if (saldo + credito < dineroSacar)
			throw new CuentaException("Sobrepasa el límite del crédito.");
		saldo -= dineroSacar;
	}

	@Override
	public String toString() {
		return "CuentaCredito [saldo=" + saldo + "credito=" + credito + "]";
	}

}
