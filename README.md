# Java_database_Connection

This is a Simple repository that connect to the Database named movies

The Demo.java File Creates the table Movies.
Movies:
+--------------+--------------+------+-----+---------+----------------+
| Field        | Type         | Null | Key | Default | Extra          |
+--------------+--------------+------+-----+---------+----------------+
| film_id      | int          | NO   | PRI | NULL    | auto_increment |
| name         | varchar(200) | YES  |     | NULL    |                |
| actor        | varchar(200) | YES  |     | NULL    |                |
| actress      | varchar(200) | YES  |     | NULL    |                |
| director     | varchar(20)  | YES  |     | NULL    |                |
| release_year | int          | YES  |     | NULL    |                |
+--------------+--------------+------+-----+---------+----------------+
6 rows in set (0.01 sec)


The Insert_data.java file inserts the data into the Table.

The Query.java File Displays the all the contents of the table using the query:
SELECT * FROM MOVIES;
+---------+----------------------+-----------------+-----------------+--------------+--------------+
| film_id | name                 | actor           | actress         | director     | release_year |
+---------+----------------------+-----------------+-----------------+--------------+--------------+
|       1 | IRON MAN 1           | RDJ             | PEPPER          | JOHN FEAVRU  |         2008 |
|       2 | IRON MAN 2           | RDJ             | PEPPER          | JOHN FEAVRU  |         2008 |
|       3 | THOR                 | CHRIS HEMSWORTH | NATALIE PORTMAN | KENNETH      |         2011 |
|       4 | SPIDERMAN HOMECOMING | TOM HOLLAND     | ZENDEYA         | JON WATTS    |         2017 |
|       5 | BLACK PANTHER        | CHADWIK BOSEMAN | NAKIA           | RYAN COOGLER |         2018 |
+---------+----------------------+-----------------+-----------------+--------------+--------------+
5 rows in set (0.00 sec)

The specific_query.java File querys the movie details using a SELECT statement with 
parameter like actor name to select movies based on the actor's name.

 SELECT name FROM movies WHERE Actor='RDJ';
+------------+
| name       |
+------------+
| IRON MAN 1 |
| IRON MAN 2 |
+------------+
2 rows in set (0.00 sec)


 SELECT name FROM movies WHERE release_year>2015;
+----------------------+
| name                 |
+----------------------+
| SPIDERMAN HOMECOMING |
| BLACK PANTHER        |
+----------------------+
2 rows in set (0.00 sec)
