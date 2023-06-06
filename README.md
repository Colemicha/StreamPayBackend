# StreamPayBackend
The decodeInteger function reverses the encoding process by performing a bitwise AND operation to remove the extra bits added during encoding.
The decodeArray function takes the encoded array, the original array (which will be filled with the recovered values), and the size of the array (n). 
It iterates over each element of the encoded array and uses decodeInteger to recover the original value, which is then stored in the corresponding position in the original array.

Regarding the classification of the algorithm used in terms of Big O, the time complexity of both encoding and decoding functions is O(n), where n is the size of the array. This is because the functions iterate over each element of the array once. Therefore, the overall time complexity for recovering the original arrays is also O(n).
