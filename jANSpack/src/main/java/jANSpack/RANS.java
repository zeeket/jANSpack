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
        for(int i=0;i<inputByteArray.length;i++){
            int state = i;
                    if(verbose){
                        System.out.print("Reading byte "+i+ " of "+inputByteArray.length+" which is ");
                        System.out.print((char) inputByteArray[i]+"\n");
                        System.out.println("key is "+key);
                        
                    }
                    int accumulator= inputByteArray[i] + 128;
                    CFAResult[accumulator]++;
                    
                    
        }
        if(verbose){
        System.out.println("");
        }
        decodingTable = new int[10];
        
    }
    
    public Pack getPack(){
        return new Pack(12345,decodingTable);
    }
    
}
