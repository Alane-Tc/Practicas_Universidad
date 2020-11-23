package tecmilenio.alantamez;

public class Numeros {
    public void Numeros_Primos(int numero){
        int[] array_numero =new int[numero];
        int posicion=0;
           System.out.println("Numeros Primos");
        for (int i=0; posicion<numero; i++) {
            int divisor = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) {
                array_numero[posicion]=i;
                posicion++;
            }
        }
        for (int a : array_numero) {
            System.out.print(a+ ",");
        }
    }
    public void Fibonacci(int serie){
        int  n1 = 0, n2=1 ,suma_numeros;
        System.out.println(" ");
        System.out.println("Sucesión de Fibonacci");
        for (int i=0; i<serie; i++){
            suma_numeros =n1+n2;
            n1=n2;
            n2=suma_numeros;
            System.out.print(suma_numeros+ ",");
        }
    }
}
