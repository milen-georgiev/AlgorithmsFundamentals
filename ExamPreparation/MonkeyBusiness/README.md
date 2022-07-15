# Monkey Business
* So nothing to do right? But how is that even possible. No matter what there is always something to be done and you never get bored doing the Monkey Business.
  You have found a number N and now you want to see in how many ways you can combine the numbers from 1 to N in such a way that by using addition or subtraction you will end up with zero as a result. Find the possible expressions print them on the console each on a new line then followed by the total number of solutions in the following format:

* Total Solutions: {possibleSolutions}
  1. Input
     • The input will come from the console on single line.
  2. Output
     • The output is each expression on a new line followed by the total solutions see the examples below.
  3. Constraints
     • The input will only be a single positive integer.
     • The input will be in the range [1…25]
``` 
Examples

Input
4
Output
+1 -2 -3 +4 
-1 +2 +3 -4 
Total Solutions: 2

--------------------------------
Input
8
Output
+1 +2 +3 +4 -5 -6 -7 +8 
+1 +2 +3 -4 +5 -6 +7 -8 
+1 +2 -3 +4 +5 +6 -7 -8 
+1 +2 -3 -4 -5 -6 +7 +8 
+1 -2 +3 -4 -5 +6 -7 +8 
+1 -2 -3 +4 +5 -6 -7 +8 
+1 -2 -3 +4 -5 +6 +7 -8 
-1 +2 +3 -4 +5 -6 -7 +8 
-1 +2 +3 -4 -5 +6 +7 -8 
-1 +2 -3 +4 +5 -6 +7 -8 
-1 -2 +3 +4 +5 +6 -7 -8 
-1 -2 +3 -4 -5 -6 +7 +8 
-1 -2 -3 +4 -5 +6 -7 +8 
-1 -2 -3 -4 +5 +6 +7 -8 
Total Solutions: 14
    
```
