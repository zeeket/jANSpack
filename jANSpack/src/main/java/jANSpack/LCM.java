package jANSpack;

//find the lowest common multiple given probabilities for each letter of alphabet
public class LCM {
    public static int lowestCommonMultiple(int[] probabilitiesArray) 
    { 
        int divisor = 2; 
        int lowestCommonMultiple = 1; 

        while (true) { 
            int y = 0; 
            boolean divisible = false; 
            for (int i = 0; i < probabilitiesArray.length; i++) { 
                if (probabilitiesArray[i] == 0) { 
                    System.out.println("something went wrong");
                    return 0; 
                } 
                if (probabilitiesArray[i] == 1) { 
                    y++; 
                }
                if (probabilitiesArray[i] % divisor == 0) { 
                    probabilitiesArray[i] = probabilitiesArray[i] / divisor;
                    divisible = true; 
                } 
            } 
            if (divisible) { 
                lowestCommonMultiple = divisor * lowestCommonMultiple; 
            } else { 
                divisor++; 
            } 
            if (y == probabilitiesArray.length) { 
                //done
                return lowestCommonMultiple; 
            } 
        } 
    }
}
