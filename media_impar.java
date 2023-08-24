public class media_impar {
    public static void main(String[] args) {
        int m = 0;
        int i;
        for(i=0;i<=100;i++){
            if(i%2!=0){
                m+=i;
                System.out.println("A média é: "+ m/50);
            }
        }
    }
}
