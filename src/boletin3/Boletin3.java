package boletin3;

public class Boletin3 {

    public static void main(String[] args) {
       Consumo obxCons1 = new Consumo(80f, 10f, 120f, 1.57f);
       System.out.println("El tiempo empleado es de: " + obxCons1.tempo() + " horas");
       Consumo obxCons2 = new Consumo();
       System.out.println("El consumo medio de gasolina es de: " + obxCons2.consumoMedio() + " litros por cada 100km");
       System.out.println("El consumo en euros del viaje fue de: " + obxCons2.consumoEuros() + "€");
       System.out.println("La velocidad media del viaje fue de: " + obxCons2.getvMed() + "km/h");
    }
    
}
