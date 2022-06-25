# Word Cruncher
* Write a program that receives some strings and forms another string that is required. In the first line, you will be given all of the strings separated by a comma and space. On the next line, you will be given the string that needs to be formed from the given strings. For more clarification see the examples below.
* Input
  - On the first line you will receive the strings (separated by comma and space ", ")
  - On the next line you will receive the target string
* Output
  - Print each of them found ways to form the required string as shown in the examples
* Constrains
  - There might be repeating elements in the input

``` 
Examples
    Input
        text, me, so, do, m, ran
        somerandomtext
    Output
        so me ran do m text    
    --------------------------------
    Input
        this, th, is, Word, cruncher, cr, h, unch, c, r, un, ch, er
        Wordcruncher
    Output
        Word c r un ch er
        Word c r unch er
        Word cr un c h er
        Word cr un ch er
        Word cr unch er
        Word cruncher
    
```
