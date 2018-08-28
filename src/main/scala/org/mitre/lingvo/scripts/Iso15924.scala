/*
 * Copyright (c) 2018 The MITRE Corporation. All rights reserved.
 */

package org.mitre.lingvo.scripts

import enumeratum.values.{ StringEnum, StringEnumEntry, StringPlayJsonValueEnum }

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
  * <p>
  * All names taken from [[http://unicode.org/iso15924/iso15924-codes.html the Unicode committee]].
  */
object Iso15924 extends StringEnum[Iso15924] with StringPlayJsonValueEnum[Iso15924] {

  /***
    * Attempts to get the script by its ISO 15924 code.
    *
    * @param code the ISO 15924 code of the object to be returned
    * @return the script whose value is equal to `name` if it exists.
    */
  def withName(code: String): Iso15924 =
    values
      .find(_.value == code)
      .getOrElse(throw new NoSuchElementException(s"Unknown script '$code'"))

  /***
    * The values this enum can assume. This is required to be part of the public API by Enumeratum.
    */
  val values: immutable.IndexedSeq[Iso15924] = findValues

  case object Adlam extends Iso15924 {
    final val value: String = "adlm"
  }

  case object Afaka extends Iso15924 {
    final val value: String = "afak"
  }

  case object CaucasianAlbanian extends Iso15924 {
    final val value: String = "aghb"
  }

  case object Ahom extends Iso15924 {
    final val value: String = "ahom"
  }

  case object Arabic extends Iso15924 {
    final val value: String = "arab"
  }

  case object NastaliqArabic extends Iso15924 {
    final val value: String = "aran"
  }

  case object ImperialAramaic extends Iso15924 {
    final val value: String = "armi"
  }

  case object Armenian extends Iso15924 {
    final val value: String = "armn"
  }

  case object Avestan extends Iso15924 {
    final val value: String = "avst"
  }

  case object Balinese extends Iso15924 {
    final val value: String = "bali"
  }

  case object Bamum extends Iso15924 {
    final val value: String = "bamu"
  }

  case object BassaVah extends Iso15924 {
    final val value: String = "bass"
  }

  case object Batak extends Iso15924 {
    final val value: String = "batk"
  }

  case object Bengali extends Iso15924 {
    final val value: String = "beng"
  }

  case object Bhaiksuki extends Iso15924 {
    final val value: String = "bhks"
  }

  case object Blissymbols extends Iso15924 {
    final val value: String = "blis"
  }

  case object Bopomofo extends Iso15924 {
    final val value: String = "bopo"
  }

  case object Brahmi extends Iso15924 {
    final val value: String = "brah"
  }

  case object Braille extends Iso15924 {
    final val value: String = "brai"
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

  case object UnifiedCanadianAboriginalSyllabics extends Iso15924 {
    final val value: String = "cans"
  }

  case object Carian extends Iso15924 {
    final val value: String = "cari"
  }

  case object Cham extends Iso15924 {
    final val value: String = "cham"
  }

  case object Cherokee extends Iso15924 {
    final val value: String = "cher"
  }

  case object Cirth extends Iso15924 {
    final val value: String = "cirt"
  }

  case object Coptic extends Iso15924 {
    final val value: String = "copt"
  }

  case object CyproMinoan extends Iso15924 {
    final val value: String = "cpmn"
  }

  case object CypriotSyllabary extends Iso15924 {
    final val value: String = "cprt"
  }

  case object Cyrillic extends Iso15924 {
    final val value: String = "cyrl"
  }

  case object OldChurchSlavonicCyrillic extends Iso15924 {
    final val value: String = "cyrs"
  }

  case object Devanagari extends Iso15924 {
    final val value: String = "deva"
  }

  case object Dogra extends Iso15924 {
    final val value: String = "dogr"
  }

  case object Deseret extends Iso15924 {
    final val value: String = "dsrt"
  }

  case object DuployanShorthand extends Iso15924 {
    final val value: String = "dupl"
  }

  case object EgyptianDemotic extends Iso15924 {
    final val value: String = "egyd"
  }

  case object EgyptianHieratic extends Iso15924 {
    final val value: String = "egyh"
  }

  case object EgyptianHieroglyphs extends Iso15924 {
    final val value: String = "egyp"
  }

  case object Elbasan extends Iso15924 {
    final val value: String = "elba"
  }

  case object Ethiopic extends Iso15924 {
    final val value: String = "ethi"
  }

  case object Khutsuri extends Iso15924 {
    final val value: String = "geok"
  }

  case object Georgian extends Iso15924 {
    final val value: String = "geor"
  }

  case object Glagolitic extends Iso15924 {
    final val value: String = "glag"
  }

  case object GunjalaGondi extends Iso15924 {
    final val value: String = "gong"
  }

  case object MasaramGondi extends Iso15924 {
    final val value: String = "gonm"
  }

  case object Gothic extends Iso15924 {
    final val value: String = "goth"
  }

  case object Grantha extends Iso15924 {
    final val value: String = "gran"
  }

  case object Greek extends Iso15924 {
    final val value: String = "grek"
  }

  case object Gujarati extends Iso15924 {
    final val value: String = "gujr"
  }

  case object Gurmukhi extends Iso15924 {
    final val value: String = "guru"
  }

  case object HanBopomofo extends Iso15924 {
    final val value: String = "hanb"
  }

  case object Hangul extends Iso15924 {
    final val value: String = "hang"
  }

  case object Han extends Iso15924 {
    final val value: String = "hani"
  }

  case object Hanunoo extends Iso15924 {
    final val value: String = "hano"
  }

  case object SimpliefiedHan extends Iso15924 {
    final val value: String = "hans"
  }

  case object TraditionalHan extends Iso15924 {
    final val value: String = "hant"
  }

  case object Hatran extends Iso15924 {
    final val value: String = "hatr"
  }

  case object Hebrew extends Iso15924 {
    final val value: String = "hebr"
  }

  case object Hiragana extends Iso15924 {
    final val value: String = "hira"
  }

  case object AnatolianHieroglyphs extends Iso15924 {
    final val value: String = "hluw"
  }

  case object PahawhHmong extends Iso15924 {
    final val value: String = "hmng"
  }

  case object NyiakengPuachueHmong extends Iso15924 {
    final val value: String = "hmnp"
  }

  case object JapaneseSyllabaries extends Iso15924 {
    final val value: String = "hrkt"
  }

  case object OldHungarian extends Iso15924 {
    final val value: String = "hung"
  }

  case object Indus extends Iso15924 {
    final val value: String = "inds"
  }

  case object OldItalic extends Iso15924 {
    final val value: String = "ital"
  }

  case object Jamo extends Iso15924 {
    final val value: String = "jamo"
  }

  case object Javanese extends Iso15924 {
    final val value: String = "java"
  }

  case object Japanese extends Iso15924 {
    final val value: String = "jpan"
  }

  case object Jurchen extends Iso15924 {
    final val value: String = "jurc"
  }

  case object KayahLi extends Iso15924 {
    final val value: String = "kali"
  }

  case object Katakana extends Iso15924 {
    final val value: String = "kana"
  }

  case object Kharoshthi extends Iso15924 {
    final val value: String = "khar"
  }

  case object Khmer extends Iso15924 {
    final val value: String = "khmr"
  }

  case object Khojki extends Iso15924 {
    final val value: String = "khoj"
  }

  case object KhitanLarge extends Iso15924 {
    final val value: String = "kitl"
  }

  case object KhitanSmall extends Iso15924 {
    final val value: String = "kits"
  }

  case object Kannada extends Iso15924 {
    final val value: String = "knda"
  }

  case object Korean extends Iso15924 {
    final val value: String = "kore"
  }

  case object Kpelle extends Iso15924 {
    final val value: String = "kpel"
  }

  case object Kaithi extends Iso15924 {
    final val value: String = "kthi"
  }

  case object TaiTham extends Iso15924 {
    final val value: String = "lana"
  }

  case object Lao extends Iso15924 {
    final val value: String = "laoo"
  }

  case object FrakturLatin extends Iso15924 {
    final val value: String = "latf"
  }

  case object GaelicLatin extends Iso15924 {
    final val value: String = "latg"
  }

  case object Latin extends Iso15924 {
    final val value: String = "latn"
  }

  case object Leke extends Iso15924 {
    final val value: String = "leke"
  }

  case object Lepcha extends Iso15924 {
    final val value: String = "lepc"
  }

  case object Limbu extends Iso15924 {
    final val value: String = "limb"
  }

  case object LinearA extends Iso15924 {
    final val value: String = "lina"
  }

  case object LinearB extends Iso15924 {
    final val value: String = "linb"
  }

  case object Lisu extends Iso15924 {
    final val value: String = "lisu"
  }

  case object Loma extends Iso15924 {
    final val value: String = "loma"
  }

  case object Lycian extends Iso15924 {
    final val value: String = "lyci"
  }

  case object Lydian extends Iso15924 {
    final val value: String = "lydi"
  }

  case object Mahajani extends Iso15924 {
    final val value: String = "mahj"
  }

  case object Makasar extends Iso15924 {
    final val value: String = "maka"
  }

  case object Mandaic extends Iso15924 {
    final val value: String = "mand"
  }

  case object Manichaean extends Iso15924 {
    final val value: String = "mani"
  }

  case object Marchen extends Iso15924 {
    final val value: String = "marc"
  }

  case object MayanHieroglyphs extends Iso15924 {
    final val value: String = "maya"
  }

  case object Medefaidrin extends Iso15924 {
    final val value: String = "medf"
  }

  case object MendeKikakui extends Iso15924 {
    final val value: String = "mend"
  }

  case object MeroiticCursive extends Iso15924 {
    final val value: String = "merc"
  }

  case object MeroiticHieroglyphs extends Iso15924 {
    final val value: String = "mero"
  }

  case object Malayalam extends Iso15924 {
    final val value: String = "mlym"
  }

  case object Modi extends Iso15924 {
    final val value: String = "modi"
  }

  case object Mongolian extends Iso15924 {
    final val value: String = "mong"
  }

  case object Moon extends Iso15924 {
    final val value: String = "moon"
  }

  case object Mro extends Iso15924 {
    final val value: String = "mroo"
  }

  case object MeiteiMayek extends Iso15924 {
    final val value: String = "mtei"
  }

  case object Multani extends Iso15924 {
    final val value: String = "mult"
  }

  case object Myanmar extends Iso15924 {
    final val value: String = "mymr"
  }

  case object OldNorthArabian extends Iso15924 {
    final val value: String = "narb"
  }

  case object Nabataean extends Iso15924 {
    final val value: String = "nbat"
  }

  case object Newa extends Iso15924 {
    final val value: String = "newa"
  }

  case object NaxiDongba extends Iso15924 {
    final val value: String = "nkdb"
  }

  case object NaxiGeba extends Iso15924 {
    final val value: String = "nkgb"
  }

  case object NKo extends Iso15924 {
    final val value: String = "nkoo"
  }

  case object Nüshu extends Iso15924 {
    final val value: String = "nshu"
  }

  case object Ogham extends Iso15924 {
    final val value: String = "ogam"
  }

  case object OlChiki extends Iso15924 {
    final val value: String = "olck"
  }

  case object OldTurkic extends Iso15924 {
    final val value: String = "orkh"
  }

  case object Oriya extends Iso15924 {
    final val value: String = "orya"
  }

  case object Osage extends Iso15924 {
    final val value: String = "osge"
  }

  case object Osmanya extends Iso15924 {
    final val value: String = "osma"
  }

  case object Palmyrene extends Iso15924 {
    final val value: String = "palm"
  }

  case object PauCinHau extends Iso15924 {
    final val value: String = "pauc"
  }

  case object OldPermic extends Iso15924 {
    final val value: String = "perm"
  }

  case object PhagsPa extends Iso15924 {
    final val value: String = "phag"
  }

  case object InscriptionalPahlavi extends Iso15924 {
    final val value: String = "phli"
  }

  case object PsalterPahlavi extends Iso15924 {
    final val value: String = "phlp"
  }

  case object BookPahlavi extends Iso15924 {
    final val value: String = "phlv"
  }

  case object Phoenician extends Iso15924 {
    final val value: String = "phnx"
  }

  case object Miao extends Iso15924 {
    final val value: String = "plrd"
  }

  case object Klingon extends Iso15924 {
    final val value: String = "piqd"
  }

  case object InscriptionalParthian extends Iso15924 {
    final val value: String = "prti"
  }

  case object ReservedStart extends Iso15924 {
    final val value: String = "qaaa"
  }

  case object ReservedEnd extends Iso15924 {
    final val value: String = "qabx"
  }

  case object Rejang extends Iso15924 {
    final val value: String = "rjng"
  }

  case object HanifiRohingya extends Iso15924 {
    final val value: String = "rohg"
  }

  case object Rongorongo extends Iso15924 {
    final val value: String = "roro"
  }

  case object Runic extends Iso15924 {
    final val value: String = "runr"
  }

  case object Samaritan extends Iso15924 {
    final val value: String = "samr"
  }

  case object Sarati extends Iso15924 {
    final val value: String = "sara"
  }

  case object OldSouthArabian extends Iso15924 {
    final val value: String = "sarb"
  }

  case object Saurashtra extends Iso15924 {
    final val value: String = "saur"
  }

  case object SignWriting extends Iso15924 {
    final val value: String = "sgnw"
  }

  case object Shavian extends Iso15924 {
    final val value: String = "shaw"
  }

  case object Sharada extends Iso15924 {
    final val value: String = "shrd"
  }

  case object Shuishu extends Iso15924 {
    final val value: String = "shui"
  }

  case object Siddham extends Iso15924 {
    final val value: String = "sidd"
  }

  case object Khudawadi extends Iso15924 {
    final val value: String = "sind"
  }

  case object Sinhala extends Iso15924 {
    final val value: String = "sinh"
  }

  case object Sogdian extends Iso15924 {
    final val value: String = "sogd"
  }

  case object OldSogdian extends Iso15924 {
    final val value: String = "sogo"
  }

  case object SoraSompeng extends Iso15924 {
    final val value: String = "sora"
  }

  case object Soyombo extends Iso15924 {
    final val value: String = "soyo"
  }

  case object Sundanese extends Iso15924 {
    final val value: String = "sund"
  }

  case object SylotiNagri extends Iso15924 {
    final val value: String = "sylo"
  }

  case object Syriac extends Iso15924 {
    final val value: String = "syrc"
  }

  case object EstrangeloSyriac extends Iso15924 {
    final val value: String = "syre"
  }

  case object WesternSyriac extends Iso15924 {
    final val value: String = "syrj"
  }

  case object EasternSyriac extends Iso15924 {
    final val value: String = "syrn"
  }

  case object Tagbanwa extends Iso15924 {
    final val value: String = "tagb"
  }

  case object Takri extends Iso15924 {
    final val value: String = "takr"
  }

  case object TaiLe extends Iso15924 {
    final val value: String = "tale"
  }

  case object NewTaiLue extends Iso15924 {
    final val value: String = "talu"
  }

  case object Tamil extends Iso15924 {
    final val value: String = "taml"
  }

  case object Tangut extends Iso15924 {
    final val value: String = "tang"
  }

  case object TaiViet extends Iso15924 {
    final val value: String = "tavt"
  }

  case object Telugu extends Iso15924 {
    final val value: String = "telu"
  }

  case object Tengwar extends Iso15924 {
    final val value: String = "teng"
  }

  case object Tifinagh extends Iso15924 {
    final val value: String = "tfng"
  }

  case object Tagalog extends Iso15924 {
    final val value: String = "tglg"
  }

  case object Thaana extends Iso15924 {
    final val value: String = "thaa"
  }

  case object Thai extends Iso15924 {
    final val value: String = "thai"
  }

  case object Tibetan extends Iso15924 {
    final val value: String = "tibt"
  }

  case object Tirhuta extends Iso15924 {
    final val value: String = "tirh"
  }

  case object Ugaritic extends Iso15924 {
    final val value: String = "ugar"
  }

  case object Vai extends Iso15924 {
    final val value: String = "vaii"
  }

  case object VisibleSpeech extends Iso15924 {
    final val value: String = "visp"
  }

  case object WarangCiti extends Iso15924 {
    final val value: String = "wara"
  }

  case object Wancho extends Iso15924 {
    final val value: String = "wcho"
  }

  case object Woleai extends Iso15924 {
    final val value: String = "wole"
  }

  case object OldPersian extends Iso15924 {
    final val value: String = "xpeo"
  }

  case object Cuneiform extends Iso15924 {
    final val value: String = "xsux"
  }

  case object Yi extends Iso15924 {
    final val value: String = "yiii"
  }

  case object ZanabazarSquare extends Iso15924 {
    final val value: String = "zanb"
  }

  case object InheritedScriptCode extends Iso15924 {
    final val value: String = "zinh"
  }

  case object MathematicalNotation extends Iso15924 {
    final val value: String = "zmth"
  }

  case object EmojiSymbols extends Iso15924 {
    final val value: String = "zsye"
  }

  case object Symbols extends Iso15924 {
    final val value: String = "zsym"
  }

  case object UnwrittenDocuments extends Iso15924 {
    final val value: String = "zxxx"
  }

  case object UndeterminedScript extends Iso15924 {
    final val value: String = "zyyy"
  }
}
