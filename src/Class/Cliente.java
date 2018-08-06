package Class;

public class Cliente {

	private String nombre;
	private String apellido;
	private Cuenta[] cuenta; //Asociacion el cliente tiene una cuenta//
	private int cantCuentas;
	
    public Cliente (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        // inicializar el array de cuenta//
        cuenta = new Cuenta[1];
        cantCuentas = 0;
    }
    
    //getters//
    public String getNombre () {
    	return nombre;
    }
    
    public String getApellido () {
    	return apellido;
    }
    
    //agregar cuenta//
    public void addCuenta (Cuenta acct) {
        int i = cantCuentas++;
        cuenta[i] = acct;
    }

    public int getCantidadCuentas() {
        return cantCuentas;
    }


}


