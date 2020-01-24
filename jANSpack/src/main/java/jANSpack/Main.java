/*
 *   _          _   _  _____                  _    
 *  (_)   /\   | \ | |/ ____|                | |   
 *   _   /  \  |  \| | (___  _ __   __ _  ___| | __
 *  | | / /\ \ | . ` |\___ \| '_ \ / _` |/ __| |/ /
 *  | |/ ____ \| |\  |____) | |_) | (_| | (__|   < 
 *  | /_/    \_\_| \_|_____/| .__/ \__,_|\___|_|\_\
 * _/ |                     | |                    
 *|__/   
 *            https://github.com/zeeket/jANSpack
 *                         GPLv3
 */

package jANSpack;

import java.io.*;

public class Main {
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private static boolean verbose=false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String inputFilePath = args[0];
            String outputFilePath = inputFilePath;
            if(inputFilePath.lastIndexOf(".")!=-1){
            outputFilePath = inputFilePath.substring(0, inputFilePath.lastIndexOf("."));
            }
            outputFilePath = outputFilePath.concat(".ansp");
            if(args.length==2){
                if ("v".equals(args[2])||"verbose".equals(args[2])){
                    verbose=true;
                } else {
                    outputFilePath = args[1];
                }
            } else if(args.length==3){
                if ("v".equals(args[3])||"verbose".equals(args[3])) verbose=true;
            } else {
                System.out.println("No destination file specified, defaulting to filename from source file");
            }
            InputStream input = new FileInputStream(inputFilePath);
            int inputSize = input.available();
            if (inputSize > MAX_ARRAY_SIZE){
            throw new InputFileTooBigException();
            }
            DataInputStream reader = new DataInputStream(input);
            byte[] inputByteArray = new byte[inputSize];
            input.read(inputByteArray);
            RANS algo = new RANS(inputByteArray,verbose);
            Pack compressed = algo.getPack();
            if(verbose) System.out.println("Finished compression algo");
            FileOutputStream compressedFileOutputStream = new FileOutputStream(outputFilePath);
            ObjectOutputStream packOutputStream = new ObjectOutputStream(compressedFileOutputStream);
            if(verbose) System.out.println("Writing packed file to output stream going to "+outputFilePath);
            packOutputStream.writeObject(compressed);
            if(verbose) System.out.println("Finishing up");
            packOutputStream.flush();
            packOutputStream.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            if (args.length < 1) {
                System.out.println("No source file specified\nUSAGE (* indicates optional):\njava [ options ] -jar jANSpack.jar [source path] [*output archive path] [*verbose]");
            }
        } catch (IOException e) {
         System.out.println("IO Exception occurred.");
         e.printStackTrace();
        } catch (InputFileTooBigException e) {
            System.out.println("Your file was ");
        } catch (Exception e) {
            
        } finally {
            

        }
    }

}
