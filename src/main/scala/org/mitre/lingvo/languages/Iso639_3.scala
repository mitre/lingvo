package org.mitre.lingvo.languages

import enumeratum.values.{StringEnum, StringEnumEntry, StringPlayJsonValueEnum}

import org.mitre.lingvo.scripts.Iso15924

import scala.collection.immutable

/***
  * The interface which describes languages according to the ISO 639-3 standard.
  */
sealed trait Iso639_3 extends StringEnumEntry {

  /***
    * The ISO code of the language. The property name `value` is required for JSON
    * serialization supported by EnumeratumPlay.
    *
    * When an Iso639_3 object is JSON serialized, this property defines how the object
    * will be serialized.
    *
    * @return the three letter language code according to the standard.
    */
  def value: String

  /***
    * The ISO 15924 scripts used in this language.
    * @return the set of ISO 15924 scripts.
    */
  def scripts: immutable.Set[Iso15924]
}

/***
  * The companion object which contains all the relevant enumerations of languages.
  */
case object Iso639_3 extends StringEnum[Iso639_3] with StringPlayJsonValueEnum[Iso639_3] {

  /***
    * The values this enum can assume. This is required to be part of the public API by Enumeratum.
    */
  val values: immutable.IndexedSeq[Iso639_3] = findValues

  case object Afrikaans extends Iso639_3 {
    final val value: String = "afr"
    override def scripts: Set[Iso15924] = immutable.Set(Iso15924.Latin)
  }
}



