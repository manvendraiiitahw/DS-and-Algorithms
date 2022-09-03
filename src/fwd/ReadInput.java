package fwd;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadInput {

    public static void main(String[] args) {

        try {


            // Read input data from file
            String inputFileName = "KsnMovementKsnReq.txt";
            // String inputFileName="costChangeKsnReq.txt"

            File inputfile = new File("src/fwd/" + inputFileName);
            Scanner reader = new Scanner(inputfile);
            String outputFileName = "Output_" + inputFileName;
            File outputFile = new File("src/fwd/" + outputFileName);
            if(outputFile.createNewFile()) {
                System.out.println("file created successfully");
            }
            else {
                System.out.println("File already exists");
            }

            FileWriter writer = new FileWriter(outputFile);
            PrintWriter pw= new PrintWriter(writer);
            while (reader.hasNextLine()) {
                String input = reader.nextLine();
                  writer.write(convertInput(input));
                  writer.write("\r\n");
            }
            reader.close();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String convertInput(String input) {
        // String input = "999990020704030000YNNYN 00000YN051";
        InputSchema schema = new InputSchema();
        schema.setStoreNbr(Integer.parseInt(input.substring(0, 5)));
        schema.setKsnNbr(Integer.parseInt(input.substring(5, 14)));
        schema.setFiller1(Integer.parseInt(input.substring(14, 18)));
        schema.setKsnInd(input.charAt(18));
        schema.setAssrtInd(input.charAt(19));
        schema.setSpecInstrInd(input.charAt(20));
        schema.setGtinInd(input.charAt(21));
        schema.setSlsLnkInd(input.charAt(22));
        // schema.setFiller2(input.charAt(index));
        schema.setDcOverhead(Integer.parseInt(input.substring(28, 33)));
        schema.setAuthStores(input.charAt(33));
        schema.setRequiredInd(input.charAt(34));
        schema.setSource(Integer.parseInt(input.substring(35, 38)));

        System.out.println(schema.toString());
        return schema.toString();

    }

}
