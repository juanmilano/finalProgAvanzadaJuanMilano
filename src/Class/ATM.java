package Class;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {  
        Banco bancoATM = Banco.getInstance();
		String nombre_usuario;
        String type;
        int saldo;
        int tmp;
        int psw;
        int retirar=0;
        int aNumber; 
        int codigo;
   
 
        
	        Cliente cliente;
	        bancoATM.addCliente("Juan", "Milano");
	        cliente = bancoATM.getCliente(0);
	        aNumber = 12345;
	        codigo = 10010;
	        saldo = 0;
	        type= "cajaAhorro";        
	        cliente.addCuenta(new CrearCaja(aNumber,codigo,saldo,type)); 	       
            Scanner in = new Scanner(System.in); //Creo el objeto Scanner//
            int userMenu;
            boolean quit = false;
        
            System.out.println("Bienvenido a ATM Cajeros: \n");
            System.out.print("Ingresar el número de Cuenta para comenzar : ");
            tmp=in.nextInt();
            System.out.print("Ingresar su código NIP : ");
            psw=in.nextInt();

            
            
            if(psw != codigo || tmp != aNumber) {
            	System.out.println("Los datos ingresados no son correctos!");
            	System.out.print("\n**************************** \n");
            	System.out.println("Bienvenido a ATM Cajeros: ");
                System.out.print("Ingresar el número de Cuenta para comenzar : ");
                tmp=in.nextInt(); //le digo que va a leer un INT//
                System.out.print("Ingresar su código NIP : ");
                psw=in.nextInt();
            	
            }else{
            System.out.println("Hola " + cliente.getNombre() + " que transacción desea realizar? \n");
            
            do {
                  
                  
                  System.out.println("1. Depositar Dinero");
                  System.out.println("2. Retirar Dinero");
                  System.out.println("3. Consultar Saldo");
                  System.out.println("0. Salir: \n");
                  System.out.print("Elegir transacción : ");
                  userMenu = in.nextInt();
                  switch (userMenu) {
                                
                
                case 1: // Depositar
                    System.out.print("Entrar el código de NIP : ");
                    psw=in.nextInt();
                 if(psw == codigo ){
                 System.out.print("Ingresa la Cantidad que desea Depositar: ");
                 saldo=saldo+in.nextInt();
                 
                 System.out.println("\t Deposito Exitoso!");
              }                
                     else
                    System.out.println("Código NIP incorrecto");          
                   break;
                    
                  case 2: // Retirar                      
                      System.out.print("Entrar el código de NIP : ");
                      psw=in.nextInt();
                   if(psw == codigo ){                         
                             if(saldo==0)
                             System.out.print("Tu cuenta no tiene Saldo.");
                             
                             else{
                             System.out.print("Ingrese la Cantidad a Retirar : ");   
                             retirar=in.nextInt();  
                             
                             if(retirar>saldo){
                             System.out.print("Ingrese una Cantidad Valida : ");
                             retirar=in.nextInt();
                             }
                             else
                             saldo= saldo-retirar;
                             System.out.println("Su Saldo es : "+saldo);   
                             }
                          }
                             else
                             System.out.println("Código NIP Incorrecto");  
                        break;
     
                  case 3: // Consultar Saldo 
                      System.out.print("Entrar el código de NIP : ");
                      psw=in.nextInt();
                   if(psw == codigo){
                             System.out.println("Su Saldo es : "+ saldo);
                             }
                             else
                             System.out.println("Código NIP Incorrecto");                         
                      break;
                      
                  case 0:
                	  	quit = true;
                        break;
                  default:
                        System.out.println("La opción ingresada No Existe!");
                        break;
                  }
                  System.out.println("\n");
            } while (!quit);
            System.out.println("Muchas Gracias por utilizar nuestro Servicio. \n ATM ");
            	
            
	 }
}
	}
             
    	 
            
            
        

    	 
     




