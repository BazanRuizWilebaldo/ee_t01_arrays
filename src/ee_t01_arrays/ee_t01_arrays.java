
import java.io.*;
import java.util.*;
import java.util.Collections;

public class ee_t01_arrays {

    public static void main(String[] args) {
        String arch = "numeros/numerosl.txt";
        String num;

        String nums[];
        Integer[] ve = new Integer[7];
        File Archivo;
        FileReader lector;

        Scanner s = new Scanner(System.in);
        try {
            Archivo = new File(arch);
            lector = new FileReader(Archivo);

            s = new Scanner(lector);

            while (s.hasNextLine()) {
                int n;
                num = s.nextLine();
                nums = num.split(",");

                for (int h = 0; h < nums.length; h++) {
                    ve[h] = Integer.parseInt(nums[h]);
                }

                Arrays.sort(ve, Collections.reverseOrder());
                for (int x : ve) {
                    System.out.println(x);
                }

            }
            s.close();

        } catch (FileNotFoundException e) {
            System.out.println("no se ha econtrado el archivo");

        }

    }

}

