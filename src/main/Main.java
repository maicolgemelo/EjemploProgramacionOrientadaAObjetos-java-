package main;

import empleado.Descuentos;

import javax.swing.*;

import static empleado.constantes.Valores.IMPUESTO_PENSION;
import static empleado.constantes.Valores.IMPUESTO_SALUD;
import static empleado.constantes.Valores.AUMENTO;
import static empleado.constantes.Valores.OTRO_DESCUENTO;
import static empleado.constantes.Valores.MILLON;
import static empleado.constantes.Mensajes.*;


public class Main {

    public static void main(String[] args){


        Descuentos descuentos = new Descuentos();
        boolean accion = true;

        while(accion == true){



        String opcion =JOptionPane.showInputDialog(null,TITULO_MENU.getMensaje()+ "\n"+
                "\n" + OPCION1.getMensaje() +
                "\n"+ OPCION2.getMensaje());



        switch (opcion){

            case "1":

                String horasTrabajadas = JOptionPane.showInputDialog(null,HORASTRABAJADAS.getMensaje());
                double horas = Double.parseDouble(horasTrabajadas);
                String valorHora = JOptionPane.showInputDialog(null,VALORHORA.getMensaje());
                double valor = Double.parseDouble(valorHora);

                descuentos.setHorasTrabajadas(horas);
                descuentos.setValorHora(valor);

                double salud =descuentos.impuesto(IMPUESTO_SALUD);
                double pension = descuentos.impuesto(IMPUESTO_PENSION);

                JOptionPane.showMessageDialog(null,SALARIOBASE.getMensaje() + descuentos.calcularSalarioBase()+
                        "\n" + DESCUENTOSALUD.getMensaje() +descuentos.impuesto(IMPUESTO_SALUD)+ "\n" + DESCUENTOPENSION.getMensaje()+pension +
                        "\n"+SALARIOFINAL1.getMensaje() + descuentos.salarioFinal(salud + pension)+
                        "\n"+ SALARIOFINAL2.getMensaje() +descuentos.salarioFinal(salud,pension) +
                        "\n"+SALARIOAPAGAR.getMensaje() + ((descuentos.salarioFinal(salud,pension) > MILLON)? descuentos.salarioDefinitivo(salud,pension,OTRO_DESCUENTO):
                        descuentos.salarioDefinitivo(salud + pension,AUMENTO)));



                break;

            case "2":

                break;

            default:
                JOptionPane.showMessageDialog(null,OPCIONNOEXISTE.getMensaje());

                break;
        }

        int respuesta= JOptionPane.showConfirmDialog(null,"Desea regresar?","Mensaje de confirmacion",JOptionPane.YES_NO_OPTION);

        if(respuesta==JOptionPane.YES_OPTION){
            accion=true;
        }else if(respuesta == JOptionPane.NO_OPTION){
            accion=false;
        }


    }

    }

}
