package jANSpack;

/*
 *  Some VMs reserve some header words in an array.Attempts to allocate larger arrays may result in
 OutOfMemoryError: Requested array size exceeds VM limit
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
