package UTS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Trapesium {
    public static void main(String[] args) {
        String namafile = "E:\\PEMOGRAMAN LANJUT\\PL\\src\\UTS\\trapezoid.csv";

        List <Luas> ff = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(namafile));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null ){
                String [] row = line.split(",");
                Luas tra = new Luas();
                tra.Sisi1 = Double.parseDouble(row[0]);
                tra.Sisi2 = Double.parseDouble(row[1]);
                tra.Tinggi = Double.parseDouble(row[2]);
                
                ff.add(tra);

            }
            } catch (IOException e){
            System.err.println(e.getMessage());
        }
        for ( Luas vc : ff){
            double Luas = vc.Hitungluas();
            System.out.println("LUAS TRAPESIUM : " + Luas);
            if (Luas > 5000){
                System.out.println("LEBIH  : " + Luas);
            }
        }
        }
}
