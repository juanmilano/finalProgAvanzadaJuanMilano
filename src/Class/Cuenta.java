package Class;

public abstract class Cuenta {
	    protected String tipoCuenta;
	    protected int numCuenta;
	    protected int nip;
	    protected int saldo;
	    
	    public Cuenta(){ //constructor por defecto//
	      
	    }
	        public Cuenta(int numCuenta,int nip,int saldo,String tipoCuenta){ //Constructor//
	            this.numCuenta= numCuenta;
	            this.nip = nip;
	            this.saldo= saldo;
	            this.tipoCuenta = tipoCuenta;
	        }
	        
	    	//Getters//
	        public int getNumCuenta() {
	    		return numCuenta;
	    	}
	    	
	        //Metodos Abstractos// Se aplica Polimorfismo
	        public abstract void depositar (int numCuenta, int efectivo);
	         
	        public abstract int retirar(int retiro);
	    }
	        
	


