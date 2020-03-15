package empleado;

public class Descuentos extends Salario {

    public double calcularSalarioBase(){
        return (this.getHorasTrabajadas() * this.getValorHora());
    }

    public double impuesto(double porcentaje){

        return (calcularSalarioBase() * (porcentaje/100));
    }

    public double salarioFinal(double descuentos){
        return(calcularSalarioBase() - descuentos);
    }

    public double salarioFinal(double salud,double pension){
        return(calcularSalarioBase() - salud - pension);
    }

    public double salarioDefinitivo(double salud, double pension,double descuento){
        return (calcularSalarioBase() - salud - pension) - ((calcularSalarioBase() - salud - pension) * descuento/100);
    }

    public double salarioDefinitivo(double descuentos,  double aumento){
        return (calcularSalarioBase() - descuentos) + ((calcularSalarioBase() - descuentos) * (aumento/100));
    }
}
