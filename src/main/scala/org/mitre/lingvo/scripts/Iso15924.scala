package org.mitre.lingvo.scripts

import enumeratum.values.{StringEnum, StringEnumEntry, StringPlayJsonValueEnum}

import scala.collection.immutable

/***
  * The interface which describes scripts according to the ISO 15924 standard.
  */
sealed trait Iso15924 extends StringEnumEntry {

  /***
    * The ISO code of the script. The property name `value` is required for JSON
    * serialization supported by EnumeratumPlay.
    *
    * When an Iso15924 object is JSON serialized, this property defines how the object
    * will be serialized.
    *
    * @return the four letter script code according to the standard.
    */
  def value: String
}

/***
  * The companion object which contains all the relevant enumerations of scripts.
  */
object Iso15924 extends StringEnum[Iso15924] with StringPlayJsonValueEnum[Iso15924] {

  /***
    * Attempts to get the script by its ISO 15924 code.
    *
    * @param code the ISO 15924 code of the object to be returned
    * @return the script whose value is equal to `name` if it exists.
    */
  def withName(code: String): Iso15924 =
    values.find(_.value == code)
      .getOrElse(throw new NoSuchElementException(s"Unknown script '$code'"))

  /***
    * The values this enum can assume. This is required to be part of the public API by Enumeratum.
    */
  val values: immutable.IndexedSeq[Iso15924] = findValues


  case object Arabic extends Iso15924 {
    final val value: String = "arab"
  }

  case object Armenian extends Iso15924 {
    final val value: String = "armn"
  }

  case object Balinese extends Iso15924 {
    final val value: String = "bali"
  }

  case object Bamum extends Iso15924 {
    final val value: String = "bamu"
  }

  case object Batak extends Iso15924 {
    final val value: String = "batk"
  }

  case object Bengali extends Iso15924 {
    final val value: String = "beng"
  }

  case object Bopomofo extends Iso15924 {
    final val value: String = "bopo"
  }

  case object Buginese extends Iso15924 {
    final val value: String = "bugi"
  }

  case object Buhid extends Iso15924 {
    final val value: String = "buhd"
  }

  case object Chakma extends Iso15924 {
    final val value: String = "cakm"
  }

  case object Cham extends Iso15924 {
    final val value: String = "cham"
  }

  case object Cyrillic extends Iso15924 {
    final val value: String = "cyrl"
  }

  case object SimplifiedChinese extends Iso15924 {
    final val value: String = "hans"
  }

  case object TraditionalChinese extends Iso15924 {
    final val value: String = "hant"
  }

  case object Devanagari extends Iso15924 {
    final val value: String = "deva"
  }

  case object Greek extends Iso15924 {
    final val value: String = "grek"
  }

  case object Japanese extends Iso15924 {
    final val value: String = "jpan"
  }

  case object Korean extends Iso15924 {
    final val value: String = "kore"
  }

  case object Khmer extends Iso15924 {
    final val value: String = "khmr"
  }

  case object Latin extends Iso15924 {
    final val value: String = "latn"
  }

  case object Lao extends Iso15924 {
    final val value: String = "laoo"
  }

  case object Pahawh extends Iso15924 {
    final val value: String = "hmng"
  }

  case object Sundanese extends Iso15924 {
    final val value: String = "sund"
  }

  case object Thai extends Iso15924 {
    final val value: String = "thai"
  }
}