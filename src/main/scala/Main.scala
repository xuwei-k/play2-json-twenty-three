import play.api.libs.json.Json

object Main extends App {

  val result1 = Json.parse("{}").validate[Foo]

  println(result1)
  assert(result1.isError)

  val result2 = Json.parse("""{
    "_1"  : 1,
    "_2"  : 2,
    "_3"  : 3,
    "_4"  : 4,
    "_5"  : 5,
    "_6"  : 6,
    "_7"  : 7,
    "_8"  : 8,
    "_9"  : 9,
    "_10" : 10,
    "_11" : 11,
    "_12" : 12,
    "_13" : 13,
    "_14" : 14,
    "_15" : 15,
    "_16" : 16,
    "_17" : 17,
    "_18" : 18,
    "_19" : 19,
    "_20" : 20,
    "_21" : 21,
    "_22" : 22,
    "_23" : 23,
    "_24" : 24,
    "_25" : 25
  }""").validate[Foo]

  println(result2)
  assert(result2.isSuccess)

}

