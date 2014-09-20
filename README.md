My-code
=======
Agenda
Write an agenda system that takes as input a group of start and end date pairs (format YYYY/MM/DD). 
Create a function that, passed in a date with the same format, queries the system to determine if the date falls either inside
or outside any of the provided start/end pairs, and returns true or false.

Use this data as input for the array:
start	end
2018/02/02	2019/01/01
2017/02/02	2018/01/01
2014/01/01	2015/01/01
2015/02/02	2016/01/01
2016/02/02	2017/01/01

Use this data to test the method.
input	result
2014/05/05	true
2013/01/01	false
2012/01/01	false
2016/05/05	true
2015/01/01	true
2015/01/02	false

Additional instructions
•	Create a simple console app.
•	Use clean code.
    o	One method one thing.
    o	Correct indentation.
    •	Javadoc comments.
•	Use JUnit.

Version one
•	Create a class named AgendaOnArray.
•	Use a two dimensions array to hold and query the start - end pairs.


