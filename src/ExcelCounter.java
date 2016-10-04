import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by anthonylagrotta on 9/3/16.
 */
public class ExcelCounter {
    private static Scanner scan;

    public ExcelCounter(){

    }

    public int howMany(String terrainType){
        int counter=0;
        File read = new File ("CoolMonsters.csv");

       /* try {
            scan = new Scanner(read);

            String[] split;
            Monster b ;
            while (scan.hasNextLine()){

                split = scan.nextLine().split(",");

                b = new Monster(split[0], split[1],Integer.parseInt(split[2]));
                if(split[1].equals(terrainType)||split[1].equals("ANYWHERE")){
                    counter++;
                }
            }



        }
        catch  (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        return 1000;

    }
}
