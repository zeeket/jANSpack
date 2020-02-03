package jANSpack;

import java.lang.Math;
import java.io.*;

public class RANS {

    /**
     * @param inputByteArray
     * @param verbose
     * @return
     */
    public int[] decodingTable;

    public RANS(byte[] inputByteArray, boolean verbose) {
        long key = 1;
        int[] CFAResult = new int[256];
        for (int i = 0; i < inputByteArray.length; i++) {

            if (verbose) {
                System.out.print("Reading byte " + i + " of " + inputByteArray.length + " which is ");
                System.out.print(inputByteArray[i] + 128 + "\n");
            }
            int accumulator = inputByteArray[i] + 128;
            CFAResult[accumulator]++;
            if (verbose) {
                System.out.println("So far we've read the byte called \"" + (inputByteArray[i] + 128) + "\" " + CFAResult[accumulator] + " times.");
            }
        }
        if (verbose) {
            System.out.println("=========\nCumulative frquency analysis complete\n==========");

            for (int i = 0; i < CFAResult.length; i++) {

                System.out.println("byte " + i + " was seen " + CFAResult[i] + " times.");

            }
        }
        decodingTable = new int[10];

    }

    public Pack getPack() {
        return new Pack(12345, decodingTable);
    }

}
