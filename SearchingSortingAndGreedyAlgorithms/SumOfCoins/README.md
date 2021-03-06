# Sum of Coins
* Write a program, which gathers a sum of money, using the least possible number of coins. This is the range of possible coin values:
  • { 1, 2, 5, 10, 20, 50 }
  You will receive the desired sum. The goal is to reach the sum using as few coins as possible using a greedy approach. We’ll assume that each coin value and the desired sum are integers. There is a skeleton, which you can download from Judge. Use the Main class in the skeleton.

``` 
Examples
    Input
        Coins: 1, 2, 5, 10, 20, 50
        Sum: 923
    Output
        Number of coins to take: 21
        18 coin(s) with value 50
        1 coin(s) with value 20
        1 coin(s) with value 2
        1 coin(s) with value 1
    Comments
        18*50 + 1*20 + 1*2 + 1*1 = 900 + 20 + 2 + 1 = 923
    --------------------------------------
    Input
        Coins: 1
        Sum: 42
    Output
        Number of coins to take: 42
        42 coin(s) with value 1
    --------------------------------------
    Input
        Coins: 1, 2, 5
        Sum: 2031154123
    Output
        Number of coins to take: 406230826
        406230824 coin(s) with value 5
        1 coin(s) with value 2
        1 coin(s) with value 1
    Comments
        The solution should be fast enough to handle a combination of small coin values and a large desired sum
```

#### Greedy Approach
For this problem, a greedy algorithm will attempt to take the best possible coin value (which is the largest), then take the next largest coin value, and so on, until the sum is reached or there are no coin values left. There may be a different amount of coins to take for each value. In one of the examples above, we had a very large desired sum and relatively small coin values, which means we’ll need to take a lot of coins. It would not be efficient (and may even cause an Exception) if we return the result as a List<Integer>. А more practical way to do it is to use a
Map<Integer, Integer>, where the keys are the coin values and the values are the number of coins to take for the specified coin value. Therefore, in the second example (coin values = { 1 }, sum = 42), instead of returning a list with 42 elements in it, we’ll return a dictionary with a single key-value pair: 1 => 42.

#### Greedy Algorithm Implementation
You are given an implemented main() method with sample data. Your task is to implement the chooseCoins() method:

Since at each step we’ll try to take the largest value we haven’t yet tried, it would simplify our work to order the coin values so we can iterate them in descending order:

Now, taking the largest coin value at each step is simply a matter of iterating the list. We’ll need several variables:
• A resulting map
• An index variable
• A variable for the current sum
Since it’s possible to finish the algorithm without reaching the desired sum, we’ll keep track of the current amount taken in a separate variable (when we’re done, we’ll check it against the desired sum to see if we
got a solution or not).

Having these variables, when do we stop taking coins? There are two possibilities:
• We have reached the desired sum
• We ran out of coin values
We can put these two conditions in a while loop like this:

Inside the body of the while loop, we need to decide how many coins to take of the current value. We take the current value from the list. We have its index:

So far, we’ve accumulated some amount in the currentSum variable, the difference between targetSum and currentSum will give us the remaining sum we need to obtain:

So, how many coins do we take? Using integer division, we can just divide remainingSum over the current coin value to find out:

All we have to do now is put this information in the resulting dictionary as a key-value pair (only if we can take coins with this value), then increment the current index to move on to the next coin value:

Finally, return the resulting map.