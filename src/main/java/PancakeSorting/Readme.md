<h1>Pancake Sorting</h1>

<b>A pancake number is the minimum number of flips required for a given number of pancakes</b>

<br><br>
Given set of pancakes with different height. Sort the pancakes by height using only FLIP operation.<br>
FLIP allow to reverse the pancake array from 0th index to target index.


<br><br><b>Solution</b><br>
<ul>
<li>For each index from N to 0
<li>Find max. index from 0 to curr index
<li>Flip pancake array (0 to max. index) flip.  This gets max. index value at 0th index
<li>Flip pancake array (0th to curr index) flip. This get 0th index to curr index (end of line)
</ul>