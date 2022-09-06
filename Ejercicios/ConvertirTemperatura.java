package EcuacionCuadratica;

public class ConvertirTemperatura {
    public double C;
    public double F;
    public double K;
    public double R;

    public void establecerC(double numC){
        C=numC;
    }
    public double obtenerC(){
        return C;
    }

    public double calcular(){
        F=(9/5)*C+32;
        K=C+273;
        R=(9/5)*C+492;

        System.out.println(obtenerC()+"° celsius = " + F + "° farenheit");
        System.out.println(obtenerC()+"° celsius = " + K + "° kelvin");
        System.out.println(obtenerC()+"° celsius = " + R + "° rankine");

        return 0;
    }

}
