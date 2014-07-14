val shapelessContribSequenceURL =
"https://raw.githubusercontent.com/typelevel/shapeless-contrib/2f574073e/scalaz/main/scala/sequence.scala"

val shapelessContribSequence = SettingKey[List[String]]("shapelessContribSequence")

shapelessContribSequence := {
  println(s"download from $shapelessContribSequenceURL")
  IO.readLinesURL(url(shapelessContribSequenceURL))
}

sourceGenerators in Compile += task{Seq({
  val file = (sourceManaged in Compile).value / "sequence.scala"
  IO.writeLines(file, shapelessContribSequence.value)
  file
})}
