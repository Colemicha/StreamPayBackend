# StreamPayBackend
The decodeInteger function reverses the encoding process by performing a bitwise AND operation to remove the extra bits added during encoding.
The decodeArray function takes the encoded array, the original array (which will be filled with the recovered values), and the size of the array (n). 
It iterates over each element of the encoded array and uses decodeInteger to recover the original value, which is then stored in the corresponding position in the original array.
