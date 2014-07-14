import play2scalaz.Play2Scalaz._
import shapeless.{Generic, HNil}
import play.api.libs.json._

final case class Foo(
  _1: Int,
  _2: Int,
  _3: Int,
  _4: Int,
  _5: Int,
  _6: Int,
  _7: Int,
  _8: Int,
  _9: Int,
  _10: Int,
  _11: Int,
  _12: Int,
  _13: Int,
  _14: Int,
  _15: Int,
  _16: Int,
  _17: Int,
  _18: Int,
  _19: Int,
  _20: Int,
  _21: Int,
  _22: Int,
  _23: Int,
  _24: Int,
  _25: Int
)

object Foo {
  import shapeless.contrib.scalaz._

  private[this] val s = new SequenceFunctions{}

  private[this] val hlist25reads =
    (__ \ "_1").read[Int] ::
    (__ \ "_2").read[Int] ::
    (__ \ "_3").read[Int] ::
    (__ \ "_4").read[Int] ::
    (__ \ "_5").read[Int] ::
    (__ \ "_6").read[Int] ::
    (__ \ "_7").read[Int] ::
    (__ \ "_8").read[Int] ::
    (__ \ "_9").read[Int] ::
    (__ \ "_10").read[Int] ::
    (__ \ "_11").read[Int] ::
    (__ \ "_12").read[Int] ::
    (__ \ "_13").read[Int] ::
    (__ \ "_14").read[Int] ::
    (__ \ "_15").read[Int] ::
    (__ \ "_16").read[Int] ::
    (__ \ "_17").read[Int] ::
    (__ \ "_18").read[Int] ::
    (__ \ "_19").read[Int] ::
    (__ \ "_20").read[Int] ::
    (__ \ "_21").read[Int] ::
    (__ \ "_22").read[Int] ::
    (__ \ "_23").read[Int] ::
    (__ \ "_24").read[Int] ::
    (__ \ "_25").read[Int] ::
    HNil

  implicit val reads: Reads[Foo] =
    s.sequence(hlist25reads).map(Generic[Foo].from)
}

