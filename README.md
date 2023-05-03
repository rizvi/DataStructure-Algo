# DataStructure-Algo

#APRIORI Algorithm Output:

<pre>
Enter the minimum support (as an integer value):
1
Transaction Number: 1:
Item number 1 = 1
Item number 2 = 3
Item number 3 = 4
Transaction Number: 2:
Item number 1 = 2
Item number 2 = 3
Item number 3 = 5
Transaction Number: 3:
Item number 1 = 1
Item number 2 = 2
Item number 3 = 3
Item number 4 = 5
Transaction Number: 4:
Item number 1 = 2
Item number 2 = 5
-********** Level wise data **********-
[1] : 2
[2] : 3
[5] : 3
[3] : 3
[4] : 1
-********** Level wise data **********-
[2, 5] : 3
[1, 5] : 1
[3, 5] : 2
[1, 3] : 2
[3, 4] : 1
[1, 4] : 1
[2, 3] : 2
[1, 2] : 1
-********** Level wise data **********-
[2, 3, 5] : 2
[1, 2, 3] : 1
[1, 3, 4] : 1
[1, 3, 5] : 1
[1, 2, 5] : 1
-********** Level wise data **********-
[1, 2, 3, 5] : 1

=************ FINAL LIST *******************=
[1, 2, 3, 5] : 1

Process finished with exit code 0
================================================================================
Enter the minimum support (as an integer value):
2
Transaction Number: 1:
Item number 1 = 1
Item number 2 = 3
Item number 3 = 4
Transaction Number: 2:
Item number 1 = 2
Item number 2 = 3
Item number 3 = 5
Transaction Number: 3:
Item number 1 = 1
Item number 2 = 2
Item number 3 = 3
Item number 4 = 5
Transaction Number: 4:
Item number 1 = 2
Item number 2 = 5
-********** Level wise data **********-
[1] : 2
[2] : 3
[5] : 3
[3] : 3
-********** Level wise data **********-
[2, 5] : 3
[1, 3] : 2
[2, 3] : 2
[3, 5] : 2
-********** Level wise data **********-
[2, 3, 5] : 2

=************ FINAL LIST *******************=
[2, 3, 5] : 2

Process finished with exit code 0

========================================================================================================
Enter the minimum support (as an integer value):
3
Transaction Number: 1:
Item number 1 = 1
Item number 2 = 3
Item number 3 = 4
Transaction Number: 2:
Item number 1 = 2
Item number 2 = 3
Item number 3 = 5
Transaction Number: 3:
Item number 1 = 1
Item number 2 = 2
Item number 3 = 3
Item number 4 = 5
Transaction Number: 4:
Item number 1 = 2
Item number 2 = 5
-********** Level wise data **********-
[2] : 3
[5] : 3
[3] : 3
-********** Level wise data **********-
[2, 5] : 3

=************ FINAL LIST *******************=
[2, 5] : 3

Process finished with exit code 0

</pre>
