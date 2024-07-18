package org.example;

import java.math.BigDecimal;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {


        Scanner entradaTeclado=new Scanner(System.in);

        int anioNacimientoCliente;
        int anioActual;
        String nombresCompletosCliente;
        double salarioCliente;
        String licorFavoritoCLiente;
        String cantanteFavoritoCliente;
        double valorIva;
        byte numeroMesa;
        double valorDescuento;

        //ASIGNANDO VARIABLES
        System.out.print("Digita tus nombres y apellidos");
        nombresCompletosCliente=entradaTeclado.nextLine();

        System.out.print("Digita tu licor favorito: ");
        licorFavoritoCLiente=entradaTeclado.nextLine();

        System.out.print("Digita tu cantante favorito: ");
        cantanteFavoritoCliente=entradaTeclado.nextLine();

        System.out.print("Digite su año de nacimiento: ");
        anioNacimientoCliente=entradaTeclado.nextInt();

        System.out.print("Digite el año actual: ");
        anioActual=entradaTeclado.nextInt();

        System.out.print("Digita el salario del cliente: ");
        salarioCliente=entradaTeclado.nextInt();



        System.out.print("Valor del IVA: ");
        valorIva=entradaTeclado.nextDouble();

        System.out.print("valor del descuento: ");
        valorDescuento=entradaTeclado.nextDouble();

        System.out.print("Numero de la mesa del cliente: ");
        numeroMesa=entradaTeclado.nextByte();

// Procesos del algoritmo
        // 1. Calcular la edad del Usuario
        int edadUsuario=anioActual-anioNacimientoCliente;
        System.out.println("Apreciado"+nombresCompletosCliente+" usted tiene "+edadUsuario+" años");

        //2. comparar y decidir sobre el salario
        final double velorSalarioMinimo=1300000;

        double numeroSalarios=salarioCliente/velorSalarioMinimo;

        DecimalFormatSymbols simbolo= new DecimalFormatSymbols();
        simbolo.setDecimalSeparator(',');
        DecimalFormat formato= new DecimalFormat("0.00",simbolo);
        formato.setRoundingMode(RoundingMode.HALF_UP);
        String numeroSalariosFormato=formato.format(numeroSalarios);
        System.out.println("Usted gana:"+numeroSalariosFormato+" SMLV");

        //condicion logica para validar si tiene platica
        if (numeroSalarios>=3.0){
            // el camino de verdad
            System.out.println("Bienvenido patron");
        }else{
            // el camino de negación
            System.out.println("chao arrastrado");
        }



    }
}