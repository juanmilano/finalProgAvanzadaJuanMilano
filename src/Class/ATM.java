package Class;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {  
        Banco bancoATM = Banco.getInstance();
 
		String nombre_usuario =null,type;
        type = null;
        int saldo=0;
        int tmp=0;
        int psw;
        int retirar=0;
        int saldonuevo=0;
        int aNumber = 0; 
        int codigo = 0;
        aNumber = (int)((Math.random() * 9000)+1000); 
        

	        Cliente cliente;
	        bancoATM.addCliente("Juan", "Milano");
	        cliente = bancoATM.getCliente(0);
	        cliente.addCuenta(new CrearCaja("Juan",1234,12,0,"Caja de Ahorro"));
            Scanner in = new Scanner(System.in);
            Scanner string=new Scanner(System.in);
            int userMenu;
            boolean quit = false;

            do {
                  
            	  System.out.println("Bienvenido a ATM Cajeros: \n");
            	  System.out.println("1. Crear Cuenta");
                  System.out.println("2. Depositar Dinero");
                  System.out.println("3. Retirar Dinero");
                  System.out.println("4. Consultar Saldo");
                  System.out.println("5. Ver mi cuenta");
                  System.out.println("0. Salir: \n");
                  System.out.print("Elegir transacción : ");
                  userMenu = in.nextInt();
                  switch (userMenu) {
                      
                 
               case 1:
                        System.out.print("Ingresar tu nombre: ");
                        nombre_usuario =string.nextLine(); 
                        System.out.print("Ingresar el tipo de Cuenta : ");
                        type=in.next();
                        System.out.print("Ingresar código NIP : ");
                        codigo=in.nextInt();
                        System.out.print("Ingresar el número de Cuenta : ");
                        cliente.addCuenta(new CrearCaja(nombre_usuario,aNumber,codigo,saldo,type)); 
                        System.out.println("\n\tYour Account Details\n");
                        System.out.println("Cliente: "+ nombre_usuario + "\n"+"Número de Cuenta "+ aNumber + "\n"+"Código NIP: "+ codigo + "\n"+ "Saldo: "+ saldo+ "\n"+"Tipo de Cuenta: "+ type);
                        System.out.println("**************************");
                        
                        break;
                
                case 2: // Depositar
                    System.out.print("Entrar el número de Cuenta : ");
                    tmp=in.nextInt();
                    System.out.print("Entrar el código de NIP : ");
                    psw=in.nextInt();
                 if(tmp== aNumber && psw == codigo ){
                 System.out.print("Ingresa la Cantidad que desea Depositar: ");
                 saldo=in.nextInt();
                 System.out.println("\t Deposito Exitoso!");
              }                
                     else
                    System.out.println("Número de Cuenta Erroneo o código NIP incorrecto");          
                   break;
                    
                  case 3: // Retirar                      
                      System.out.print("Entrar el número de Cuenta : ");
                      tmp=in.nextInt();
                      System.out.print("Entrar el código de NIP : ");
                      psw=in.nextInt();
                   if(tmp== aNumber && psw == codigo ){                         
                             if(saldo==0)
                             System.out.print("Tu cuenta no tiene Saldo.");
                             
                             else{
                             System.out.print("Ingrese la Cantidad a Retirar : ");   
                             retirar=in.nextInt();  
                             
                             if(retirar>saldo){
                             System.out.print("Ingrese una Cantiddad Valida : ");
                             retirar=in.nextInt();
                             }
                             else
                             saldo= saldo-retirar;
                             System.out.println("Su Saldo es : "+saldo);   
                             }
                          }
                             else
                             System.out.println("Número de Cuenta erroneo o Código NIP Incorrecto");  
                        break;
     
                  case 4: // Consultar Saldo 
                      System.out.print("Entrar el número de Cuenta : ");
                      tmp=in.nextInt();
                      System.out.print("Entrar el código de NIP : ");
                      psw=in.nextInt();
                   if(tmp== aNumber && psw == codigo ){
                             System.out.println("Su Saldo es : "+ saldo);
                             }
                             else
                             System.out.println("Número de Cuenta o Código NIP Incorrecto");                         
                      break;
                      
                  case 5: // Ver información de Cuenta 
                      System.out.print("Entrar el número de Cuenta : ");
                      tmp=in.nextInt();
                      System.out.print("Entrar el código de NIP : ");
                      psw=in.nextInt();
                   if(tmp== aNumber && psw == codigo ){                               
                                                         
                        }else
                             System.out.println("Número de Cuenta o Código NIP Incorrecto");
                             
                      break;
                  case 0:
                        quit = true;
                        break;
                  default:
                        System.out.println("La opción ingresada No Existe!.");
                        break;
                  }
                  System.out.println("\n");
            } while (!quit);
            System.out.println("Muchas Gracias por utilizar nuestro Servicio. \n ATM ");
             
     }

	private static void iniciarCliente(Banco banco) {
		// TODO Auto-generated method stub
		
	} 
    
}

