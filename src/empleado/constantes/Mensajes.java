package empleado.constantes;

public enum Mensajes {


    TITULO_MENU("Menú de opciones"),
    OPCION1("1. calcular salario final."),
    OPCION2("2. salir."),
    HORASTRABAJADAS("Ingresa las horas trabajadas:"),
    VALORHORA("Ingrese el valor de la hora de trabajo:"),
    SALARIOBASE("El salario base es:"),
    DESCUENTOPENSION("El descuento de pension es: "),
    DESCUENTOSALUD("El descuento de salud es:"),
    SALARIOFINAL1("El salario final 1 es:"),
    SALARIOFINAL2("El salario final 2 es:"),
    SALARIOAPAGAR("El salario a pagar es:"),
    OPCIONNOEXISTE("opcion no existe");



    private String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

}
