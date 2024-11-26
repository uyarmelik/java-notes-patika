# [Insertion Sort Project](https://app.patika.dev/courses/veri-yapilari-ve-algoritmalar/insertion-sort-proje)

[22,27,16,2,18,6] -> Insertion Sort

1. Write the stages of the given array according to the sorting algorithm.
2. Write the Big-O notation.
3. Write the time complexity.
4. After the array is sorted, which case does the number 18 fall under? Write it down.
5. Write the first 4 steps of Insertion Sort for the array [7,3,5,8,2,9,4,15,6].

## Answer 1
[22,27,16,2,18,6] -> [<b>2</b>,27,16,<b>22</b>,18,6] -> [2,<b>6</b>,16,22,18,<b>27</b>] -> [2,6,<b>16</b>,22,18,27] -> [2,6,16,<b>18</b>,<b>22</b>,27] -> [2,6,16,18,<b>22</b>,27]

## Answer 2
O(n²) -> O(6²) -> O(36)

## Answer 3
<b>Average Case:</b> The searched number is in the middle
<b>Worst Case:</b> The searched number is at the end
<b>Best Case:</b> The searched number is at the beginning of the array

## Answern 4
Average Case

## Answer 5
[7,3,5,8,2,9,4,15,6] -> [<b>2</b>,3,5,8,<b>7</b>,9,4,15,6] -> [2,<b>3</b>,5,8,7,9,4,15,6] -> [2,3,<b>4</b>,8,7,9,<b>5</b>,15,6] -> [2,3,4,<b>5</b>,7,9,<b>8</b>,15,6]