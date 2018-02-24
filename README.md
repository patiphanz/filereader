# FileReader
by Patiphan Srisook

I ran the tasks on Macbook Pro with 2.7 GHz core i5, and got these results:

| Task | Time |
|:-----|-----:|
|Append 52539 chars to String | 1.274831 sec. |
|Append 52539 chars to StringBuilder | 0.007584 sec. |
|Append 52539 chars to StringBufferedReader | 0.036906 sec. |

## Explanation of Results

 - Append to String is the slowest task because every appending, it create new String.
 
 - Append to String by String Builder is the fastest task because it overwrite the old string and then return it.
 
 - Append to String by using BufferedReader is not fast or slow because it just read the file not create a new string.
