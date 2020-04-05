# JavaProgram

#Java Program to calculate  how many different ways you can remove the balls from the bag. 
Example: n = 3, result = 3 --> 1 - 1 - 1, 1 - 2, 2 - 1

Example:
n = 5, result = 8
1 - 1 - 1 - 1 - 1
1 - 1 - 1 - 2
1 - 1 - 2 - 1
1 - 2 - 1 - 1
2 - 1 - 1 - 1
1 - 2 - 2
2 - 1 - 2
2 - 2 - 1
ways(n) = ways(n-1) + ways(n-2)
