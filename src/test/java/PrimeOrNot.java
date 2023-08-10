import org.testng.annotations.Test;

/*
* Check if the given number is Prime:
*
* */

public class PrimeOrNot {

    @Test
    public void checkPrime(){

        Integer n = 4;
        String prime = checkIntegerPrime(n);
        System.out.println(prime);
    }

    public String checkIntegerPrime(Integer n){


        for(int i=2;i<=n-1;i++){
            if(n%i == 0){
                return "The given number is not prime " +n;

            }
        }
        return "The given number is prime " +n;



    }
}


/*if(n==1){

            System.out.println("The given number is prime " +n);
            return "The given number is prime " +n;
        }else{
            if (n%2 != 0){

                return "The given number is a prime " +n;

            }
            else{
                return "The given number is not prime " +n;

            }
        }*/
