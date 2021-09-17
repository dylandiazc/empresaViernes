/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import empleado.Empleado;
import java.util.Scanner;

/**
 *
 * @author 57305
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        int opcion; 
        int contador=0;
        
        int edad=50;
        Empleado[] empleados=new Empleado[10];
        
        do{
           
           System.out.println("Bienvenidos");
           System.out.println("**************");
           System.out.println("1. Agregar Empleados");
           System.out.println("2. Mostrar Empleado");
           System.out.println("3. MOstrar Empleados");
           System.out.println("4. Salir");
           System.out.println("");
           
            System.out.print("Digite una opcion: ");
            opcion=entrada.nextInt();
                
        switch(opcion){
        
            case 1:
                //contador=0
                empleados[contador]=new Empleado();
                //condicion if(contador<=4)
                //else sout ingreso denegado 
                
                System.out.println("Digita el id: ");
                empleados[contador].setId(entrada.nextInt());
                System.out.println("Digita nombre");
                empleados[contador].setNombre(entrada.next());
                System.out.println("Digite cargo");
                empleados[contador].setCargo(entrada.next());
                System.out.println("Digite Salario");
                empleados[contador].setSalario(entrada.nextInt());
                System.out.println("Digite telefono");
                empleados[contador].setTelefono(entrada.next());
                System.out.println("Digite Direccion");
                empleados[contador].setDireccion(entrada.next());
                contador++;
                
                break;
            case 2:
                break;
            case 3:
                
                for(int i=0; i<contador; i++){
                    System.out.println(empleados[i].getNombre());
                }
                //Se completa como el case1
                
                break;
            case 4:
                //msj
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        
        }    
            
            
        }while(opcion!=4);
        
    }
    
}
