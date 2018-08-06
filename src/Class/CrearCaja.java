package Class;

public class CrearCaja extends Cuenta{
	    CrearCaja(int numCuenta,int nip,int saldo,String tipoCuenta){ //constructor 
	            this.numCuenta = numCuenta;
	            this.saldo = saldo;
	            this.nip = nip;
	            this.tipoCuenta = tipoCuenta;
	    }
	    

	    public void insertar(int nip,int numCuenta,int saldo,String tipoCuenta){ 
	        this.tipoCuenta = tipoCuenta;
	        this.numCuenta = numCuenta;
	        this.saldo = saldo;
	        this.nip = nip;
	        saldo = 0;
	    }
	    
	    	//metodos sobrescritos//
	        public void depositar(int numCuenta,int efectivo){                 
	                saldo=efectivo;    
	        }
	        
	        public int retirar(int retiro){
	                saldo= saldo-retiro;
	                return saldo;
	        }
	        
	        

	  
	}


