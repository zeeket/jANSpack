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
        
        for(int i=0;i<inputByteArray.length;i++){
                    if(verbose){
                        System.out.print((char) inputByteArray[i]);
        }
                    
        }

        decodingTable = new int[10];
        
    }
    
    public Pack getPack(){
        return new Pack(12345,decodingTable);
    }
    
}
