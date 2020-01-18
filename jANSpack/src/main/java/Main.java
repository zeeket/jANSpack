/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            String one = args[0];
            String two = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (args.length < 1) {
                System.out.println("No source file specified");
            } else {
                System.out.println("No destination file specified, defaulting to filename from source file");
            }

        } catch (Exception e) {

        } finally {

        }
    }

}
