# perceptron
A simple perceptron for determining the parity of a digit.

# How does it work?
Each digit corresponds to its own vector, which is compiled on the basis of the 3*5 table, where 0 is an unpainted square, and 1 is a shaded one.
After that, we multiply the values of the input vector by the vector of weights and sum them up. If the value is greater than 0, then 1 - even appears on the output neuron, if less than or equal to 0, then the output value is 0 - odd. 
Then we compare the output value with the reference value and if the network is wrong, then we change the weights, if not, we continue.
Example of the number 3:
__________
| 1| 1| 1|
| 0| 0| 1|
| 1| 1| 1|
| 0| 0| 1|
| 1| 1| 1|
----------

# The question is about coefficients and input data.
Problem: if we take data on an unfilled segment for 0, then regardless of the coefficient, it will not participate in the total amount, which means it will not be possible to highlight the importance. 
The solution is to convert the input data. Let's assume that in case of arrival of 0 it will be replaced by the value -1. Then the fact that the segment is NOT lit will have a negative impact on the total amount.

Coefficients
Let all coefficients be equal to 1. Then:
______________________________________
|Digit | 0| 1| 2| 3| 4| 5| 6| 7| 8| 9|
|------------------------------------|
|Amount| 5|-3| 3| 3| 1| 3| 5|-1| 7| 5|
--------------------------------------
The numbers 1, 4, 7, 8 are identified without problems.
The problem is that we can't distinguish those numbers whose sums are the same. 
For example, 0 has the same sum as 6 and 9 (they have the same number of lit segments = 6).
The solution is to change the weights (coefficients). Note that for zero, a distinctive feature, unlike 6 and 9, is the fact that the central cell is not lit. Accordingly, it is necessary to change its coefficient so that the sum of the vector for each number is different.
A new example of the number 3:
__________
| 1| 1| 1|
|-1|-1| 1|
| 1|-1| 1|
|-1|-1| 1|
| 1| 1| 1|
----------


The perceptron made by github.com/orhandemirel was taken as a basis
