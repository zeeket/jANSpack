How the encoding table is generated:

probability of each symbol should be rational and have the same denominator
the encoding table has periodicity. The first pediod contains exactly as many cells as the value of the denominator.
The algorithm fills the table for the first pediod, and all subsequent cells are just iterations of the first period.

Example: given an alphabet of size 2 (a & b) with "a" having a probability of 8/10 and "b" having a probability of 2/10, the first PERIOD of the encoding table is as follows:

| state | A  | B |
|-------|----|---|
| 0     | 1  | 2 |
| 1     | 3  | 4 |
| 2     | 5  |   |
| 3     | 6  |   |
| 4     | 7  |   |
| 5     | 8  |   |
| 6     | 9  |   |
| 7     | 10 |   |

so far I have the probability for each letter in the alphabet expressed as a fraction of (how many times it was seen in the file) / (how many letters in the file)
now I need to reduce these fraction to the lowest common denominator (LCD).

then I will further optimize the compression by having the numbers in each cell of the encoding table correspond to the ratio of probabilities for each column so that the previous encoding table PERIOD would look like this:

| state | A  | B |
|-------|----|---|
| 0     | 1  | 4 |
| 1     | 2  | 8 |
| 2     | 3  |   |
| 3     | 5  |   |
| 4     | 6  |   |
| 5     | 7  |   |
| 6     | 9  |   |
| 7     | 10 |   |

because 8/10 = 0.8 and 2/10 = 0.2 and 0.8/0.2 = 4
so the number in column A should be 1/4 of the number on the same row of column B

Then I will be able to build the encoding table correctly.
