# Project specification

## What data structures and algorithms will you be using?

I will be using the asymmetric numeral systems- method to compress files.

##What problem are you solving and why did you chose these specific data structures and algorithms

I am solving the problem of compressing data to hopefully allow it to take up less space in computer memory or transmit data with a smaller amount of bits.

##What is the program input and how will it be used

The program input is a file on the user's system. The program outputs a compressed packed file.

##Expected time and space complexities of the program (big-O notations)

ANS is a lossless compression algorithm. The input for this program is a list of bytes from a file from Java's datastream. Its output is a sequence of bytes written in a compressed file. Each byte S has a fixed known probability P<sub>S</sub> of occurring in the list. The algorithm tries to assign each list a unique sequence of bytes as an identifier so that the more probable lists get a smaller identifier.
The integer variable x represents a state in I, which is initialized to l in the encoder but can be initialized to any integer in I. C(s, x) is a state transition function defined by C(s, x)=m⌊xms⌋+bs+mod(x, ms),where bs=s−1∑i=0mi for s∈A.

* Encoding

iterative/recursive algorithm:

    Start with the bytes 0x00;
    If the current byte value is n, and the incoming byte corresponds to a byte s, update the bytes to be s+n⋅B.



* Decoding

corecursive algorithm


    Start with the number that we are decoding;
    Split the current number n into the quotient and remainder modulo B;
    Emit the remainder and continue decoding the quotient;
    Stop when the current number reaches 1.




Each byte has a fixed known probability in a file

##Sources
