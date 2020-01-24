/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jANSpack;

import java.io.IOException;

/**
 *
 * @author i
 */
public class Pack implements java.io.Serializable {
     public String filename;
     public long key;
     public int[] table;
    public Pack (long key, int[] table) {
       
    }
}
