package EcuacionCuadratica;

public class Main {
    public static void main(String[] args) {
        EcuacionCuadratica ecuacion = new EcuacionCuadratica();
        ConvertirEnBase convertBase = new ConvertirEnBase();
        ConvertirTemperatura convertTemp = new ConvertirTemperatura();

        ecuacion.establecerA(2);
        ecuacion.establecerB(4);
        ecuacion.establecerC(-6);
        System.out.println("ECUACIONES DE SEGUNDO GRADO COMPLETAS");
        System.out.println("Valor A: " + ecuacion.obtenerA());
        System.out.println("Valor B: " + ecuacion.obtenerB());
        System.out.println("Valor C: " + ecuacion.obtenerC() + "\n");
        System.out.println(ecuacion.solucion());

        convertBase.establecerN(194);
        convertBase.establecerBase(5);
        System.out.println("\nCONVERTIR NÚMERO DECIMAL A UNA BASE MENOR QUE 10");
        System.out.println("Número en base 10 a convertir: " + convertBase.obternerN());
        System.out.println("Base: " + convertBase.obternerBase());
        System.out.println(convertBase.resolver());

        convertTemp.establecerC(10);
        System.out.println("\nCONVERTIR DE CELSIUS A FARENHEIT, KELVIN Y RANKINE");
        System.out.println("Grados celsius a convertir: " + convertTemp.obtenerC());
        System.out.println(convertTemp.calcular());


    }
}
