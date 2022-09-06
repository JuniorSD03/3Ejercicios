package EcuacionCuadratica;

public class ConvertirEnBase {
    public int n;
    public int base;
    public int inv;

    public void establecerN(int numN){
        n=numN;
    }
    public int obternerN(){
        return n;
    }
    public void establecerBase(int numBase){
        base=numBase;
    }
    public int obternerBase(){
        return base;
    }

    public int resolver(){
        inv=0;
        while (n>0){
            inv=((10*inv)+(n%base));
            n=n/base;
        }
        while (inv>0) {
            n = (10 * n) + (inv%10);
            inv = inv / 10;
        }
        return n;
    }
}
