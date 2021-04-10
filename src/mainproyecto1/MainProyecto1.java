package mainproyecto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainProyecto1 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Proyecto1[]  codigos;
        int tam=0;
        System.out.print("Cual es el tamaño de la cartera de clientes: ");
        tam=sc.nextInt();
        codigos = new Proyecto1[tam];
        for(int i=0; i<codigos.length; i++){
        codigos[i] = new Proyecto1();
        }

        int [] codigoCliente = new int[tam];
        String [] nombre = new String[tam];
        int opc=10;
        while(opc!=0){
            System.out.println("Tamano de la cartera: " + tam + ".");
            System.out.println("1) Agregar cliente");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Buscar cliente");
            System.out.println("0) Cerrar sistema");
            System.out.print("Elige una opción: ");
            opc= sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("--------------------------------------------");
                    try {
                        for (int i = 0; i < codigos.length; i++) {
                            System.out.print("Codigo del cliente: ");
                            codigos[i].setCodigoCliente(sc.nextInt());
                            System.out.print("Confirma el cofigo: ");;
                            codigoCliente[i] = sc.nextInt();
                            System.out.print("Ingresa el nombre: ");
                            codigos[i].setNombre(bf.readLine());
                            System.out.print("Confirma el nombre del cliente: ");
                            nombre[i] = bf.readLine();
                            System.out.print("Ingrese el apellido paterno: ");
                            codigos[i].setApellidoPaterno(bf.readLine());
                            System.out.print("Ingrese el apellido materno: ");
                            codigos[i].setApellidoMaterno(bf.readLine());
                            System.out.print("Ingrese el telefono: ");
                            codigos[i].setTelefono(bf.readLine());
                            System.out.print("Ingrese la dirección: ");
                            codigos[i].setDireccion(bf.readLine());
                            System.out.print("Ingrese la edad: ");
                            codigos[i].setEdad(sc.nextInt());
                        }
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("--------------------------------------------");
                                for(int i=0; i< codigos.length; i++){
                System.out.println("Codigo del cliente: " + codigos[i].getCodigoCliente());
                System.out.println("Nombre: " + codigos[i].getNombre());
                System.out.println("Apellido paterno: " + codigos[i].getApellidoPaterno());
                System.out.println("Apellido Materno: " + codigos[i].getApellidoMaterno());
                System.out.println("Telefono: " + codigos[i].getTelefono());
                System.out.println("Dirección: " + codigos[i].getDireccion());
                System.out.println("Edad: " + codigos[i].getEdad());
            }
                    break;
                case 3:
                    int opc2 = 10;
                    while(opc2!=0) {
                        System.out.println("--------------------------------------------");
                        System.out.println("1) Buscar por codigo");
                        System.out.println("2) Buscar por nombre");
                        System.out.println("0) Regresar al menu anterior");
                        System.out.print("Elige una opción: ");
                        opc2= sc.nextInt();
                        switch (opc2){
                            case 1:
                                System.out.print("Ingresa el codigo del cliente: ");
                                int codig = sc.nextInt();
                                for(int i=0; i< codigos.length; i++){
                                    if(codig == codigoCliente[i]){
                                        System.out.println("Codigo del cliente: " + codigos[i].getCodigoCliente());
                                        System.out.println("Nombre: " + codigos[i].getNombre());
                                        System.out.println("Apellido paterno: " + codigos[i].getApellidoPaterno());
                                        System.out.println("Apellido Materno: " + codigos[i].getApellidoMaterno());
                                        System.out.println("Telefono: " + codigos[i].getTelefono());
                                        System.out.println("Dirección: " + codigos[i].getDireccion());
                                        System.out.println("Edad: " + codigos[i].getEdad());
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("Ingresa el nombre el cliente: ");
                                String name = bf.readLine();
                                for(int i=0; i< codigos.length; i++){
                                    if(name == nombre[i]){
                                        System.out.println("Codigo del cliente: " + codigos[i].getCodigoCliente());
                                        System.out.println("Nombre: " + codigos[i].getNombre());
                                        System.out.println("Apellido paterno: " + codigos[i].getApellidoPaterno());
                                        System.out.println("Apellido Materno: " + codigos[i].getApellidoMaterno());
                                        System.out.println("Telefono: " + codigos[i].getTelefono());
                                        System.out.println("Dirección: " + codigos[i].getDireccion());
                                        System.out.println("Edad: " + codigos[i].getEdad());
                                    }
                                }
                                break;
                            case 3:

                                break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Sistema cerrado");
                break;
            }
        }
    }
}
