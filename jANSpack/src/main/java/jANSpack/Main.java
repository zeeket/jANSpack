package jANSpack;


import java.io.*;

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

public class Main {
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String inputFilePath = args[0];
            String destinationFilePath = args[1];
            InputStream input = new FileInputStream(inputFilePath);
            int inputSize = input.available();
            if (inputSize > MAX_ARRAY_SIZE){
            throw 
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            if (args.length < 1) {
                System.out.println("No source file specified");
            } else {
                System.out.println("No destination file specified, defaulting to filename from source file");
            }
        } catch (IOException e) {
            System.out.println("IO Exception occurred.");
         e.printStackTrace();
        } catch (Exception e) {
            
        } finally {
            

        }
    }

}
