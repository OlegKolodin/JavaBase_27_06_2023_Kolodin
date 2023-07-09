package ua.hillel.kolodin.homeworks.homework2;

public class Main  {
    public static void main(String[] args) {
        // Variant 1
        float latitude =   48.858296F, longitude =  2.294479F;
        char specsumvol =  '\u00B0';
        System.out.println("Koordinate is: "+ latitude + specsumvol + " " + longitude + specsumvol);
        System.out.println("-----------------------------------------------------------------------");

        // Variant 2
        System.out.println("Variant 2");
        //48° 51′ 29.87″ N,            2° 17′ 40.12″ E
        // Coordinates possible to write like usual numbers (byte, float) and symbols (char)
        byte n = 48, e=2, n2=51,  e1=17;
        float n3 = 29.87F,  e2= 40.12F;
        char specSumvol2 = '\u00B0', specSumvol_N = '\u004E', specSumvol_E ='\u0045';

        System.out.print("Variant 2 whith coordinates is: "+ '\n' + n + specSumvol2 + " " + n2 + '\''+ n3 + '\"' + specSumvol_N + '\n');
        System.out.println(e+""+specSumvol2 + " " + e1 + '\'' +e2 + '\"' + specSumvol_E);
    }
}


