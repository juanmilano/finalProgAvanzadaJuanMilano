package Class;

public class Banco {
	private Cliente[] clientes;
	private int cantClientes;
	
    private Banco() {
        clientes = new Cliente[10];
        cantClientes = 0;
    }
    
    private static final Banco instance = new Banco();
    
    //agregar cliente//
    public void addCliente(String nombre, String apellido) {
        int i = cantClientes++;
        clientes[i] = new Cliente(nombre,apellido);
    }

    public int getCantClientes() {
        return cantClientes;
    }

    public Cliente getCliente(int cliente_index) {
        return clientes[cliente_index];
    }
    
    public static Banco getInstance(){
    	return instance;
    }


	

}
