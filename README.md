# Number-of-Rectangles-in-a-Circle
To determine the number of rectangles with integral lengths and widths that can be inscribed within a circular sheet of radius 
𝑟
r, we need to consider the following approach:

Problem Statement
Given a circular sheet of radius 
𝑟
r, find the total number of rectangles with integral length and width that can be cut from the sheet, one at a time, such that each rectangle fits entirely within the circle.

Solution Approach
Understanding Rectangle Fit:

For a rectangle with length 
𝑙
l and width 
𝑤
w, the diagonal of the rectangle must be less than or equal to the diameter of the circle, which is 
2
𝑟
2r.
The condition to check for rectangle fit is:
𝑙
2
+
𝑤
2
≤
2
𝑟
l 
2
 +w 
2
 
​
 ≤2r
Iterate Over Possible Lengths and Widths:

We will iterate over all possible integer values for 
𝑙
l and 
𝑤
w starting from 1 up to the diameter of the circle 
2
𝑟
2r.
For each pair 
(
𝑙
,
𝑤
)
(l,w), if the rectangle fits within the circle, we count it.
Java Implementation:

Below is the Java code to calculate the total number of rectangles that can be inscribed within a circle of radius 
𝑟
