# Median of medians

Implementation of 3 diffirent approaches to get the median for an array and analysis the time for each of them

### median of medians algorithm

which will have an upper bound of O(n log n) in the worst case 
but in practice its not useful as it have a lot of over head

### random selection

select random element then make quick sort to put that element in its real position and check if it is the median
the algorithm has an upper bound of O(n^2) in the worst case ... but it is used in practice as in expected time
it will lead to nlog n

### sort and get median

this algorithm uses the sort in java then return the median of the array based on the array size
in worst case it is O(nlog n) if we use merge sort

### at conclusion

the best algorithm in practice was the random selection ... then sort and get median and median of medians


 
