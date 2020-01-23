package jANSpack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i
 */
public class InputFileTooBigException extends Exception {

    /**
     * Creates a new instance of <code>InputFileTooBigException</code> without
     * detail message.
     */
    public InputFileTooBigException() {
        System.out.println("The file provided was too big to compress");
    }

    /**
     * Constructs an instance of <code>InputFileTooBigException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InputFileTooBigException(String msg) {
        super(msg);
    }
}
