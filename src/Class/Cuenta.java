package Class;

public abstract class Cuenta {
	    protected String nombreCliente;
	    protected String tipoCuenta;
	    protected int numCuenta;
	    protected int nip;
	    protected int saldo;
	    
	    public Cuenta(){
	      
	    }
	        public Cuenta(String nombreCliente,int numCuenta,int nip,int saldo,String tipoCuenta){
	            this.nombreCliente = nombreCliente;
	            this.numCuenta= numCuenta;
	            this.nip = nip;
	            this.saldo= saldo;
	            this.tipoCuenta = tipoCuenta;
	        }
	        
	    	public int getNumCuenta() {
	    		return numCuenta;
	    	}
	    	
	        
	        public abstract void depositar (int numCuenta, int efectivo);
	         
	        public abstract int retirar(int retiro);
	    }
	        
	


