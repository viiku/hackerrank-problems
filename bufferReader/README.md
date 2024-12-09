### Buffer Reader class
The BufferedReader class of Java is used to read the stream of characters from the specified source (character-input stream). The constructor of this class accepts an InputStream object as a parameter

This class provides a method named read() and readLine() which reads and returns the character and next line from the source (respectively) and returns them.

Instantiate an InputStreamReader class bypassing your InputStream object as a parameter.
Then, create a BufferedReader, bypassing the above obtained InputStreamReader object as a parameter.
Now, read data from the current reader as String using the readLine() or read() method.
For Example: Suppose we want to read an integer from the user then the code will look like:

```
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 int toRead = Integer.parseInt(reader.readLine());
Another Example: Suppose we want to read a line (in form of a string) from the user then the code will look like:

 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 String toRead = reader.readLine();
References: Click Here
```

Task:

Their exist two lines of input each consist of single integer, read these two integers using BufferedReader Class and then print both of them on a single line in a space-separated manner.



Input Format
Input consist of two lines.

Both of the lines contains a single integer.



Output Format
Print both of the integers on a single line in a space-separated manner.



Example Input
Input 1:

 12
 1
Input 2:

 12
 110