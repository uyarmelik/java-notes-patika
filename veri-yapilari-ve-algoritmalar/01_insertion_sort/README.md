# [Insertion Sort Projesi](https://app.patika.dev/courses/veri-yapilari-ve-algoritmalar/insertion-sort-proje)

[22,27,16,2,18,6] -> Insertion Sort  

1. Yukarıda verilen dizinin sort türüne göre aşamalarını yazınız.  
2. Big-O gösterimini yazınız.  
3. Time complexity yazınız.  
4. Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.  
5. [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.  

## Cevap-1:

[22,27,16,2,18,6] -> [<b>2</b>,27,16,<b>22</b>,18,6] -> [2,<b>6</b>,16,22,18,<b>27</b>] -> [2,6,<b>16</b>,22,18,27] -> [2,6,16,<b>18</b>,<b>22</b>,27] -> [2,6,16,18,<b>22</b>,27]

## Cevap-2: 

O(n²) -> O(6²) -> O(36)

## Cevap-3:

<b>Average Case:</b> Aradığımız sayının ortada olması  
<b>Worst Case:</b> Aradığımız sayının sonda olması  
<b>Best Case:</b> Aradığımız sayının dizinin en başında olması  

## Cevap-4:

Averge Case

## Cevap-5:

[7,3,5,8,2,9,4,15,6] -> [<b>2</b>,3,5,8,<b>7</b>,9,4,15,6] -> [2,<b>3</b>,5,8,7,9,4,15,6] -> [2,3,<b>4</b>,8,7,9,<b>5</b>,15,6] -> [2,3,4,<b>5</b>,7,9,<b>8</b>,15,6]