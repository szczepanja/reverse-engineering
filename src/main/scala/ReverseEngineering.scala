import org.apache.spark.sql.SparkSession

object ReverseEngineering extends App {

  val spark = SparkSession
    .builder()
    .master("local[*]")
    .appName("MostImportantRows")
    .config("spark.some.config.option", "some-value")
    .getOrCreate()

  def output(file: String) = {

    val readCSV = spark.read
      .option("header", value = true)
      .option("inferSchema", value = true)
      .option("delimiter", "|")
      .option("ignoreLeadingWhiteSpace", value = true)
      .option("comment", "+")
      .csv(file)

    readCSV.select(
      readCSV.columns
        .filterNot(f => f.startsWith("_c"))
        .map(a => readCSV(a)): _*
    )
  }

}