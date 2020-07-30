
public class MegaBytesConverter {


    public static void main(String[] args) {



        printMegaBytesAndKiloBytes(8000);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){


        if (kiloBytes < 0){
            System.out.println("Invalid Value");

        }
        else {
            double megaBytes = kiloBytes / 1024;
            double megaBytesRemainder = kiloBytes % 1024;
            System.out.println("XX = " + kiloBytes + " YY = " + megaBytes + " ZZ = " + megaBytesRemainder);
        }






    }
}
