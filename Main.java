/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parqueogr2;

/**
 *
 * @author diego
 */
public class Main {

    public static void main(String[] args) {
        Parqueo p = new Parqueo(20);
        //System.out.println(p.toString(5));
        p.agregarVehiculo("AAA111", "Vehiculo", 1945);
        p.agregarVehiculo("BBB111", "Vehiculo", 1945);
        p.agregarVehiculo("CCC111", "Vehiculo", 1545);
        p.agregarVehiculo("DDD111", "Vehiculo", 2045);
        p.agregarVehiculo("EEE111", "Vehiculo", 1965);
        p.agregarVehiculo("FFF111", "Vehiculo", 1000);
        p.agregarVehiculo("RRR111", "Vehiculo", 1945);
        p.agregarVehiculo("OOO111", "Vehiculo", 1445);
        p.agregarVehiculo("PPP111", "Vehiculo", 1645);
        p.agregarVehiculo("HHH111", "Vehiculo", 1745);
        p.agregarVehiculo("UWU111", "Vehiculo", 1245);
        p.agregarVehiculo("BBB111", "Vehiculo", 1945);
        p.agregarVehiculo("CCC111", "Vehiculo", 1545);
        p.agregarVehiculo("DDD111", "Vehiculo", 2045);
        p.agregarVehiculo("EEE111", "Vehiculo", 1965);
        p.agregarVehiculo("FFF111", "Vehiculo", 1000);
        p.agregarVehiculo("RRR111", "Vehiculo", 1945);
        p.agregarVehiculo("OOO111", "Vehiculo", 1445);
        p.agregarVehiculo("PPP111", "Vehiculo", 1645);
        p.agregarVehiculo("HHH111", "Vehiculo", 1745);
        //System.out.println("");
        //System.out.println(p.toString(5));
        
        //System.out.println(p.buscar("EEE111"));
        //System.out.println(p.buscar("ZZZ111"));
        
        int index = p.buscar("DDD111");
        if (index == -1)
            System.out.println("el vehículo no está en el parqueo");
        else{
            //System.out.println("Su vehiculo: " + p.getVehiculos()[index].toString());
            p.getVehiculos()[index].setHoraSalida(2100);
        }
        
        Vehiculo salida = p.sacarVehiculo("DDD111");
        //if (salida!=null)
          //  System.out.println("Salio el vehiculo: " + salida.toString());
        //System.out.println(p.toString(5));
        
        p.agregarVehiculo("XXXXXX", "Vehiculo", 1945);
        
        /*
        int temp = p.Cambiar_hora_entrada("XXXXXX", 1880);
        if (temp != -1)
        	System.out.print("Se cambio la hora a: "+ temp+ "\n");
        else {
        	System.out.println("La placa intoducida no pertenece a ningun vehiculo en el parqueo");
        }
        */
        // p.agrupar();
        int temp = p.buscar("BBB111");
        p.getVehiculos()[temp].setHoraSalida(2000);
        p.sacarVehiculo("BBB111");
        p.sacarVehiculo("BBB111");
        p.agregarVehiculo("XD", "Moto", 1000);
        temp = p.buscar("XD");
        p.getVehiculos()[temp].setHoraSalida(2000);
        p.sacarVehiculo("XD");
       // p.agrupar();
        int[] patrones = p.buscar_patron("111");
        /*for (int i = 0; i<patrones.length;i++) {
        	System.out.println(patrones[i]);
        }*/
        temp = p.sumar_hora_patron("111");
        if ( temp == -1)
        	System.out.println( "no existen vehiculos con esepatron");
        else {
        	System.out.println("Se le ha sumado una hora a todos los vehiculos con el patroooooooooooooooooooN");
        }
        System.out.println(p.toString(5));
        temp = p.buscar("OOO111");
        p.getVehiculos()[temp].setHoraSalida(2000);
        temp = p.buscar("HHH111");
        p.sacarVehiculo("OOO111");
        p.getVehiculos()[temp].setHoraSalida(2000);
        temp = p.buscar("CCC111");
        p.sacarVehiculo("HHH111");
        p.getVehiculos()[temp].setHoraSalida(2000);
        
        p.sacarVehiculo("CCC111");
        
        System.out.println(p.toString(5));
        p.agrupar();
        System.out.println(p.toString(5));
        
        System.out.println(p.getVehiculos()[0].getHoraEntrada());
        //System.out.println(patrones);
        //System.out.println(temp);
        //System.out.println(temp);
        
    }
}
