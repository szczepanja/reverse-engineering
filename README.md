# Reverse-engineering Dataset.show Output

Write a structured query that loads a text file that contains the output of Dataset.show operator (aka reverse-engineer
the show output).

There are two approaches to solve the problem with different levels of complexity. You should work it out in reverse
order of complexity. Sorry, no free lunches 😎

    (hard) Use text data source
    (intermediate) Use csv data source

Module: Spark SQL

Duration: 30 mins Input Dataset

    +---+------------------+-----+
    | id|             Text1|Text2|
    +---+------------------+-----+
    |  1|     one,two,three|  one|
    |  2|     four,one,five|  six|
    |  3|seven,nine,one,two|eight|
    |  4|    two,three,five| five|
    |  5|      six,five,one|seven|
    +---+------------------+-----+

Result

    +---+------------------+-----+
    | id|             Text1|Text2|
    +---+------------------+-----+
    |  1|     one,two,three|  one|
    |  2|     four,one,five|  six|
    |  3|seven,nine,one,two|eight|
    |  4|    two,three,five| five|
    |  5|      six,five,one|seven|
    +---+------------------+-----+

Protips

    +s are comments
    |s are separators
    A CSV file with +s as comments and |s as separators
    CSVFileFormat
