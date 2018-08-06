package Class;

public class CrearCaja extends Cuenta{
	    CrearCaja(String nombreCliente,int numCuenta,int nip,int saldo,String tipoCuenta){ //  
	            this.nombreCliente = nombreCliente;
	            this.numCuenta = numCuenta;
	            this.saldo = saldo;
	            this.nip = nip;
	            this.tipoCuenta = tipoCuenta;
	    }
	    

	    void insertar(String nombreCliente,int nip,int numCuenta,int saldo,String tipoCuenta){ // input user name, account number and type 
	        this.nombreCliente = nombreCliente;
	        this.tipoCuenta = tipoCuenta;
	        this.numCuenta = numCuenta;// generate random number 
	        this.saldo = saldo;
	        this.nip = nip;
	        saldo = 0;
	    }
	    
	    void display_details(){
	        System.out.println("Nombre de Cliente:" +nombreCliente);
	        System.out.println("Número de Cuenta: "+numCuenta);
	        System.out.println("Código Nip : "+nip);
	        System.out.println("Saldo de Cuenta : "+saldo); 
	        System.out.println("Tipo de Cuenta : "+tipoCuenta);
	    }
	 
	        public void depositar(int numCuenta,int efectivo){                 
	                saldo=efectivo;    
	        }
	        
	        public int retirar(int retiro){
	                saldo= saldo-retiro;
	                return saldo;
	        }
	        
	        

	  
	}


