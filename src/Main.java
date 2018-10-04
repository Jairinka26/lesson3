public class Main {
    public static void main(String[] args) {
        float kg=5000,C=25,K=15;
        convertKGtoT(kg);
        convertCtoF(C);
        convertKtoC(K);
    }
    private static void convertKGtoT(float newKG){
        float ton;
        ton=newKG/1000;
        System.out.println(newKG+" kg ="+ton+"tonn");
        convertTtoU(ton);
    }
    private static void convertTtoU(float newT){
        float un;
        un=newT*35274;
        System.out.println(newT+"tonn ="+un+"uncii");
    }
    private static void convertCtoF(float newC){
        float F;
        F=(newC*9/5)+32;
        System.out.println(newC+" C ="+F+" F");
    }
    private static void convertKtoC(float newK){
        float C;
        C=newK-273;
        System.out.println(newK+" K ="+C+" C");
    }
}
