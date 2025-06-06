public class FizzBuzz {
    
    public static void main(String[] args) {
        // FizzBuzz
        // Imprime los números del 1 al 100, pero por cada múltiplo de 3 imprime "Fizz", por cada múltiplo de 5 imprime "Buzz" y por cada múltiplo de 3 y 5 imprime "Fizz
        int numeros;

        for (numeros = 1;numeros <= 100; numeros++){
            if (numeros % 3 == 0 && numeros % 5 == 0){
                System.out.println("FizzBuzz");
            }            
            else if (numeros % 3 == 0){
                System.out.println("Fizz");
            }
            else if (numeros % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(numeros + " ");
            }
        }
    }
}