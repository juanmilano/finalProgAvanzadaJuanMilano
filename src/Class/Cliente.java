package Class;

public class Cliente {

	private String nombre;
	private String apellido;
	private Cuenta[] cuenta;
	private int cantCuentas;
	
    public Cliente (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        // initialize accounts array
        cuenta = new Cuenta[10];
        cantCuentas = 0;
    }
    
    public String getNombre () {
    	return nombre;
    }
    
    public String getApellido () {
    	return apellido;
    }
    
    public void addCuenta (Cuenta acct) {
        int i = cantCuentas++;
        cuenta[i] = acct;
    }

    public int getCantidadCuentas() {
        return cantCuentas;
    }

    public Cuenta getCuenta(int cuenta_index) {
        return cuenta[cuenta_index];
    }

}


