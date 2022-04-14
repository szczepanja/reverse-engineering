import org.apache.spark.sql.SparkSession

object ReverseEngineering extends App {

  val spark = SparkSession
    .builder()
    .master("local[*]")
    .appName("MostImportantRows")
    .config("spark.some.config.option", "some-value")
    .getOrCreate()

  import spark.implicits._
  import org.apache.spark.sql.functions._

}