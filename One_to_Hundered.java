public class One_to_Hundered {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are");
        for(int n=2;n<=100;n++){
            boolean isPrime=true;
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(n);
            }
        }
    }
}

