package EcuacionCuadratica;

public class EcuacionCuadratica {
    public double a;
    public double b;
    public double c;

    public void establecerA(double numA){
        a = numA;
    }
    public double obtenerA(){
        return a;
    }
    public void establecerB(double numB){
        b = numB;
    }
    public double obtenerB(){
        return b;
    }
    public void establecerC(double numC){
        c = numC;
    }
    public double obtenerC(){
        return c;
    }

    public double discriminante(){
        double expresion;
        expresion = Math.pow(obtenerB(),2)-(4*obtenerA()*obtenerC());

        return expresion;
    }

    public double solucion(){
        double respuesta1;

        if (discriminante() > 0){
            System.out.println("2 soluciones");
            double respuesta2;

            respuesta1=(-obtenerB()+Math.sqrt(discriminante()))/(2*obtenerA());
            respuesta2=(-obtenerB()-Math.sqrt(discriminante()))/(2*obtenerA());

            System.out.println("X = " + respuesta1);
            System.out.println("X = " + respuesta2);
        } else if (discriminante() == 0) {
            System.out.println("1 soluciones");

            respuesta1 =(-obtenerB())/(2*obtenerA());
            System.out.println("X = " + respuesta1);

        } else {
            System.out.println("Ninguna solucion");
        }
        return 0;
    }
}
