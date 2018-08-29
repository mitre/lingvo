/*
 * Copyright (c) 2018 The MITRE Corporation. All rights reserved.
 */

package org.mitre.lingvo.languages
import enumeratum.values.{StringEnum, StringEnumEntry, StringPlayJsonValueEnum}
import org.mitre.lingvo.scripts.Iso15924
import scala.collection.immutable
/***
  * The interface which describes languages according to the ISO 6393 standard.
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

}
/***
  * The companion object which contains all the relevant enumerations of languages.
  */
case object Iso639_3 extends StringEnum[Iso639_3] with StringPlayJsonValueEnum[Iso639_3] {
  /***
    * The values this enum can assume. This is required to be part of the public API by Enumeratum.
    */
  val values: immutable.IndexedSeq[Iso639_3] = findValues

  case object Ghotuo extends Iso639_3 {
    final val value: String = "aaa"
  }

  case object AlumuTesu extends Iso639_3 {
    final val value: String = "aab"
  }

  case object Ari extends Iso639_3 {
    final val value: String = "aac"
  }
  
  case object Amal extends Iso639_3 {
    final val value: String = "aad"
  }

  case object ArberesheAlbanian extends Iso639_3 {
    final val value: String = "aae"
  }

  case object Aranadan extends Iso639_3 {
    final val value: String = "aaf"
  }

  case object Ambrak extends Iso639_3 {
    final val value: String = "aag"
  }

  case object AbuArapesh extends Iso639_3 {
    final val value: String = "aah"
  }

  case object ArifamaMiniafia extends Iso639_3 {
    final val value: String = "aai"
  }

  case object Ankave extends Iso639_3 {
    final val value: String = "aak"
  }

  case object Afade extends Iso639_3 {
    final val value: String = "aal"
  }

  case object Anambe extends Iso639_3 {
    final val value: String = "aan"
  }

  case object AlgerianSaharanArabic extends Iso639_3 {
    final val value: String = "aao"
  }

  case object ParaArara extends Iso639_3 {
    final val value: String = "aap"
  }

  case object Afar extends Iso639_3 {
    final val value: String = "aar"
  }

  case object Aasax extends Iso639_3 {
    final val value: String = "aas"
  }

  case object ArvanitikaAlbanian extends Iso639_3 {
    final val value: String = "aat"
  }

  case object Abau extends Iso639_3 {
    final val value: String = "aau"
  }

  case object Solong extends Iso639_3 {
    final val value: String = "aaw"
  }

  case object MandoboAtas extends Iso639_3 {
    final val value: String = "aax"
  }

  case object Amarasi extends Iso639_3 {
    final val value: String = "aaz"
  }

  case object Abe extends Iso639_3 {
    final val value: String = "aba"
  }

  case object Bankon extends Iso639_3 {
    final val value: String = "abb"
  }

  case object AmbalaAyta extends Iso639_3 {
    final val value: String = "abc"
  }

  case object Manide extends Iso639_3 {
    final val value: String = "abd"
  }

  case object WesternAbnaki extends Iso639_3 {
    final val value: String = "abe"
  }

  case object AbaiSungai extends Iso639_3 {
    final val value: String = "abf"
  }

  case object Abaga extends Iso639_3 {
    final val value: String = "abg"
  }

  case object TajikiArabic extends Iso639_3 {
    final val value: String = "abh"
  }

  case object Abidji extends Iso639_3 {
    final val value: String = "abi"
  }

  case object Abkhazian extends Iso639_3 {
    final val value: String = "abk"
  }

  case object LampungNyo extends Iso639_3 {
    final val value: String = "abl"
  }

  case object Abanyom extends Iso639_3 {
    final val value: String = "abm"
  }

  case object Abua extends Iso639_3 {
    final val value: String = "abn"
  }

  case object Abon extends Iso639_3 {
    final val value: String = "abo"
  }

  case object AbellenAyta extends Iso639_3 {
    final val value: String = "abp"
  }

  case object Abaza extends Iso639_3 {
    final val value: String = "abq"
  }

  case object Abron extends Iso639_3 {
    final val value: String = "abr"
  }

  case object AmboneseMalay extends Iso639_3 {
    final val value: String = "abs"
  }

  case object Ambulas extends Iso639_3 {
    final val value: String = "abt"
  }

  case object Abure extends Iso639_3 {
    final val value: String = "abu"
  }

  case object BaharnaArabic extends Iso639_3 {
    final val value: String = "abv"
  }

  case object Pal extends Iso639_3 {
    final val value: String = "abw"
  }

  case object Inabaknon extends Iso639_3 {
    final val value: String = "abx"
  }

  case object AnemeWake extends Iso639_3 {
    final val value: String = "aby"
  }

  case object Abui extends Iso639_3 {
    final val value: String = "abz"
  }

  case object Achagua extends Iso639_3 {
    final val value: String = "aca"
  }

  case object Anca extends Iso639_3 {
    final val value: String = "acb"
  }

  case object Gikyode extends Iso639_3 {
    final val value: String = "acd"
  }

  case object Achinese extends Iso639_3 {
    final val value: String = "ace"
  }

  case object SaintLucianCreoleFrench extends Iso639_3 {
    final val value: String = "acf"
  }

  case object Acoli extends Iso639_3 {
    final val value: String = "ach"
  }

  case object MesopotamianArabic extends Iso639_3 {
    final val value: String = "acm"
  }

  case object Achang extends Iso639_3 {
    final val value: String = "acn"
  }

  case object EasternAcipa extends Iso639_3 {
    final val value: String = "acp"
  }

  case object TaizziAdeniArabic extends Iso639_3 {
    final val value: String = "acq"
  }

  case object Achi extends Iso639_3 {
    final val value: String = "acr"
  }

  case object Achterhoeks extends Iso639_3 {
    final val value: String = "act"
  }

  case object AchuarShiwiar extends Iso639_3 {
    final val value: String = "acu"
  }

  case object Achumawi extends Iso639_3 {
    final val value: String = "acv"
  }

  case object HijaziArabic extends Iso639_3 {
    final val value: String = "acw"
  }

  case object OmaniArabic extends Iso639_3 {
    final val value: String = "acx"
  }

  case object CypriotArabic extends Iso639_3 {
    final val value: String = "acy"
  }

  case object Acheron extends Iso639_3 {
    final val value: String = "acz"
  }

  case object Adangme extends Iso639_3 {
    final val value: String = "ada"
  }

  case object Adabe extends Iso639_3 {
    final val value: String = "adb"
  }

  case object Lidzonka extends Iso639_3 {
    final val value: String = "add"
  }

  case object Adele extends Iso639_3 {
    final val value: String = "ade"
  }

  case object DhofariArabic extends Iso639_3 {
    final val value: String = "adf"
  }

  case object Andegerebinha extends Iso639_3 {
    final val value: String = "adg"
  }

  case object Adhola extends Iso639_3 {
    final val value: String = "adh"
  }

  case object Adi extends Iso639_3 {
    final val value: String = "adi"
  }

  case object Adioukrou extends Iso639_3 {
    final val value: String = "adj"
  }

  case object Galo extends Iso639_3 {
    final val value: String = "adl"
  }

  case object Adang extends Iso639_3 {
    final val value: String = "adn"
  }

  case object Abu extends Iso639_3 {
    final val value: String = "ado"
  }

  case object Adangbe extends Iso639_3 {
    final val value: String = "adq"
  }

  case object Adonara extends Iso639_3 {
    final val value: String = "adr"
  }

  case object SignLanguage extends Iso639_3 {
    final val value: String = "ads"
  }

  case object Adnyamathanha extends Iso639_3 {
    final val value: String = "adt"
  }

  case object Aduge extends Iso639_3 {
    final val value: String = "adu"
  }

  case object Amundava extends Iso639_3 {
    final val value: String = "adw"
  }

  case object AmdoTibetan extends Iso639_3 {
    final val value: String = "adx"
  }

  case object Adyghe extends Iso639_3 {
    final val value: String = "ady"
  }

  case object Adzera extends Iso639_3 {
    final val value: String = "adz"
  }

  case object TunisianArabic extends Iso639_3 {
    final val value: String = "aeb"
  }

  case object SaidiArabic extends Iso639_3 {
    final val value: String = "aec"
  }

  case object ArgentineSignLanguage extends Iso639_3 {
    final val value: String = "aed"
  }

  case object NortheastPashai extends Iso639_3 {
    final val value: String = "aee"
  }

  case object Haeke extends Iso639_3 {
    final val value: String = "aek"
  }

  case object Ambele extends Iso639_3 {
    final val value: String = "ael"
  }

  case object Arem extends Iso639_3 {
    final val value: String = "aem"
  }

  case object ArmenianSignLanguage extends Iso639_3 {
    final val value: String = "aen"
  }

  case object Aer extends Iso639_3 {
    final val value: String = "aeq"
  }

  case object EasternArrernte extends Iso639_3 {
    final val value: String = "aer"
  }

  case object Akeu extends Iso639_3 {
    final val value: String = "aeu"
  }

  case object Ambakich extends Iso639_3 {
    final val value: String = "aew"
  }

  case object Amele extends Iso639_3 {
    final val value: String = "aey"
  }

  case object Aeka extends Iso639_3 {
    final val value: String = "aez"
  }

  case object GulfArabic extends Iso639_3 {
    final val value: String = "afb"
  }

  case object Andai extends Iso639_3 {
    final val value: String = "afd"
  }

  case object Putukwam extends Iso639_3 {
    final val value: String = "afe"
  }

  case object AfghanSignLanguage extends Iso639_3 {
    final val value: String = "afg"
  }

  case object Akrukay extends Iso639_3 {
    final val value: String = "afi"
  }

  case object Nanubae extends Iso639_3 {
    final val value: String = "afk"
  }

  case object Defaka extends Iso639_3 {
    final val value: String = "afn"
  }

  case object Eloyi extends Iso639_3 {
    final val value: String = "afo"
  }

  case object Tapei extends Iso639_3 {
    final val value: String = "afp"
  }

  case object Afrikaans extends Iso639_3 {
    final val value: String = "afr"
  }

  case object SeminoleCreole extends Iso639_3 {
    final val value: String = "afs"
  }

  case object Afitti extends Iso639_3 {
    final val value: String = "aft"
  }

  case object Awutu extends Iso639_3 {
    final val value: String = "afu"
  }

  case object Obokuitai extends Iso639_3 {
    final val value: String = "afz"
  }

  case object Legbo extends Iso639_3 {
    final val value: String = "agb"
  }

  case object Agatu extends Iso639_3 {
    final val value: String = "agc"
  }

  case object Agarabi extends Iso639_3 {
    final val value: String = "agd"
  }

  case object Angal extends Iso639_3 {
    final val value: String = "age"
  }

  case object Arguni extends Iso639_3 {
    final val value: String = "agf"
  }

  case object Angor extends Iso639_3 {
    final val value: String = "agg"
  }

  case object Ngelima extends Iso639_3 {
    final val value: String = "agh"
  }

  case object Agariya extends Iso639_3 {
    final val value: String = "agi"
  }

  case object Argobba extends Iso639_3 {
    final val value: String = "agj"
  }

  case object IsarogAgta extends Iso639_3 {
    final val value: String = "agk"
  }

  case object Fembe extends Iso639_3 {
    final val value: String = "agl"
  }

  case object Angaataha extends Iso639_3 {
    final val value: String = "agm"
  }

  case object Agutaynen extends Iso639_3 {
    final val value: String = "agn"
  }

  case object Tainae extends Iso639_3 {
    final val value: String = "ago"
  }

  case object Aghem extends Iso639_3 {
    final val value: String = "agq"
  }

  case object Aguaruna extends Iso639_3 {
    final val value: String = "agr"
  }

  case object Esimbi extends Iso639_3 {
    final val value: String = "ags"
  }

  case object CagayanAgta extends Iso639_3 {
    final val value: String = "agt"
  }

  case object Aguacateco extends Iso639_3 {
    final val value: String = "agu"
  }

  case object RemontadoDumagat extends Iso639_3 {
    final val value: String = "agv"
  }

  case object Kahua extends Iso639_3 {
    final val value: String = "agw"
  }

  case object Aghul extends Iso639_3 {
    final val value: String = "agx"
  }

  case object SouthernAlta extends Iso639_3 {
    final val value: String = "agy"
  }

  case object MtIrigaAgta extends Iso639_3 {
    final val value: String = "agz"
  }

  case object Ahanta extends Iso639_3 {
    final val value: String = "aha"
  }

  case object Axamb extends Iso639_3 {
    final val value: String = "ahb"
  }

  case object Qimant extends Iso639_3 {
    final val value: String = "ahg"
  }

  case object Aghu extends Iso639_3 {
    final val value: String = "ahh"
  }

  case object TiagbamrinAizi extends Iso639_3 {
    final val value: String = "ahi"
  }

  case object Akha extends Iso639_3 {
    final val value: String = "ahk"
  }

  case object Igo extends Iso639_3 {
    final val value: String = "ahl"
  }

  case object MobumrinAizi extends Iso639_3 {
    final val value: String = "ahm"
  }

  case object Ahan extends Iso639_3 {
    final val value: String = "ahn"
  }

  case object AproumuAizi extends Iso639_3 {
    final val value: String = "ahp"
  }

  case object Ahirani extends Iso639_3 {
    final val value: String = "ahr"
  }

  case object Ashe extends Iso639_3 {
    final val value: String = "ahs"
  }

  case object Ahtena extends Iso639_3 {
    final val value: String = "aht"
  }

  case object Arosi extends Iso639_3 {
    final val value: String = "aia"
  }

  case object ChineseAinu extends Iso639_3 {
    final val value: String = "aib"
  }

  case object Ainbai extends Iso639_3 {
    final val value: String = "aic"
  }

  case object Amara extends Iso639_3 {
    final val value: String = "aie"
  }

  case object Agi extends Iso639_3 {
    final val value: String = "aif"
  }

  case object AntiguaAndBarbudaCreoleEnglish extends Iso639_3 {
    final val value: String = "aig"
  }

  case object AiCham extends Iso639_3 {
    final val value: String = "aih"
  }

  case object AssyrianNeoAramaic extends Iso639_3 {
    final val value: String = "aii"
  }

  case object LishanidNoshan extends Iso639_3 {
    final val value: String = "aij"
  }

  case object Ake extends Iso639_3 {
    final val value: String = "aik"
  }

  case object Aimele extends Iso639_3 {
    final val value: String = "ail"
  }

  case object Aimol extends Iso639_3 {
    final val value: String = "aim"
  }

  case object JapaneseAinu extends Iso639_3 {
    final val value: String = "ain"
  }

  case object Aiton extends Iso639_3 {
    final val value: String = "aio"
  }

  case object Burumakok extends Iso639_3 {
    final val value: String = "aip"
  }

  case object Aimaq extends Iso639_3 {
    final val value: String = "aiq"
  }

  case object Airoran extends Iso639_3 {
    final val value: String = "air"
  }

  case object NataoranAmis extends Iso639_3 {
    final val value: String = "ais"
  }

  case object Aari extends Iso639_3 {
    final val value: String = "aiw"
  }

  case object Aighon extends Iso639_3 {
    final val value: String = "aix"
  }

  case object Ali extends Iso639_3 {
    final val value: String = "aiy"
  }

  case object SouthSudaneseAja extends Iso639_3 {
    final val value: String = "aja"
  }

  case object BeninAja extends Iso639_3 {
    final val value: String = "ajg"
  }

  case object Ajie extends Iso639_3 {
    final val value: String = "aji"
  }

  case object Andajin extends Iso639_3 {
    final val value: String = "ajn"
  }

  case object LevantineArabic extends Iso639_3 {
    final val value: String = "ajp"
  }

  case object JudeoTunisianArabic extends Iso639_3 {
    final val value: String = "ajt"
  }

  case object JudeoMoroccanArabic extends Iso639_3 {
    final val value: String = "aju"
  }

  case object AmriKarbi extends Iso639_3 {
    final val value: String = "ajz"
  }

  case object Akan extends Iso639_3 {
    final val value: String = "aka"
  }

  case object BatakAngkola extends Iso639_3 {
    final val value: String = "akb"
  }

  case object Mpur extends Iso639_3 {
    final val value: String = "akc"
  }

  case object UkpetEhom extends Iso639_3 {
    final val value: String = "akd"
  }

  case object Akawaio extends Iso639_3 {
    final val value: String = "ake"
  }

  case object Akpa extends Iso639_3 {
    final val value: String = "akf"
  }

  case object Anakalangu extends Iso639_3 {
    final val value: String = "akg"
  }

  case object AngalHeneng extends Iso639_3 {
    final val value: String = "akh"
  }

  case object Aiome extends Iso639_3 {
    final val value: String = "aki"
  }

  case object Aklanon extends Iso639_3 {
    final val value: String = "akl"
  }

  case object Akurio extends Iso639_3 {
    final val value: String = "ako"
  }

  case object Siwu extends Iso639_3 {
    final val value: String = "akp"
  }

  case object Ak extends Iso639_3 {
    final val value: String = "akq"
  }

  case object Araki extends Iso639_3 {
    final val value: String = "akr"
  }

  case object Akaselem extends Iso639_3 {
    final val value: String = "aks"
  }

  case object Akolet extends Iso639_3 {
    final val value: String = "akt"
  }

  case object Akum extends Iso639_3 {
    final val value: String = "aku"
  }

  case object Akhvakh extends Iso639_3 {
    final val value: String = "akv"
  }

  case object Akwa extends Iso639_3 {
    final val value: String = "akw"
  }

  case object Alabama extends Iso639_3 {
    final val value: String = "akz"
  }

  case object Alago extends Iso639_3 {
    final val value: String = "ala"
  }

  case object Qawasqar extends Iso639_3 {
    final val value: String = "alc"
  }

  case object Alladian extends Iso639_3 {
    final val value: String = "ald"
  }

  case object Aleut extends Iso639_3 {
    final val value: String = "ale"
  }

  case object Alege extends Iso639_3 {
    final val value: String = "alf"
  }

  case object Alawa extends Iso639_3 {
    final val value: String = "alh"
  }

  case object Amaimon extends Iso639_3 {
    final val value: String = "ali"
  }

  case object Alangan extends Iso639_3 {
    final val value: String = "alj"
  }

  case object Alak extends Iso639_3 {
    final val value: String = "alk"
  }

  case object Allar extends Iso639_3 {
    final val value: String = "all"
  }

  case object Amblong extends Iso639_3 {
    final val value: String = "alm"
  }

  case object GhegAlbanian extends Iso639_3 {
    final val value: String = "aln"
  }

  case object LarikeWakasihu extends Iso639_3 {
    final val value: String = "alo"
  }

  case object Alune extends Iso639_3 {
    final val value: String = "alp"
  }

  case object Algonquin extends Iso639_3 {
    final val value: String = "alq"
  }

  case object Alutor extends Iso639_3 {
    final val value: String = "alr"
  }

  case object ToskAlbanian extends Iso639_3 {
    final val value: String = "als"
  }

  case object SouthernAltai extends Iso639_3 {
    final val value: String = "alt"
  }

  case object Areare extends Iso639_3 {
    final val value: String = "alu"
  }

  case object AlabaKabeena extends Iso639_3 {
    final val value: String = "alw"
  }

  case object Amol extends Iso639_3 {
    final val value: String = "alx"
  }

  case object Alyawarr extends Iso639_3 {
    final val value: String = "aly"
  }

  case object Alur extends Iso639_3 {
    final val value: String = "alz"
  }

  case object Ambo extends Iso639_3 {
    final val value: String = "amb"
  }

  case object Amahuaca extends Iso639_3 {
    final val value: String = "amc"
  }

  case object Yanesha extends Iso639_3 {
    final val value: String = "ame"
  }

  case object HamerBanna extends Iso639_3 {
    final val value: String = "amf"
  }

  case object Amurdak extends Iso639_3 {
    final val value: String = "amg"
  }

  case object Amharic extends Iso639_3 {
    final val value: String = "amh"
  }

  case object Amis extends Iso639_3 {
    final val value: String = "ami"
  }

  case object Amdang extends Iso639_3 {
    final val value: String = "amj"
  }

  case object Ambai extends Iso639_3 {
    final val value: String = "amk"
  }

  case object WarJaintia extends Iso639_3 {
    final val value: String = "aml"
  }

  case object PapuaNewGuineanAma extends Iso639_3 {
    final val value: String = "amm"
  }

  case object Amanab extends Iso639_3 {
    final val value: String = "amn"
  }

  case object Amo extends Iso639_3 {
    final val value: String = "amo"
  }

  case object Alamblak extends Iso639_3 {
    final val value: String = "amp"
  }

  case object Amahai extends Iso639_3 {
    final val value: String = "amq"
  }

  case object Amarakaeri extends Iso639_3 {
    final val value: String = "amr"
  }

  case object SouthernAmamiOshima extends Iso639_3 {
    final val value: String = "ams"
  }

  case object Amto extends Iso639_3 {
    final val value: String = "amt"
  }

  case object GuerreroAmuzgo extends Iso639_3 {
    final val value: String = "amu"
  }

  case object Ambelau extends Iso639_3 {
    final val value: String = "amv"
  }

  case object WesternNeoAramaic extends Iso639_3 {
    final val value: String = "amw"
  }

  case object Anmatyerre extends Iso639_3 {
    final val value: String = "amx"
  }

  case object Ami extends Iso639_3 {
    final val value: String = "amy"
  }

  case object Ngas extends Iso639_3 {
    final val value: String = "anc"
  }

  case object Ansus extends Iso639_3 {
    final val value: String = "and"
  }

  case object Xaracuu extends Iso639_3 {
    final val value: String = "ane"
  }

  case object Animere extends Iso639_3 {
    final val value: String = "anf"
  }

  case object Nend extends Iso639_3 {
    final val value: String = "anh"
  }

  case object Andi extends Iso639_3 {
    final val value: String = "ani"
  }

  case object Anor extends Iso639_3 {
    final val value: String = "anj"
  }

  case object Goemai extends Iso639_3 {
    final val value: String = "ank"
  }

  case object HkongsoChin extends Iso639_3 {
    final val value: String = "anl"
  }

  case object Anal extends Iso639_3 {
    final val value: String = "anm"
  }

  case object Obolo extends Iso639_3 {
    final val value: String = "ann"
  }

  case object Andoque extends Iso639_3 {
    final val value: String = "ano"
  }

  case object Angika extends Iso639_3 {
    final val value: String = "anp"
  }

  case object IndianJarawa extends Iso639_3 {
    final val value: String = "anq"
  }

  case object Andh extends Iso639_3 {
    final val value: String = "anr"
  }

  case object Antakarinya extends Iso639_3 {
    final val value: String = "ant"
  }

  case object Anuak extends Iso639_3 {
    final val value: String = "anu"
  }

  case object Denya extends Iso639_3 {
    final val value: String = "anv"
  }

  case object Anaang extends Iso639_3 {
    final val value: String = "anw"
  }

  case object AndraHus extends Iso639_3 {
    final val value: String = "anx"
  }

  case object Anyin extends Iso639_3 {
    final val value: String = "any"
  }

  case object Anem extends Iso639_3 {
    final val value: String = "anz"
  }

  case object Angolar extends Iso639_3 {
    final val value: String = "aoa"
  }

  case object Abom extends Iso639_3 {
    final val value: String = "aob"
  }

  case object Pemon extends Iso639_3 {
    final val value: String = "aoc"
  }

  case object Andarum extends Iso639_3 {
    final val value: String = "aod"
  }

  case object AngalEnen extends Iso639_3 {
    final val value: String = "aoe"
  }

  case object Bragat extends Iso639_3 {
    final val value: String = "aof"
  }

  case object Angoram extends Iso639_3 {
    final val value: String = "aog"
  }

  case object Anindilyakwa extends Iso639_3 {
    final val value: String = "aoi"
  }

  case object Mufian extends Iso639_3 {
    final val value: String = "aoj"
  }

  case object Arho extends Iso639_3 {
    final val value: String = "aok"
  }

  case object Alor extends Iso639_3 {
    final val value: String = "aol"
  }

  case object Omie extends Iso639_3 {
    final val value: String = "aom"
  }

  case object BumbitaArapesh extends Iso639_3 {
    final val value: String = "aon"
  }

  case object Taikat extends Iso639_3 {
    final val value: String = "aos"
  }

  case object IndianAtong extends Iso639_3 {
    final val value: String = "aot"
  }

  case object Aou extends Iso639_3 {
    final val value: String = "aou"
  }

  case object Atorada extends Iso639_3 {
    final val value: String = "aox"
  }

  case object UabMeto extends Iso639_3 {
    final val value: String = "aoz"
  }

  case object Saa extends Iso639_3 {
    final val value: String = "apb"
  }

  case object NorthLevantineArabic extends Iso639_3 {
    final val value: String = "apc"
  }

  case object SudaneseArabic extends Iso639_3 {
    final val value: String = "apd"
  }

  case object Bukiyip extends Iso639_3 {
    final val value: String = "ape"
  }

  case object PahananAgta extends Iso639_3 {
    final val value: String = "apf"
  }

  case object Ampanang extends Iso639_3 {
    final val value: String = "apg"
  }

  case object Athpariya extends Iso639_3 {
    final val value: String = "aph"
  }

  case object Apiaka extends Iso639_3 {
    final val value: String = "api"
  }

  case object JicarillaApache extends Iso639_3 {
    final val value: String = "apj"
  }

  case object KiowaApache extends Iso639_3 {
    final val value: String = "apk"
  }

  case object LipanApache extends Iso639_3 {
    final val value: String = "apl"
  }

  case object ChiricahuaApache extends Iso639_3 {
    final val value: String = "apm"
  }

  case object Apinaye extends Iso639_3 {
    final val value: String = "apn"
  }

  case object Ambul extends Iso639_3 {
    final val value: String = "apo"
  }

  case object Apma extends Iso639_3 {
    final val value: String = "app"
  }

  case object APucikwar extends Iso639_3 {
    final val value: String = "apq"
  }

  case object AropLokep extends Iso639_3 {
    final val value: String = "apr"
  }

  case object AropSissano extends Iso639_3 {
    final val value: String = "aps"
  }

  case object Apatani extends Iso639_3 {
    final val value: String = "apt"
  }

  case object Apurina extends Iso639_3 {
    final val value: String = "apu"
  }

  case object WesternApache extends Iso639_3 {
    final val value: String = "apw"
  }

  case object Aputai extends Iso639_3 {
    final val value: String = "apx"
  }

  case object Apalai extends Iso639_3 {
    final val value: String = "apy"
  }

  case object Safeyoka extends Iso639_3 {
    final val value: String = "apz"
  }

  case object Archi extends Iso639_3 {
    final val value: String = "aqc"
  }

  case object AmpariDogon extends Iso639_3 {
    final val value: String = "aqd"
  }

  case object Arigidi extends Iso639_3 {
    final val value: String = "aqg"
  }

  case object Atohwaim extends Iso639_3 {
    final val value: String = "aqm"
  }

  case object NorthernAlta extends Iso639_3 {
    final val value: String = "aqn"
  }

  case object Arha extends Iso639_3 {
    final val value: String = "aqr"
  }

  case object Angaite extends Iso639_3 {
    final val value: String = "aqt"
  }

  case object Akuntsu extends Iso639_3 {
    final val value: String = "aqz"
  }

  case object Arabic extends Iso639_3 {
    final val value: String = "ara"
  }

  case object StandardArabic extends Iso639_3 {
    final val value: String = "arb"
  }

  case object WesternArrarnta extends Iso639_3 {
    final val value: String = "are"
  }

  case object Aragonese extends Iso639_3 {
    final val value: String = "arg"
  }

  case object Arhuaco extends Iso639_3 {
    final val value: String = "arh"
  }

  case object Arikara extends Iso639_3 {
    final val value: String = "ari"
  }

  case object Arikapu extends Iso639_3 {
    final val value: String = "ark"
  }

  case object Arabela extends Iso639_3 {
    final val value: String = "arl"
  }

  case object Mapudungun extends Iso639_3 {
    final val value: String = "arn"
  }

  case object Araona extends Iso639_3 {
    final val value: String = "aro"
  }

  case object Arapaho extends Iso639_3 {
    final val value: String = "arp"
  }

  case object AlgerianArabic extends Iso639_3 {
    final val value: String = "arq"
  }

  case object BrazilianKaro extends Iso639_3 {
    final val value: String = "arr"
  }

  case object NajdiArabic extends Iso639_3 {
    final val value: String = "ars"
  }

  case object Arbore extends Iso639_3 {
    final val value: String = "arv"
  }

  case object Arawak extends Iso639_3 {
    final val value: String = "arw"
  }

  case object RodonianArua extends Iso639_3 {
    final val value: String = "arx"
  }

  case object MoroccanArabic extends Iso639_3 {
    final val value: String = "ary"
  }

  case object EgyptianArabic extends Iso639_3 {
    final val value: String = "arz"
  }

  case object TanzanianAsu extends Iso639_3 {
    final val value: String = "asa"
  }

  case object Assiniboine extends Iso639_3 {
    final val value: String = "asb"
  }

  case object CoastAsmat extends Iso639_3 {
    final val value: String = "asc"
  }

  case object Asas extends Iso639_3 {
    final val value: String = "asd"
  }

  case object AmericanSignLanguage extends Iso639_3 {
    final val value: String = "ase"
  }

  case object Auslan extends Iso639_3 {
    final val value: String = "asf"
  }

  case object Cishingini extends Iso639_3 {
    final val value: String = "asg"
  }

  case object Buruwai extends Iso639_3 {
    final val value: String = "asi"
  }

  case object Sari extends Iso639_3 {
    final val value: String = "asj"
  }

  case object Ashkun extends Iso639_3 {
    final val value: String = "ask"
  }

  case object Asilulu extends Iso639_3 {
    final val value: String = "asl"
  }

  case object Assamese extends Iso639_3 {
    final val value: String = "asm"
  }

  case object XinguAsurini extends Iso639_3 {
    final val value: String = "asn"
  }

  case object Dano extends Iso639_3 {
    final val value: String = "aso"
  }

  case object AlgerianSignLanguage extends Iso639_3 {
    final val value: String = "asp"
  }

  case object AustrianSignLanguage extends Iso639_3 {
    final val value: String = "asq"
  }

  case object Asuri extends Iso639_3 {
    final val value: String = "asr"
  }

  case object Ipulo extends Iso639_3 {
    final val value: String = "ass"
  }

  case object Asturian extends Iso639_3 {
    final val value: String = "ast"
  }

  case object TocantinsAsurini extends Iso639_3 {
    final val value: String = "asu"
  }

  case object Asoa extends Iso639_3 {
    final val value: String = "asv"
  }

  case object AboriginesSignLanguage extends Iso639_3 {
    final val value: String = "asw"
  }

  case object Muratayak extends Iso639_3 {
    final val value: String = "asx"
  }

  case object YaosakorAsmat extends Iso639_3 {
    final val value: String = "asy"
  }

  case object As extends Iso639_3 {
    final val value: String = "asz"
  }

  case object PeleAta extends Iso639_3 {
    final val value: String = "ata"
  }

  case object Zaiwa extends Iso639_3 {
    final val value: String = "atb"
  }

  case object AtaManobo extends Iso639_3 {
    final val value: String = "atd"
  }

  case object Atemble extends Iso639_3 {
    final val value: String = "ate"
  }

  case object IvbieNorthOkpelaArhe extends Iso639_3 {
    final val value: String = "atg"
  }

  case object Attie extends Iso639_3 {
    final val value: String = "ati"
  }

  case object Atikamekw extends Iso639_3 {
    final val value: String = "atj"
  }

  case object Ati extends Iso639_3 {
    final val value: String = "atk"
  }

  case object MtIrayaAgta extends Iso639_3 {
    final val value: String = "atl"
  }

  case object Ata extends Iso639_3 {
    final val value: String = "atm"
  }

  case object Ashtiani extends Iso639_3 {
    final val value: String = "atn"
  }

  case object CameroonianAtong extends Iso639_3 {
    final val value: String = "ato"
  }

  case object PudtolAtta extends Iso639_3 {
    final val value: String = "atp"
  }

  case object AralleTabulahan extends Iso639_3 {
    final val value: String = "atq"
  }

  case object WaimiriAtroari extends Iso639_3 {
    final val value: String = "atr"
  }

  case object GrosVentre extends Iso639_3 {
    final val value: String = "ats"
  }

  case object PamplonaAtta extends Iso639_3 {
    final val value: String = "att"
  }

  case object Reel extends Iso639_3 {
    final val value: String = "atu"
  }

  case object NorthernAltai extends Iso639_3 {
    final val value: String = "atv"
  }

  case object Atsugewi extends Iso639_3 {
    final val value: String = "atw"
  }

  case object Arutani extends Iso639_3 {
    final val value: String = "atx"
  }

  case object Aneityum extends Iso639_3 {
    final val value: String = "aty"
  }

  case object Arta extends Iso639_3 {
    final val value: String = "atz"
  }

  case object Asumboa extends Iso639_3 {
    final val value: String = "aua"
  }

  case object Alugu extends Iso639_3 {
    final val value: String = "aub"
  }

  case object Waorani extends Iso639_3 {
    final val value: String = "auc"
  }

  case object Anuta extends Iso639_3 {
    final val value: String = "aud"
  }

  case object Aguna extends Iso639_3 {
    final val value: String = "aug"
  }

  case object Aushi extends Iso639_3 {
    final val value: String = "auh"
  }

  case object Anuki extends Iso639_3 {
    final val value: String = "aui"
  }

  case object Awjilah extends Iso639_3 {
    final val value: String = "auj"
  }

  case object Heyo extends Iso639_3 {
    final val value: String = "auk"
  }

  case object Aulua extends Iso639_3 {
    final val value: String = "aul"
  }

  case object NigerianAsu extends Iso639_3 {
    final val value: String = "aum"
  }

  case object MolmoOne extends Iso639_3 {
    final val value: String = "aun"
  }

  case object Makayam extends Iso639_3 {
    final val value: String = "aup"
  }

  case object Anus extends Iso639_3 {
    final val value: String = "auq"
  }

  case object Aruek extends Iso639_3 {
    final val value: String = "aur"
  }

  case object Austral extends Iso639_3 {
    final val value: String = "aut"
  }

  case object Auye extends Iso639_3 {
    final val value: String = "auu"
  }

  case object Awyi extends Iso639_3 {
    final val value: String = "auw"
  }

  case object Awiyaana extends Iso639_3 {
    final val value: String = "auy"
  }

  case object UzbekiArabic extends Iso639_3 {
    final val value: String = "auz"
  }

  case object Avaric extends Iso639_3 {
    final val value: String = "ava"
  }

  case object Avau extends Iso639_3 {
    final val value: String = "avb"
  }

  case object AlviriVidari extends Iso639_3 {
    final val value: String = "avd"
  }

  case object Avikam extends Iso639_3 {
    final val value: String = "avi"
  }

  case object EgyptianBedawiArabic extends Iso639_3 {
    final val value: String = "avl"
  }

  case object Avatime extends Iso639_3 {
    final val value: String = "avn"
  }

  case object Au extends Iso639_3 {
    final val value: String = "avt"
  }

  case object Avokaya extends Iso639_3 {
    final val value: String = "avu"
  }

  case object AvaCanoeiro extends Iso639_3 {
    final val value: String = "avv"
  }

  case object Awadhi extends Iso639_3 {
    final val value: String = "awa"
  }

  case object PapuaNewGuineanAwa extends Iso639_3 {
    final val value: String = "awb"
  }

  case object Cicipu extends Iso639_3 {
    final val value: String = "awc"
  }

  case object Aweti extends Iso639_3 {
    final val value: String = "awe"
  }

  case object Awbono extends Iso639_3 {
    final val value: String = "awh"
  }

  case object Aekyom extends Iso639_3 {
    final val value: String = "awi"
  }

  case object Arawum extends Iso639_3 {
    final val value: String = "awm"
  }

  case object Awngi extends Iso639_3 {
    final val value: String = "awn"
  }

  case object Awak extends Iso639_3 {
    final val value: String = "awo"
  }

  case object Awera extends Iso639_3 {
    final val value: String = "awr"
  }

  case object SouthAwyu extends Iso639_3 {
    final val value: String = "aws"
  }

  case object Arawete extends Iso639_3 {
    final val value: String = "awt"
  }

  case object CentralAwyu extends Iso639_3 {
    final val value: String = "awu"
  }

  case object JairAwyu extends Iso639_3 {
    final val value: String = "awv"
  }

  case object Awun extends Iso639_3 {
    final val value: String = "aww"
  }

  case object Awara extends Iso639_3 {
    final val value: String = "awx"
  }

  case object EderaAwyu extends Iso639_3 {
    final val value: String = "awy"
  }

  case object CentralAfricanRepublicanYaka extends Iso639_3 {
    final val value: String = "axk"
  }

  case object Xaragure extends Iso639_3 {
    final val value: String = "axx"
  }

  case object Awar extends Iso639_3 {
    final val value: String = "aya"
  }

  case object AyizoGbe extends Iso639_3 {
    final val value: String = "ayb"
  }

  case object SouthernAymara extends Iso639_3 {
    final val value: String = "ayc"
  }

  case object Ayere extends Iso639_3 {
    final val value: String = "aye"
  }

  case object Ginyanga extends Iso639_3 {
    final val value: String = "ayg"
  }

  case object HadramiArabic extends Iso639_3 {
    final val value: String = "ayh"
  }

  case object Leyigha extends Iso639_3 {
    final val value: String = "ayi"
  }

  case object Akuku extends Iso639_3 {
    final val value: String = "ayk"
  }

  case object LibyanArabic extends Iso639_3 {
    final val value: String = "ayl"
  }

  case object Aymara extends Iso639_3 {
    final val value: String = "aym"
  }

  case object SanaaniArabic extends Iso639_3 {
    final val value: String = "ayn"
  }

  case object Ayoreo extends Iso639_3 {
    final val value: String = "ayo"
  }

  case object NorthMesopotamianArabic extends Iso639_3 {
    final val value: String = "ayp"
  }

  case object PapuaNewGuineanAyi extends Iso639_3 {
    final val value: String = "ayq"
  }

  case object CentralAymara extends Iso639_3 {
    final val value: String = "ayr"
  }

  case object SorsogonAyta extends Iso639_3 {
    final val value: String = "ays"
  }

  case object MagbukunAyta extends Iso639_3 {
    final val value: String = "ayt"
  }

  case object Ayu extends Iso639_3 {
    final val value: String = "ayu"
  }

  case object MaiBrat extends Iso639_3 {
    final val value: String = "ayz"
  }

  case object Azha extends Iso639_3 {
    final val value: String = "aza"
  }

  case object SouthAzerbaijani extends Iso639_3 {
    final val value: String = "azb"
  }

  case object DurangoNahuatl extends Iso639_3 {
    final val value: String = "azd"
  }

  case object Azerbaijani extends Iso639_3 {
    final val value: String = "aze"
  }

  case object PedroAmuzgosAmuzgo extends Iso639_3 {
    final val value: String = "azg"
  }

  case object NorthAzerbaijani extends Iso639_3 {
    final val value: String = "azj"
  }

  case object IpalapaAmuzgo extends Iso639_3 {
    final val value: String = "azm"
  }

  case object WesternDurangoNahuatl extends Iso639_3 {
    final val value: String = "azn"
  }

  case object Awing extends Iso639_3 {
    final val value: String = "azo"
  }

  case object FaireAtta extends Iso639_3 {
    final val value: String = "azt"
  }

  case object PueblaNahuatl extends Iso639_3 {
    final val value: String = "azz"
  }

  case object Babatana extends Iso639_3 {
    final val value: String = "baa"
  }

  case object BainoukGunyuno extends Iso639_3 {
    final val value: String = "bab"
  }

  case object Badui extends Iso639_3 {
    final val value: String = "bac"
  }

  case object Nubaca extends Iso639_3 {
    final val value: String = "baf"
  }

  case object Tuki extends Iso639_3 {
    final val value: String = "bag"
  }

  case object CreoleEnglish extends Iso639_3 {
    final val value: String = "bah"
  }

  case object Barakai extends Iso639_3 {
    final val value: String = "baj"
  }

  case object Bashkir extends Iso639_3 {
    final val value: String = "bak"
  }

  case object Baluchi extends Iso639_3 {
    final val value: String = "bal"
  }

  case object Bambara extends Iso639_3 {
    final val value: String = "bam"
  }

  case object Balinese extends Iso639_3 {
    final val value: String = "ban"
  }

  case object Waimaha extends Iso639_3 {
    final val value: String = "bao"
  }

  case object Bantawa extends Iso639_3 {
    final val value: String = "bap"
  }

  case object Bavarian extends Iso639_3 {
    final val value: String = "bar"
  }

  case object CameroonianBasa extends Iso639_3 {
    final val value: String = "bas"
  }

  case object NigerianBada extends Iso639_3 {
    final val value: String = "bau"
  }

  case object Vengo extends Iso639_3 {
    final val value: String = "bav"
  }

  case object BambiliBambui extends Iso639_3 {
    final val value: String = "baw"
  }

  case object Bamun extends Iso639_3 {
    final val value: String = "bax"
  }

  case object Batuley extends Iso639_3 {
    final val value: String = "bay"
  }

  case object Baatonum extends Iso639_3 {
    final val value: String = "bba"
  }

  case object Barai extends Iso639_3 {
    final val value: String = "bbb"
  }

  case object BatakToba extends Iso639_3 {
    final val value: String = "bbc"
  }

  case object Bau extends Iso639_3 {
    final val value: String = "bbd"
  }

  case object Bangba extends Iso639_3 {
    final val value: String = "bbe"
  }

  case object Baibai extends Iso639_3 {
    final val value: String = "bbf"
  }

  case object Barama extends Iso639_3 {
    final val value: String = "bbg"
  }

  case object Bugan extends Iso639_3 {
    final val value: String = "bbh"
  }

  case object Barombi extends Iso639_3 {
    final val value: String = "bbi"
  }

  case object Ghomala extends Iso639_3 {
    final val value: String = "bbj"
  }

  case object Babanki extends Iso639_3 {
    final val value: String = "bbk"
  }

  case object Bats extends Iso639_3 {
    final val value: String = "bbl"
  }

  case object Babango extends Iso639_3 {
    final val value: String = "bbm"
  }

  case object Uneapa extends Iso639_3 {
    final val value: String = "bbn"
  }

  case object NorthernBoboMadare extends Iso639_3 {
    final val value: String = "bbo"
  }

  case object WestCentralBanda extends Iso639_3 {
    final val value: String = "bbp"
  }

  case object Bamali extends Iso639_3 {
    final val value: String = "bbq"
  }

  case object Girawa extends Iso639_3 {
    final val value: String = "bbr"
  }

  case object Bakpinka extends Iso639_3 {
    final val value: String = "bbs"
  }

  case object Mburku extends Iso639_3 {
    final val value: String = "bbt"
  }

  case object NigerianKulung extends Iso639_3 {
    final val value: String = "bbu"
  }

  case object Karnai extends Iso639_3 {
    final val value: String = "bbv"
  }

  case object Baba extends Iso639_3 {
    final val value: String = "bbw"
  }

  case object Bubia extends Iso639_3 {
    final val value: String = "bbx"
  }

  case object Befang extends Iso639_3 {
    final val value: String = "bby"
  }

  case object BabaliaCreoleArabic extends Iso639_3 {
    final val value: String = "bbz"
  }

  case object CentralBai extends Iso639_3 {
    final val value: String = "bca"
  }

  case object BainoukSamik extends Iso639_3 {
    final val value: String = "bcb"
  }

  case object SouthernBalochi extends Iso639_3 {
    final val value: String = "bcc"
  }

  case object NorthBabar extends Iso639_3 {
    final val value: String = "bcd"
  }

  case object Bamenyam extends Iso639_3 {
    final val value: String = "bce"
  }

  case object Bamu extends Iso639_3 {
    final val value: String = "bcf"
  }

  case object BagaPokur extends Iso639_3 {
    final val value: String = "bcg"
  }

  case object Bariai extends Iso639_3 {
    final val value: String = "bch"
  }

  case object Baoule extends Iso639_3 {
    final val value: String = "bci"
  }

  case object Bardi extends Iso639_3 {
    final val value: String = "bcj"
  }

  case object Bunaba extends Iso639_3 {
    final val value: String = "bck"
  }

  case object CentralBikol extends Iso639_3 {
    final val value: String = "bcl"
  }

  case object Bannoni extends Iso639_3 {
    final val value: String = "bcm"
  }

  case object NigerianBali extends Iso639_3 {
    final val value: String = "bcn"
  }

  case object Kaluli extends Iso639_3 {
    final val value: String = "bco"
  }

  case object DemocraticRepublicOfCongoeseBali extends Iso639_3 {
    final val value: String = "bcp"
  }

  case object Bench extends Iso639_3 {
    final val value: String = "bcq"
  }

  case object Babine extends Iso639_3 {
    final val value: String = "bcr"
  }

  case object Kohumono extends Iso639_3 {
    final val value: String = "bcs"
  }

  case object Bendi extends Iso639_3 {
    final val value: String = "bct"
  }

  case object AwadBing extends Iso639_3 {
    final val value: String = "bcu"
  }

  case object ShooMindaNye extends Iso639_3 {
    final val value: String = "bcv"
  }

  case object Bana extends Iso639_3 {
    final val value: String = "bcw"
  }

  case object Bacama extends Iso639_3 {
    final val value: String = "bcy"
  }

  case object BainoukGunyaamolo extends Iso639_3 {
    final val value: String = "bcz"
  }

  case object Bayot extends Iso639_3 {
    final val value: String = "bda"
  }

  case object Basap extends Iso639_3 {
    final val value: String = "bdb"
  }

  case object EmberaBaudo extends Iso639_3 {
    final val value: String = "bdc"
  }

  case object Bunama extends Iso639_3 {
    final val value: String = "bdd"
  }

  case object Bade extends Iso639_3 {
    final val value: String = "bde"
  }

  case object Biage extends Iso639_3 {
    final val value: String = "bdf"
  }

  case object Bonggi extends Iso639_3 {
    final val value: String = "bdg"
  }

  case object SouthSudaneseBaka extends Iso639_3 {
    final val value: String = "bdh"
  }

  case object Burun extends Iso639_3 {
    final val value: String = "bdi"
  }

  case object SouthSudaneseBai extends Iso639_3 {
    final val value: String = "bdj"
  }

  case object Budukh extends Iso639_3 {
    final val value: String = "bdk"
  }

  case object IndonesianBajau extends Iso639_3 {
    final val value: String = "bdl"
  }

  case object Buduma extends Iso639_3 {
    final val value: String = "bdm"
  }

  case object Baldemu extends Iso639_3 {
    final val value: String = "bdn"
  }

  case object Morom extends Iso639_3 {
    final val value: String = "bdo"
  }

  case object Bende extends Iso639_3 {
    final val value: String = "bdp"
  }

  case object Bahnar extends Iso639_3 {
    final val value: String = "bdq"
  }

  case object CoastBajau extends Iso639_3 {
    final val value: String = "bdr"
  }

  case object Burunge extends Iso639_3 {
    final val value: String = "bds"
  }

  case object Bokoto extends Iso639_3 {
    final val value: String = "bdt"
  }

  case object Oroko extends Iso639_3 {
    final val value: String = "bdu"
  }

  case object BodoParja extends Iso639_3 {
    final val value: String = "bdv"
  }

  case object Baham extends Iso639_3 {
    final val value: String = "bdw"
  }

  case object BudongBudong extends Iso639_3 {
    final val value: String = "bdx"
  }

  case object Bandjalang extends Iso639_3 {
    final val value: String = "bdy"
  }

  case object Badeshi extends Iso639_3 {
    final val value: String = "bdz"
  }

  case object Beaver extends Iso639_3 {
    final val value: String = "bea"
  }

  case object Bebele extends Iso639_3 {
    final val value: String = "beb"
  }

  case object IceveMaci extends Iso639_3 {
    final val value: String = "bec"
  }

  case object Bedoanas extends Iso639_3 {
    final val value: String = "bed"
  }

  case object Byangsi extends Iso639_3 {
    final val value: String = "bee"
  }

  case object Benabena extends Iso639_3 {
    final val value: String = "bef"
  }

  case object Belait extends Iso639_3 {
    final val value: String = "beg"
  }

  case object Biali extends Iso639_3 {
    final val value: String = "beh"
  }

  case object Bekati extends Iso639_3 {
    final val value: String = "bei"
  }

  case object Beja extends Iso639_3 {
    final val value: String = "bej"
  }

  case object Bebeli extends Iso639_3 {
    final val value: String = "bek"
  }

  case object Belarusian extends Iso639_3 {
    final val value: String = "bel"
  }

  case object Bemba extends Iso639_3 {
    final val value: String = "bem"
  }

  case object Bengali extends Iso639_3 {
    final val value: String = "ben"
  }

  case object Beami extends Iso639_3 {
    final val value: String = "beo"
  }

  case object Besoa extends Iso639_3 {
    final val value: String = "bep"
  }

  case object Beembe extends Iso639_3 {
    final val value: String = "beq"
  }

  case object Besme extends Iso639_3 {
    final val value: String = "bes"
  }

  case object GuiberouaBete extends Iso639_3 {
    final val value: String = "bet"
  }

  case object Blagar extends Iso639_3 {
    final val value: String = "beu"
  }

  case object DaloaBete extends Iso639_3 {
    final val value: String = "bev"
  }

  case object Betawi extends Iso639_3 {
    final val value: String = "bew"
  }

  case object JurModo extends Iso639_3 {
    final val value: String = "bex"
  }

  case object PapuaNewGuineanBeli extends Iso639_3 {
    final val value: String = "bey"
  }

  case object TanzanianBena extends Iso639_3 {
    final val value: String = "bez"
  }

  case object Bari extends Iso639_3 {
    final val value: String = "bfa"
  }

  case object PauriBareli extends Iso639_3 {
    final val value: String = "bfb"
  }

  case object PanyiBai extends Iso639_3 {
    final val value: String = "bfc"
  }

  case object Bafut extends Iso639_3 {
    final val value: String = "bfd"
  }

  case object Betaf extends Iso639_3 {
    final val value: String = "bfe"
  }

  case object Bofi extends Iso639_3 {
    final val value: String = "bff"
  }

  case object BusangKayan extends Iso639_3 {
    final val value: String = "bfg"
  }

  case object Blafe extends Iso639_3 {
    final val value: String = "bfh"
  }

  case object BritishSignLanguage extends Iso639_3 {
    final val value: String = "bfi"
  }

  case object Bafanji extends Iso639_3 {
    final val value: String = "bfj"
  }

  case object BanKhorSignLanguage extends Iso639_3 {
    final val value: String = "bfk"
  }

  case object BandaNdele extends Iso639_3 {
    final val value: String = "bfl"
  }

  case object Mmen extends Iso639_3 {
    final val value: String = "bfm"
  }

  case object Bunak extends Iso639_3 {
    final val value: String = "bfn"
  }

  case object MalbaBirifor extends Iso639_3 {
    final val value: String = "bfo"
  }

  case object Beba extends Iso639_3 {
    final val value: String = "bfp"
  }

  case object Badaga extends Iso639_3 {
    final val value: String = "bfq"
  }

  case object Bazigar extends Iso639_3 {
    final val value: String = "bfr"
  }

  case object SouthernBai extends Iso639_3 {
    final val value: String = "bfs"
  }

  case object Balti extends Iso639_3 {
    final val value: String = "bft"
  }

  case object Gahri extends Iso639_3 {
    final val value: String = "bfu"
  }

  case object Bondo extends Iso639_3 {
    final val value: String = "bfw"
  }

  case object Bantayanon extends Iso639_3 {
    final val value: String = "bfx"
  }

  case object Bagheli extends Iso639_3 {
    final val value: String = "bfy"
  }

  case object MahasuPahari extends Iso639_3 {
    final val value: String = "bfz"
  }

  case object GwamhiWuri extends Iso639_3 {
    final val value: String = "bga"
  }

  case object Bobongko extends Iso639_3 {
    final val value: String = "bgb"
  }

  case object Haryanvi extends Iso639_3 {
    final val value: String = "bgc"
  }

  case object RathwiBareli extends Iso639_3 {
    final val value: String = "bgd"
  }

  case object Bauria extends Iso639_3 {
    final val value: String = "bge"
  }

  case object Bangandu extends Iso639_3 {
    final val value: String = "bgf"
  }

  case object Bugun extends Iso639_3 {
    final val value: String = "bgg"
  }

  case object Giangan extends Iso639_3 {
    final val value: String = "bgi"
  }

  case object Bangolan extends Iso639_3 {
    final val value: String = "bgj"
  }

  case object Bit extends Iso639_3 {
    final val value: String = "bgk"
  }

  case object LaotianBo extends Iso639_3 {
    final val value: String = "bgl"
  }

  case object WesternBalochi extends Iso639_3 {
    final val value: String = "bgn"
  }

  case object BagaKoga extends Iso639_3 {
    final val value: String = "bgo"
  }

  case object EasternBalochi extends Iso639_3 {
    final val value: String = "bgp"
  }

  case object Bagri extends Iso639_3 {
    final val value: String = "bgq"
  }

  case object BawmChin extends Iso639_3 {
    final val value: String = "bgr"
  }

  case object Tagabawa extends Iso639_3 {
    final val value: String = "bgs"
  }

  case object Bughotu extends Iso639_3 {
    final val value: String = "bgt"
  }

  case object Mbongno extends Iso639_3 {
    final val value: String = "bgu"
  }

  case object WarkayBipim extends Iso639_3 {
    final val value: String = "bgv"
  }

  case object Bhatri extends Iso639_3 {
    final val value: String = "bgw"
  }

  case object GagauzTurkish extends Iso639_3 {
    final val value: String = "bgx"
  }

  case object Benggoi extends Iso639_3 {
    final val value: String = "bgy"
  }

  case object Banggai extends Iso639_3 {
    final val value: String = "bgz"
  }

  case object Bharia extends Iso639_3 {
    final val value: String = "bha"
  }

  case object Bhili extends Iso639_3 {
    final val value: String = "bhb"
  }

  case object Biga extends Iso639_3 {
    final val value: String = "bhc"
  }

  case object Bhadrawahi extends Iso639_3 {
    final val value: String = "bhd"
  }

  case object Bhaya extends Iso639_3 {
    final val value: String = "bhe"
  }

  case object Odiai extends Iso639_3 {
    final val value: String = "bhf"
  }

  case object Binandere extends Iso639_3 {
    final val value: String = "bhg"
  }

  case object Bukharic extends Iso639_3 {
    final val value: String = "bhh"
  }

  case object Bhilali extends Iso639_3 {
    final val value: String = "bhi"
  }

  case object Bahing extends Iso639_3 {
    final val value: String = "bhj"
  }

  case object Bimin extends Iso639_3 {
    final val value: String = "bhl"
  }

  case object Bathari extends Iso639_3 {
    final val value: String = "bhm"
  }

  case object BohtanNeoAramaic extends Iso639_3 {
    final val value: String = "bhn"
  }

  case object Bhojpuri extends Iso639_3 {
    final val value: String = "bho"
  }

  case object Bima extends Iso639_3 {
    final val value: String = "bhp"
  }

  case object BesiSouth extends Iso639_3 {
    final val value: String = "bhq"
  }

  case object BaraMalagasy extends Iso639_3 {
    final val value: String = "bhr"
  }

  case object Buwal extends Iso639_3 {
    final val value: String = "bhs"
  }

  case object Bhattiyali extends Iso639_3 {
    final val value: String = "bht"
  }

  case object Bhunjia extends Iso639_3 {
    final val value: String = "bhu"
  }

  case object Bahau extends Iso639_3 {
    final val value: String = "bhv"
  }

  case object Biak extends Iso639_3 {
    final val value: String = "bhw"
  }

  case object Bhalay extends Iso639_3 {
    final val value: String = "bhx"
  }

  case object Bhele extends Iso639_3 {
    final val value: String = "bhy"
  }

  case object IndonesianBada extends Iso639_3 {
    final val value: String = "bhz"
  }

  case object Badimaya extends Iso639_3 {
    final val value: String = "bia"
  }

  case object Bissa extends Iso639_3 {
    final val value: String = "bib"
  }

  case object Bikaru extends Iso639_3 {
    final val value: String = "bic"
  }

  case object Bidiyo extends Iso639_3 {
    final val value: String = "bid"
  }

  case object Bepour extends Iso639_3 {
    final val value: String = "bie"
  }

  case object Biafada extends Iso639_3 {
    final val value: String = "bif"
  }

  case object Biangai extends Iso639_3 {
    final val value: String = "big"
  }

  case object VaghatYaBijimLegeri extends Iso639_3 {
    final val value: String = "bij"
  }

  case object Bikol extends Iso639_3 {
    final val value: String = "bik"
  }

  case object Bile extends Iso639_3 {
    final val value: String = "bil"
  }

  case object Bimoba extends Iso639_3 {
    final val value: String = "bim"
  }

  case object Bini extends Iso639_3 {
    final val value: String = "bin"
  }

  case object Nai extends Iso639_3 {
    final val value: String = "bio"
  }

  case object Bila extends Iso639_3 {
    final val value: String = "bip"
  }

  case object Bipi extends Iso639_3 {
    final val value: String = "biq"
  }

  case object Bisorio extends Iso639_3 {
    final val value: String = "bir"
  }

  case object Bislama extends Iso639_3 {
    final val value: String = "bis"
  }

  case object Berinomo extends Iso639_3 {
    final val value: String = "bit"
  }

  case object Biete extends Iso639_3 {
    final val value: String = "biu"
  }

  case object SouthernBirifor extends Iso639_3 {
    final val value: String = "biv"
  }

  case object CameroonianKol extends Iso639_3 {
    final val value: String = "biw"
  }

  case object Bijori extends Iso639_3 {
    final val value: String = "bix"
  }

  case object Birhor extends Iso639_3 {
    final val value: String = "biy"
  }

  case object Baloi extends Iso639_3 {
    final val value: String = "biz"
  }

  case object Budza extends Iso639_3 {
    final val value: String = "bja"
  }

  case object Bariji extends Iso639_3 {
    final val value: String = "bjc"
  }

  case object JiaoMien extends Iso639_3 {
    final val value: String = "bje"
  }

  case object JewishNeoAramaic extends Iso639_3 {
    final val value: String = "bjf"
  }

  case object Bidyogo extends Iso639_3 {
    final val value: String = "bjg"
  }

  case object Bahinemo extends Iso639_3 {
    final val value: String = "bjh"
  }

  case object Burji extends Iso639_3 {
    final val value: String = "bji"
  }

  case object Kanauji extends Iso639_3 {
    final val value: String = "bjj"
  }

  case object Barok extends Iso639_3 {
    final val value: String = "bjk"
  }

  case object PapuaNewGuineanBulu extends Iso639_3 {
    final val value: String = "bjl"
  }

  case object Bajelani extends Iso639_3 {
    final val value: String = "bjm"
  }

  case object Banjar extends Iso639_3 {
    final val value: String = "bjn"
  }

  case object SouthernBanda extends Iso639_3 {
    final val value: String = "bjo"
  }

  case object Fanamaket extends Iso639_3 {
    final val value: String = "bjp"
  }

  case object Binumarien extends Iso639_3 {
    final val value: String = "bjr"
  }

  case object Bajan extends Iso639_3 {
    final val value: String = "bjs"
  }

  case object BalantaGanja extends Iso639_3 {
    final val value: String = "bjt"
  }

  case object Busuu extends Iso639_3 {
    final val value: String = "bju"
  }

  case object Bedjond extends Iso639_3 {
    final val value: String = "bjv"
  }

  case object Bakwe extends Iso639_3 {
    final val value: String = "bjw"
  }

  case object BanaoItneg extends Iso639_3 {
    final val value: String = "bjx"
  }

  case object Baruga extends Iso639_3 {
    final val value: String = "bjz"
  }

  case object Kyak extends Iso639_3 {
    final val value: String = "bka"
  }

  case object CameroonianBaka extends Iso639_3 {
    final val value: String = "bkc"
  }

  case object Binukid extends Iso639_3 {
    final val value: String = "bkd"
  }

  case object Beeke extends Iso639_3 {
    final val value: String = "bkf"
  }

  case object Buraka extends Iso639_3 {
    final val value: String = "bkg"
  }

  case object Bakoko extends Iso639_3 {
    final val value: String = "bkh"
  }

  case object Baki extends Iso639_3 {
    final val value: String = "bki"
  }

  case object Pande extends Iso639_3 {
    final val value: String = "bkj"
  }

  case object Brokskat extends Iso639_3 {
    final val value: String = "bkk"
  }

  case object Berik extends Iso639_3 {
    final val value: String = "bkl"
  }

  case object CameroonianKom extends Iso639_3 {
    final val value: String = "bkm"
  }

  case object Bukitan extends Iso639_3 {
    final val value: String = "bkn"
  }

  case object Kwa_ extends Iso639_3 {
    final val value: String = "bko"
  }

  case object Boko extends Iso639_3 {
    final val value: String = "bkp"
  }

  case object Bakairi extends Iso639_3 {
    final val value: String = "bkq"
  }

  case object Bakumpai extends Iso639_3 {
    final val value: String = "bkr"
  }

  case object NorthernSorsoganon extends Iso639_3 {
    final val value: String = "bks"
  }

  case object Boloki extends Iso639_3 {
    final val value: String = "bkt"
  }

  case object Buhid extends Iso639_3 {
    final val value: String = "bku"
  }

  case object Bekwarra extends Iso639_3 {
    final val value: String = "bkv"
  }

  case object Bekwel extends Iso639_3 {
    final val value: String = "bkw"
  }

  case object Baikeno extends Iso639_3 {
    final val value: String = "bkx"
  }

  case object Bokyi extends Iso639_3 {
    final val value: String = "bky"
  }

  case object Bungku extends Iso639_3 {
    final val value: String = "bkz"
  }

  case object Siksika extends Iso639_3 {
    final val value: String = "bla"
  }

  case object Bilua extends Iso639_3 {
    final val value: String = "blb"
  }

  case object BellaCoola extends Iso639_3 {
    final val value: String = "blc"
  }

  case object Bolango extends Iso639_3 {
    final val value: String = "bld"
  }

  case object BalantaKentohe extends Iso639_3 {
    final val value: String = "ble"
  }

  case object Buol extends Iso639_3 {
    final val value: String = "blf"
  }

  case object Balau extends Iso639_3 {
    final val value: String = "blg"
  }

  case object Kuwaa extends Iso639_3 {
    final val value: String = "blh"
  }

  case object Bolia extends Iso639_3 {
    final val value: String = "bli"
  }

  case object Bolongan extends Iso639_3 {
    final val value: String = "blj"
  }

  case object PaoKaren extends Iso639_3 {
    final val value: String = "blk"
  }

  case object Beli extends Iso639_3 {
    final val value: String = "blm"
  }

  case object SouthernCatanduanesBikol extends Iso639_3 {
    final val value: String = "bln"
  }

  case object Anii extends Iso639_3 {
    final val value: String = "blo"
  }

  case object Blablanga extends Iso639_3 {
    final val value: String = "blp"
  }

  case object BaluanPam extends Iso639_3 {
    final val value: String = "blq"
  }

  case object Blang extends Iso639_3 {
    final val value: String = "blr"
  }

  case object Balaesang extends Iso639_3 {
    final val value: String = "bls"
  }

  case object TaiDam extends Iso639_3 {
    final val value: String = "blt"
  }

  case object Kibala extends Iso639_3 {
    final val value: String = "blv"
  }

  case object Balangao extends Iso639_3 {
    final val value: String = "blw"
  }

  case object MagIndiAyta extends Iso639_3 {
    final val value: String = "blx"
  }

  case object Notre extends Iso639_3 {
    final val value: String = "bly"
  }

  case object Balantak extends Iso639_3 {
    final val value: String = "blz"
  }

  case object Lame extends Iso639_3 {
    final val value: String = "bma"
  }

  case object Bembe extends Iso639_3 {
    final val value: String = "bmb"
  }

  case object Biem extends Iso639_3 {
    final val value: String = "bmc"
  }

  case object BagaManduri extends Iso639_3 {
    final val value: String = "bmd"
  }

  case object Limassa extends Iso639_3 {
    final val value: String = "bme"
  }

  case object BomKim extends Iso639_3 {
    final val value: String = "bmf"
  }

  case object Bamwe extends Iso639_3 {
    final val value: String = "bmg"
  }

  case object Kein extends Iso639_3 {
    final val value: String = "bmh"
  }

  case object Bagirmi extends Iso639_3 {
    final val value: String = "bmi"
  }

  case object BoteMajhi extends Iso639_3 {
    final val value: String = "bmj"
  }

  case object Ghayavi extends Iso639_3 {
    final val value: String = "bmk"
  }

  case object Bomboli extends Iso639_3 {
    final val value: String = "bml"
  }

  case object NorthernBetsimisarakaMalagasy extends Iso639_3 {
    final val value: String = "bmm"
  }

  case object Bambalang extends Iso639_3 {
    final val value: String = "bmo"
  }

  case object Bulgebi extends Iso639_3 {
    final val value: String = "bmp"
  }

  case object Bomu extends Iso639_3 {
    final val value: String = "bmq"
  }

  case object Muinane extends Iso639_3 {
    final val value: String = "bmr"
  }

  case object BilmaKanuri extends Iso639_3 {
    final val value: String = "bms"
  }

  case object BiaoMon extends Iso639_3 {
    final val value: String = "bmt"
  }

  case object SombaSiawari extends Iso639_3 {
    final val value: String = "bmu"
  }

  case object Bum extends Iso639_3 {
    final val value: String = "bmv"
  }

  case object Bomwali extends Iso639_3 {
    final val value: String = "bmw"
  }

  case object Baimak extends Iso639_3 {
    final val value: String = "bmx"
  }

  case object Baramu extends Iso639_3 {
    final val value: String = "bmz"
  }

  case object Bonerate extends Iso639_3 {
    final val value: String = "bna"
  }

  case object Bookan extends Iso639_3 {
    final val value: String = "bnb"
  }

  case object Bontok extends Iso639_3 {
    final val value: String = "bnc"
  }

  case object Banda extends Iso639_3 {
    final val value: String = "bnd"
  }

  case object Bintauna extends Iso639_3 {
    final val value: String = "bne"
  }

  case object Masiwang extends Iso639_3 {
    final val value: String = "bnf"
  }

  case object Benga extends Iso639_3 {
    final val value: String = "bng"
  }

  case object Bangi extends Iso639_3 {
    final val value: String = "bni"
  }

  case object EasternTawbuid extends Iso639_3 {
    final val value: String = "bnj"
  }

  case object Bierebo extends Iso639_3 {
    final val value: String = "bnk"
  }

  case object Boon extends Iso639_3 {
    final val value: String = "bnl"
  }

  case object Batanga extends Iso639_3 {
    final val value: String = "bnm"
  }

  case object Bunun extends Iso639_3 {
    final val value: String = "bnn"
  }

  case object Bantoanon extends Iso639_3 {
    final val value: String = "bno"
  }

  case object Bola extends Iso639_3 {
    final val value: String = "bnp"
  }

  case object Bantik extends Iso639_3 {
    final val value: String = "bnq"
  }

  case object ButmasTur extends Iso639_3 {
    final val value: String = "bnr"
  }

  case object Bundeli extends Iso639_3 {
    final val value: String = "bns"
  }

  case object Bentong extends Iso639_3 {
    final val value: String = "bnu"
  }

  case object Bonerif extends Iso639_3 {
    final val value: String = "bnv"
  }

  case object Bisis extends Iso639_3 {
    final val value: String = "bnw"
  }

  case object Bangubangu extends Iso639_3 {
    final val value: String = "bnx"
  }

  case object Bintulu extends Iso639_3 {
    final val value: String = "bny"
  }

  case object Beezen extends Iso639_3 {
    final val value: String = "bnz"
  }

  case object Bora extends Iso639_3 {
    final val value: String = "boa"
  }

  case object Aweer extends Iso639_3 {
    final val value: String = "bob"
  }

  case object Tibetan extends Iso639_3 {
    final val value: String = "bod"
  }

  case object Mundabli extends Iso639_3 {
    final val value: String = "boe"
  }

  case object Bolon extends Iso639_3 {
    final val value: String = "bof"
  }

  case object BamakoSignLanguage extends Iso639_3 {
    final val value: String = "bog"
  }

  case object Boma extends Iso639_3 {
    final val value: String = "boh"
  }

  case object Anjam extends Iso639_3 {
    final val value: String = "boj"
  }

  case object Bonjo extends Iso639_3 {
    final val value: String = "bok"
  }

  case object Bole extends Iso639_3 {
    final val value: String = "bol"
  }

  case object Berom extends Iso639_3 {
    final val value: String = "bom"
  }

  case object Bine extends Iso639_3 {
    final val value: String = "bon"
  }

  case object TiemaceweBozo extends Iso639_3 {
    final val value: String = "boo"
  }

  case object Bonkiman extends Iso639_3 {
    final val value: String = "bop"
  }

  case object Bogaya extends Iso639_3 {
    final val value: String = "boq"
  }

  case object Bororo extends Iso639_3 {
    final val value: String = "bor"
  }

  case object Bosnian extends Iso639_3 {
    final val value: String = "bos"
  }

  case object Bongo extends Iso639_3 {
    final val value: String = "bot"
  }

  case object Bondei extends Iso639_3 {
    final val value: String = "bou"
  }

  case object Tuwuli extends Iso639_3 {
    final val value: String = "bov"
  }

  case object Buamu extends Iso639_3 {
    final val value: String = "box"
  }

  case object CentralAfricanRepublicanBodo extends Iso639_3 {
    final val value: String = "boy"
  }

  case object TieyaxoBozo extends Iso639_3 {
    final val value: String = "boz"
  }

  case object Daakaka extends Iso639_3 {
    final val value: String = "bpa"
  }

  case object BandaBanda extends Iso639_3 {
    final val value: String = "bpd"
  }

  case object Bonggo extends Iso639_3 {
    final val value: String = "bpg"
  }

  case object Botlikh extends Iso639_3 {
    final val value: String = "bph"
  }

  case object Bagupi extends Iso639_3 {
    final val value: String = "bpi"
  }

  case object Binji extends Iso639_3 {
    final val value: String = "bpj"
  }

  case object Orowe extends Iso639_3 {
    final val value: String = "bpk"
  }

  case object PearlingLuggerPidgin extends Iso639_3 {
    final val value: String = "bpl"
  }

  case object Biyom extends Iso639_3 {
    final val value: String = "bpm"
  }

  case object DzaoMin extends Iso639_3 {
    final val value: String = "bpn"
  }

  case object Anasi extends Iso639_3 {
    final val value: String = "bpo"
  }

  case object Kaure extends Iso639_3 {
    final val value: String = "bpp"
  }

  case object BandaMalay extends Iso639_3 {
    final val value: String = "bpq"
  }

  case object KoronadalBlaan extends Iso639_3 {
    final val value: String = "bpr"
  }

  case object SaranganiBlaan extends Iso639_3 {
    final val value: String = "bps"
  }

  case object Bongu extends Iso639_3 {
    final val value: String = "bpu"
  }

  case object BianMarind extends Iso639_3 {
    final val value: String = "bpv"
  }

  case object PapuaNewGuineanBo extends Iso639_3 {
    final val value: String = "bpw"
  }

  case object PalyaBareli extends Iso639_3 {
    final val value: String = "bpx"
  }

  case object Bishnupriya extends Iso639_3 {
    final val value: String = "bpy"
  }

  case object Bilba extends Iso639_3 {
    final val value: String = "bpz"
  }

  case object Tchumbuli extends Iso639_3 {
    final val value: String = "bqa"
  }

  case object Bagusa extends Iso639_3 {
    final val value: String = "bqb"
  }

  case object BeninBoko extends Iso639_3 {
    final val value: String = "bqc"
  }

  case object Bung extends Iso639_3 {
    final val value: String = "bqd"
  }

  case object BagoKusuntu extends Iso639_3 {
    final val value: String = "bqg"
  }

  case object Baima extends Iso639_3 {
    final val value: String = "bqh"
  }

  case object Bakhtiari extends Iso639_3 {
    final val value: String = "bqi"
  }

  case object Bandial extends Iso639_3 {
    final val value: String = "bqj"
  }

  case object BandaMbres extends Iso639_3 {
    final val value: String = "bqk"
  }

  case object Bilakura extends Iso639_3 {
    final val value: String = "bql"
  }

  case object Wumboko extends Iso639_3 {
    final val value: String = "bqm"
  }

  case object BulgarianSignLanguage extends Iso639_3 {
    final val value: String = "bqn"
  }

  case object Balo extends Iso639_3 {
    final val value: String = "bqo"
  }

  case object Busa extends Iso639_3 {
    final val value: String = "bqp"
  }

  case object Biritai extends Iso639_3 {
    final val value: String = "bqq"
  }

  case object Burusu extends Iso639_3 {
    final val value: String = "bqr"
  }

  case object Bosngun extends Iso639_3 {
    final val value: String = "bqs"
  }

  case object Bamukumbit extends Iso639_3 {
    final val value: String = "bqt"
  }

  case object Boguru extends Iso639_3 {
    final val value: String = "bqu"
  }

  case object KoroWachi extends Iso639_3 {
    final val value: String = "bqv"
  }

  case object NigerianBuru extends Iso639_3 {
    final val value: String = "bqw"
  }

  case object Baangi extends Iso639_3 {
    final val value: String = "bqx"
  }

  case object BengkalaSignLanguage extends Iso639_3 {
    final val value: String = "bqy"
  }

  case object Bakaka extends Iso639_3 {
    final val value: String = "bqz"
  }

  case object Braj extends Iso639_3 {
    final val value: String = "bra"
  }

  case object Lave extends Iso639_3 {
    final val value: String = "brb"
  }

  case object Baraamu extends Iso639_3 {
    final val value: String = "brd"
  }

  case object Breton extends Iso639_3 {
    final val value: String = "bre"
  }

  case object Bera extends Iso639_3 {
    final val value: String = "brf"
  }

  case object Baure extends Iso639_3 {
    final val value: String = "brg"
  }

  case object Brahui extends Iso639_3 {
    final val value: String = "brh"
  }

  case object Mokpwe extends Iso639_3 {
    final val value: String = "bri"
  }

  case object Bieria extends Iso639_3 {
    final val value: String = "brj"
  }

  case object Birwa extends Iso639_3 {
    final val value: String = "brl"
  }

  case object Barambu extends Iso639_3 {
    final val value: String = "brm"
  }

  case object Boruca extends Iso639_3 {
    final val value: String = "brn"
  }

  case object Brokkat extends Iso639_3 {
    final val value: String = "bro"
  }

  case object Barapasi extends Iso639_3 {
    final val value: String = "brp"
  }

  case object Breri extends Iso639_3 {
    final val value: String = "brq"
  }

  case object Birao extends Iso639_3 {
    final val value: String = "brr"
  }

  case object Baras extends Iso639_3 {
    final val value: String = "brs"
  }

  case object Bitare extends Iso639_3 {
    final val value: String = "brt"
  }

  case object EasternBru extends Iso639_3 {
    final val value: String = "bru"
  }

  case object WesternBru extends Iso639_3 {
    final val value: String = "brv"
  }

  case object Bellari extends Iso639_3 {
    final val value: String = "brw"
  }

  case object IndianBodo extends Iso639_3 {
    final val value: String = "brx"
  }

  case object Burui extends Iso639_3 {
    final val value: String = "bry"
  }

  case object Bilbil extends Iso639_3 {
    final val value: String = "brz"
  }

  case object Abinomn extends Iso639_3 {
    final val value: String = "bsa"
  }

  case object BruneiBisaya extends Iso639_3 {
    final val value: String = "bsb"
  }

  case object Bassari extends Iso639_3 {
    final val value: String = "bsc"
  }

  case object Wushi extends Iso639_3 {
    final val value: String = "bse"
  }

  case object Bauchi extends Iso639_3 {
    final val value: String = "bsf"
  }

  case object Bashkardi extends Iso639_3 {
    final val value: String = "bsg"
  }

  case object Kati extends Iso639_3 {
    final val value: String = "bsh"
  }

  case object Bassossi extends Iso639_3 {
    final val value: String = "bsi"
  }

  case object Bangwinji extends Iso639_3 {
    final val value: String = "bsj"
  }

  case object Burushaski extends Iso639_3 {
    final val value: String = "bsk"
  }

  case object Busami extends Iso639_3 {
    final val value: String = "bsm"
  }

  case object BarasanaEduria extends Iso639_3 {
    final val value: String = "bsn"
  }

  case object Buso extends Iso639_3 {
    final val value: String = "bso"
  }

  case object BagaSitemu extends Iso639_3 {
    final val value: String = "bsp"
  }

  case object Bassa extends Iso639_3 {
    final val value: String = "bsq"
  }

  case object BassaKontagora extends Iso639_3 {
    final val value: String = "bsr"
  }

  case object Akoose extends Iso639_3 {
    final val value: String = "bss"
  }

  case object Basketo extends Iso639_3 {
    final val value: String = "bst"
  }

  case object Bahonsuai extends Iso639_3 {
    final val value: String = "bsu"
  }

  case object Baiso extends Iso639_3 {
    final val value: String = "bsw"
  }

  case object Yangkam extends Iso639_3 {
    final val value: String = "bsx"
  }

  case object SabahBisaya extends Iso639_3 {
    final val value: String = "bsy"
  }

  case object Bata extends Iso639_3 {
    final val value: String = "bta"
  }

  case object CameroonianBati extends Iso639_3 {
    final val value: String = "btc"
  }

  case object BatakDairi extends Iso639_3 {
    final val value: String = "btd"
  }

  case object Birgit extends Iso639_3 {
    final val value: String = "btf"
  }

  case object GagnoaBete extends Iso639_3 {
    final val value: String = "btg"
  }

  case object BiatahBidayuh extends Iso639_3 {
    final val value: String = "bth"
  }

  case object Burate extends Iso639_3 {
    final val value: String = "bti"
  }

  case object BacaneseMalay extends Iso639_3 {
    final val value: String = "btj"
  }

  case object BatakMandailing extends Iso639_3 {
    final val value: String = "btm"
  }

  case object Ratagnon extends Iso639_3 {
    final val value: String = "btn"
  }

  case object RinconadaBikol extends Iso639_3 {
    final val value: String = "bto"
  }

  case object Budibud extends Iso639_3 {
    final val value: String = "btp"
  }

  case object Batek extends Iso639_3 {
    final val value: String = "btq"
  }

  case object Baetora extends Iso639_3 {
    final val value: String = "btr"
  }

  case object BatakSimalungun extends Iso639_3 {
    final val value: String = "bts"
  }

  case object BeteBendi extends Iso639_3 {
    final val value: String = "btt"
  }

  case object Batu extends Iso639_3 {
    final val value: String = "btu"
  }

  case object Bateri extends Iso639_3 {
    final val value: String = "btv"
  }

  case object Butuanon extends Iso639_3 {
    final val value: String = "btw"
  }

  case object BatakKaro extends Iso639_3 {
    final val value: String = "btx"
  }

  case object Bobot extends Iso639_3 {
    final val value: String = "bty"
  }

  case object BatakAlasKluet extends Iso639_3 {
    final val value: String = "btz"
  }

  case object Buriat extends Iso639_3 {
    final val value: String = "bua"
  }

  case object Bua extends Iso639_3 {
    final val value: String = "bub"
  }

  case object Bushi extends Iso639_3 {
    final val value: String = "buc"
  }

  case object Ntcham extends Iso639_3 {
    final val value: String = "bud"
  }

  case object Bushoong extends Iso639_3 {
    final val value: String = "buf"
  }

  case object Buginese extends Iso639_3 {
    final val value: String = "bug"
  }

  case object YounuoBunu extends Iso639_3 {
    final val value: String = "buh"
  }

  case object Bongili extends Iso639_3 {
    final val value: String = "bui"
  }

  case object BasaGurmana extends Iso639_3 {
    final val value: String = "buj"
  }

  case object Bugawac extends Iso639_3 {
    final val value: String = "buk"
  }

  case object Bulgarian extends Iso639_3 {
    final val value: String = "bul"
  }

  case object CameroonianBulu extends Iso639_3 {
    final val value: String = "bum"
  }

  case object Sherbro extends Iso639_3 {
    final val value: String = "bun"
  }

  case object Terei extends Iso639_3 {
    final val value: String = "buo"
  }

  case object Busoa extends Iso639_3 {
    final val value: String = "bup"
  }

  case object Brem extends Iso639_3 {
    final val value: String = "buq"
  }

  case object Bokobaru extends Iso639_3 {
    final val value: String = "bus"
  }

  case object Bungain extends Iso639_3 {
    final val value: String = "but"
  }

  case object Budu extends Iso639_3 {
    final val value: String = "buu"
  }

  case object Bun extends Iso639_3 {
    final val value: String = "buv"
  }

  case object Bubi extends Iso639_3 {
    final val value: String = "buw"
  }

  case object Boghom extends Iso639_3 {
    final val value: String = "bux"
  }

  case object BullomSo extends Iso639_3 {
    final val value: String = "buy"
  }

  case object Bukwen extends Iso639_3 {
    final val value: String = "buz"
  }

  case object Barein extends Iso639_3 {
    final val value: String = "bva"
  }

  case object Bube extends Iso639_3 {
    final val value: String = "bvb"
  }

  case object Baelelea extends Iso639_3 {
    final val value: String = "bvc"
  }

  case object Baeggu extends Iso639_3 {
    final val value: String = "bvd"
  }

  case object BerauMalay extends Iso639_3 {
    final val value: String = "bve"
  }

  case object Boor extends Iso639_3 {
    final val value: String = "bvf"
  }

  case object Bonkeng extends Iso639_3 {
    final val value: String = "bvg"
  }

  case object Bure extends Iso639_3 {
    final val value: String = "bvh"
  }

  case object BelandaViri extends Iso639_3 {
    final val value: String = "bvi"
  }

  case object Baan extends Iso639_3 {
    final val value: String = "bvj"
  }

  case object Bukat extends Iso639_3 {
    final val value: String = "bvk"
  }

  case object BolivianSignLanguage extends Iso639_3 {
    final val value: String = "bvl"
  }

  case object Bamunka extends Iso639_3 {
    final val value: String = "bvm"
  }

  case object Buna extends Iso639_3 {
    final val value: String = "bvn"
  }

  case object Bolgo extends Iso639_3 {
    final val value: String = "bvo"
  }

  case object Bumang extends Iso639_3 {
    final val value: String = "bvp"
  }

  case object Birri extends Iso639_3 {
    final val value: String = "bvq"
  }

  case object Burarra extends Iso639_3 {
    final val value: String = "bvr"
  }

  case object IndonesianBati extends Iso639_3 {
    final val value: String = "bvt"
  }

  case object BukitMalay extends Iso639_3 {
    final val value: String = "bvu"
  }

  case object Boga extends Iso639_3 {
    final val value: String = "bvw"
  }

  case object Dibole extends Iso639_3 {
    final val value: String = "bvx"
  }

  case object Baybayanon extends Iso639_3 {
    final val value: String = "bvy"
  }

  case object Bauzi extends Iso639_3 {
    final val value: String = "bvz"
  }

  case object Bwatoo extends Iso639_3 {
    final val value: String = "bwa"
  }

  case object NamosiNaitasiriSerua extends Iso639_3 {
    final val value: String = "bwb"
  }

  case object Bwile extends Iso639_3 {
    final val value: String = "bwc"
  }

  case object Bwaidoka extends Iso639_3 {
    final val value: String = "bwd"
  }

  case object BweKaren extends Iso639_3 {
    final val value: String = "bwe"
  }

  case object Boselewa extends Iso639_3 {
    final val value: String = "bwf"
  }

  case object Barwe extends Iso639_3 {
    final val value: String = "bwg"
  }

  case object Bishuo extends Iso639_3 {
    final val value: String = "bwh"
  }

  case object Baniwa extends Iso639_3 {
    final val value: String = "bwi"
  }

  case object LaaLaaBwamu extends Iso639_3 {
    final val value: String = "bwj"
  }

  case object Bauwaki extends Iso639_3 {
    final val value: String = "bwk"
  }

  case object Bwela extends Iso639_3 {
    final val value: String = "bwl"
  }

  case object Biwat extends Iso639_3 {
    final val value: String = "bwm"
  }

  case object WunaiBunu extends Iso639_3 {
    final val value: String = "bwn"
  }

  case object EthiopianBoro extends Iso639_3 {
    final val value: String = "bwo"
  }

  case object MandoboBawah extends Iso639_3 {
    final val value: String = "bwp"
  }

  case object BoboMadare extends Iso639_3 {
    final val value: String = "bwq"
  }

  case object BuraPabir extends Iso639_3 {
    final val value: String = "bwr"
  }

  case object Bomboma extends Iso639_3 {
    final val value: String = "bws"
  }

  case object BafawBalong extends Iso639_3 {
    final val value: String = "bwt"
  }

  case object GhanianBuli extends Iso639_3 {
    final val value: String = "bwu"
  }

  case object Bwa extends Iso639_3 {
    final val value: String = "bww"
  }

  case object NaoBunu extends Iso639_3 {
    final val value: String = "bwx"
  }

  case object CwiBwamu extends Iso639_3 {
    final val value: String = "bwy"
  }

  case object Bwisi extends Iso639_3 {
    final val value: String = "bwz"
  }

  case object Tairaha extends Iso639_3 {
    final val value: String = "bxa"
  }

  case object BelandaBor extends Iso639_3 {
    final val value: String = "bxb"
  }

  case object Molengue extends Iso639_3 {
    final val value: String = "bxc"
  }

  case object Pela extends Iso639_3 {
    final val value: String = "bxd"
  }

  case object Birale extends Iso639_3 {
    final val value: String = "bxe"
  }

  case object Bilur extends Iso639_3 {
    final val value: String = "bxf"
  }

  case object Bangala extends Iso639_3 {
    final val value: String = "bxg"
  }

  case object Buhutu extends Iso639_3 {
    final val value: String = "bxh"
  }

  case object Bayungu extends Iso639_3 {
    final val value: String = "bxj"
  }

  case object Bukusu extends Iso639_3 {
    final val value: String = "bxk"
  }

  case object Jalkunan extends Iso639_3 {
    final val value: String = "bxl"
  }

  case object MongoliaBuriat extends Iso639_3 {
    final val value: String = "bxm"
  }

  case object Burduna extends Iso639_3 {
    final val value: String = "bxn"
  }

  case object Barikanchi extends Iso639_3 {
    final val value: String = "bxo"
  }

  case object Bebil extends Iso639_3 {
    final val value: String = "bxp"
  }

  case object Beele extends Iso639_3 {
    final val value: String = "bxq"
  }

  case object RussiaBuriat extends Iso639_3 {
    final val value: String = "bxr"
  }

  case object Busam extends Iso639_3 {
    final val value: String = "bxs"
  }

  case object ChinaBuriat extends Iso639_3 {
    final val value: String = "bxu"
  }

  case object Berakou extends Iso639_3 {
    final val value: String = "bxv"
  }

  case object Bankagooma extends Iso639_3 {
    final val value: String = "bxw"
  }

  case object Binahari extends Iso639_3 {
    final val value: String = "bxz"
  }

  case object Batak extends Iso639_3 {
    final val value: String = "bya"
  }

  case object Bikya extends Iso639_3 {
    final val value: String = "byb"
  }

  case object Ubaghara extends Iso639_3 {
    final val value: String = "byc"
  }

  case object Benyadu extends Iso639_3 {
    final val value: String = "byd"
  }

  case object Pouye extends Iso639_3 {
    final val value: String = "bye"
  }

  case object Bete extends Iso639_3 {
    final val value: String = "byf"
  }

  case object Bhujel extends Iso639_3 {
    final val value: String = "byh"
  }

  case object Buyu extends Iso639_3 {
    final val value: String = "byi"
  }

  case object NigerianBina extends Iso639_3 {
    final val value: String = "byj"
  }

  case object Biao extends Iso639_3 {
    final val value: String = "byk"
  }

  case object Bayono extends Iso639_3 {
    final val value: String = "byl"
  }

  case object Bidyara extends Iso639_3 {
    final val value: String = "bym"
  }

  case object Bilin extends Iso639_3 {
    final val value: String = "byn"
  }

  case object Biyo extends Iso639_3 {
    final val value: String = "byo"
  }

  case object Bumaji extends Iso639_3 {
    final val value: String = "byp"
  }

  case object Baruya extends Iso639_3 {
    final val value: String = "byr"
  }

  case object Burak extends Iso639_3 {
    final val value: String = "bys"
  }

  case object Medumba extends Iso639_3 {
    final val value: String = "byv"
  }

  case object Belhariya extends Iso639_3 {
    final val value: String = "byw"
  }

  case object Qaqet extends Iso639_3 {
    final val value: String = "byx"
  }

  case object Banaro extends Iso639_3 {
    final val value: String = "byz"
  }

  case object Bandi extends Iso639_3 {
    final val value: String = "bza"
  }

  case object Andio extends Iso639_3 {
    final val value: String = "bzb"
  }

  case object BetsimisarakaMalagasy extends Iso639_3 {
    final val value: String = "bzc"
  }

  case object Bribri extends Iso639_3 {
    final val value: String = "bzd"
  }

  case object JenaamaBozo extends Iso639_3 {
    final val value: String = "bze"
  }

  case object Boikin extends Iso639_3 {
    final val value: String = "bzf"
  }

  case object Babuza extends Iso639_3 {
    final val value: String = "bzg"
  }

  case object MaposBuang extends Iso639_3 {
    final val value: String = "bzh"
  }

  case object Bisu extends Iso639_3 {
    final val value: String = "bzi"
  }

  case object KriolEnglish extends Iso639_3 {
    final val value: String = "bzj"
  }

  case object NicaraguaCreoleEnglish extends Iso639_3 {
    final val value: String = "bzk"
  }

  case object SulawesianBoano extends Iso639_3 {
    final val value: String = "bzl"
  }

  case object Bolondo extends Iso639_3 {
    final val value: String = "bzm"
  }

  case object MalukuanBoano extends Iso639_3 {
    final val value: String = "bzn"
  }

  case object Bozaba extends Iso639_3 {
    final val value: String = "bzo"
  }

  case object Kemberano extends Iso639_3 {
    final val value: String = "bzp"
  }

  case object IndonesianBuli extends Iso639_3 {
    final val value: String = "bzq"
  }

  case object BrazilianSignLanguage extends Iso639_3 {
    final val value: String = "bzs"
  }

  case object Burmeso extends Iso639_3 {
    final val value: String = "bzu"
  }

  case object Naami extends Iso639_3 {
    final val value: String = "bzv"
  }

  case object NigerianBasa extends Iso639_3 {
    final val value: String = "bzw"
  }

  case object KelengaxoBozo extends Iso639_3 {
    final val value: String = "bzx"
  }

  case object Obanliku extends Iso639_3 {
    final val value: String = "bzy"
  }

  case object Evant extends Iso639_3 {
    final val value: String = "bzz"
  }

  case object Chorti extends Iso639_3 {
    final val value: String = "caa"
  }

  case object Garifuna extends Iso639_3 {
    final val value: String = "cab"
  }

  case object Chuj extends Iso639_3 {
    final val value: String = "cac"
  }

  case object Caddo extends Iso639_3 {
    final val value: String = "cad"
  }

  case object Lehar extends Iso639_3 {
    final val value: String = "cae"
  }

  case object SouthernCarrier extends Iso639_3 {
    final val value: String = "caf"
  }

  case object Nivacle extends Iso639_3 {
    final val value: String = "cag"
  }

  case object Cahuarano extends Iso639_3 {
    final val value: String = "cah"
  }

  case object Kaqchikel extends Iso639_3 {
    final val value: String = "cak"
  }

  case object Carolinian extends Iso639_3 {
    final val value: String = "cal"
  }

  case object Cemuhi extends Iso639_3 {
    final val value: String = "cam"
  }

  case object Chambri extends Iso639_3 {
    final val value: String = "can"
  }

  case object Chacobo extends Iso639_3 {
    final val value: String = "cao"
  }

  case object Chipaya extends Iso639_3 {
    final val value: String = "cap"
  }

  case object CarNicobarese extends Iso639_3 {
    final val value: String = "caq"
  }

  case object GalibiCarib extends Iso639_3 {
    final val value: String = "car"
  }

  case object Tsimane extends Iso639_3 {
    final val value: String = "cas"
  }

  case object Catalan extends Iso639_3 {
    final val value: String = "cat"
  }

  case object Cavinena extends Iso639_3 {
    final val value: String = "cav"
  }

  case object Callawalla extends Iso639_3 {
    final val value: String = "caw"
  }

  case object Chiquitano extends Iso639_3 {
    final val value: String = "cax"
  }

  case object Cayuga extends Iso639_3 {
    final val value: String = "cay"
  }

  case object Cabiyari extends Iso639_3 {
    final val value: String = "cbb"
  }

  case object Carapana extends Iso639_3 {
    final val value: String = "cbc"
  }

  case object Carijona extends Iso639_3 {
    final val value: String = "cbd"
  }

  case object Chimila extends Iso639_3 {
    final val value: String = "cbg"
  }

  case object Chachi extends Iso639_3 {
    final val value: String = "cbi"
  }

  case object EdeCabe extends Iso639_3 {
    final val value: String = "cbj"
  }

  case object Chavacano extends Iso639_3 {
    final val value: String = "cbk"
  }

  case object BualkhawChin extends Iso639_3 {
    final val value: String = "cbl"
  }

  case object Nyahkur extends Iso639_3 {
    final val value: String = "cbn"
  }

  case object Izora extends Iso639_3 {
    final val value: String = "cbo"
  }

  case object Tsucuba extends Iso639_3 {
    final val value: String = "cbq"
  }

  case object CashiboCacataibo extends Iso639_3 {
    final val value: String = "cbr"
  }

  case object Cashinahua extends Iso639_3 {
    final val value: String = "cbs"
  }

  case object Chayahuita extends Iso639_3 {
    final val value: String = "cbt"
  }

  case object CandoshiShapra extends Iso639_3 {
    final val value: String = "cbu"
  }

  case object Cacua extends Iso639_3 {
    final val value: String = "cbv"
  }

  case object Kinabalian extends Iso639_3 {
    final val value: String = "cbw"
  }

  case object Carabayo extends Iso639_3 {
    final val value: String = "cby"
  }

  case object Chamicuro extends Iso639_3 {
    final val value: String = "ccc"
  }

  case object CafundoCreole extends Iso639_3 {
    final val value: String = "ccd"
  }

  case object Chopi extends Iso639_3 {
    final val value: String = "cce"
  }

  case object SambaDaka extends Iso639_3 {
    final val value: String = "ccg"
  }

  case object Atsam extends Iso639_3 {
    final val value: String = "cch"
  }

  case object Kasanga extends Iso639_3 {
    final val value: String = "ccj"
  }

  case object CutchiSwahili extends Iso639_3 {
    final val value: String = "ccl"
  }

  case object CreoleMalay extends Iso639_3 {
    final val value: String = "ccm"
  }

  case object ComaltepecChinantec extends Iso639_3 {
    final val value: String = "cco"
  }

  case object Chakma extends Iso639_3 {
    final val value: String = "ccp"
  }

  case object Choni extends Iso639_3 {
    final val value: String = "cda"
  }

  case object Chenchu extends Iso639_3 {
    final val value: String = "cde"
  }

  case object Chiru extends Iso639_3 {
    final val value: String = "cdf"
  }

  case object Chamari extends Iso639_3 {
    final val value: String = "cdg"
  }

  case object Chambeali extends Iso639_3 {
    final val value: String = "cdh"
  }

  case object Chodri extends Iso639_3 {
    final val value: String = "cdi"
  }

  case object Churahi extends Iso639_3 {
    final val value: String = "cdj"
  }

  case object Chepang extends Iso639_3 {
    final val value: String = "cdm"
  }

  case object Chaudangsi extends Iso639_3 {
    final val value: String = "cdn"
  }

  case object DongChinese extends Iso639_3 {
    final val value: String = "cdo"
  }

  case object CindaRegiTiyal extends Iso639_3 {
    final val value: String = "cdr"
  }

  case object ChadianSignLanguage extends Iso639_3 {
    final val value: String = "cds"
  }

  case object Chadong extends Iso639_3 {
    final val value: String = "cdy"
  }

  case object Koda extends Iso639_3 {
    final val value: String = "cdz"
  }

  case object Cebuano extends Iso639_3 {
    final val value: String = "ceb"
  }

  case object Chamacoco extends Iso639_3 {
    final val value: String = "ceg"
  }

  case object EasternKhumiChin extends Iso639_3 {
    final val value: String = "cek"
  }

  case object Cen extends Iso639_3 {
    final val value: String = "cen"
  }

  case object Czech extends Iso639_3 {
    final val value: String = "ces"
  }

  case object Centuum extends Iso639_3 {
    final val value: String = "cet"
  }

  case object DijimBwilim extends Iso639_3 {
    final val value: String = "cfa"
  }

  case object Cara extends Iso639_3 {
    final val value: String = "cfd"
  }

  case object ComoKarim extends Iso639_3 {
    final val value: String = "cfg"
  }

  case object FalamChin extends Iso639_3 {
    final val value: String = "cfm"
  }

  case object Changriwa extends Iso639_3 {
    final val value: String = "cga"
  }

  case object Kagayanen extends Iso639_3 {
    final val value: String = "cgc"
  }

  case object Chiga extends Iso639_3 {
    final val value: String = "cgg"
  }

  case object Chocangacakha extends Iso639_3 {
    final val value: String = "cgk"
  }

  case object Chamorro extends Iso639_3 {
    final val value: String = "cha"
  }

  case object OaxacaChontal extends Iso639_3 {
    final val value: String = "chd"
  }

  case object Chechen extends Iso639_3 {
    final val value: String = "che"
  }

  case object TabascoChontal extends Iso639_3 {
    final val value: String = "chf"
  }

  case object Chinook extends Iso639_3 {
    final val value: String = "chh"
  }

  case object OjitlanChinantec extends Iso639_3 {
    final val value: String = "chj"
  }

  case object Chuukese extends Iso639_3 {
    final val value: String = "chk"
  }

  case object Cahuilla extends Iso639_3 {
    final val value: String = "chl"
  }

  case object RussianMari extends Iso639_3 {
    final val value: String = "chm"
  }

  case object ChinookJargon extends Iso639_3 {
    final val value: String = "chn"
  }

  case object Choctaw extends Iso639_3 {
    final val value: String = "cho"
  }

  case object Chipewyan extends Iso639_3 {
    final val value: String = "chp"
  }

  case object QuiotepecChinantec extends Iso639_3 {
    final val value: String = "chq"
  }

  case object Cherokee extends Iso639_3 {
    final val value: String = "chr"
  }

  case object Chuvash extends Iso639_3 {
    final val value: String = "chv"
  }

  case object Chuwabu extends Iso639_3 {
    final val value: String = "chw"
  }

  case object Chantyal extends Iso639_3 {
    final val value: String = "chx"
  }

  case object Cheyenne extends Iso639_3 {
    final val value: String = "chy"
  }

  case object OzumacinChinantec extends Iso639_3 {
    final val value: String = "chz"
  }

  case object CiaCia extends Iso639_3 {
    final val value: String = "cia"
  }

  case object CiGbe extends Iso639_3 {
    final val value: String = "cib"
  }

  case object Chickasaw extends Iso639_3 {
    final val value: String = "cic"
  }

  case object Cineni extends Iso639_3 {
    final val value: String = "cie"
  }

  case object Chinali extends Iso639_3 {
    final val value: String = "cih"
  }

  case object ChitkuliKinnauri extends Iso639_3 {
    final val value: String = "cik"
  }

  case object Cimbrian extends Iso639_3 {
    final val value: String = "cim"
  }

  case object CintaLarga extends Iso639_3 {
    final val value: String = "cin"
  }

  case object Chiapanec extends Iso639_3 {
    final val value: String = "cip"
  }

  case object Tiri extends Iso639_3 {
    final val value: String = "cir"
  }

  case object Chippewa extends Iso639_3 {
    final val value: String = "ciw"
  }

  case object Chaima extends Iso639_3 {
    final val value: String = "ciy"
  }

  case object WesternCham extends Iso639_3 {
    final val value: String = "cja"
  }

  case object Chru extends Iso639_3 {
    final val value: String = "cje"
  }

  case object Chamalal extends Iso639_3 {
    final val value: String = "cji"
  }

  case object Chokwe extends Iso639_3 {
    final val value: String = "cjk"
  }

  case object EasternCham extends Iso639_3 {
    final val value: String = "cjm"
  }

  case object Chenapian extends Iso639_3 {
    final val value: String = "cjn"
  }

  case object AsheninkaPajonal extends Iso639_3 {
    final val value: String = "cjo"
  }

  case object Cabecar extends Iso639_3 {
    final val value: String = "cjp"
  }

  case object Shor extends Iso639_3 {
    final val value: String = "cjs"
  }

  case object Chuave extends Iso639_3 {
    final val value: String = "cjv"
  }

  case object JinyuChinese extends Iso639_3 {
    final val value: String = "cjy"
  }

  case object CentralKurdish extends Iso639_3 {
    final val value: String = "ckb"
  }

  case object Chak extends Iso639_3 {
    final val value: String = "ckh"
  }

  case object Cibak extends Iso639_3 {
    final val value: String = "ckl"
  }

  case object KaangChin extends Iso639_3 {
    final val value: String = "ckn"
  }

  case object Anufo extends Iso639_3 {
    final val value: String = "cko"
  }

  case object Kajakse extends Iso639_3 {
    final val value: String = "ckq"
  }

  case object Kairak extends Iso639_3 {
    final val value: String = "ckr"
  }

  case object Tayo extends Iso639_3 {
    final val value: String = "cks"
  }

  case object Chukot extends Iso639_3 {
    final val value: String = "ckt"
  }

  case object Koasati extends Iso639_3 {
    final val value: String = "cku"
  }

  case object Kavalan extends Iso639_3 {
    final val value: String = "ckv"
  }

  case object Caka extends Iso639_3 {
    final val value: String = "ckx"
  }

  case object CakfemMushere extends Iso639_3 {
    final val value: String = "cky"
  }

  case object CakchiquelQuicheMixedLanguage extends Iso639_3 {
    final val value: String = "ckz"
  }

  case object Ron extends Iso639_3 {
    final val value: String = "cla"
  }

  case object Chilcotin extends Iso639_3 {
    final val value: String = "clc"
  }

  case object ChaldeanNeoAramaic extends Iso639_3 {
    final val value: String = "cld"
  }

  case object LealaoChinantec extends Iso639_3 {
    final val value: String = "cle"
  }

  case object Chilisso extends Iso639_3 {
    final val value: String = "clh"
  }

  case object Chakali extends Iso639_3 {
    final val value: String = "cli"
  }

  case object LaituChin extends Iso639_3 {
    final val value: String = "clj"
  }

  case object IduMishmi extends Iso639_3 {
    final val value: String = "clk"
  }

  case object Chala extends Iso639_3 {
    final val value: String = "cll"
  }

  case object Clallam extends Iso639_3 {
    final val value: String = "clm"
  }

  case object LowlandOaxacaChontal extends Iso639_3 {
    final val value: String = "clo"
  }

  case object LautuChin extends Iso639_3 {
    final val value: String = "clt"
  }

  case object Caluyanun extends Iso639_3 {
    final val value: String = "clu"
  }

  case object Chulym extends Iso639_3 {
    final val value: String = "clw"
  }

  case object HighlandChatino extends Iso639_3 {
    final val value: String = "cly"
  }

  case object Maa extends Iso639_3 {
    final val value: String = "cma"
  }

  case object Cerma extends Iso639_3 {
    final val value: String = "cme"
  }

  case object EmberaChami extends Iso639_3 {
    final val value: String = "cmi"
  }

  case object Campalagian extends Iso639_3 {
    final val value: String = "cml"
  }

  case object MandarinChinese extends Iso639_3 {
    final val value: String = "cmn"
  }

  case object CentralMnong extends Iso639_3 {
    final val value: String = "cmo"
  }

  case object KhimiChin extends Iso639_3 {
    final val value: String = "cmr"
  }

  case object Camtho extends Iso639_3 {
    final val value: String = "cmt"
  }

  case object Changthang extends Iso639_3 {
    final val value: String = "cna"
  }

  case object ChinbonChin extends Iso639_3 {
    final val value: String = "cnb"
  }

  case object Coong extends Iso639_3 {
    final val value: String = "cnc"
  }

  case object NorthernQiang extends Iso639_3 {
    final val value: String = "cng"
  }

  case object HakhaChin extends Iso639_3 {
    final val value: String = "cnh"
  }

  case object Ashaninka extends Iso639_3 {
    final val value: String = "cni"
  }

  case object KhumiChin extends Iso639_3 {
    final val value: String = "cnk"
  }

  case object LalanaChinantec extends Iso639_3 {
    final val value: String = "cnl"
  }

  case object Con extends Iso639_3 {
    final val value: String = "cno"
  }

  case object Montenegrin extends Iso639_3 {
    final val value: String = "cnr"
  }

  case object CentralAsmat extends Iso639_3 {
    final val value: String = "cns"
  }

  case object TepetotutlaChinantec extends Iso639_3 {
    final val value: String = "cnt"
  }

  case object Chenoua extends Iso639_3 {
    final val value: String = "cnu"
  }

  case object NgawnChin extends Iso639_3 {
    final val value: String = "cnw"
  }

  case object IslandsMalay extends Iso639_3 {
    final val value: String = "coa"
  }

  case object Cocopa extends Iso639_3 {
    final val value: String = "coc"
  }

  case object CocamaCocamilla extends Iso639_3 {
    final val value: String = "cod"
  }

  case object Koreguaje extends Iso639_3 {
    final val value: String = "coe"
  }

  case object Colorado extends Iso639_3 {
    final val value: String = "cof"
  }

  case object Chong extends Iso639_3 {
    final val value: String = "cog"
  }

  case object ChonyiDzihanaKauma extends Iso639_3 {
    final val value: String = "coh"
  }

  case object TeresaCora extends Iso639_3 {
    final val value: String = "cok"
  }

  case object ColumbiaWenatchi extends Iso639_3 {
    final val value: String = "col"
  }

  case object Comanche extends Iso639_3 {
    final val value: String = "com"
  }

  case object Cofan extends Iso639_3 {
    final val value: String = "con"
  }

  case object Comox extends Iso639_3 {
    final val value: String = "coo"
  }

  case object Cornish extends Iso639_3 {
    final val value: String = "cor"
  }

  case object Corsican extends Iso639_3 {
    final val value: String = "cos"
  }

  case object Caquinte extends Iso639_3 {
    final val value: String = "cot"
  }

  case object Wamey extends Iso639_3 {
    final val value: String = "cou"
  }

  case object CaoMiao extends Iso639_3 {
    final val value: String = "cov"
  }

  case object Nanti extends Iso639_3 {
    final val value: String = "cox"
  }

  case object Chochotec extends Iso639_3 {
    final val value: String = "coz"
  }

  case object PalantlaChinantec extends Iso639_3 {
    final val value: String = "cpa"
  }

  case object UcayaliYuruaAsheninka extends Iso639_3 {
    final val value: String = "cpb"
  }

  case object AjyininkaApurucayali extends Iso639_3 {
    final val value: String = "cpc"
  }

  case object ChinesePidginEnglish extends Iso639_3 {
    final val value: String = "cpi"
  }

  case object Cherepon extends Iso639_3 {
    final val value: String = "cpn"
  }

  case object Kpeego extends Iso639_3 {
    final val value: String = "cpo"
  }

  case object Capiznon extends Iso639_3 {
    final val value: String = "cps"
  }

  case object PichisAsheninka extends Iso639_3 {
    final val value: String = "cpu"
  }

  case object XianChinese extends Iso639_3 {
    final val value: String = "cpx"
  }

  case object UcayaliAsheninka extends Iso639_3 {
    final val value: String = "cpy"
  }

  case object ClusterMiao extends Iso639_3 {
    final val value: String = "cqd"
  }

  case object Chara extends Iso639_3 {
    final val value: String = "cra"
  }

  case object Lonwolwol extends Iso639_3 {
    final val value: String = "crc"
  }

  case object CoeurdAlene extends Iso639_3 {
    final val value: String = "crd"
  }

  case object Cree extends Iso639_3 {
    final val value: String = "cre"
  }

  case object Michif extends Iso639_3 {
    final val value: String = "crg"
  }

  case object CrimeanTatar extends Iso639_3 {
    final val value: String = "crh"
  }

  case object Saotomense extends Iso639_3 {
    final val value: String = "cri"
  }

  case object EastCree extends Iso639_3 {
    final val value: String = "crj"
  }

  case object PlainsCree extends Iso639_3 {
    final val value: String = "crk"
  }

  case object NorthernEastCree extends Iso639_3 {
    final val value: String = "crl"
  }

  case object MooseCree extends Iso639_3 {
    final val value: String = "crm"
  }

  case object NayarCora extends Iso639_3 {
    final val value: String = "crn"
  }

  case object Crow extends Iso639_3 {
    final val value: String = "cro"
  }

  case object IyowujwaChorote extends Iso639_3 {
    final val value: String = "crq"
  }

  case object CreoleFrench extends Iso639_3 {
    final val value: String = "crs"
  }

  case object IyojwajaChorote extends Iso639_3 {
    final val value: String = "crt"
  }

  case object Chaura extends Iso639_3 {
    final val value: String = "crv"
  }

  case object Chrau extends Iso639_3 {
    final val value: String = "crw"
  }

  case object Carrier extends Iso639_3 {
    final val value: String = "crx"
  }

  case object Cori extends Iso639_3 {
    final val value: String = "cry"
  }

  case object ChiltepecChinantec extends Iso639_3 {
    final val value: String = "csa"
  }

  case object Kashubian extends Iso639_3 {
    final val value: String = "csb"
  }

  case object CatalanSignLanguage extends Iso639_3 {
    final val value: String = "csc"
  }

  case object ChiangmaiSignLanguage extends Iso639_3 {
    final val value: String = "csd"
  }

  case object CzechSignLanguage extends Iso639_3 {
    final val value: String = "cse"
  }

  case object CubaSignLanguage extends Iso639_3 {
    final val value: String = "csf"
  }

  case object ChileanSignLanguage extends Iso639_3 {
    final val value: String = "csg"
  }

  case object AshoChin extends Iso639_3 {
    final val value: String = "csh"
  }

  case object SonglaiChin extends Iso639_3 {
    final val value: String = "csj"
  }

  case object JolaKasa extends Iso639_3 {
    final val value: String = "csk"
  }

  case object ChineseSignLanguage extends Iso639_3 {
    final val value: String = "csl"
  }

  case object SierraMiwok extends Iso639_3 {
    final val value: String = "csm"
  }

  case object ColombianSignLanguage extends Iso639_3 {
    final val value: String = "csn"
  }

  case object SochiapamChinantec extends Iso639_3 {
    final val value: String = "cso"
  }

  case object CroatiaSignLanguage extends Iso639_3 {
    final val value: String = "csq"
  }

  case object CostaRicanSignLanguage extends Iso639_3 {
    final val value: String = "csr"
  }

  case object NorthernOhlone extends Iso639_3 {
    final val value: String = "cst"
  }

  case object SumtuChin extends Iso639_3 {
    final val value: String = "csv"
  }

  case object SwampyCree extends Iso639_3 {
    final val value: String = "csw"
  }

  case object SiyinChin extends Iso639_3 {
    final val value: String = "csy"
  }

  case object Coos extends Iso639_3 {
    final val value: String = "csz"
  }

  case object TataltepecChatino extends Iso639_3 {
    final val value: String = "cta"
  }

  case object Chetco extends Iso639_3 {
    final val value: String = "ctc"
  }

  case object TedimChin extends Iso639_3 {
    final val value: String = "ctd"
  }

  case object TepinapaChinantec extends Iso639_3 {
    final val value: String = "cte"
  }

  case object Chittagonian extends Iso639_3 {
    final val value: String = "ctg"
  }

  case object ThaiphumChin extends Iso639_3 {
    final val value: String = "cth"
  }

  case object TlacoatzintepecChinantec extends Iso639_3 {
    final val value: String = "ctl"
  }

  case object Chhintange extends Iso639_3 {
    final val value: String = "ctn"
  }

  case object EmberaCatio extends Iso639_3 {
    final val value: String = "cto"
  }

  case object WesternHighlandChatino extends Iso639_3 {
    final val value: String = "ctp"
  }

  case object CatanduanesBikol extends Iso639_3 {
    final val value: String = "cts"
  }

  case object WayanadChetti extends Iso639_3 {
    final val value: String = "ctt"
  }

  case object Chol extends Iso639_3 {
    final val value: String = "ctu"
  }

  case object ZacatepecChatino extends Iso639_3 {
    final val value: String = "ctz"
  }

  case object Cua extends Iso639_3 {
    final val value: String = "cua"
  }

  case object Cubeo extends Iso639_3 {
    final val value: String = "cub"
  }

  case object UsilaChinantec extends Iso639_3 {
    final val value: String = "cuc"
  }

  case object Chungmboko extends Iso639_3 {
    final val value: String = "cug"
  }

  case object Chuka extends Iso639_3 {
    final val value: String = "cuh"
  }

  case object Cuiba extends Iso639_3 {
    final val value: String = "cui"
  }

  case object MashcoPiro extends Iso639_3 {
    final val value: String = "cuj"
  }

  case object BlasKuna extends Iso639_3 {
    final val value: String = "cuk"
  }

  case object Culina extends Iso639_3 {
    final val value: String = "cul"
  }

  case object Cun extends Iso639_3 {
    final val value: String = "cuq"
  }

  case object Chhulung extends Iso639_3 {
    final val value: String = "cur"
  }

  case object TeutilaCuicatec extends Iso639_3 {
    final val value: String = "cut"
  }

  case object TaiYa extends Iso639_3 {
    final val value: String = "cuu"
  }

  case object Cuvok extends Iso639_3 {
    final val value: String = "cuv"
  }

  case object Chukwa extends Iso639_3 {
    final val value: String = "cuw"
  }

  case object TepeuxilaCuicatec extends Iso639_3 {
    final val value: String = "cux"
  }

  case object Cuitlatec extends Iso639_3 {
    final val value: String = "cuy"
  }

  case object Chug extends Iso639_3 {
    final val value: String = "cvg"
  }

  case object NacionalChinantec extends Iso639_3 {
    final val value: String = "cvn"
  }

  case object Kabwa extends Iso639_3 {
    final val value: String = "cwa"
  }

  case object Maindo extends Iso639_3 {
    final val value: String = "cwb"
  }

  case object WoodsCree extends Iso639_3 {
    final val value: String = "cwd"
  }

  case object Kwere extends Iso639_3 {
    final val value: String = "cwe"
  }

  case object Chewong extends Iso639_3 {
    final val value: String = "cwg"
  }

  case object Kuwaataay extends Iso639_3 {
    final val value: String = "cwt"
  }

  case object NopalaChatino extends Iso639_3 {
    final val value: String = "cya"
  }

  case object Welsh extends Iso639_3 {
    final val value: String = "cym"
  }

  case object Cuyonon extends Iso639_3 {
    final val value: String = "cyo"
  }

  case object HuizhouChinese extends Iso639_3 {
    final val value: String = "czh"
  }

  case object ZenzontepecChatino extends Iso639_3 {
    final val value: String = "czn"
  }

  case object ZhongChinese extends Iso639_3 {
    final val value: String = "czo"
  }

  case object ZotungChin extends Iso639_3 {
    final val value: String = "czt"
  }

  case object Dangaleat extends Iso639_3 {
    final val value: String = "daa"
  }

  case object Dambi extends Iso639_3 {
    final val value: String = "dac"
  }

  case object Marik extends Iso639_3 {
    final val value: String = "dad"
  }

  case object Duupa extends Iso639_3 {
    final val value: String = "dae"
  }

  case object Dagbani extends Iso639_3 {
    final val value: String = "dag"
  }

  case object Gwahatike extends Iso639_3 {
    final val value: String = "dah"
  }

  case object Day extends Iso639_3 {
    final val value: String = "dai"
  }

  case object FurDaju extends Iso639_3 {
    final val value: String = "daj"
  }

  case object Dakota extends Iso639_3 {
    final val value: String = "dak"
  }

  case object Dahalo extends Iso639_3 {
    final val value: String = "dal"
  }

  case object Damakawa extends Iso639_3 {
    final val value: String = "dam"
  }

  case object Danish extends Iso639_3 {
    final val value: String = "dan"
  }

  case object DaaiChin extends Iso639_3 {
    final val value: String = "dao"
  }

  case object DandamiMaria extends Iso639_3 {
    final val value: String = "daq"
  }

  case object Dargwa extends Iso639_3 {
    final val value: String = "dar"
  }

  case object DahoDoo extends Iso639_3 {
    final val value: String = "das"
  }

  case object SilaDaju extends Iso639_3 {
    final val value: String = "dau"
  }

  case object Taita extends Iso639_3 {
    final val value: String = "dav"
  }

  case object Davawenyo extends Iso639_3 {
    final val value: String = "daw"
  }

  case object Dayi extends Iso639_3 {
    final val value: String = "dax"
  }

  case object Dao extends Iso639_3 {
    final val value: String = "daz"
  }

  case object Bangime extends Iso639_3 {
    final val value: String = "dba"
  }

  case object Deno extends Iso639_3 {
    final val value: String = "dbb"
  }

  case object Dadiya extends Iso639_3 {
    final val value: String = "dbd"
  }

  case object Dabe extends Iso639_3 {
    final val value: String = "dbe"
  }

  case object Edopi extends Iso639_3 {
    final val value: String = "dbf"
  }

  case object DomDogon extends Iso639_3 {
    final val value: String = "dbg"
  }

  case object Doka extends Iso639_3 {
    final val value: String = "dbi"
  }

  case object Idaan extends Iso639_3 {
    final val value: String = "dbj"
  }

  case object Dyirbal extends Iso639_3 {
    final val value: String = "dbl"
  }

  case object Duguri extends Iso639_3 {
    final val value: String = "dbm"
  }

  case object Duriankere extends Iso639_3 {
    final val value: String = "dbn"
  }

  case object Dulbu extends Iso639_3 {
    final val value: String = "dbo"
  }

  case object Duwai extends Iso639_3 {
    final val value: String = "dbp"
  }

  case object Daba extends Iso639_3 {
    final val value: String = "dbq"
  }

  case object Dabarre extends Iso639_3 {
    final val value: String = "dbr"
  }

  case object TeyDogon extends Iso639_3 {
    final val value: String = "dbt"
  }

  case object BondumDomDogon extends Iso639_3 {
    final val value: String = "dbu"
  }

  case object Dungu extends Iso639_3 {
    final val value: String = "dbv"
  }

  case object BankanTeyDogon extends Iso639_3 {
    final val value: String = "dbw"
  }

  case object Dibiyaso extends Iso639_3 {
    final val value: String = "dby"
  }

  case object Deccan extends Iso639_3 {
    final val value: String = "dcc"
  }

  case object Dongotono extends Iso639_3 {
    final val value: String = "ddd"
  }

  case object Doondo extends Iso639_3 {
    final val value: String = "dde"
  }

  case object Fataluku extends Iso639_3 {
    final val value: String = "ddg"
  }

  case object WestGoodenough extends Iso639_3 {
    final val value: String = "ddi"
  }

  case object Jaru extends Iso639_3 {
    final val value: String = "ddj"
  }

  case object BeninDendi extends Iso639_3 {
    final val value: String = "ddn"
  }

  case object Dido extends Iso639_3 {
    final val value: String = "ddo"
  }

  case object SoDogon extends Iso639_3 {
    final val value: String = "dds"
  }

  case object DaweraDaweloor extends Iso639_3 {
    final val value: String = "ddw"
  }

  case object Dagik extends Iso639_3 {
    final val value: String = "dec"
  }

  case object Dedua extends Iso639_3 {
    final val value: String = "ded"
  }

  case object Dewoin extends Iso639_3 {
    final val value: String = "dee"
  }

  case object Dezfuli extends Iso639_3 {
    final val value: String = "def"
  }

  case object Degema extends Iso639_3 {
    final val value: String = "deg"
  }

  case object Dehwari extends Iso639_3 {
    final val value: String = "deh"
  }

  case object Demisa extends Iso639_3 {
    final val value: String = "dei"
  }

  case object Dek extends Iso639_3 {
    final val value: String = "dek"
  }

  case object Delaware extends Iso639_3 {
    final val value: String = "del"
  }

  case object Dem extends Iso639_3 {
    final val value: String = "dem"
  }

  case object AthapascanSlave extends Iso639_3 {
    final val value: String = "den"
  }

  case object CentralAfricanRepublicanDendi extends Iso639_3 {
    final val value: String = "deq"
  }

  case object Deori extends Iso639_3 {
    final val value: String = "der"
  }

  case object Desano extends Iso639_3 {
    final val value: String = "des"
  }

  case object German extends Iso639_3 {
    final val value: String = "deu"
  }

  case object Domung extends Iso639_3 {
    final val value: String = "dev"
  }

  case object Dengese extends Iso639_3 {
    final val value: String = "dez"
  }

  case object SouthernDagaare extends Iso639_3 {
    final val value: String = "dga"
  }

  case object BunogeDogon extends Iso639_3 {
    final val value: String = "dgb"
  }

  case object DumagatAgta extends Iso639_3 {
    final val value: String = "dgc"
  }

  case object DagaariDioula extends Iso639_3 {
    final val value: String = "dgd"
  }

  case object Degenan extends Iso639_3 {
    final val value: String = "dge"
  }

  case object Doga extends Iso639_3 {
    final val value: String = "dgg"
  }

  case object Dghwede extends Iso639_3 {
    final val value: String = "dgh"
  }

  case object NorthernDagara extends Iso639_3 {
    final val value: String = "dgi"
  }

  case object Dagba extends Iso639_3 {
    final val value: String = "dgk"
  }

  case object Andaandi extends Iso639_3 {
    final val value: String = "dgl"
  }

  case object Dogri extends Iso639_3 {
    final val value: String = "dgo"
  }

  case object Dogrib extends Iso639_3 {
    final val value: String = "dgr"
  }

  case object Dogoso extends Iso639_3 {
    final val value: String = "dgs"
  }

  case object Degaru extends Iso639_3 {
    final val value: String = "dgu"
  }

  case object Doghoro extends Iso639_3 {
    final val value: String = "dgx"
  }

  case object Daga extends Iso639_3 {
    final val value: String = "dgz"
  }

  case object Dhundari extends Iso639_3 {
    final val value: String = "dhd"
  }

  case object DhanguDjangu extends Iso639_3 {
    final val value: String = "dhg"
  }

  case object Dhimal extends Iso639_3 {
    final val value: String = "dhi"
  }

  case object Dhalandji extends Iso639_3 {
    final val value: String = "dhl"
  }

  case object Zemba extends Iso639_3 {
    final val value: String = "dhm"
  }

  case object Dhanki extends Iso639_3 {
    final val value: String = "dhn"
  }

  case object Dhodia extends Iso639_3 {
    final val value: String = "dho"
  }

  case object Dhargari extends Iso639_3 {
    final val value: String = "dhr"
  }

  case object Dhaiso extends Iso639_3 {
    final val value: String = "dhs"
  }

  case object Dehu extends Iso639_3 {
    final val value: String = "dhv"
  }

  case object NepaleseDhanwar extends Iso639_3 {
    final val value: String = "dhw"
  }

  case object Dhungaloo extends Iso639_3 {
    final val value: String = "dhx"
  }

  case object Dia extends Iso639_3 {
    final val value: String = "dia"
  }

  case object CentralDinka extends Iso639_3 {
    final val value: String = "dib"
  }

  case object LakotaDida extends Iso639_3 {
    final val value: String = "dic"
  }

  case object Didinga extends Iso639_3 {
    final val value: String = "did"
  }

  case object Digo extends Iso639_3 {
    final val value: String = "dig"
  }

  case object Kumiai extends Iso639_3 {
    final val value: String = "dih"
  }

  case object Dimbong extends Iso639_3 {
    final val value: String = "dii"
  }

  case object Dai extends Iso639_3 {
    final val value: String = "dij"
  }

  case object SouthwesternDinka extends Iso639_3 {
    final val value: String = "dik"
  }

  case object Dilling extends Iso639_3 {
    final val value: String = "dil"
  }

  case object Dime extends Iso639_3 {
    final val value: String = "dim"
  }

  case object Dinka extends Iso639_3 {
    final val value: String = "din"
  }

  case object Dibo extends Iso639_3 {
    final val value: String = "dio"
  }

  case object NortheasternDinka extends Iso639_3 {
    final val value: String = "dip"
  }

  case object Dimli extends Iso639_3 {
    final val value: String = "diq"
  }

  case object Dirim extends Iso639_3 {
    final val value: String = "dir"
  }

  case object Dimasa extends Iso639_3 {
    final val value: String = "dis"
  }

  case object Diriku extends Iso639_3 {
    final val value: String = "diu"
  }

  case object Dhivehi extends Iso639_3 {
    final val value: String = "div"
  }

  case object NorthwesternDinka extends Iso639_3 {
    final val value: String = "diw"
  }

  case object DixonReef extends Iso639_3 {
    final val value: String = "dix"
  }

  case object Diuwe extends Iso639_3 {
    final val value: String = "diy"
  }

  case object Ding extends Iso639_3 {
    final val value: String = "diz"
  }

  case object Djinba extends Iso639_3 {
    final val value: String = "djb"
  }

  case object DajuDaju extends Iso639_3 {
    final val value: String = "djc"
  }

  case object Djamindjung extends Iso639_3 {
    final val value: String = "djd"
  }

  case object Zarma extends Iso639_3 {
    final val value: String = "dje"
  }

  case object Djinang extends Iso639_3 {
    final val value: String = "dji"
  }

  case object Djeebbana extends Iso639_3 {
    final val value: String = "djj"
  }

  case object MaroonCreole extends Iso639_3 {
    final val value: String = "djk"
  }

  case object JamsayDogon extends Iso639_3 {
    final val value: String = "djm"
  }

  case object Djauan extends Iso639_3 {
    final val value: String = "djn"
  }

  case object Jangkang extends Iso639_3 {
    final val value: String = "djo"
  }

  case object Djambarrpuyngu extends Iso639_3 {
    final val value: String = "djr"
  }

  case object Kapriman extends Iso639_3 {
    final val value: String = "dju"
  }

  case object Dakpakha extends Iso639_3 {
    final val value: String = "dka"
  }

  case object Dakka extends Iso639_3 {
    final val value: String = "dkk"
  }

  case object Kuijau extends Iso639_3 {
    final val value: String = "dkr"
  }

  case object SoutheasternDinka extends Iso639_3 {
    final val value: String = "dks"
  }

  case object Mazagway extends Iso639_3 {
    final val value: String = "dkx"
  }

  case object Dolgan extends Iso639_3 {
    final val value: String = "dlg"
  }

  case object Dahalik extends Iso639_3 {
    final val value: String = "dlk"
  }

  case object Darlong extends Iso639_3 {
    final val value: String = "dln"
  }

  case object Duma extends Iso639_3 {
    final val value: String = "dma"
  }

  case object MomboDogon extends Iso639_3 {
    final val value: String = "dmb"
  }

  case object Gavak extends Iso639_3 {
    final val value: String = "dmc"
  }

  case object Dugwor extends Iso639_3 {
    final val value: String = "dme"
  }

  case object UpperKinabatangan extends Iso639_3 {
    final val value: String = "dmg"
  }

  case object Domaaki extends Iso639_3 {
    final val value: String = "dmk"
  }

  case object Dameli extends Iso639_3 {
    final val value: String = "dml"
  }

  case object Dama extends Iso639_3 {
    final val value: String = "dmm"
  }

  case object Kemedzung extends Iso639_3 {
    final val value: String = "dmo"
  }

  case object EastDamar extends Iso639_3 {
    final val value: String = "dmr"
  }

  case object Dampelas extends Iso639_3 {
    final val value: String = "dms"
  }

  case object Dubu extends Iso639_3 {
    final val value: String = "dmu"
  }

  case object Dumpas extends Iso639_3 {
    final val value: String = "dmv"
  }

  case object Mudburra extends Iso639_3 {
    final val value: String = "dmw"
  }

  case object Dema extends Iso639_3 {
    final val value: String = "dmx"
  }

  case object Demta extends Iso639_3 {
    final val value: String = "dmy"
  }

  case object GrandValleyDani extends Iso639_3 {
    final val value: String = "dna"
  }

  case object Daonda extends Iso639_3 {
    final val value: String = "dnd"
  }

  case object Ndendeule extends Iso639_3 {
    final val value: String = "dne"
  }

  case object Dungan extends Iso639_3 {
    final val value: String = "dng"
  }

  case object LowerGrandValleyDani extends Iso639_3 {
    final val value: String = "dni"
  }

  case object Dan extends Iso639_3 {
    final val value: String = "dnj"
  }

  case object Dengka extends Iso639_3 {
    final val value: String = "dnk"
  }

  case object Dzuungoo extends Iso639_3 {
    final val value: String = "dnn"
  }

  case object Danaru extends Iso639_3 {
    final val value: String = "dnr"
  }

  case object MidGrandValleyDani extends Iso639_3 {
    final val value: String = "dnt"
  }

  case object Danau extends Iso639_3 {
    final val value: String = "dnu"
  }

  case object Danu extends Iso639_3 {
    final val value: String = "dnv"
  }

  case object WesternDani extends Iso639_3 {
    final val value: String = "dnw"
  }

  case object Deni extends Iso639_3 {
    final val value: String = "dny"
  }

  case object Dom extends Iso639_3 {
    final val value: String = "doa"
  }

  case object Dobu extends Iso639_3 {
    final val value: String = "dob"
  }

  case object NorthernDong extends Iso639_3 {
    final val value: String = "doc"
  }

  case object Doe extends Iso639_3 {
    final val value: String = "doe"
  }

  case object Domu extends Iso639_3 {
    final val value: String = "dof"
  }

  case object Dong extends Iso639_3 {
    final val value: String = "doh"
  }

  case object MacrolanguageDogri extends Iso639_3 {
    final val value: String = "doi"
  }

  case object Dondo extends Iso639_3 {
    final val value: String = "dok"
  }

  case object Doso extends Iso639_3 {
    final val value: String = "dol"
  }

  case object PapuaNewGuineanToura extends Iso639_3 {
    final val value: String = "don"
  }

  case object Dongo extends Iso639_3 {
    final val value: String = "doo"
  }

  case object Lukpa extends Iso639_3 {
    final val value: String = "dop"
  }

  case object DominicanSignLanguage extends Iso639_3 {
    final val value: String = "doq"
  }

  case object Dorio extends Iso639_3 {
    final val value: String = "dor"
  }

  case object Dogose extends Iso639_3 {
    final val value: String = "dos"
  }

  case object Dass extends Iso639_3 {
    final val value: String = "dot"
  }

  case object Dombe extends Iso639_3 {
    final val value: String = "dov"
  }

  case object Doyayo extends Iso639_3 {
    final val value: String = "dow"
  }

  case object Bussa extends Iso639_3 {
    final val value: String = "dox"
  }

  case object Dompo extends Iso639_3 {
    final val value: String = "doy"
  }

  case object Dorze extends Iso639_3 {
    final val value: String = "doz"
  }

  case object Papar extends Iso639_3 {
    final val value: String = "dpp"
  }

  case object Dair extends Iso639_3 {
    final val value: String = "drb"
  }

  case object Minderico extends Iso639_3 {
    final val value: String = "drc"
  }

  case object Darmiya extends Iso639_3 {
    final val value: String = "drd"
  }

  case object Dolpo extends Iso639_3 {
    final val value: String = "dre"
  }

  case object Rungus extends Iso639_3 {
    final val value: String = "drg"
  }

  case object CLela extends Iso639_3 {
    final val value: String = "dri"
  }

  case object Paakantyi extends Iso639_3 {
    final val value: String = "drl"
  }

  case object WestDamar extends Iso639_3 {
    final val value: String = "drn"
  }

  case object MatuMelanau extends Iso639_3 {
    final val value: String = "dro"
  }

  case object Gedeo extends Iso639_3 {
    final val value: String = "drs"
  }

  case object Drents extends Iso639_3 {
    final val value: String = "drt"
  }

  case object Rukai extends Iso639_3 {
    final val value: String = "dru"
  }

  case object Darai extends Iso639_3 {
    final val value: String = "dry"
  }

  case object LowerSorbian extends Iso639_3 {
    final val value: String = "dsb"
  }

  case object DutchSignLanguage extends Iso639_3 {
    final val value: String = "dse"
  }

  case object Daasanach extends Iso639_3 {
    final val value: String = "dsh"
  }

  case object Disa extends Iso639_3 {
    final val value: String = "dsi"
  }

  case object DanishSignLanguage extends Iso639_3 {
    final val value: String = "dsl"
  }

  case object Desiya extends Iso639_3 {
    final val value: String = "dso"
  }

  case object Tadaksahak extends Iso639_3 {
    final val value: String = "dsq"
  }

  case object Daur extends Iso639_3 {
    final val value: String = "dta"
  }

  case object KinabatanganKadazan extends Iso639_3 {
    final val value: String = "dtb"
  }

  case object Ditidaht extends Iso639_3 {
    final val value: String = "dtd"
  }

  case object TingaDogon extends Iso639_3 {
    final val value: String = "dti"
  }

  case object TeneKanDogon extends Iso639_3 {
    final val value: String = "dtk"
  }

  case object TomoKanDogon extends Iso639_3 {
    final val value: String = "dtm"
  }

  case object Daatsiin extends Iso639_3 {
    final val value: String = "dtn"
  }

  case object TeneSoDogon extends Iso639_3 {
    final val value: String = "dto"
  }

  case object KadazanDusun extends Iso639_3 {
    final val value: String = "dtp"
  }

  case object Lotud extends Iso639_3 {
    final val value: String = "dtr"
  }

  case object ToroSoDogon extends Iso639_3 {
    final val value: String = "dts"
  }

  case object TeguDogon extends Iso639_3 {
    final val value: String = "dtt"
  }

  case object UreDogon extends Iso639_3 {
    final val value: String = "dtu"
  }

  case object Dotyali extends Iso639_3 {
    final val value: String = "dty"
  }

  case object Duala extends Iso639_3 {
    final val value: String = "dua"
  }

  case object Dubli extends Iso639_3 {
    final val value: String = "dub"
  }

  case object Duna extends Iso639_3 {
    final val value: String = "duc"
  }

  case object HunSaare extends Iso639_3 {
    final val value: String = "dud"
  }

  case object DumagetAgta extends Iso639_3 {
    final val value: String = "due"
  }

  case object Dumbea extends Iso639_3 {
    final val value: String = "duf"
  }

  case object Duruma extends Iso639_3 {
    final val value: String = "dug"
  }

  case object DungraBhil extends Iso639_3 {
    final val value: String = "duh"
  }

  case object Dumun extends Iso639_3 {
    final val value: String = "dui"
  }

  case object Uyajitaya extends Iso639_3 {
    final val value: String = "duk"
  }

  case object IslandAgta extends Iso639_3 {
    final val value: String = "dul"
  }

  case object DusunDeyah extends Iso639_3 {
    final val value: String = "dun"
  }

  case object DupaninanAgta extends Iso639_3 {
    final val value: String = "duo"
  }

  case object Duano extends Iso639_3 {
    final val value: String = "dup"
  }

  case object DusunMalang extends Iso639_3 {
    final val value: String = "duq"
  }

  case object Dii extends Iso639_3 {
    final val value: String = "dur"
  }

  case object Dumi extends Iso639_3 {
    final val value: String = "dus"
  }

  case object Drung extends Iso639_3 {
    final val value: String = "duu"
  }

  case object Duvle extends Iso639_3 {
    final val value: String = "duv"
  }

  case object DusunWitu extends Iso639_3 {
    final val value: String = "duw"
  }

  case object Duungooma extends Iso639_3 {
    final val value: String = "dux"
  }

  case object Duau extends Iso639_3 {
    final val value: String = "dva"
  }

  case object Diri extends Iso639_3 {
    final val value: String = "dwa"
  }

  case object Dawro extends Iso639_3 {
    final val value: String = "dwr"
  }

  case object Dhuwal extends Iso639_3 {
    final val value: String = "dwu"
  }

  case object Dawawa extends Iso639_3 {
    final val value: String = "dww"
  }

  case object Dhuwaya extends Iso639_3 {
    final val value: String = "dwy"
  }

  case object Dyan extends Iso639_3 {
    final val value: String = "dya"
  }

  case object DjiminiSenoufo extends Iso639_3 {
    final val value: String = "dyi"
  }

  case object YandaDomDogon extends Iso639_3 {
    final val value: String = "dym"
  }

  case object Dyangadi extends Iso639_3 {
    final val value: String = "dyn"
  }

  case object JolaFonyi extends Iso639_3 {
    final val value: String = "dyo"
  }

  case object Dyula extends Iso639_3 {
    final val value: String = "dyu"
  }

  case object Dyaabugay extends Iso639_3 {
    final val value: String = "dyy"
  }

  case object Tunzu extends Iso639_3 {
    final val value: String = "dza"
  }

  case object Dazaga extends Iso639_3 {
    final val value: String = "dzg"
  }

  case object Dzalakha extends Iso639_3 {
    final val value: String = "dzl"
  }

  case object Dzando extends Iso639_3 {
    final val value: String = "dzn"
  }

  case object Dzongkha extends Iso639_3 {
    final val value: String = "dzo"
  }

  case object Ebughu extends Iso639_3 {
    final val value: String = "ebg"
  }

  case object EasternBontok extends Iso639_3 {
    final val value: String = "ebk"
  }

  case object TekeEbo extends Iso639_3 {
    final val value: String = "ebo"
  }

  case object Ebrie extends Iso639_3 {
    final val value: String = "ebr"
  }

  case object Embu extends Iso639_3 {
    final val value: String = "ebu"
  }

  case object EcuadorianSignLanguage extends Iso639_3 {
    final val value: String = "ecs"
  }

  case object E extends Iso639_3 {
    final val value: String = "eee"
  }

  case object Efai extends Iso639_3 {
    final val value: String = "efa"
  }

  case object Efe extends Iso639_3 {
    final val value: String = "efe"
  }

  case object Efik extends Iso639_3 {
    final val value: String = "efi"
  }

  case object Ega extends Iso639_3 {
    final val value: String = "ega"
  }

  case object Emilian extends Iso639_3 {
    final val value: String = "egl"
  }

  case object Eggon extends Iso639_3 {
    final val value: String = "ego"
  }

  case object Ehueun extends Iso639_3 {
    final val value: String = "ehu"
  }

  case object Eipomek extends Iso639_3 {
    final val value: String = "eip"
  }

  case object Eitiep extends Iso639_3 {
    final val value: String = "eit"
  }

  case object Askopan extends Iso639_3 {
    final val value: String = "eiv"
  }

  case object Ejamat extends Iso639_3 {
    final val value: String = "eja"
  }

  case object Ekajuk extends Iso639_3 {
    final val value: String = "eka"
  }

  case object Ekit extends Iso639_3 {
    final val value: String = "eke"
  }

  case object Ekari extends Iso639_3 {
    final val value: String = "ekg"
  }

  case object Eki extends Iso639_3 {
    final val value: String = "eki"
  }

  case object StandardEstonian extends Iso639_3 {
    final val value: String = "ekk"
  }

  case object BangladeshiKol extends Iso639_3 {
    final val value: String = "ekl"
  }

  case object Elip extends Iso639_3 {
    final val value: String = "ekm"
  }

  case object Koti extends Iso639_3 {
    final val value: String = "eko"
  }

  case object Ekpeye extends Iso639_3 {
    final val value: String = "ekp"
  }

  case object Yace extends Iso639_3 {
    final val value: String = "ekr"
  }

  case object EasternKayah extends Iso639_3 {
    final val value: String = "eky"
  }

  case object Elepi extends Iso639_3 {
    final val value: String = "ele"
  }

  case object ElHugeirat extends Iso639_3 {
    final val value: String = "elh"
  }

  case object Elkei extends Iso639_3 {
    final val value: String = "elk"
  }

  case object ModernGreek extends Iso639_3 {
    final val value: String = "ell"
  }

  case object Eleme extends Iso639_3 {
    final val value: String = "elm"
  }

  case object ElMolo extends Iso639_3 {
    final val value: String = "elo"
  }

  case object Elu extends Iso639_3 {
    final val value: String = "elu"
  }

  case object EmaiIulehaOra extends Iso639_3 {
    final val value: String = "ema"
  }

  case object Embaloh extends Iso639_3 {
    final val value: String = "emb"
  }

  case object Emerillon extends Iso639_3 {
    final val value: String = "eme"
  }

  case object EasternMeohang extends Iso639_3 {
    final val value: String = "emg"
  }

  case object MussauEmira extends Iso639_3 {
    final val value: String = "emi"
  }

  case object EasternManinkakan extends Iso639_3 {
    final val value: String = "emk"
  }

  case object Eman extends Iso639_3 {
    final val value: String = "emn"
  }

  case object NorthernEmbera extends Iso639_3 {
    final val value: String = "emp"
  }

  case object GulfYupik extends Iso639_3 {
    final val value: String = "ems"
  }

  case object EasternMuria extends Iso639_3 {
    final val value: String = "emu"
  }

  case object Emplawas extends Iso639_3 {
    final val value: String = "emw"
  }

  case object Erromintxela extends Iso639_3 {
    final val value: String = "emx"
  }

  case object Apali extends Iso639_3 {
    final val value: String = "ena"
  }

  case object Markweeta extends Iso639_3 {
    final val value: String = "enb"
  }

  case object En extends Iso639_3 {
    final val value: String = "enc"
  }

  case object Ende extends Iso639_3 {
    final val value: String = "end"
  }

  case object ForestEnets extends Iso639_3 {
    final val value: String = "enf"
  }

  case object English extends Iso639_3 {
    final val value: String = "eng"
  }

  case object TundraEnets extends Iso639_3 {
    final val value: String = "enh"
  }

  case object Enlhet extends Iso639_3 {
    final val value: String = "enl"
  }

  case object Engenni extends Iso639_3 {
    final val value: String = "enn"
  }

  case object Enggano extends Iso639_3 {
    final val value: String = "eno"
  }

  case object Enga extends Iso639_3 {
    final val value: String = "enq"
  }

  case object Emumu extends Iso639_3 {
    final val value: String = "enr"
  }

  case object Enu extends Iso639_3 {
    final val value: String = "enu"
  }

  case object EduEnwan extends Iso639_3 {
    final val value: String = "env"
  }

  case object AkwaIbomEnwan extends Iso639_3 {
    final val value: String = "enw"
  }

  case object Enxet extends Iso639_3 {
    final val value: String = "enx"
  }

  case object CotedIvoireBeti extends Iso639_3 {
    final val value: String = "eot"
  }

  case object Epie extends Iso639_3 {
    final val value: String = "epi"
  }

  case object Eravallan extends Iso639_3 {
    final val value: String = "era"
  }

  case object Sie extends Iso639_3 {
    final val value: String = "erg"
  }

  case object Eruwa extends Iso639_3 {
    final val value: String = "erh"
  }

  case object Ogea extends Iso639_3 {
    final val value: String = "eri"
  }

  case object SouthEfate extends Iso639_3 {
    final val value: String = "erk"
  }

  case object Horpa extends Iso639_3 {
    final val value: String = "ero"
  }

  case object Ersu extends Iso639_3 {
    final val value: String = "ers"
  }

  case object Eritai extends Iso639_3 {
    final val value: String = "ert"
  }

  case object Erokwanas extends Iso639_3 {
    final val value: String = "erw"
  }

  case object EseEjja extends Iso639_3 {
    final val value: String = "ese"
  }

  case object AheriGondi extends Iso639_3 {
    final val value: String = "esg"
  }

  case object Eshtehardi extends Iso639_3 {
    final val value: String = "esh"
  }

  case object AlaskanInupiatun extends Iso639_3 {
    final val value: String = "esi"
  }

  case object AlaskaInupiatun extends Iso639_3 {
    final val value: String = "esk"
  }

  case object EgyptSignLanguage extends Iso639_3 {
    final val value: String = "esl"
  }

  case object SalvadoranSignLanguage extends Iso639_3 {
    final val value: String = "esn"
  }

  case object EstonianSignLanguage extends Iso639_3 {
    final val value: String = "eso"
  }

  case object SiberianYupik extends Iso639_3 {
    final val value: String = "ess"
  }

  case object Estonian extends Iso639_3 {
    final val value: String = "est"
  }

  case object CentralYupik extends Iso639_3 {
    final val value: String = "esu"
  }

  case object Eskayan extends Iso639_3 {
    final val value: String = "esy"
  }

  case object Etebi extends Iso639_3 {
    final val value: String = "etb"
  }

  case object EthiopianSignLanguage extends Iso639_3 {
    final val value: String = "eth"
  }

  case object VanuatuanEton extends Iso639_3 {
    final val value: String = "etn"
  }

  case object CameroonianEton extends Iso639_3 {
    final val value: String = "eto"
  }

  case object Edolo extends Iso639_3 {
    final val value: String = "etr"
  }

  case object Yekhee extends Iso639_3 {
    final val value: String = "ets"
  }

  case object Ejagham extends Iso639_3 {
    final val value: String = "etu"
  }

  case object Eten extends Iso639_3 {
    final val value: String = "etx"
  }

  case object Semimi extends Iso639_3 {
    final val value: String = "etz"
  }

  case object Basque extends Iso639_3 {
    final val value: String = "eus"
  }

  case object Even extends Iso639_3 {
    final val value: String = "eve"
  }

  case object Uvbie extends Iso639_3 {
    final val value: String = "evh"
  }

  case object Evenki extends Iso639_3 {
    final val value: String = "evn"
  }

  case object Ewe extends Iso639_3 {
    final val value: String = "ewe"
  }

  case object Ewondo extends Iso639_3 {
    final val value: String = "ewo"
  }

  case object Extremaduran extends Iso639_3 {
    final val value: String = "ext"
  }

  case object Keiyo extends Iso639_3 {
    final val value: String = "eyo"
  }

  case object Ezaa extends Iso639_3 {
    final val value: String = "eza"
  }

  case object Uzekwe extends Iso639_3 {
    final val value: String = "eze"
  }

  case object Fasu extends Iso639_3 {
    final val value: String = "faa"
  }

  case object FadAmbu extends Iso639_3 {
    final val value: String = "fab"
  }

  case object Wagi extends Iso639_3 {
    final val value: String = "fad"
  }

  case object Fagani extends Iso639_3 {
    final val value: String = "faf"
  }

  case object Finongan extends Iso639_3 {
    final val value: String = "fag"
  }

  case object BaissaFali extends Iso639_3 {
    final val value: String = "fah"
  }

  case object Faiwol extends Iso639_3 {
    final val value: String = "fai"
  }

  case object Faita extends Iso639_3 {
    final val value: String = "faj"
  }

  case object CameroonianFang extends Iso639_3 {
    final val value: String = "fak"
  }

  case object SouthFali extends Iso639_3 {
    final val value: String = "fal"
  }

  case object Fam extends Iso639_3 {
    final val value: String = "fam"
  }

  case object EquitorialGuineanFang extends Iso639_3 {
    final val value: String = "fan"
  }

  case object Faroese extends Iso639_3 {
    final val value: String = "fao"
  }

  case object Paloor extends Iso639_3 {
    final val value: String = "fap"
  }

  case object Fataleka extends Iso639_3 {
    final val value: String = "far"
  }

  case object Persian extends Iso639_3 {
    final val value: String = "fas"
  }

  case object Fanti extends Iso639_3 {
    final val value: String = "fat"
  }

  case object Fayu extends Iso639_3 {
    final val value: String = "fau"
  }

  case object Fala extends Iso639_3 {
    final val value: String = "fax"
  }

  case object SouthwesternFars extends Iso639_3 {
    final val value: String = "fay"
  }

  case object NorthwesternFars extends Iso639_3 {
    final val value: String = "faz"
  }

  case object AlbayBikol extends Iso639_3 {
    final val value: String = "fbl"
  }

  case object QuebecSignLanguage extends Iso639_3 {
    final val value: String = "fcs"
  }

  case object Feroge extends Iso639_3 {
    final val value: String = "fer"
  }

  case object FoiaFoia extends Iso639_3 {
    final val value: String = "ffi"
  }

  case object MaasinaFulfulde extends Iso639_3 {
    final val value: String = "ffm"
  }

  case object Fongoro extends Iso639_3 {
    final val value: String = "fgr"
  }

  case object Nobiin extends Iso639_3 {
    final val value: String = "fia"
  }

  case object Fyer extends Iso639_3 {
    final val value: String = "fie"
  }

  case object Fijian extends Iso639_3 {
    final val value: String = "fij"
  }

  case object Filipino extends Iso639_3 {
    final val value: String = "fil"
  }

  case object Finnish extends Iso639_3 {
    final val value: String = "fin"
  }

  case object Fipa extends Iso639_3 {
    final val value: String = "fip"
  }

  case object Firan extends Iso639_3 {
    final val value: String = "fir"
  }

  case object TornedalenFinnish extends Iso639_3 {
    final val value: String = "fit"
  }

  case object Fiwaga extends Iso639_3 {
    final val value: String = "fiw"
  }

  case object KiryaKonzel extends Iso639_3 {
    final val value: String = "fkk"
  }

  case object KvenFinnish extends Iso639_3 {
    final val value: String = "fkv"
  }

  case object KalispelPenddOreille extends Iso639_3 {
    final val value: String = "fla"
  }

  case object Foau extends Iso639_3 {
    final val value: String = "flh"
  }

  case object Fali extends Iso639_3 {
    final val value: String = "fli"
  }

  case object NorthFali extends Iso639_3 {
    final val value: String = "fll"
  }

  case object Fuliiru extends Iso639_3 {
    final val value: String = "flr"
  }

  case object Flaaitaal extends Iso639_3 {
    final val value: String = "fly"
  }

  case object Fefe extends Iso639_3 {
    final val value: String = "fmp"
  }

  case object FarWesternMuria extends Iso639_3 {
    final val value: String = "fmu"
  }

  case object Fanbak extends Iso639_3 {
    final val value: String = "fnb"
  }

  case object Fanagalo extends Iso639_3 {
    final val value: String = "fng"
  }

  case object Fania extends Iso639_3 {
    final val value: String = "fni"
  }

  case object Foodo extends Iso639_3 {
    final val value: String = "fod"
  }

  case object Foi extends Iso639_3 {
    final val value: String = "foi"
  }

  case object Foma extends Iso639_3 {
    final val value: String = "fom"
  }

  case object Fon extends Iso639_3 {
    final val value: String = "fon"
  }

  case object Fore extends Iso639_3 {
    final val value: String = "for"
  }

  case object PoCreoleEnglish extends Iso639_3 {
    final val value: String = "fpe"
  }

  case object Fas extends Iso639_3 {
    final val value: String = "fqs"
  }

  case object French extends Iso639_3 {
    final val value: String = "fra"
  }

  case object CajunFrench extends Iso639_3 {
    final val value: String = "frc"
  }

  case object Fordata extends Iso639_3 {
    final val value: String = "frd"
  }

  case object Arpitan extends Iso639_3 {
    final val value: String = "frp"
  }

  case object Forak extends Iso639_3 {
    final val value: String = "frq"
  }

  case object NorthernFrisian extends Iso639_3 {
    final val value: String = "frr"
  }

  case object EasternFrisian extends Iso639_3 {
    final val value: String = "frs"
  }

  case object Fortsenal extends Iso639_3 {
    final val value: String = "frt"
  }

  case object WesternFrisian extends Iso639_3 {
    final val value: String = "fry"
  }

  case object FinnishSignLanguage extends Iso639_3 {
    final val value: String = "fse"
  }

  case object FrenchSignLanguage extends Iso639_3 {
    final val value: String = "fsl"
  }

  case object FinlandSwedishSignLanguage extends Iso639_3 {
    final val value: String = "fss"
  }

  case object AdamawaFulfulde extends Iso639_3 {
    final val value: String = "fub"
  }

  case object Pulaar extends Iso639_3 {
    final val value: String = "fuc"
  }

  case object EastFutuna extends Iso639_3 {
    final val value: String = "fud"
  }

  case object BorguFulfulde extends Iso639_3 {
    final val value: String = "fue"
  }

  case object Pular extends Iso639_3 {
    final val value: String = "fuf"
  }

  case object NigerFulfulde extends Iso639_3 {
    final val value: String = "fuh"
  }

  case object BagirmiFulfulde extends Iso639_3 {
    final val value: String = "fui"
  }

  case object Ko extends Iso639_3 {
    final val value: String = "fuj"
  }

  case object Fulah extends Iso639_3 {
    final val value: String = "ful"
  }

  case object Fum extends Iso639_3 {
    final val value: String = "fum"
  }

  case object Fulnio extends Iso639_3 {
    final val value: String = "fun"
  }

  case object EasternNigerFulfulde extends Iso639_3 {
    final val value: String = "fuq"
  }

  case object Friulian extends Iso639_3 {
    final val value: String = "fur"
  }

  case object FutunaAniwa extends Iso639_3 {
    final val value: String = "fut"
  }

  case object Furu extends Iso639_3 {
    final val value: String = "fuu"
  }

  case object NigerianFulfulde extends Iso639_3 {
    final val value: String = "fuv"
  }

  case object Fuyug extends Iso639_3 {
    final val value: String = "fuy"
  }

  case object Fur extends Iso639_3 {
    final val value: String = "fvr"
  }

  case object Fwai extends Iso639_3 {
    final val value: String = "fwa"
  }

  case object Fwe extends Iso639_3 {
    final val value: String = "fwe"
  }

  case object Ga extends Iso639_3 {
    final val value: String = "gaa"
  }

  case object Gabri extends Iso639_3 {
    final val value: String = "gab"
  }

  case object GreatAndamanese extends Iso639_3 {
    final val value: String = "gac"
  }

  case object Gaddang extends Iso639_3 {
    final val value: String = "gad"
  }

  case object Guarequena extends Iso639_3 {
    final val value: String = "gae"
  }

  case object Gende extends Iso639_3 {
    final val value: String = "gaf"
  }

  case object Gagauz extends Iso639_3 {
    final val value: String = "gag"
  }

  case object Alekano extends Iso639_3 {
    final val value: String = "gah"
  }

  case object Borei extends Iso639_3 {
    final val value: String = "gai"
  }

  case object Gadsup extends Iso639_3 {
    final val value: String = "gaj"
  }

  case object Gamkonora extends Iso639_3 {
    final val value: String = "gak"
  }

  case object Galolen extends Iso639_3 {
    final val value: String = "gal"
  }

  case object Kandawo extends Iso639_3 {
    final val value: String = "gam"
  }

  case object GanChinese extends Iso639_3 {
    final val value: String = "gan"
  }

  case object Gants extends Iso639_3 {
    final val value: String = "gao"
  }

  case object Gal extends Iso639_3 {
    final val value: String = "gap"
  }

  case object Gata extends Iso639_3 {
    final val value: String = "gaq"
  }

  case object Galeya extends Iso639_3 {
    final val value: String = "gar"
  }

  case object AdiwasiGarasia extends Iso639_3 {
    final val value: String = "gas"
  }

  case object Kenati extends Iso639_3 {
    final val value: String = "gat"
  }

  case object MudhiliGadaba extends Iso639_3 {
    final val value: String = "gau"
  }

  case object Nobonob extends Iso639_3 {
    final val value: String = "gaw"
  }

  case object GujiOromo extends Iso639_3 {
    final val value: String = "gax"
  }

  case object Gayo extends Iso639_3 {
    final val value: String = "gay"
  }

  case object CentralOromo extends Iso639_3 {
    final val value: String = "gaz"
  }

  case object CentralAfricanRepublicanGbaya extends Iso639_3 {
    final val value: String = "gba"
  }

  case object Kaytetye extends Iso639_3 {
    final val value: String = "gbb"
  }

  case object Karadjeri extends Iso639_3 {
    final val value: String = "gbd"
  }

  case object Niksek extends Iso639_3 {
    final val value: String = "gbe"
  }

  case object Gaikundi extends Iso639_3 {
    final val value: String = "gbf"
  }

  case object Gbanziri extends Iso639_3 {
    final val value: String = "gbg"
  }

  case object DefiGbe extends Iso639_3 {
    final val value: String = "gbh"
  }

  case object Galela extends Iso639_3 {
    final val value: String = "gbi"
  }

  case object BodoGadaba extends Iso639_3 {
    final val value: String = "gbj"
  }

  case object Gaddi extends Iso639_3 {
    final val value: String = "gbk"
  }

  case object Gamit extends Iso639_3 {
    final val value: String = "gbl"
  }

  case object Garhwali extends Iso639_3 {
    final val value: String = "gbm"
  }

  case object Moda extends Iso639_3 {
    final val value: String = "gbn"
  }

  case object NorthernGrebo extends Iso639_3 {
    final val value: String = "gbo"
  }

  case object GbayaBossangoa extends Iso639_3 {
    final val value: String = "gbp"
  }

  case object GbayaBozoum extends Iso639_3 {
    final val value: String = "gbq"
  }

  case object Gbagyi extends Iso639_3 {
    final val value: String = "gbr"
  }

  case object GbesiGbe extends Iso639_3 {
    final val value: String = "gbs"
  }

  case object Gagadu extends Iso639_3 {
    final val value: String = "gbu"
  }

  case object Gbanu extends Iso639_3 {
    final val value: String = "gbv"
  }

  case object GabiGabi extends Iso639_3 {
    final val value: String = "gbw"
  }

  case object XwlaGbe extends Iso639_3 {
    final val value: String = "gbx"
  }

  case object Gbari extends Iso639_3 {
    final val value: String = "gby"
  }

  case object ZoroastrianDari extends Iso639_3 {
    final val value: String = "gbz"
  }

  case object Mali extends Iso639_3 {
    final val value: String = "gcc"
  }

  case object GuadeloupeanCreoleFrench extends Iso639_3 {
    final val value: String = "gcf"
  }

  case object GrenadianCreoleEnglish extends Iso639_3 {
    final val value: String = "gcl"
  }

  case object Gaina extends Iso639_3 {
    final val value: String = "gcn"
  }

  case object GuianeseCreoleFrench extends Iso639_3 {
    final val value: String = "gcr"
  }

  case object TovarGerman extends Iso639_3 {
    final val value: String = "gct"
  }

  case object GadeLohar extends Iso639_3 {
    final val value: String = "gda"
  }

  case object OllarGadaba extends Iso639_3 {
    final val value: String = "gdb"
  }

  case object Gedaged extends Iso639_3 {
    final val value: String = "gdd"
  }

  case object Gude extends Iso639_3 {
    final val value: String = "gde"
  }

  case object GudufGava extends Iso639_3 {
    final val value: String = "gdf"
  }

  case object Ga_dang extends Iso639_3 {
    final val value: String = "gdg"
  }

  case object Gadjerawang extends Iso639_3 {
    final val value: String = "gdh"
  }

  case object Gundi extends Iso639_3 {
    final val value: String = "gdi"
  }

  case object Gurdjar extends Iso639_3 {
    final val value: String = "gdj"
  }

  case object Gadang extends Iso639_3 {
    final val value: String = "gdk"
  }

  case object Dirasha extends Iso639_3 {
    final val value: String = "gdl"
  }

  case object Laal extends Iso639_3 {
    final val value: String = "gdm"
  }

  case object Umanakaina extends Iso639_3 {
    final val value: String = "gdn"
  }

  case object Ghodoberi extends Iso639_3 {
    final val value: String = "gdo"
  }

  case object Mehri extends Iso639_3 {
    final val value: String = "gdq"
  }

  case object Wipi extends Iso639_3 {
    final val value: String = "gdr"
  }

  case object GhandrukSignLanguage extends Iso639_3 {
    final val value: String = "gds"
  }

  case object Gudu extends Iso639_3 {
    final val value: String = "gdu"
  }

  case object Godwari extends Iso639_3 {
    final val value: String = "gdx"
  }

  case object Geruma extends Iso639_3 {
    final val value: String = "gea"
  }

  case object Kire extends Iso639_3 {
    final val value: String = "geb"
  }

  case object GbolooGrebo extends Iso639_3 {
    final val value: String = "gec"
  }

  case object Gade extends Iso639_3 {
    final val value: String = "ged"
  }

  case object Gengle extends Iso639_3 {
    final val value: String = "geg"
  }

  case object HutteriteGerman extends Iso639_3 {
    final val value: String = "geh"
  }

  case object Gebe extends Iso639_3 {
    final val value: String = "gei"
  }

  case object Gen extends Iso639_3 {
    final val value: String = "gej"
  }

  case object Ywom extends Iso639_3 {
    final val value: String = "gek"
  }

  case object utMain extends Iso639_3 {
    final val value: String = "gel"
  }

  case object Geme extends Iso639_3 {
    final val value: String = "geq"
  }

  case object GeserGorom extends Iso639_3 {
    final val value: String = "ges"
  }

  case object Eviya extends Iso639_3 {
    final val value: String = "gev"
  }

  case object Gera extends Iso639_3 {
    final val value: String = "gew"
  }

  case object Garre extends Iso639_3 {
    final val value: String = "gex"
  }

  case object Enya extends Iso639_3 {
    final val value: String = "gey"
  }

  case object Patpatar extends Iso639_3 {
    final val value: String = "gfk"
  }

  case object Gao extends Iso639_3 {
    final val value: String = "gga"
  }

  case object Gbii extends Iso639_3 {
    final val value: String = "ggb"
  }

  case object Guragone extends Iso639_3 {
    final val value: String = "gge"
  }

  case object Gurgula extends Iso639_3 {
    final val value: String = "ggg"
  }

  case object Ganglau extends Iso639_3 {
    final val value: String = "ggl"
  }

  case object Gitua extends Iso639_3 {
    final val value: String = "ggt"
  }

  case object Gagu extends Iso639_3 {
    final val value: String = "ggu"
  }

  case object Gogodala extends Iso639_3 {
    final val value: String = "ggw"
  }

  case object Ghadames extends Iso639_3 {
    final val value: String = "gha"
  }

  case object SouthernGhale extends Iso639_3 {
    final val value: String = "ghe"
  }

  case object NorthernGhale extends Iso639_3 {
    final val value: String = "ghh"
  }

  case object GekoKaren extends Iso639_3 {
    final val value: String = "ghk"
  }

  case object Ghulfan extends Iso639_3 {
    final val value: String = "ghl"
  }

  case object Ghanongga extends Iso639_3 {
    final val value: String = "ghn"
  }

  case object Ghera extends Iso639_3 {
    final val value: String = "ghr"
  }

  case object GuhuSamane extends Iso639_3 {
    final val value: String = "ghs"
  }

  case object Kuke extends Iso639_3 {
    final val value: String = "ght"
  }

  case object Kitja extends Iso639_3 {
    final val value: String = "gia"
  }

  case object Gibanawa extends Iso639_3 {
    final val value: String = "gib"
  }

  case object Gail extends Iso639_3 {
    final val value: String = "gic"
  }

  case object Gidar extends Iso639_3 {
    final val value: String = "gid"
  }

  case object Gabogbo extends Iso639_3 {
    final val value: String = "gie"
  }

  case object Goaria extends Iso639_3 {
    final val value: String = "gig"
  }

  case object Githabul extends Iso639_3 {
    final val value: String = "gih"
  }

  case object Gilbertese extends Iso639_3 {
    final val value: String = "gil"
  }

  case object EasternHighlandsGimi extends Iso639_3 {
    final val value: String = "gim"
  }

  case object Hinukh extends Iso639_3 {
    final val value: String = "gin"
  }

  case object WestNewBritainGimi extends Iso639_3 {
    final val value: String = "gip"
  }

  case object GreenGelao extends Iso639_3 {
    final val value: String = "giq"
  }

  case object RedGelao extends Iso639_3 {
    final val value: String = "gir"
  }

  case object NorthGiziga extends Iso639_3 {
    final val value: String = "gis"
  }

  case object Gitxsan extends Iso639_3 {
    final val value: String = "git"
  }

  case object Mulao extends Iso639_3 {
    final val value: String = "giu"
  }

  case object WhiteGelao extends Iso639_3 {
    final val value: String = "giw"
  }

  case object Gilima extends Iso639_3 {
    final val value: String = "gix"
  }

  case object Giyug extends Iso639_3 {
    final val value: String = "giy"
  }

  case object SouthGiziga extends Iso639_3 {
    final val value: String = "giz"
  }

  case object Geji extends Iso639_3 {
    final val value: String = "gji"
  }

  case object KachiKoli extends Iso639_3 {
    final val value: String = "gjk"
  }

  case object Gonja extends Iso639_3 {
    final val value: String = "gjn"
  }

  case object GurindjiKriol extends Iso639_3 {
    final val value: String = "gjr"
  }

  case object Gujari extends Iso639_3 {
    final val value: String = "gju"
  }

  case object Guya extends Iso639_3 {
    final val value: String = "gka"
  }

  case object MadangMagi extends Iso639_3 {
    final val value: String = "gkd"
  }

  case object Ndai extends Iso639_3 {
    final val value: String = "gke"
  }

  case object Gokana extends Iso639_3 {
    final val value: String = "gkn"
  }

  case object GuineaKpelle extends Iso639_3 {
    final val value: String = "gkp"
  }

  case object ScottishGaelic extends Iso639_3 {
    final val value: String = "gla"
  }

  case object BonGula extends Iso639_3 {
    final val value: String = "glc"
  }

  case object Nanai extends Iso639_3 {
    final val value: String = "gld"
  }

  case object Irish extends Iso639_3 {
    final val value: String = "gle"
  }

  case object Galician extends Iso639_3 {
    final val value: String = "glg"
  }

  case object NorthwestPashai extends Iso639_3 {
    final val value: String = "glh"
  }

  case object GulaIro extends Iso639_3 {
    final val value: String = "glj"
  }

  case object Gilaki extends Iso639_3 {
    final val value: String = "glk"
  }

  case object Galambu extends Iso639_3 {
    final val value: String = "glo"
  }

  case object GlaroTwabo extends Iso639_3 {
    final val value: String = "glr"
  }

  case object ChadGula extends Iso639_3 {
    final val value: String = "glu"
  }

  case object Manx extends Iso639_3 {
    final val value: String = "glv"
  }

  case object Glavda extends Iso639_3 {
    final val value: String = "glw"
  }

  case object Gulaalaa extends Iso639_3 {
    final val value: String = "gmb"
  }

  case object Maghdi extends Iso639_3 {
    final val value: String = "gmd"
  }

  case object Magiyi extends Iso639_3 {
    final val value: String = "gmg"
  }

  case object GbayaMbodomo extends Iso639_3 {
    final val value: String = "gmm"
  }

  case object Gimnime extends Iso639_3 {
    final val value: String = "gmn"
  }

  case object Gumalu extends Iso639_3 {
    final val value: String = "gmu"
  }

  case object Gamo extends Iso639_3 {
    final val value: String = "gmv"
  }

  case object Magoma extends Iso639_3 {
    final val value: String = "gmx"
  }

  case object Mgbolizhia extends Iso639_3 {
    final val value: String = "gmz"
  }

  case object Kaansa extends Iso639_3 {
    final val value: String = "gna"
  }

  case object Gangte extends Iso639_3 {
    final val value: String = "gnb"
  }

  case object ZulgoGemzek extends Iso639_3 {
    final val value: String = "gnd"
  }

  case object Ganang extends Iso639_3 {
    final val value: String = "gne"
  }

  case object Ngangam extends Iso639_3 {
    final val value: String = "gng"
  }

  case object Lere extends Iso639_3 {
    final val value: String = "gnh"
  }

  case object Gooniyandi extends Iso639_3 {
    final val value: String = "gni"
  }

  case object Ngen extends Iso639_3 {
    final val value: String = "gnj"
  }

  case object _Gana extends Iso639_3 {
    final val value: String = "gnk"
  }

  case object Ginuman extends Iso639_3 {
    final val value: String = "gnm"
  }

  case object Gumatj extends Iso639_3 {
    final val value: String = "gnn"
  }

  case object NorthernGondi extends Iso639_3 {
    final val value: String = "gno"
  }

  case object Gana extends Iso639_3 {
    final val value: String = "gnq"
  }

  case object Guntai extends Iso639_3 {
    final val value: String = "gnt"
  }

  case object Gnau extends Iso639_3 {
    final val value: String = "gnu"
  }

  case object BolivianGuarani extends Iso639_3 {
    final val value: String = "gnw"
  }

  case object Ganzi extends Iso639_3 {
    final val value: String = "gnz"
  }

  case object Guro extends Iso639_3 {
    final val value: String = "goa"
  }

  case object Playero extends Iso639_3 {
    final val value: String = "gob"
  }

  case object Gorakor extends Iso639_3 {
    final val value: String = "goc"
  }

  case object Godie extends Iso639_3 {
    final val value: String = "god"
  }

  case object Gongduk extends Iso639_3 {
    final val value: String = "goe"
  }

  case object Gofa extends Iso639_3 {
    final val value: String = "gof"
  }

  case object Gogo extends Iso639_3 {
    final val value: String = "gog"
  }

  case object Gobasi extends Iso639_3 {
    final val value: String = "goi"
  }

  case object Gowlan extends Iso639_3 {
    final val value: String = "goj"
  }

  case object Gowli extends Iso639_3 {
    final val value: String = "gok"
  }

  case object Gola extends Iso639_3 {
    final val value: String = "gol"
  }

  case object GoanKonkani extends Iso639_3 {
    final val value: String = "gom"
  }

  case object Gondi extends Iso639_3 {
    final val value: String = "gon"
  }

  case object GoneDau extends Iso639_3 {
    final val value: String = "goo"
  }

  case object Yeretuar extends Iso639_3 {
    final val value: String = "gop"
  }

  case object Gorap extends Iso639_3 {
    final val value: String = "goq"
  }

  case object Gorontalo extends Iso639_3 {
    final val value: String = "gor"
  }

  case object Gronings extends Iso639_3 {
    final val value: String = "gos"
  }

  case object Gavar extends Iso639_3 {
    final val value: String = "gou"
  }

  case object Gorowa extends Iso639_3 {
    final val value: String = "gow"
  }

  case object Gobu extends Iso639_3 {
    final val value: String = "gox"
  }

  case object Goundo extends Iso639_3 {
    final val value: String = "goy"
  }

  case object Gozarkhani extends Iso639_3 {
    final val value: String = "goz"
  }

  case object GupaAbawa extends Iso639_3 {
    final val value: String = "gpa"
  }

  case object PidginEnglish extends Iso639_3 {
    final val value: String = "gpe"
  }

  case object Taiap extends Iso639_3 {
    final val value: String = "gpn"
  }

  case object Gaanda extends Iso639_3 {
    final val value: String = "gqa"
  }

  case object Guiqiong extends Iso639_3 {
    final val value: String = "gqi"
  }

  case object Gor extends Iso639_3 {
    final val value: String = "gqr"
  }

  case object Qau extends Iso639_3 {
    final val value: String = "gqu"
  }

  case object RajputGarasia extends Iso639_3 {
    final val value: String = "gra"
  }

  case object Grebo extends Iso639_3 {
    final val value: String = "grb"
  }

  case object GuruntumMbaaru extends Iso639_3 {
    final val value: String = "grd"
  }

  case object Madi extends Iso639_3 {
    final val value: String = "grg"
  }

  case object GbiriNiragu extends Iso639_3 {
    final val value: String = "grh"
  }

  case object Ghari extends Iso639_3 {
    final val value: String = "gri"
  }

  case object SouthernGrebo extends Iso639_3 {
    final val value: String = "grj"
  }

  case object MaruduTalantang extends Iso639_3 {
    final val value: String = "grm"
  }

  case object Guarani extends Iso639_3 {
    final val value: String = "grn"
  }

  case object Groma extends Iso639_3 {
    final val value: String = "gro"
  }

  case object Gorovu extends Iso639_3 {
    final val value: String = "grq"
  }

  case object Taznatit extends Iso639_3 {
    final val value: String = "grr"
  }

  case object Gresi extends Iso639_3 {
    final val value: String = "grs"
  }

  case object Garo extends Iso639_3 {
    final val value: String = "grt"
  }

  case object Kistane extends Iso639_3 {
    final val value: String = "gru"
  }

  case object CentralGrebo extends Iso639_3 {
    final val value: String = "grv"
  }

  case object Gweda extends Iso639_3 {
    final val value: String = "grw"
  }

  case object Guriaso extends Iso639_3 {
    final val value: String = "grx"
  }

  case object BarclayvilleGrebo extends Iso639_3 {
    final val value: String = "gry"
  }

  case object Guramalum extends Iso639_3 {
    final val value: String = "grz"
  }

  case object GhanaianSignLanguage extends Iso639_3 {
    final val value: String = "gse"
  }

  case object GermanSignLanguage extends Iso639_3 {
    final val value: String = "gsg"
  }

  case object Gusilay extends Iso639_3 {
    final val value: String = "gsl"
  }

  case object GuatemalanSignLanguage extends Iso639_3 {
    final val value: String = "gsm"
  }

  case object Nema extends Iso639_3 {
    final val value: String = "gsn"
  }

  case object SouthwestGbaya extends Iso639_3 {
    final val value: String = "gso"
  }

  case object Wasembo extends Iso639_3 {
    final val value: String = "gsp"
  }

  case object GreekSignLanguage extends Iso639_3 {
    final val value: String = "gss"
  }

  case object SwissGerman extends Iso639_3 {
    final val value: String = "gsw"
  }

  case object Guato extends Iso639_3 {
    final val value: String = "gta"
  }

  case object Shiki extends Iso639_3 {
    final val value: String = "gua"
  }

  case object Guajajara extends Iso639_3 {
    final val value: String = "gub"
  }

  case object Wayuu extends Iso639_3 {
    final val value: String = "guc"
  }

  case object YocoboueDida extends Iso639_3 {
    final val value: String = "gud"
  }

  case object Gurinji extends Iso639_3 {
    final val value: String = "gue"
  }

  case object Gupapuyngu extends Iso639_3 {
    final val value: String = "guf"
  }

  case object ParaguayanGuarani extends Iso639_3 {
    final val value: String = "gug"
  }

  case object Guahibo extends Iso639_3 {
    final val value: String = "guh"
  }

  case object EasternBolivianGuarani extends Iso639_3 {
    final val value: String = "gui"
  }

  case object Gujarati extends Iso639_3 {
    final val value: String = "guj"
  }

  case object Gumuz extends Iso639_3 {
    final val value: String = "guk"
  }

  case object SeaIslandCreoleEnglish extends Iso639_3 {
    final val value: String = "gul"
  }

  case object Guambiano extends Iso639_3 {
    final val value: String = "gum"
  }

  case object MbyaGuarani extends Iso639_3 {
    final val value: String = "gun"
  }

  case object Guayabero extends Iso639_3 {
    final val value: String = "guo"
  }

  case object Gunwinggu extends Iso639_3 {
    final val value: String = "gup"
  }

  case object Achee extends Iso639_3 {
    final val value: String = "guq"
  }

  case object Farefare extends Iso639_3 {
    final val value: String = "gur"
  }

  case object GuineanSignLanguage extends Iso639_3 {
    final val value: String = "gus"
  }

  case object MalekuJaika extends Iso639_3 {
    final val value: String = "gut"
  }

  case object Yanomamo extends Iso639_3 {
    final val value: String = "guu"
  }

  case object Gun extends Iso639_3 {
    final val value: String = "guw"
  }

  case object Gourmanchema extends Iso639_3 {
    final val value: String = "gux"
  }

  case object Gusii extends Iso639_3 {
    final val value: String = "guz"
  }

  case object ParaguaianGuana extends Iso639_3 {
    final val value: String = "gva"
  }

  case object Guanano extends Iso639_3 {
    final val value: String = "gvc"
  }

  case object Duwet extends Iso639_3 {
    final val value: String = "gve"
  }

  case object Golin extends Iso639_3 {
    final val value: String = "gvf"
  }

  case object Guaja extends Iso639_3 {
    final val value: String = "gvj"
  }

  case object Gulay extends Iso639_3 {
    final val value: String = "gvl"
  }

  case object Gurmana extends Iso639_3 {
    final val value: String = "gvm"
  }

  case object KukuYalanji extends Iso639_3 {
    final val value: String = "gvn"
  }

  case object GaviaoDoJiparana extends Iso639_3 {
    final val value: String = "gvo"
  }

  case object ParaGaviao extends Iso639_3 {
    final val value: String = "gvp"
  }

  case object Gurung extends Iso639_3 {
    final val value: String = "gvr"
  }

  case object Gumawana extends Iso639_3 {
    final val value: String = "gvs"
  }

  case object Mbato extends Iso639_3 {
    final val value: String = "gwa"
  }

  case object Gwa extends Iso639_3 {
    final val value: String = "gwb"
  }

  case object Kalami extends Iso639_3 {
    final val value: String = "gwc"
  }

  case object Gawwada extends Iso639_3 {
    final val value: String = "gwd"
  }

  case object Gweno extends Iso639_3 {
    final val value: String = "gwe"
  }

  case object Gowro extends Iso639_3 {
    final val value: String = "gwf"
  }

  case object Moo extends Iso639_3 {
    final val value: String = "gwg"
  }

  case object Gwichin extends Iso639_3 {
    final val value: String = "gwi"
  }

  case object Gwi extends Iso639_3 {
    final val value: String = "gwj"
  }

  case object Gwandara extends Iso639_3 {
    final val value: String = "gwn"
  }

  case object Gwere extends Iso639_3 {
    final val value: String = "gwr"
  }

  case object GawarBati extends Iso639_3 {
    final val value: String = "gwt"
  }

  case object Kwini extends Iso639_3 {
    final val value: String = "gww"
  }

  case object Gua extends Iso639_3 {
    final val value: String = "gwx"
  }

  case object WeSouthern extends Iso639_3 {
    final val value: String = "gxx"
  }

  case object NorthwestGbaya extends Iso639_3 {
    final val value: String = "gya"
  }

  case object Garus extends Iso639_3 {
    final val value: String = "gyb"
  }

  case object Kayardild extends Iso639_3 {
    final val value: String = "gyd"
  }

  case object Gyem extends Iso639_3 {
    final val value: String = "gye"
  }

  case object Gbayi extends Iso639_3 {
    final val value: String = "gyg"
  }

  case object Gyele extends Iso639_3 {
    final val value: String = "gyi"
  }

  case object Gayil extends Iso639_3 {
    final val value: String = "gyl"
  }

  case object Ngabere extends Iso639_3 {
    final val value: String = "gym"
  }

  case object GuyaneseCreoleEnglish extends Iso639_3 {
    final val value: String = "gyn"
  }

  case object Gyalsumdo extends Iso639_3 {
    final val value: String = "gyo"
  }

  case object Guarayu extends Iso639_3 {
    final val value: String = "gyr"
  }

  case object Ganza extends Iso639_3 {
    final val value: String = "gza"
  }

  case object Gazi extends Iso639_3 {
    final val value: String = "gzi"
  }

  case object Gane extends Iso639_3 {
    final val value: String = "gzn"
  }

  case object Han extends Iso639_3 {
    final val value: String = "haa"
  }

  case object HanoiSignLanguage extends Iso639_3 {
    final val value: String = "hab"
  }

  case object Gurani extends Iso639_3 {
    final val value: String = "hac"
  }

  case object Hatam extends Iso639_3 {
    final val value: String = "had"
  }

  case object EasternOromo extends Iso639_3 {
    final val value: String = "hae"
  }

  case object HaiphongSignLanguage extends Iso639_3 {
    final val value: String = "haf"
  }

  case object Hanga extends Iso639_3 {
    final val value: String = "hag"
  }

  case object Hahon extends Iso639_3 {
    final val value: String = "hah"
  }

  case object Haida extends Iso639_3 {
    final val value: String = "hai"
  }

  case object Hajong extends Iso639_3 {
    final val value: String = "haj"
  }

  case object HakkaChinese extends Iso639_3 {
    final val value: String = "hak"
  }

  case object Halang extends Iso639_3 {
    final val value: String = "hal"
  }

  case object Hewa extends Iso639_3 {
    final val value: String = "ham"
  }

  case object Hangaza extends Iso639_3 {
    final val value: String = "han"
  }

  case object Hako extends Iso639_3 {
    final val value: String = "hao"
  }

  case object Hupla extends Iso639_3 {
    final val value: String = "hap"
  }

  case object Ha extends Iso639_3 {
    final val value: String = "haq"
  }

  case object Harari extends Iso639_3 {
    final val value: String = "har"
  }

  case object Haisla extends Iso639_3 {
    final val value: String = "has"
  }

  case object Haitian extends Iso639_3 {
    final val value: String = "hat"
  }

  case object Hausa extends Iso639_3 {
    final val value: String = "hau"
  }

  case object Havu extends Iso639_3 {
    final val value: String = "hav"
  }

  case object Hawaiian extends Iso639_3 {
    final val value: String = "haw"
  }

  case object SouthernHaida extends Iso639_3 {
    final val value: String = "hax"
  }

  case object Haya extends Iso639_3 {
    final val value: String = "hay"
  }

  case object Hazaragi extends Iso639_3 {
    final val value: String = "haz"
  }

  case object Hamba extends Iso639_3 {
    final val value: String = "hba"
  }

  case object Huba extends Iso639_3 {
    final val value: String = "hbb"
  }

  case object Heiban extends Iso639_3 {
    final val value: String = "hbn"
  }

  case object SerboCroatian extends Iso639_3 {
    final val value: String = "hbs"
  }

  case object Habu extends Iso639_3 {
    final val value: String = "hbu"
  }

  case object CreoleHindi extends Iso639_3 {
    final val value: String = "hca"
  }

  case object Huichol extends Iso639_3 {
    final val value: String = "hch"
  }

  case object NorthernHaida extends Iso639_3 {
    final val value: String = "hdn"
  }

  case object HondurasSignLanguage extends Iso639_3 {
    final val value: String = "hds"
  }

  case object Hadiyya extends Iso639_3 {
    final val value: String = "hdy"
  }

  case object QiandongMiao extends Iso639_3 {
    final val value: String = "hea"
  }

  case object Hebrew extends Iso639_3 {
    final val value: String = "heb"
  }

  case object Herde extends Iso639_3 {
    final val value: String = "hed"
  }

  case object Helong extends Iso639_3 {
    final val value: String = "heg"
  }

  case object Hehe extends Iso639_3 {
    final val value: String = "heh"
  }

  case object Heiltsuk extends Iso639_3 {
    final val value: String = "hei"
  }

  case object Hemba extends Iso639_3 {
    final val value: String = "hem"
  }

  case object Herero extends Iso639_3 {
    final val value: String = "her"
  }

  case object Haiom extends Iso639_3 {
    final val value: String = "hgm"
  }

  case object Haigwai extends Iso639_3 {
    final val value: String = "hgw"
  }

  case object HoiaHoia extends Iso639_3 {
    final val value: String = "hhi"
  }

  case object Kerak extends Iso639_3 {
    final val value: String = "hhr"
  }

  case object Hoyahoya extends Iso639_3 {
    final val value: String = "hhy"
  }

  case object Lamang extends Iso639_3 {
    final val value: String = "hia"
  }

  case object Hidatsa extends Iso639_3 {
    final val value: String = "hid"
  }

  case object FijiHindi extends Iso639_3 {
    final val value: String = "hif"
  }

  case object Kamwe extends Iso639_3 {
    final val value: String = "hig"
  }

  case object Pamosu extends Iso639_3 {
    final val value: String = "hih"
  }

  case object Hinduri extends Iso639_3 {
    final val value: String = "hii"
  }

  case object Hijuk extends Iso639_3 {
    final val value: String = "hij"
  }

  case object SeitKaitetu extends Iso639_3 {
    final val value: String = "hik"
  }

  case object Hiligaynon extends Iso639_3 {
    final val value: String = "hil"
  }

  case object Hindi extends Iso639_3 {
    final val value: String = "hin"
  }

  case object Tsoa extends Iso639_3 {
    final val value: String = "hio"
  }

  case object Himarima extends Iso639_3 {
    final val value: String = "hir"
  }

  case object Hiw extends Iso639_3 {
    final val value: String = "hiw"
  }

  case object Hixkaryana extends Iso639_3 {
    final val value: String = "hix"
  }

  case object Haji extends Iso639_3 {
    final val value: String = "hji"
  }

  case object Kahe extends Iso639_3 {
    final val value: String = "hka"
  }

  case object Hunde extends Iso639_3 {
    final val value: String = "hke"
  }

  case object KainaKe extends Iso639_3 {
    final val value: String = "hkk"
  }

  case object MelKhaonh extends Iso639_3 {
    final val value: String = "hkn"
  }

  case object HongKongSignLanguage extends Iso639_3 {
    final val value: String = "hks"
  }

  case object Halia extends Iso639_3 {
    final val value: String = "hla"
  }

  case object Halbi extends Iso639_3 {
    final val value: String = "hlb"
  }

  case object HalangDoan extends Iso639_3 {
    final val value: String = "hld"
  }

  case object Hlersu extends Iso639_3 {
    final val value: String = "hle"
  }

  case object MatuChin extends Iso639_3 {
    final val value: String = "hlt"
  }

  case object MashanHmong extends Iso639_3 {
    final val value: String = "hma"
  }

  case object SenniSonghay extends Iso639_3 {
    final val value: String = "hmb"
  }

  case object HuishuiHmong extends Iso639_3 {
    final val value: String = "hmc"
  }

  case object FloweryMiao extends Iso639_3 {
    final val value: String = "hmd"
  }

  case object EasternHuishuiHmong extends Iso639_3 {
    final val value: String = "hme"
  }

  case object HmongDon extends Iso639_3 {
    final val value: String = "hmf"
  }

  case object SouthwesternGuiyangHmong extends Iso639_3 {
    final val value: String = "hmg"
  }

  case object SouthwesternHuishuiHmong extends Iso639_3 {
    final val value: String = "hmh"
  }

  case object NorthernHuishuiHmong extends Iso639_3 {
    final val value: String = "hmi"
  }

  case object Ge extends Iso639_3 {
    final val value: String = "hmj"
  }

  case object LuopoheHmong extends Iso639_3 {
    final val value: String = "hml"
  }

  case object CentralMashanHmong extends Iso639_3 {
    final val value: String = "hmm"
  }

  case object Hmong extends Iso639_3 {
    final val value: String = "hmn"
  }

  case object HiriMotu extends Iso639_3 {
    final val value: String = "hmo"
  }

  case object NorthernMashanHmong extends Iso639_3 {
    final val value: String = "hmp"
  }

  case object EasternQiandongMiao extends Iso639_3 {
    final val value: String = "hmq"
  }

  case object Hmar extends Iso639_3 {
    final val value: String = "hmr"
  }

  case object SouthernQiandongMiao extends Iso639_3 {
    final val value: String = "hms"
  }

  case object Hamtai extends Iso639_3 {
    final val value: String = "hmt"
  }

  case object Hamap extends Iso639_3 {
    final val value: String = "hmu"
  }

  case object HmongDo extends Iso639_3 {
    final val value: String = "hmv"
  }

  case object WesternMashanHmong extends Iso639_3 {
    final val value: String = "hmw"
  }

  case object SouthernGuiyangHmong extends Iso639_3 {
    final val value: String = "hmy"
  }

  case object HmongShua extends Iso639_3 {
    final val value: String = "hmz"
  }

  case object CameroonianMina extends Iso639_3 {
    final val value: String = "hna"
  }

  case object SouthernHindko extends Iso639_3 {
    final val value: String = "hnd"
  }

  case object Chhattisgarhi extends Iso639_3 {
    final val value: String = "hne"
  }

  case object Ani extends Iso639_3 {
    final val value: String = "hnh"
  }

  case object Hani extends Iso639_3 {
    final val value: String = "hni"
  }

  case object HmongNjua extends Iso639_3 {
    final val value: String = "hnj"
  }

  case object Hanunoo extends Iso639_3 {
    final val value: String = "hnn"
  }

  case object NorthernHindko extends Iso639_3 {
    final val value: String = "hno"
  }

  case object CaribbeanHindustani extends Iso639_3 {
    final val value: String = "hns"
  }

  case object Hung extends Iso639_3 {
    final val value: String = "hnu"
  }

  case object Hoava extends Iso639_3 {
    final val value: String = "hoa"
  }

  case object MadangMari extends Iso639_3 {
    final val value: String = "hob"
  }

  case object Ho extends Iso639_3 {
    final val value: String = "hoc"
  }

  case object Horom extends Iso639_3 {
    final val value: String = "hoe"
  }

  case object Hobyot extends Iso639_3 {
    final val value: String = "hoh"
  }

  case object Holikachuk extends Iso639_3 {
    final val value: String = "hoi"
  }

  case object Hadothi extends Iso639_3 {
    final val value: String = "hoj"
  }

  case object Holu extends Iso639_3 {
    final val value: String = "hol"
  }

  case object Holoholo extends Iso639_3 {
    final val value: String = "hoo"
  }

  case object Hopi extends Iso639_3 {
    final val value: String = "hop"
  }

  case object HoChiMinhCitySignLanguage extends Iso639_3 {
    final val value: String = "hos"
  }

  case object Hote extends Iso639_3 {
    final val value: String = "hot"
  }

  case object Hovongan extends Iso639_3 {
    final val value: String = "hov"
  }

  case object Honi extends Iso639_3 {
    final val value: String = "how"
  }

  case object Holiya extends Iso639_3 {
    final val value: String = "hoy"
  }

  case object Hozo extends Iso639_3 {
    final val value: String = "hoz"
  }

  case object HawaiiSignLanguage extends Iso639_3 {
    final val value: String = "hps"
  }

  case object Hrangkhol extends Iso639_3 {
    final val value: String = "hra"
  }

  case object NiwerMil extends Iso639_3 {
    final val value: String = "hrc"
  }

  case object Hre extends Iso639_3 {
    final val value: String = "hre"
  }

  case object Haruku extends Iso639_3 {
    final val value: String = "hrk"
  }

  case object HornedMiao extends Iso639_3 {
    final val value: String = "hrm"
  }

  case object Haroi extends Iso639_3 {
    final val value: String = "hro"
  }

  case object Hertevin extends Iso639_3 {
    final val value: String = "hrt"
  }

  case object Hruso extends Iso639_3 {
    final val value: String = "hru"
  }

  case object Croatian extends Iso639_3 {
    final val value: String = "hrv"
  }

  case object WarwarFeni extends Iso639_3 {
    final val value: String = "hrw"
  }

  case object Hunsrik extends Iso639_3 {
    final val value: String = "hrx"
  }

  case object Harzani extends Iso639_3 {
    final val value: String = "hrz"
  }

  case object UpperSorbian extends Iso639_3 {
    final val value: String = "hsb"
  }

  case object HungarianSignLanguage extends Iso639_3 {
    final val value: String = "hsh"
  }

  case object HausaSignLanguage extends Iso639_3 {
    final val value: String = "hsl"
  }

  case object XiangChinese extends Iso639_3 {
    final val value: String = "hsn"
  }

  case object Harsusi extends Iso639_3 {
    final val value: String = "hss"
  }

  case object MinicaHuitoto extends Iso639_3 {
    final val value: String = "hto"
  }

  case object Hadza extends Iso639_3 {
    final val value: String = "hts"
  }

  case object Hitu extends Iso639_3 {
    final val value: String = "htu"
  }

  case object Huambisa extends Iso639_3 {
    final val value: String = "hub"
  }

  case object Hua extends Iso639_3 {
    final val value: String = "huc"
  }

  case object Huaulu extends Iso639_3 {
    final val value: String = "hud"
  }

  case object SanFranciscoDelMarHuave extends Iso639_3 {
    final val value: String = "hue"
  }

  case object Humene extends Iso639_3 {
    final val value: String = "huf"
  }

  case object Huachipaeri extends Iso639_3 {
    final val value: String = "hug"
  }

  case object Huilliche extends Iso639_3 {
    final val value: String = "huh"
  }

  case object Huli extends Iso639_3 {
    final val value: String = "hui"
  }

  case object NorthernGuiyangHmong extends Iso639_3 {
    final val value: String = "huj"
  }

  case object Hula extends Iso639_3 {
    final val value: String = "hul"
  }

  case object Hungana extends Iso639_3 {
    final val value: String = "hum"
  }

  case object Hungarian extends Iso639_3 {
    final val value: String = "hun"
  }

  case object Hu extends Iso639_3 {
    final val value: String = "huo"
  }

  case object Hupa extends Iso639_3 {
    final val value: String = "hup"
  }

  case object Tsat extends Iso639_3 {
    final val value: String = "huq"
  }

  case object Halkomelem extends Iso639_3 {
    final val value: String = "hur"
  }

  case object Huastec extends Iso639_3 {
    final val value: String = "hus"
  }

  case object Humla extends Iso639_3 {
    final val value: String = "hut"
  }

  case object MuruiHuitoto extends Iso639_3 {
    final val value: String = "huu"
  }

  case object SanMateoDelMarHuave extends Iso639_3 {
    final val value: String = "huv"
  }

  case object NupodeHuitoto extends Iso639_3 {
    final val value: String = "hux"
  }

  case object Hulaula extends Iso639_3 {
    final val value: String = "huy"
  }

  case object Hunzib extends Iso639_3 {
    final val value: String = "huz"
  }

  case object HaitianVodounCultureLanguage extends Iso639_3 {
    final val value: String = "hvc"
  }

  case object DelMarHuave extends Iso639_3 {
    final val value: String = "hve"
  }

  case object Haveke extends Iso639_3 {
    final val value: String = "hvk"
  }

  case object Sabu extends Iso639_3 {
    final val value: String = "hvn"
  }

  case object SantaMariaDelMarHuave extends Iso639_3 {
    final val value: String = "hvv"
  }

  case object Wane extends Iso639_3 {
    final val value: String = "hwa"
  }

  case object HawaiiCreoleEnglish extends Iso639_3 {
    final val value: String = "hwc"
  }

  case object Hwana extends Iso639_3 {
    final val value: String = "hwo"
  }

  case object Hya extends Iso639_3 {
    final val value: String = "hya"
  }

  case object Armenian extends Iso639_3 {
    final val value: String = "hye"
  }

  case object WesternArmenian extends Iso639_3 {
    final val value: String = "hyw"
  }

  case object Iaai extends Iso639_3 {
    final val value: String = "iai"
  }

  case object Iatmul extends Iso639_3 {
    final val value: String = "ian"
  }

  case object Purari extends Iso639_3 {
    final val value: String = "iar"
  }

  case object Iban extends Iso639_3 {
    final val value: String = "iba"
  }

  case object Ibibio extends Iso639_3 {
    final val value: String = "ibb"
  }

  case object Iwaidja extends Iso639_3 {
    final val value: String = "ibd"
  }

  case object Akpes extends Iso639_3 {
    final val value: String = "ibe"
  }

  case object Ibanag extends Iso639_3 {
    final val value: String = "ibg"
  }

  case object Bih extends Iso639_3 {
    final val value: String = "ibh"
  }

  case object Ibaloi extends Iso639_3 {
    final val value: String = "ibl"
  }

  case object Agoi extends Iso639_3 {
    final val value: String = "ibm"
  }

  case object Ibino extends Iso639_3 {
    final val value: String = "ibn"
  }

  case object Igbo extends Iso639_3 {
    final val value: String = "ibo"
  }

  case object Ibuoro extends Iso639_3 {
    final val value: String = "ibr"
  }

  case object Ibu extends Iso639_3 {
    final val value: String = "ibu"
  }

  case object Ibani extends Iso639_3 {
    final val value: String = "iby"
  }

  case object EdeIca extends Iso639_3 {
    final val value: String = "ica"
  }

  case object Etkywan extends Iso639_3 {
    final val value: String = "ich"
  }

  case object IcelandicSignLanguage extends Iso639_3 {
    final val value: String = "icl"
  }

  case object IslanderCreoleEnglish extends Iso639_3 {
    final val value: String = "icr"
  }

  case object IdakhoIsukhaTiriki extends Iso639_3 {
    final val value: String = "ida"
  }

  case object IndoPortuguese extends Iso639_3 {
    final val value: String = "idb"
  }

  case object Idon extends Iso639_3 {
    final val value: String = "idc"
  }

  case object EdeIdaca extends Iso639_3 {
    final val value: String = "idd"
  }

  case object Idere extends Iso639_3 {
    final val value: String = "ide"
  }

  case object Idi extends Iso639_3 {
    final val value: String = "idi"
  }

  case object Indri extends Iso639_3 {
    final val value: String = "idr"
  }

  case object Idesa extends Iso639_3 {
    final val value: String = "ids"
  }

  case object Idate extends Iso639_3 {
    final val value: String = "idt"
  }

  case object Idoma extends Iso639_3 {
    final val value: String = "idu"
  }

  case object AmganadIfugao extends Iso639_3 {
    final val value: String = "ifa"
  }

  case object BatadIfugao extends Iso639_3 {
    final val value: String = "ifb"
  }

  case object Ife extends Iso639_3 {
    final val value: String = "ife"
  }

  case object TuwaliIfugao extends Iso639_3 {
    final val value: String = "ifk"
  }

  case object TekeFuumu extends Iso639_3 {
    final val value: String = "ifm"
  }

  case object MayoyaoIfugao extends Iso639_3 {
    final val value: String = "ifu"
  }

  case object KeleyIKallahan extends Iso639_3 {
    final val value: String = "ify"
  }

  case object Ebira extends Iso639_3 {
    final val value: String = "igb"
  }

  case object Igede extends Iso639_3 {
    final val value: String = "ige"
  }

  case object Igana extends Iso639_3 {
    final val value: String = "igg"
  }

  case object Igala extends Iso639_3 {
    final val value: String = "igl"
  }

  case object Kanggape extends Iso639_3 {
    final val value: String = "igm"
  }

  case object Ignaciano extends Iso639_3 {
    final val value: String = "ign"
  }

  case object Isebe extends Iso639_3 {
    final val value: String = "igo"
  }

  case object Igwe extends Iso639_3 {
    final val value: String = "igw"
  }

  case object BasedPidgin extends Iso639_3 {
    final val value: String = "ihb"
  }

  case object Ihievbe extends Iso639_3 {
    final val value: String = "ihi"
  }

  case object Iha extends Iso639_3 {
    final val value: String = "ihp"
  }

  case object SichuanYi extends Iso639_3 {
    final val value: String = "iii"
  }

  case object Izon extends Iso639_3 {
    final val value: String = "ijc"
  }

  case object Biseni extends Iso639_3 {
    final val value: String = "ije"
  }

  case object EdeIje extends Iso639_3 {
    final val value: String = "ijj"
  }

  case object Kalabari extends Iso639_3 {
    final val value: String = "ijn"
  }

  case object SoutheastIjo extends Iso639_3 {
    final val value: String = "ijs"
  }

  case object CanadianInuktitut extends Iso639_3 {
    final val value: String = "ike"
  }

  case object Iko extends Iso639_3 {
    final val value: String = "iki"
  }

  case object Ika extends Iso639_3 {
    final val value: String = "ikk"
  }

  case object Ikulu extends Iso639_3 {
    final val value: String = "ikl"
  }

  case object OlulumoIkom extends Iso639_3 {
    final val value: String = "iko"
  }

  case object Ikpeshi extends Iso639_3 {
    final val value: String = "ikp"
  }

  case object InuitSignLanguage extends Iso639_3 {
    final val value: String = "iks"
  }

  case object Inuinnaqtun extends Iso639_3 {
    final val value: String = "ikt"
  }

  case object Inuktitut extends Iso639_3 {
    final val value: String = "iku"
  }

  case object IkuGoraAnkwa extends Iso639_3 {
    final val value: String = "ikv"
  }

  case object Ikwere extends Iso639_3 {
    final val value: String = "ikw"
  }

  case object Ik extends Iso639_3 {
    final val value: String = "ikx"
  }

  case object Ikizu extends Iso639_3 {
    final val value: String = "ikz"
  }

  case object IleApe extends Iso639_3 {
    final val value: String = "ila"
  }

  case object Ila extends Iso639_3 {
    final val value: String = "ilb"
  }

  case object IliTurki extends Iso639_3 {
    final val value: String = "ili"
  }

  case object Ilongot extends Iso639_3 {
    final val value: String = "ilk"
  }

  case object MalaysianIranun extends Iso639_3 {
    final val value: String = "ilm"
  }

  case object Iloko extends Iso639_3 {
    final val value: String = "ilo"
  }

  case object PhilippinesIranun extends Iso639_3 {
    final val value: String = "ilp"
  }

  case object InternationalSign extends Iso639_3 {
    final val value: String = "ils"
  }

  case object Iliuun extends Iso639_3 {
    final val value: String = "ilu"
  }

  case object Ilue extends Iso639_3 {
    final val value: String = "ilv"
  }

  case object MalaMalasar extends Iso639_3 {
    final val value: String = "ima"
  }

  case object Anamgura extends Iso639_3 {
    final val value: String = "imi"
  }

  case object Imonda extends Iso639_3 {
    final val value: String = "imn"
  }

  case object Imbongu extends Iso639_3 {
    final val value: String = "imo"
  }

  case object Imroing extends Iso639_3 {
    final val value: String = "imr"
  }

  case object Inga extends Iso639_3 {
    final val value: String = "inb"
  }

  case object Indonesian extends Iso639_3 {
    final val value: String = "ind"
  }

  case object Degexitan extends Iso639_3 {
    final val value: String = "ing"
  }

  case object Ingush extends Iso639_3 {
    final val value: String = "inh"
  }

  case object JungleInga extends Iso639_3 {
    final val value: String = "inj"
  }

  case object IndonesianSignLanguage extends Iso639_3 {
    final val value: String = "inl"
  }

  case object Isinai extends Iso639_3 {
    final val value: String = "inn"
  }

  case object InokeYate extends Iso639_3 {
    final val value: String = "ino"
  }

  case object Inapari extends Iso639_3 {
    final val value: String = "inp"
  }

  case object IndianSignLanguage extends Iso639_3 {
    final val value: String = "ins"
  }

  case object Intha extends Iso639_3 {
    final val value: String = "int"
  }

  case object Inor extends Iso639_3 {
    final val value: String = "ior"
  }

  case object TumaIrumu extends Iso639_3 {
    final val value: String = "iou"
  }

  case object Ipili extends Iso639_3 {
    final val value: String = "ipi"
  }

  case object Inupiaq extends Iso639_3 {
    final val value: String = "ipk"
  }

  case object Ipiko extends Iso639_3 {
    final val value: String = "ipo"
  }

  case object Iquito extends Iso639_3 {
    final val value: String = "iqu"
  }

  case object Ikwo extends Iso639_3 {
    final val value: String = "iqw"
  }

  case object Iresim extends Iso639_3 {
    final val value: String = "ire"
  }

  case object Irarutu extends Iso639_3 {
    final val value: String = "irh"
  }

  case object Rigwe extends Iso639_3 {
    final val value: String = "iri"
  }

  case object Iraqw extends Iso639_3 {
    final val value: String = "irk"
  }

  case object Irantxe extends Iso639_3 {
    final val value: String = "irn"
  }

  case object Ir extends Iso639_3 {
    final val value: String = "irr"
  }

  case object Irula extends Iso639_3 {
    final val value: String = "iru"
  }

  case object Kamberau extends Iso639_3 {
    final val value: String = "irx"
  }

  case object Iraya extends Iso639_3 {
    final val value: String = "iry"
  }

  case object Isabi extends Iso639_3 {
    final val value: String = "isa"
  }

  case object Isconahua extends Iso639_3 {
    final val value: String = "isc"
  }

  case object Isnag extends Iso639_3 {
    final val value: String = "isd"
  }

  case object ItalianSignLanguage extends Iso639_3 {
    final val value: String = "ise"
  }

  case object IrishSignLanguage extends Iso639_3 {
    final val value: String = "isg"
  }

  case object Esan extends Iso639_3 {
    final val value: String = "ish"
  }

  case object NkemNkum extends Iso639_3 {
    final val value: String = "isi"
  }

  case object Ishkashimi extends Iso639_3 {
    final val value: String = "isk"
  }

  case object Icelandic extends Iso639_3 {
    final val value: String = "isl"
  }

  case object Masimasi extends Iso639_3 {
    final val value: String = "ism"
  }

  case object Isanzu extends Iso639_3 {
    final val value: String = "isn"
  }

  case object Isoko extends Iso639_3 {
    final val value: String = "iso"
  }

  case object IsraeliSignLanguage extends Iso639_3 {
    final val value: String = "isr"
  }

  case object Istriot extends Iso639_3 {
    final val value: String = "ist"
  }

  case object MenchumIsu extends Iso639_3 {
    final val value: String = "isu"
  }

  case object Italian extends Iso639_3 {
    final val value: String = "ita"
  }

  case object BinonganItneg extends Iso639_3 {
    final val value: String = "itb"
  }

  case object SouthernTidung extends Iso639_3 {
    final val value: String = "itd"
  }

  case object InlaodItneg extends Iso639_3 {
    final val value: String = "iti"
  }

  case object JudeoItalian extends Iso639_3 {
    final val value: String = "itk"
  }

  case object Itelmen extends Iso639_3 {
    final val value: String = "itl"
  }

  case object MbonUzo extends Iso639_3 {
    final val value: String = "itm"
  }

  case object Itonama extends Iso639_3 {
    final val value: String = "ito"
  }

  case object Iteri extends Iso639_3 {
    final val value: String = "itr"
  }

  case object Isekiri extends Iso639_3 {
    final val value: String = "its"
  }

  case object MaengItneg extends Iso639_3 {
    final val value: String = "itt"
  }

  case object Itawit extends Iso639_3 {
    final val value: String = "itv"
  }

  case object Ito extends Iso639_3 {
    final val value: String = "itw"
  }

  case object Itik extends Iso639_3 {
    final val value: String = "itx"
  }

  case object MoyadanItneg extends Iso639_3 {
    final val value: String = "ity"
  }

  case object Itza extends Iso639_3 {
    final val value: String = "itz"
  }

  case object IuMien extends Iso639_3 {
    final val value: String = "ium"
  }

  case object Ibatan extends Iso639_3 {
    final val value: String = "ivb"
  }

  case object Ivatan extends Iso639_3 {
    final val value: String = "ivv"
  }

  case object IWak extends Iso639_3 {
    final val value: String = "iwk"
  }

  case object Iwam extends Iso639_3 {
    final val value: String = "iwm"
  }

  case object Iwur extends Iso639_3 {
    final val value: String = "iwo"
  }

  case object SepikIwam extends Iso639_3 {
    final val value: String = "iws"
  }

  case object Ixcatec extends Iso639_3 {
    final val value: String = "ixc"
  }

  case object Ixil extends Iso639_3 {
    final val value: String = "ixl"
  }

  case object Iyayu extends Iso639_3 {
    final val value: String = "iya"
  }

  case object Mesaka extends Iso639_3 {
    final val value: String = "iyo"
  }

  case object CongoeseYaka extends Iso639_3 {
    final val value: String = "iyx"
  }

  case object Ingrian extends Iso639_3 {
    final val value: String = "izh"
  }

  case object Izere extends Iso639_3 {
    final val value: String = "izr"
  }

  case object Izii extends Iso639_3 {
    final val value: String = "izz"
  }

  case object Jamamadi extends Iso639_3 {
    final val value: String = "jaa"
  }

  case object Hyam extends Iso639_3 {
    final val value: String = "jab"
  }

  case object Popti extends Iso639_3 {
    final val value: String = "jac"
  }

  case object Jahanka extends Iso639_3 {
    final val value: String = "jad"
  }

  case object Yabem extends Iso639_3 {
    final val value: String = "jae"
  }

  case object Jara extends Iso639_3 {
    final val value: String = "jaf"
  }

  case object JahHut extends Iso639_3 {
    final val value: String = "jah"
  }

  case object Zazao extends Iso639_3 {
    final val value: String = "jaj"
  }

  case object Jakun extends Iso639_3 {
    final val value: String = "jak"
  }

  case object Yalahatan extends Iso639_3 {
    final val value: String = "jal"
  }

  case object JamaicanCreoleEnglish extends Iso639_3 {
    final val value: String = "jam"
  }

  case object Yanyuwa extends Iso639_3 {
    final val value: String = "jao"
  }

  case object Yaqay extends Iso639_3 {
    final val value: String = "jaq"
  }

  case object CaledonianJavanese extends Iso639_3 {
    final val value: String = "jas"
  }

  case object Jakati extends Iso639_3 {
    final val value: String = "jat"
  }

  case object Yaur extends Iso639_3 {
    final val value: String = "jau"
  }

  case object Javanese extends Iso639_3 {
    final val value: String = "jav"
  }

  case object JambiMalay extends Iso639_3 {
    final val value: String = "jax"
  }

  case object Yannhangu extends Iso639_3 {
    final val value: String = "jay"
  }

  case object Jawe extends Iso639_3 {
    final val value: String = "jaz"
  }

  case object JudeoBerber extends Iso639_3 {
    final val value: String = "jbe"
  }

  case object Arandai extends Iso639_3 {
    final val value: String = "jbj"
  }

  case object Barikewa extends Iso639_3 {
    final val value: String = "jbk"
  }

  case object Nafusi extends Iso639_3 {
    final val value: String = "jbn"
  }

  case object JofotekBromnya extends Iso639_3 {
    final val value: String = "jbr"
  }

  case object Jabuti extends Iso639_3 {
    final val value: String = "jbt"
  }

  case object JukunTakum extends Iso639_3 {
    final val value: String = "jbu"
  }

  case object JamaicanCountrySignLanguage extends Iso639_3 {
    final val value: String = "jcs"
  }

  case object Krymchak extends Iso639_3 {
    final val value: String = "jct"
  }

  case object Jad extends Iso639_3 {
    final val value: String = "jda"
  }

  case object Jadgali extends Iso639_3 {
    final val value: String = "jdg"
  }

  case object JudeoTat extends Iso639_3 {
    final val value: String = "jdt"
  }

  case object Jebero extends Iso639_3 {
    final val value: String = "jeb"
  }

  case object Jerung extends Iso639_3 {
    final val value: String = "jee"
  }

  case object Jeh extends Iso639_3 {
    final val value: String = "jeh"
  }

  case object Yei extends Iso639_3 {
    final val value: String = "jei"
  }

  case object JeriKuo extends Iso639_3 {
    final val value: String = "jek"
  }

  case object Yelmek extends Iso639_3 {
    final val value: String = "jel"
  }

  case object Dza extends Iso639_3 {
    final val value: String = "jen"
  }

  case object Jere extends Iso639_3 {
    final val value: String = "jer"
  }

  case object Manem extends Iso639_3 {
    final val value: String = "jet"
  }

  case object JonkorBourmataguil extends Iso639_3 {
    final val value: String = "jeu"
  }

  case object JudeoGeorgian extends Iso639_3 {
    final val value: String = "jge"
  }

  case object Gwak extends Iso639_3 {
    final val value: String = "jgk"
  }

  case object Ngomba extends Iso639_3 {
    final val value: String = "jgo"
  }

  case object Jehai extends Iso639_3 {
    final val value: String = "jhi"
  }

  case object JhankotSignLanguage extends Iso639_3 {
    final val value: String = "jhs"
  }

  case object Jina extends Iso639_3 {
    final val value: String = "jia"
  }

  case object Jibu extends Iso639_3 {
    final val value: String = "jib"
  }

  case object Tol extends Iso639_3 {
    final val value: String = "jic"
  }

  case object Bu extends Iso639_3 {
    final val value: String = "jid"
  }

  case object Jilbe extends Iso639_3 {
    final val value: String = "jie"
  }

  case object Djingili extends Iso639_3 {
    final val value: String = "jig"
  }

  case object sTodsde extends Iso639_3 {
    final val value: String = "jih"
  }

  case object Jiiddu extends Iso639_3 {
    final val value: String = "jii"
  }

  case object Jilim extends Iso639_3 {
    final val value: String = "jil"
  }

  case object CameroonianJimi extends Iso639_3 {
    final val value: String = "jim"
  }

  case object Jiamao extends Iso639_3 {
    final val value: String = "jio"
  }

  case object Guanyinqiao extends Iso639_3 {
    final val value: String = "jiq"
  }

  case object Jita extends Iso639_3 {
    final val value: String = "jit"
  }

  case object YouleJinuo extends Iso639_3 {
    final val value: String = "jiu"
  }

  case object Shuar extends Iso639_3 {
    final val value: String = "jiv"
  }

  case object BuyuanJinuo extends Iso639_3 {
    final val value: String = "jiy"
  }

  case object Jejueo extends Iso639_3 {
    final val value: String = "jje"
  }

  case object Bankal extends Iso639_3 {
    final val value: String = "jjr"
  }

  case object Kaera extends Iso639_3 {
    final val value: String = "jka"
  }

  case object MobwaKaren extends Iso639_3 {
    final val value: String = "jkm"
  }

  case object Kubo extends Iso639_3 {
    final val value: String = "jko"
  }

  case object PakuKaren extends Iso639_3 {
    final val value: String = "jkp"
  }

  case object IndianKoro extends Iso639_3 {
    final val value: String = "jkr"
  }

  case object Labir extends Iso639_3 {
    final val value: String = "jku"
  }

  case object Ngile extends Iso639_3 {
    final val value: String = "jle"
  }

  case object JamaicanSignLanguage extends Iso639_3 {
    final val value: String = "jls"
  }

  case object Dima extends Iso639_3 {
    final val value: String = "jma"
  }

  case object Zumbun extends Iso639_3 {
    final val value: String = "jmb"
  }

  case object Machame extends Iso639_3 {
    final val value: String = "jmc"
  }

  case object Yamdena extends Iso639_3 {
    final val value: String = "jmd"
  }

  case object NigerianJimi extends Iso639_3 {
    final val value: String = "jmi"
  }

  case object Jumli extends Iso639_3 {
    final val value: String = "jml"
  }

  case object MakuriNaga extends Iso639_3 {
    final val value: String = "jmn"
  }

  case object Kamara extends Iso639_3 {
    final val value: String = "jmr"
  }

  case object NigerianMashi extends Iso639_3 {
    final val value: String = "jms"
  }

  case object Mouwase extends Iso639_3 {
    final val value: String = "jmw"
  }

  case object WesternJuxtlahuacaMixtec extends Iso639_3 {
    final val value: String = "jmx"
  }

  case object Jangshung extends Iso639_3 {
    final val value: String = "jna"
  }

  case object Jandavra extends Iso639_3 {
    final val value: String = "jnd"
  }

  case object Janji extends Iso639_3 {
    final val value: String = "jni"
  }

  case object Yemsa extends Iso639_3 {
    final val value: String = "jnj"
  }

  case object Rawat extends Iso639_3 {
    final val value: String = "jnl"
  }

  case object Jaunsari extends Iso639_3 {
    final val value: String = "jns"
  }

  case object Joba extends Iso639_3 {
    final val value: String = "job"
  }

  case object Wojenaka extends Iso639_3 {
    final val value: String = "jod"
  }

  case object Jogi extends Iso639_3 {
    final val value: String = "jog"
  }

  case object JordanianSignLanguage extends Iso639_3 {
    final val value: String = "jos"
  }

  case object Jowulu extends Iso639_3 {
    final val value: String = "jow"
  }

  case object Japanese extends Iso639_3 {
    final val value: String = "jpn"
  }

  case object JudeoPersian extends Iso639_3 {
    final val value: String = "jpr"
  }

  case object Jaqaru extends Iso639_3 {
    final val value: String = "jqr"
  }

  case object Jarai extends Iso639_3 {
    final val value: String = "jra"
  }

  case object JudeoArabic extends Iso639_3 {
    final val value: String = "jrb"
  }

  case object Jiru extends Iso639_3 {
    final val value: String = "jrr"
  }

  case object Jorto extends Iso639_3 {
    final val value: String = "jrt"
  }

  case object Japreria extends Iso639_3 {
    final val value: String = "jru"
  }

  case object JapaneseSignLanguage extends Iso639_3 {
    final val value: String = "jsl"
  }

  case object Juma extends Iso639_3 {
    final val value: String = "jua"
  }

  case object Wannu extends Iso639_3 {
    final val value: String = "jub"
  }

  case object Worodougou extends Iso639_3 {
    final val value: String = "jud"
  }

  case object Hone extends Iso639_3 {
    final val value: String = "juh"
  }

  case object Wapan extends Iso639_3 {
    final val value: String = "juk"
  }

  case object Jirel extends Iso639_3 {
    final val value: String = "jul"
  }

  case object Jumjum extends Iso639_3 {
    final val value: String = "jum"
  }

  case object Juang extends Iso639_3 {
    final val value: String = "jun"
  }

  case object Jiba extends Iso639_3 {
    final val value: String = "juo"
  }

  case object Hupde extends Iso639_3 {
    final val value: String = "jup"
  }

  case object Juruna extends Iso639_3 {
    final val value: String = "jur"
  }

  case object JumlaSignLanguage extends Iso639_3 {
    final val value: String = "jus"
  }

  case object Ju extends Iso639_3 {
    final val value: String = "juu"
  }

  case object Wapha extends Iso639_3 {
    final val value: String = "juw"
  }

  case object Juray extends Iso639_3 {
    final val value: String = "juy"
  }

  case object Javindo extends Iso639_3 {
    final val value: String = "jvd"
  }

  case object CaribbeanJavanese extends Iso639_3 {
    final val value: String = "jvn"
  }

  case object JwiraPepesa extends Iso639_3 {
    final val value: String = "jwi"
  }

  case object Jiarong extends Iso639_3 {
    final val value: String = "jya"
  }

  case object YemeniArabic extends Iso639_3 {
    final val value: String = "jye"
  }

  case object Jaya extends Iso639_3 {
    final val value: String = "jyy"
  }

  case object KaraKalpak extends Iso639_3 {
    final val value: String = "kaa"
  }

  case object Kabyle extends Iso639_3 {
    final val value: String = "kab"
  }

  case object Kachin extends Iso639_3 {
    final val value: String = "kac"
  }

  case object Adara extends Iso639_3 {
    final val value: String = "kad"
  }

  case object Katso extends Iso639_3 {
    final val value: String = "kaf"
  }

  case object Kajaman extends Iso639_3 {
    final val value: String = "kag"
  }

  case object CentralAfricanRepublicanKara extends Iso639_3 {
    final val value: String = "kah"
  }

  case object Karekare extends Iso639_3 {
    final val value: String = "kai"
  }

  case object Jju extends Iso639_3 {
    final val value: String = "kaj"
  }

  case object Kalanguya extends Iso639_3 {
    final val value: String = "kak"
  }

  case object Kalaallisut extends Iso639_3 {
    final val value: String = "kal"
  }

  case object KenyanKamba extends Iso639_3 {
    final val value: String = "kam"
  }

  case object Kannada extends Iso639_3 {
    final val value: String = "kan"
  }

  case object Xaasongaxango extends Iso639_3 {
    final val value: String = "kao"
  }

  case object Bezhta extends Iso639_3 {
    final val value: String = "kap"
  }

  case object Capanahua extends Iso639_3 {
    final val value: String = "kaq"
  }

  case object Kashmiri extends Iso639_3 {
    final val value: String = "kas"
  }

  case object Georgian extends Iso639_3 {
    final val value: String = "kat"
  }

  case object Kanuri extends Iso639_3 {
    final val value: String = "kau"
  }

  case object Katukina extends Iso639_3 {
    final val value: String = "kav"
  }

  case object Kao extends Iso639_3 {
    final val value: String = "kax"
  }

  case object Kamayura extends Iso639_3 {
    final val value: String = "kay"
  }

  case object Kazakh extends Iso639_3 {
    final val value: String = "kaz"
  }

  case object Kadiweu extends Iso639_3 {
    final val value: String = "kbc"
  }

  case object Kabardian extends Iso639_3 {
    final val value: String = "kbd"
  }

  case object Kanju extends Iso639_3 {
    final val value: String = "kbe"
  }

  case object Khamba extends Iso639_3 {
    final val value: String = "kbg"
  }

  case object Camsa extends Iso639_3 {
    final val value: String = "kbh"
  }

  case object Kaptiau extends Iso639_3 {
    final val value: String = "kbi"
  }

  case object Kari extends Iso639_3 {
    final val value: String = "kbj"
  }

  case object GrassKoiari extends Iso639_3 {
    final val value: String = "kbk"
  }

  case object Kanembu extends Iso639_3 {
    final val value: String = "kbl"
  }

  case object Iwal extends Iso639_3 {
    final val value: String = "kbm"
  }

  case object CentralAfricanRepublicanKare extends Iso639_3 {
    final val value: String = "kbn"
  }

  case object Keliko extends Iso639_3 {
    final val value: String = "kbo"
  }

  case object Kabiye extends Iso639_3 {
    final val value: String = "kbp"
  }

  case object Kamano extends Iso639_3 {
    final val value: String = "kbq"
  }

  case object Kafa extends Iso639_3 {
    final val value: String = "kbr"
  }

  case object Kande extends Iso639_3 {
    final val value: String = "kbs"
  }

  case object Abadi extends Iso639_3 {
    final val value: String = "kbt"
  }

  case object Kabutra extends Iso639_3 {
    final val value: String = "kbu"
  }

  case object IndonesianDera extends Iso639_3 {
    final val value: String = "kbv"
  }

  case object Kaiep extends Iso639_3 {
    final val value: String = "kbw"
  }

  case object Ap_Ma extends Iso639_3 {
    final val value: String = "kbx"
  }

  case object MangaKanuri extends Iso639_3 {
    final val value: String = "kby"
  }

  case object Duhwa extends Iso639_3 {
    final val value: String = "kbz"
  }

  case object Khanty extends Iso639_3 {
    final val value: String = "kca"
  }

  case object Kawacha extends Iso639_3 {
    final val value: String = "kcb"
  }

  case object Lubila extends Iso639_3 {
    final val value: String = "kcc"
  }

  case object NgkalmpwKanum extends Iso639_3 {
    final val value: String = "kcd"
  }

  case object Kaivi extends Iso639_3 {
    final val value: String = "kce"
  }

  case object Ukaan extends Iso639_3 {
    final val value: String = "kcf"
  }

  case object Tyap extends Iso639_3 {
    final val value: String = "kcg"
  }

  case object Vono extends Iso639_3 {
    final val value: String = "kch"
  }

  case object Kamantan extends Iso639_3 {
    final val value: String = "kci"
  }

  case object Kobiana extends Iso639_3 {
    final val value: String = "kcj"
  }

  case object Kalanga extends Iso639_3 {
    final val value: String = "kck"
  }

  case object PapuaNewGuineanKela extends Iso639_3 {
    final val value: String = "kcl"
  }

  case object CentralAfricanRepublicanGula extends Iso639_3 {
    final val value: String = "kcm"
  }

  case object Nubi extends Iso639_3 {
    final val value: String = "kcn"
  }

  case object Kinalakna extends Iso639_3 {
    final val value: String = "kco"
  }

  case object Kanga extends Iso639_3 {
    final val value: String = "kcp"
  }

  case object Kamo extends Iso639_3 {
    final val value: String = "kcq"
  }

  case object Katla extends Iso639_3 {
    final val value: String = "kcr"
  }

  case object Koenoem extends Iso639_3 {
    final val value: String = "kcs"
  }

  case object Kaian extends Iso639_3 {
    final val value: String = "kct"
  }

  case object TanzanianKami extends Iso639_3 {
    final val value: String = "kcu"
  }

  case object Kete extends Iso639_3 {
    final val value: String = "kcv"
  }

  case object Kabwari extends Iso639_3 {
    final val value: String = "kcw"
  }

  case object KachamaGanjule extends Iso639_3 {
    final val value: String = "kcx"
  }

  case object Korandje extends Iso639_3 {
    final val value: String = "kcy"
  }

  case object Konongo extends Iso639_3 {
    final val value: String = "kcz"
  }

  case object Kutu extends Iso639_3 {
    final val value: String = "kdc"
  }

  case object Yankunytjatjara extends Iso639_3 {
    final val value: String = "kdd"
  }

  case object Makonde extends Iso639_3 {
    final val value: String = "kde"
  }

  case object Mamusi extends Iso639_3 {
    final val value: String = "kdf"
  }

  case object Seba extends Iso639_3 {
    final val value: String = "kdg"
  }

  case object Tem extends Iso639_3 {
    final val value: String = "kdh"
  }

  case object Kumam extends Iso639_3 {
    final val value: String = "kdi"
  }

  case object Karamojong extends Iso639_3 {
    final val value: String = "kdj"
  }

  case object Numee extends Iso639_3 {
    final val value: String = "kdk"
  }

  case object Tsikimba extends Iso639_3 {
    final val value: String = "kdl"
  }

  case object Kagoma extends Iso639_3 {
    final val value: String = "kdm"
  }

  case object Kunda extends Iso639_3 {
    final val value: String = "kdn"
  }

  case object KaningdonNindem extends Iso639_3 {
    final val value: String = "kdp"
  }

  case object Koch extends Iso639_3 {
    final val value: String = "kdq"
  }

  case object Karaim extends Iso639_3 {
    final val value: String = "kdr"
  }

  case object Kuy extends Iso639_3 {
    final val value: String = "kdt"
  }

  case object Kadaru extends Iso639_3 {
    final val value: String = "kdu"
  }

  case object Koneraw extends Iso639_3 {
    final val value: String = "kdw"
  }

  case object Kam extends Iso639_3 {
    final val value: String = "kdx"
  }

  case object Keder extends Iso639_3 {
    final val value: String = "kdy"
  }

  case object Kwaja extends Iso639_3 {
    final val value: String = "kdz"
  }

  case object Kabuverdianu extends Iso639_3 {
    final val value: String = "kea"
  }

  case object Kele extends Iso639_3 {
    final val value: String = "keb"
  }

  case object Keiga extends Iso639_3 {
    final val value: String = "kec"
  }

  case object Kerewe extends Iso639_3 {
    final val value: String = "ked"
  }

  case object EasternKeres extends Iso639_3 {
    final val value: String = "kee"
  }

  case object Kpessi extends Iso639_3 {
    final val value: String = "kef"
  }

  case object Tese extends Iso639_3 {
    final val value: String = "keg"
  }

  case object Keak extends Iso639_3 {
    final val value: String = "keh"
  }

  case object Kei extends Iso639_3 {
    final val value: String = "kei"
  }

  case object Kadar extends Iso639_3 {
    final val value: String = "kej"
  }

  case object Kekchi extends Iso639_3 {
    final val value: String = "kek"
  }

  case object DemocraticRepublicOfCongoeseKela extends Iso639_3 {
    final val value: String = "kel"
  }

  case object Kemak extends Iso639_3 {
    final val value: String = "kem"
  }

  case object Kenyang extends Iso639_3 {
    final val value: String = "ken"
  }

  case object Kakwa extends Iso639_3 {
    final val value: String = "keo"
  }

  case object Kaikadi extends Iso639_3 {
    final val value: String = "kep"
  }

  case object Kamar extends Iso639_3 {
    final val value: String = "keq"
  }

  case object Kera extends Iso639_3 {
    final val value: String = "ker"
  }

  case object Kugbo extends Iso639_3 {
    final val value: String = "kes"
  }

  case object Ket extends Iso639_3 {
    final val value: String = "ket"
  }

  case object Akebu extends Iso639_3 {
    final val value: String = "keu"
  }

  case object Kanikkaran extends Iso639_3 {
    final val value: String = "kev"
  }

  case object WestKewa extends Iso639_3 {
    final val value: String = "kew"
  }

  case object Kukna extends Iso639_3 {
    final val value: String = "kex"
  }

  case object Kupia extends Iso639_3 {
    final val value: String = "key"
  }

  case object Kukele extends Iso639_3 {
    final val value: String = "kez"
  }

  case object Kodava extends Iso639_3 {
    final val value: String = "kfa"
  }

  case object NorthwesternKolami extends Iso639_3 {
    final val value: String = "kfb"
  }

  case object KondaDora extends Iso639_3 {
    final val value: String = "kfc"
  }

  case object KorraKoraga extends Iso639_3 {
    final val value: String = "kfd"
  }

  case object IndianKota extends Iso639_3 {
    final val value: String = "kfe"
  }

  case object Koya extends Iso639_3 {
    final val value: String = "kff"
  }

  case object Kudiya extends Iso639_3 {
    final val value: String = "kfg"
  }

  case object Kurichiya extends Iso639_3 {
    final val value: String = "kfh"
  }

  case object KannadaKurumba extends Iso639_3 {
    final val value: String = "kfi"
  }

  case object Kemiehua extends Iso639_3 {
    final val value: String = "kfj"
  }

  case object Kinnauri extends Iso639_3 {
    final val value: String = "kfk"
  }

  case object Kung extends Iso639_3 {
    final val value: String = "kfl"
  }

  case object Khunsari extends Iso639_3 {
    final val value: String = "kfm"
  }

  case object Kuk extends Iso639_3 {
    final val value: String = "kfn"
  }

  case object CotedIvoireKoro extends Iso639_3 {
    final val value: String = "kfo"
  }

  case object Korwa extends Iso639_3 {
    final val value: String = "kfp"
  }

  case object Korku extends Iso639_3 {
    final val value: String = "kfq"
  }

  case object Kachhi extends Iso639_3 {
    final val value: String = "kfr"
  }

  case object Bilaspuri extends Iso639_3 {
    final val value: String = "kfs"
  }

  case object Kanjari extends Iso639_3 {
    final val value: String = "kft"
  }

  case object Katkari extends Iso639_3 {
    final val value: String = "kfu"
  }

  case object Kurmukar extends Iso639_3 {
    final val value: String = "kfv"
  }

  case object KharamNaga extends Iso639_3 {
    final val value: String = "kfw"
  }

  case object KulluPahari extends Iso639_3 {
    final val value: String = "kfx"
  }

  case object Kumaoni extends Iso639_3 {
    final val value: String = "kfy"
  }

  case object Koromfe extends Iso639_3 {
    final val value: String = "kfz"
  }

  case object Koyaga extends Iso639_3 {
    final val value: String = "kga"
  }

  case object Kawe extends Iso639_3 {
    final val value: String = "kgb"
  }

  case object Komering extends Iso639_3 {
    final val value: String = "kge"
  }

  case object Kube extends Iso639_3 {
    final val value: String = "kgf"
  }

  case object Kusunda extends Iso639_3 {
    final val value: String = "kgg"
  }

  case object SelangorSignLanguage extends Iso639_3 {
    final val value: String = "kgi"
  }

  case object GamaleKham extends Iso639_3 {
    final val value: String = "kgj"
  }

  case object Kaiwa extends Iso639_3 {
    final val value: String = "kgk"
  }

  case object Karingani extends Iso639_3 {
    final val value: String = "kgn"
  }

  case object Krongo extends Iso639_3 {
    final val value: String = "kgo"
  }

  case object Kaingang extends Iso639_3 {
    final val value: String = "kgp"
  }

  case object Kamoro extends Iso639_3 {
    final val value: String = "kgq"
  }

  case object Abun extends Iso639_3 {
    final val value: String = "kgr"
  }

  case object Kumbainggar extends Iso639_3 {
    final val value: String = "kgs"
  }

  case object Somyev extends Iso639_3 {
    final val value: String = "kgt"
  }

  case object Kobol extends Iso639_3 {
    final val value: String = "kgu"
  }

  case object Karas extends Iso639_3 {
    final val value: String = "kgv"
  }

  case object KaronDori extends Iso639_3 {
    final val value: String = "kgw"
  }

  case object Kamaru extends Iso639_3 {
    final val value: String = "kgx"
  }

  case object Kyerung extends Iso639_3 {
    final val value: String = "kgy"
  }

  case object Khasi extends Iso639_3 {
    final val value: String = "kha"
  }

  case object Lu extends Iso639_3 {
    final val value: String = "khb"
  }

  case object BesiNorth extends Iso639_3 {
    final val value: String = "khc"
  }

  case object BadiKanum extends Iso639_3 {
    final val value: String = "khd"
  }

  case object Korowai extends Iso639_3 {
    final val value: String = "khe"
  }

  case object Khuen extends Iso639_3 {
    final val value: String = "khf"
  }

  case object KhamsTibetan extends Iso639_3 {
    final val value: String = "khg"
  }

  case object Kehu extends Iso639_3 {
    final val value: String = "khh"
  }

  case object Kuturmi extends Iso639_3 {
    final val value: String = "khj"
  }

  case object HalhMongolian extends Iso639_3 {
    final val value: String = "khk"
  }

  case object Lusi extends Iso639_3 {
    final val value: String = "khl"
  }

  case object Khmer extends Iso639_3 {
    final val value: String = "khm"
  }

  case object Khandesi extends Iso639_3 {
    final val value: String = "khn"
  }

  case object Kapori extends Iso639_3 {
    final val value: String = "khp"
  }

  case object ChiiniSonghay extends Iso639_3 {
    final val value: String = "khq"
  }

  case object Kharia extends Iso639_3 {
    final val value: String = "khr"
  }

  case object Kasua extends Iso639_3 {
    final val value: String = "khs"
  }

  case object Khamti extends Iso639_3 {
    final val value: String = "kht"
  }

  case object Nkhumbi extends Iso639_3 {
    final val value: String = "khu"
  }

  case object Khvarshi extends Iso639_3 {
    final val value: String = "khv"
  }

  case object Khowar extends Iso639_3 {
    final val value: String = "khw"
  }

  case object Kanu extends Iso639_3 {
    final val value: String = "khx"
  }

  case object DemocraticRepublicOfCongoeseKele extends Iso639_3 {
    final val value: String = "khy"
  }

  case object Keapara extends Iso639_3 {
    final val value: String = "khz"
  }

  case object Kim extends Iso639_3 {
    final val value: String = "kia"
  }

  case object Koalib extends Iso639_3 {
    final val value: String = "kib"
  }

  case object Kickapoo extends Iso639_3 {
    final val value: String = "kic"
  }

  case object Koshin extends Iso639_3 {
    final val value: String = "kid"
  }

  case object Kibet extends Iso639_3 {
    final val value: String = "kie"
  }

  case object ParbateKham extends Iso639_3 {
    final val value: String = "kif"
  }

  case object Kimaama extends Iso639_3 {
    final val value: String = "kig"
  }

  case object Kilmeri extends Iso639_3 {
    final val value: String = "kih"
  }

  case object Kilivila extends Iso639_3 {
    final val value: String = "kij"
  }

  case object Kikuyu extends Iso639_3 {
    final val value: String = "kik"
  }

  case object Kariya extends Iso639_3 {
    final val value: String = "kil"
  }

  case object Karagas extends Iso639_3 {
    final val value: String = "kim"
  }

  case object Kinyarwanda extends Iso639_3 {
    final val value: String = "kin"
  }

  case object Kiowa extends Iso639_3 {
    final val value: String = "kio"
  }

  case object SheshiKham extends Iso639_3 {
    final val value: String = "kip"
  }

  case object Kosadle extends Iso639_3 {
    final val value: String = "kiq"
  }

  case object Kirghiz extends Iso639_3 {
    final val value: String = "kir"
  }

  case object Kis extends Iso639_3 {
    final val value: String = "kis"
  }

  case object Agob extends Iso639_3 {
    final val value: String = "kit"
  }

  case object Kirmanjki extends Iso639_3 {
    final val value: String = "kiu"
  }

  case object Kimbu extends Iso639_3 {
    final val value: String = "kiv"
  }

  case object NortheastKiwai extends Iso639_3 {
    final val value: String = "kiw"
  }

  case object KhiamniunganNaga extends Iso639_3 {
    final val value: String = "kix"
  }

  case object Kirikiri extends Iso639_3 {
    final val value: String = "kiy"
  }

  case object Kisi extends Iso639_3 {
    final val value: String = "kiz"
  }

  case object Mlap extends Iso639_3 {
    final val value: String = "kja"
  }

  case object Qanjobal extends Iso639_3 {
    final val value: String = "kjb"
  }

  case object CoastalKonjo extends Iso639_3 {
    final val value: String = "kjc"
  }

  case object SouthernKiwai extends Iso639_3 {
    final val value: String = "kjd"
  }

  case object Kisar extends Iso639_3 {
    final val value: String = "kje"
  }

  case object Khalaj extends Iso639_3 {
    final val value: String = "kjf"
  }

  case object Khmu extends Iso639_3 {
    final val value: String = "kjg"
  }

  case object Khakas extends Iso639_3 {
    final val value: String = "kjh"
  }

  case object Zabana extends Iso639_3 {
    final val value: String = "kji"
  }

  case object Khinalugh extends Iso639_3 {
    final val value: String = "kjj"
  }

  case object HighlandKonjo extends Iso639_3 {
    final val value: String = "kjk"
  }

  case object WesternParbateKham extends Iso639_3 {
    final val value: String = "kjl"
  }

  case object Khang extends Iso639_3 {
    final val value: String = "kjm"
  }

  case object Kunjen extends Iso639_3 {
    final val value: String = "kjn"
  }

  case object HarijanKinnauri extends Iso639_3 {
    final val value: String = "kjo"
  }

  case object EasternKaren extends Iso639_3 {
    final val value: String = "kjp"
  }

  case object WesternKeres extends Iso639_3 {
    final val value: String = "kjq"
  }

  case object Kurudu extends Iso639_3 {
    final val value: String = "kjr"
  }

  case object EastKewa extends Iso639_3 {
    final val value: String = "kjs"
  }

  case object PwoKaren extends Iso639_3 {
    final val value: String = "kjt"
  }

  case object Kashaya extends Iso639_3 {
    final val value: String = "kju"
  }

  case object Ramopa extends Iso639_3 {
    final val value: String = "kjx"
  }

  case object Erave extends Iso639_3 {
    final val value: String = "kjy"
  }

  case object Bumthangkha extends Iso639_3 {
    final val value: String = "kjz"
  }

  case object Kakanda extends Iso639_3 {
    final val value: String = "kka"
  }

  case object Kwerisa extends Iso639_3 {
    final val value: String = "kkb"
  }

  case object Odoodee extends Iso639_3 {
    final val value: String = "kkc"
  }

  case object Kinuku extends Iso639_3 {
    final val value: String = "kkd"
  }

  case object Kakabe extends Iso639_3 {
    final val value: String = "kke"
  }

  case object KalaktangMonpa extends Iso639_3 {
    final val value: String = "kkf"
  }

  case object ValleyKalinga extends Iso639_3 {
    final val value: String = "kkg"
  }

  case object Khun extends Iso639_3 {
    final val value: String = "kkh"
  }

  case object Kagulu extends Iso639_3 {
    final val value: String = "kki"
  }

  case object Kako extends Iso639_3 {
    final val value: String = "kkj"
  }

  case object Kokota extends Iso639_3 {
    final val value: String = "kkk"
  }

  case object KosarekYale extends Iso639_3 {
    final val value: String = "kkl"
  }

  case object Kiong extends Iso639_3 {
    final val value: String = "kkm"
  }

  case object KonKeu extends Iso639_3 {
    final val value: String = "kkn"
  }

  case object Karko extends Iso639_3 {
    final val value: String = "kko"
  }

  case object Gugubera extends Iso639_3 {
    final val value: String = "kkp"
  }

  case object Kaiku extends Iso639_3 {
    final val value: String = "kkq"
  }

  case object KirBalar extends Iso639_3 {
    final val value: String = "kkr"
  }

  case object Giiwo extends Iso639_3 {
    final val value: String = "kks"
  }

  case object Koi extends Iso639_3 {
    final val value: String = "kkt"
  }

  case object Tumi extends Iso639_3 {
    final val value: String = "kku"
  }

  case object Kangean extends Iso639_3 {
    final val value: String = "kkv"
  }

  case object TekeKukuya extends Iso639_3 {
    final val value: String = "kkw"
  }

  case object Kohin extends Iso639_3 {
    final val value: String = "kkx"
  }

  case object Guguyimidjir extends Iso639_3 {
    final val value: String = "kky"
  }

  case object Kaska extends Iso639_3 {
    final val value: String = "kkz"
  }

  case object Kiliwa extends Iso639_3 {
    final val value: String = "klb"
  }

  case object Kolbila extends Iso639_3 {
    final val value: String = "klc"
  }

  case object Gamilaraay extends Iso639_3 {
    final val value: String = "kld"
  }

  case object NepaleseKulung extends Iso639_3 {
    final val value: String = "kle"
  }

  case object Kendeje extends Iso639_3 {
    final val value: String = "klf"
  }

  case object Tagakaulo extends Iso639_3 {
    final val value: String = "klg"
  }

  case object Weliki extends Iso639_3 {
    final val value: String = "klh"
  }

  case object Kalumpang extends Iso639_3 {
    final val value: String = "kli"
  }

  case object TurkicKhalaj extends Iso639_3 {
    final val value: String = "klj"
  }

  case object NigerianKono extends Iso639_3 {
    final val value: String = "klk"
  }

  case object KaganKalagan extends Iso639_3 {
    final val value: String = "kll"
  }

  case object Migum extends Iso639_3 {
    final val value: String = "klm"
  }

  case object Kalenjin extends Iso639_3 {
    final val value: String = "kln"
  }

  case object Kapya extends Iso639_3 {
    final val value: String = "klo"
  }

  case object Kamasa extends Iso639_3 {
    final val value: String = "klp"
  }

  case object Rumu extends Iso639_3 {
    final val value: String = "klq"
  }

  case object Khaling extends Iso639_3 {
    final val value: String = "klr"
  }

  case object Kalasha extends Iso639_3 {
    final val value: String = "kls"
  }

  case object Nukna extends Iso639_3 {
    final val value: String = "klt"
  }

  case object Klao extends Iso639_3 {
    final val value: String = "klu"
  }

  case object Maskelynes extends Iso639_3 {
    final val value: String = "klv"
  }

  case object Tado extends Iso639_3 {
    final val value: String = "klw"
  }

  case object Koluwawa extends Iso639_3 {
    final val value: String = "klx"
  }

  case object Kalao extends Iso639_3 {
    final val value: String = "kly"
  }

  case object Kabola extends Iso639_3 {
    final val value: String = "klz"
  }

  case object Konni extends Iso639_3 {
    final val value: String = "kma"
  }

  case object Kimbundu extends Iso639_3 {
    final val value: String = "kmb"
  }

  case object SouthernDong extends Iso639_3 {
    final val value: String = "kmc"
  }

  case object MajukayangKalinga extends Iso639_3 {
    final val value: String = "kmd"
  }

  case object Bakole extends Iso639_3 {
    final val value: String = "kme"
  }

  case object PapuaNewGuineanKare extends Iso639_3 {
    final val value: String = "kmf"
  }

  case object Kate extends Iso639_3 {
    final val value: String = "kmg"
  }

  case object Kalam extends Iso639_3 {
    final val value: String = "kmh"
  }

  case object NigerianKami extends Iso639_3 {
    final val value: String = "kmi"
  }

  case object KumarbhagPaharia extends Iso639_3 {
    final val value: String = "kmj"
  }

  case object LimosKalinga extends Iso639_3 {
    final val value: String = "kmk"
  }

  case object TanudanKalinga extends Iso639_3 {
    final val value: String = "kml"
  }

  case object IndianKom extends Iso639_3 {
    final val value: String = "kmm"
  }

  case object Awtuw extends Iso639_3 {
    final val value: String = "kmn"
  }

  case object Kwoma extends Iso639_3 {
    final val value: String = "kmo"
  }

  case object Gimme extends Iso639_3 {
    final val value: String = "kmp"
  }

  case object Kwama extends Iso639_3 {
    final val value: String = "kmq"
  }

  case object NorthernKurdish extends Iso639_3 {
    final val value: String = "kmr"
  }

  case object Kamasau extends Iso639_3 {
    final val value: String = "kms"
  }

  case object Kemtuik extends Iso639_3 {
    final val value: String = "kmt"
  }

  case object Kanite extends Iso639_3 {
    final val value: String = "kmu"
  }

  case object KaripunaCreoleFrench extends Iso639_3 {
    final val value: String = "kmv"
  }

  case object DomecraticRepublicOfCongoeseKomo extends Iso639_3 {
    final val value: String = "kmw"
  }

  case object Waboda extends Iso639_3 {
    final val value: String = "kmx"
  }

  case object Koma extends Iso639_3 {
    final val value: String = "kmy"
  }

  case object KhorasaniTurkish extends Iso639_3 {
    final val value: String = "kmz"
  }

  case object NigerianDera extends Iso639_3 {
    final val value: String = "kna"
  }

  case object LubuaganKalinga extends Iso639_3 {
    final val value: String = "knb"
  }

  case object CentralKanuri extends Iso639_3 {
    final val value: String = "knc"
  }

  case object Konda extends Iso639_3 {
    final val value: String = "knd"
  }

  case object Kankanaey extends Iso639_3 {
    final val value: String = "kne"
  }

  case object Mankanya extends Iso639_3 {
    final val value: String = "knf"
  }

  case object Koongo extends Iso639_3 {
    final val value: String = "kng"
  }

  case object Kanufi extends Iso639_3 {
    final val value: String = "kni"
  }

  case object WesternKanjobal extends Iso639_3 {
    final val value: String = "knj"
  }

  case object Kuranko extends Iso639_3 {
    final val value: String = "knk"
  }

  case object Keninjal extends Iso639_3 {
    final val value: String = "knl"
  }

  case object Kanamari extends Iso639_3 {
    final val value: String = "knm"
  }

  case object Konkani extends Iso639_3 {
    final val value: String = "knn"
  }

  case object SierraLeoneanKono extends Iso639_3 {
    final val value: String = "kno"
  }

  case object Kwanja extends Iso639_3 {
    final val value: String = "knp"
  }

  case object Kintaq extends Iso639_3 {
    final val value: String = "knq"
  }

  case object Kaningra extends Iso639_3 {
    final val value: String = "knr"
  }

  case object Kensiu extends Iso639_3 {
    final val value: String = "kns"
  }

  case object PanoanKatukina extends Iso639_3 {
    final val value: String = "knt"
  }

  case object GuineanKono extends Iso639_3 {
    final val value: String = "knu"
  }

  case object Tabo extends Iso639_3 {
    final val value: String = "knv"
  }

  case object KungEkoka extends Iso639_3 {
    final val value: String = "knw"
  }

  case object Kendayan extends Iso639_3 {
    final val value: String = "knx"
  }

  case object Kanyok extends Iso639_3 {
    final val value: String = "kny"
  }

  case object Kalamse extends Iso639_3 {
    final val value: String = "knz"
  }

  case object Konomala extends Iso639_3 {
    final val value: String = "koa"
  }

  case object Kodi extends Iso639_3 {
    final val value: String = "kod"
  }

  case object KacipoBalesi extends Iso639_3 {
    final val value: String = "koe"
  }

  case object Cogui extends Iso639_3 {
    final val value: String = "kog"
  }

  case object Koyo extends Iso639_3 {
    final val value: String = "koh"
  }

  case object KomiPermyak extends Iso639_3 {
    final val value: String = "koi"
  }

  case object MacrolanguageKonkani extends Iso639_3 {
    final val value: String = "kok"
  }

  case object PapuaNewGuineanKol extends Iso639_3 {
    final val value: String = "kol"
  }

  case object Komi extends Iso639_3 {
    final val value: String = "kom"
  }

  case object Kongo extends Iso639_3 {
    final val value: String = "kon"
  }

  case object Konzo extends Iso639_3 {
    final val value: String = "koo"
  }

  case object Waube extends Iso639_3 {
    final val value: String = "kop"
  }

  case object GaboneseKota extends Iso639_3 {
    final val value: String = "koq"
  }

  case object Korean extends Iso639_3 {
    final val value: String = "kor"
  }

  case object Kosraean extends Iso639_3 {
    final val value: String = "kos"
  }

  case object Lagwan extends Iso639_3 {
    final val value: String = "kot"
  }

  case object Koke extends Iso639_3 {
    final val value: String = "kou"
  }

  case object KuduCamo extends Iso639_3 {
    final val value: String = "kov"
  }

  case object Kugama extends Iso639_3 {
    final val value: String = "kow"
  }

  case object Koyukon extends Iso639_3 {
    final val value: String = "koy"
  }

  case object Korak extends Iso639_3 {
    final val value: String = "koz"
  }

  case object Kutto extends Iso639_3 {
    final val value: String = "kpa"
  }

  case object MulluKurumba extends Iso639_3 {
    final val value: String = "kpb"
  }

  case object Curripaco extends Iso639_3 {
    final val value: String = "kpc"
  }

  case object Koba extends Iso639_3 {
    final val value: String = "kpd"
  }

  case object Kpelle extends Iso639_3 {
    final val value: String = "kpe"
  }

  case object Komba extends Iso639_3 {
    final val value: String = "kpf"
  }

  case object Kapingamarangi extends Iso639_3 {
    final val value: String = "kpg"
  }

  case object Kplang extends Iso639_3 {
    final val value: String = "kph"
  }

  case object Kofei extends Iso639_3 {
    final val value: String = "kpi"
  }

  case object Karaja extends Iso639_3 {
    final val value: String = "kpj"
  }

  case object Kpan extends Iso639_3 {
    final val value: String = "kpk"
  }

  case object Kpala extends Iso639_3 {
    final val value: String = "kpl"
  }

  case object Koho extends Iso639_3 {
    final val value: String = "kpm"
  }

  case object Ikposo extends Iso639_3 {
    final val value: String = "kpo"
  }

  case object KorupunSela extends Iso639_3 {
    final val value: String = "kpq"
  }

  case object KorafeYegha extends Iso639_3 {
    final val value: String = "kpr"
  }

  case object Tehit extends Iso639_3 {
    final val value: String = "kps"
  }

  case object Karata extends Iso639_3 {
    final val value: String = "kpt"
  }

  case object Kafoa extends Iso639_3 {
    final val value: String = "kpu"
  }

  case object KomiZyrian extends Iso639_3 {
    final val value: String = "kpv"
  }

  case object Kobon extends Iso639_3 {
    final val value: String = "kpw"
  }

  case object MountainKoiali extends Iso639_3 {
    final val value: String = "kpx"
  }

  case object Koryak extends Iso639_3 {
    final val value: String = "kpy"
  }

  case object Kupsabiny extends Iso639_3 {
    final val value: String = "kpz"
  }

  case object Mum extends Iso639_3 {
    final val value: String = "kqa"
  }

  case object Kovai extends Iso639_3 {
    final val value: String = "kqb"
  }

  case object DoromuKoki extends Iso639_3 {
    final val value: String = "kqc"
  }

  case object SanjaqSurat extends Iso639_3 {
    final val value: String = "kqd"
  }

  case object Kalagan extends Iso639_3 {
    final val value: String = "kqe"
  }

  case object Kakabai extends Iso639_3 {
    final val value: String = "kqf"
  }

  case object Khe extends Iso639_3 {
    final val value: String = "kqg"
  }

  case object Kisankasa extends Iso639_3 {
    final val value: String = "kqh"
  }

  case object Koitabu extends Iso639_3 {
    final val value: String = "kqi"
  }

  case object Koromira extends Iso639_3 {
    final val value: String = "kqj"
  }

  case object KotafonGbe extends Iso639_3 {
    final val value: String = "kqk"
  }

  case object Kyenele extends Iso639_3 {
    final val value: String = "kql"
  }

  case object Khisa extends Iso639_3 {
    final val value: String = "kqm"
  }

  case object Kaonde extends Iso639_3 {
    final val value: String = "kqn"
  }

  case object EasternKrahn extends Iso639_3 {
    final val value: String = "kqo"
  }

  case object Kimre extends Iso639_3 {
    final val value: String = "kqp"
  }

  case object Krenak extends Iso639_3 {
    final val value: String = "kqq"
  }

  case object Kimaragang extends Iso639_3 {
    final val value: String = "kqr"
  }

  case object NorthernKissi extends Iso639_3 {
    final val value: String = "kqs"
  }

  case object RiverKadazan extends Iso639_3 {
    final val value: String = "kqt"
  }

  case object Okolod extends Iso639_3 {
    final val value: String = "kqv"
  }

  case object Kandas extends Iso639_3 {
    final val value: String = "kqw"
  }

  case object Mser extends Iso639_3 {
    final val value: String = "kqx"
  }

  case object Koorete extends Iso639_3 {
    final val value: String = "kqy"
  }

  case object Kumhali extends Iso639_3 {
    final val value: String = "kra"
  }

  case object KarachayBalkar extends Iso639_3 {
    final val value: String = "krc"
  }

  case object KairuiMidiki extends Iso639_3 {
    final val value: String = "krd"
  }

  case object Panara extends Iso639_3 {
    final val value: String = "kre"
  }

  case object VanuatuanKoro extends Iso639_3 {
    final val value: String = "krf"
  }

  case object Kurama extends Iso639_3 {
    final val value: String = "krh"
  }

  case object Krio extends Iso639_3 {
    final val value: String = "kri"
  }

  case object KinarayA extends Iso639_3 {
    final val value: String = "krj"
  }

  case object Karelian extends Iso639_3 {
    final val value: String = "krl"
  }

  case object Sapo extends Iso639_3 {
    final val value: String = "krn"
  }

  case object Korop extends Iso639_3 {
    final val value: String = "krp"
  }

  case object Krung extends Iso639_3 {
    final val value: String = "krr"
  }

  case object SudaneseGbaya extends Iso639_3 {
    final val value: String = "krs"
  }

  case object TumariKanuri extends Iso639_3 {
    final val value: String = "krt"
  }

  case object Kurukh extends Iso639_3 {
    final val value: String = "kru"
  }

  case object Kavet extends Iso639_3 {
    final val value: String = "krv"
  }

  case object WesternKrahn extends Iso639_3 {
    final val value: String = "krw"
  }

  case object Karon extends Iso639_3 {
    final val value: String = "krx"
  }

  case object Kryts extends Iso639_3 {
    final val value: String = "kry"
  }

  case object SotaKanum extends Iso639_3 {
    final val value: String = "krz"
  }

  case object ShuwaZamani extends Iso639_3 {
    final val value: String = "ksa"
  }

  case object Shambala extends Iso639_3 {
    final val value: String = "ksb"
  }

  case object SouthernKalinga extends Iso639_3 {
    final val value: String = "ksc"
  }

  case object Kuanua extends Iso639_3 {
    final val value: String = "ksd"
  }

  case object Kuni extends Iso639_3 {
    final val value: String = "kse"
  }

  case object Bafia extends Iso639_3 {
    final val value: String = "ksf"
  }

  case object Kusaghe extends Iso639_3 {
    final val value: String = "ksg"
  }

  case object Kolsch extends Iso639_3 {
    final val value: String = "ksh"
  }

  case object Krisa extends Iso639_3 {
    final val value: String = "ksi"
  }

  case object Uare extends Iso639_3 {
    final val value: String = "ksj"
  }

  case object Kansa extends Iso639_3 {
    final val value: String = "ksk"
  }

  case object Kumalu extends Iso639_3 {
    final val value: String = "ksl"
  }

  case object Kumba extends Iso639_3 {
    final val value: String = "ksm"
  }

  case object Kasiguranin extends Iso639_3 {
    final val value: String = "ksn"
  }

  case object Kofa extends Iso639_3 {
    final val value: String = "kso"
  }

  case object Kaba extends Iso639_3 {
    final val value: String = "ksp"
  }

  case object Kwaami extends Iso639_3 {
    final val value: String = "ksq"
  }

  case object Borong extends Iso639_3 {
    final val value: String = "ksr"
  }

  case object SouthernKisi extends Iso639_3 {
    final val value: String = "kss"
  }

  case object Winye extends Iso639_3 {
    final val value: String = "kst"
  }

  case object Khamyang extends Iso639_3 {
    final val value: String = "ksu"
  }

  case object Kusu extends Iso639_3 {
    final val value: String = "ksv"
  }

  case object SgawKaren extends Iso639_3 {
    final val value: String = "ksw"
  }

  case object Kedang extends Iso639_3 {
    final val value: String = "ksx"
  }

  case object KhariaThar extends Iso639_3 {
    final val value: String = "ksy"
  }

  case object Kodaku extends Iso639_3 {
    final val value: String = "ksz"
  }

  case object Katua extends Iso639_3 {
    final val value: String = "kta"
  }

  case object Kambaata extends Iso639_3 {
    final val value: String = "ktb"
  }

  case object Kholok extends Iso639_3 {
    final val value: String = "ktc"
  }

  case object Kokata extends Iso639_3 {
    final val value: String = "ktd"
  }

  case object Nubri extends Iso639_3 {
    final val value: String = "kte"
  }

  case object Kwami extends Iso639_3 {
    final val value: String = "ktf"
  }

  case object Karanga extends Iso639_3 {
    final val value: String = "kth"
  }

  case object NorthMuyu extends Iso639_3 {
    final val value: String = "kti"
  }

  case object PlapoKrumen extends Iso639_3 {
    final val value: String = "ktj"
  }

  case object Koroshi extends Iso639_3 {
    final val value: String = "ktl"
  }

  case object Kurti extends Iso639_3 {
    final val value: String = "ktm"
  }

  case object Karitiana extends Iso639_3 {
    final val value: String = "ktn"
  }

  case object Kuot extends Iso639_3 {
    final val value: String = "kto"
  }

  case object Kaduo extends Iso639_3 {
    final val value: String = "ktp"
  }

  case object SouthMuyu extends Iso639_3 {
    final val value: String = "kts"
  }

  case object Ketum extends Iso639_3 {
    final val value: String = "ktt"
  }

  case object DemocraticRepublicOfCongoeseKituba extends Iso639_3 {
    final val value: String = "ktu"
  }

  case object EasternKatu extends Iso639_3 {
    final val value: String = "ktv"
  }

  case object Kaxarari extends Iso639_3 {
    final val value: String = "ktx"
  }

  case object BasUeleKango extends Iso639_3 {
    final val value: String = "kty"
  }

  case object Juhoan extends Iso639_3 {
    final val value: String = "ktz"
  }

  case object Kuanyama extends Iso639_3 {
    final val value: String = "kua"
  }

  case object Kutep extends Iso639_3 {
    final val value: String = "kub"
  }

  case object Kwinsu extends Iso639_3 {
    final val value: String = "kuc"
  }

  case object Auhelawa extends Iso639_3 {
    final val value: String = "kud"
  }

  case object PapuaNewGuineanKuman extends Iso639_3 {
    final val value: String = "kue"
  }

  case object WesternKatu extends Iso639_3 {
    final val value: String = "kuf"
  }

  case object Kupa extends Iso639_3 {
    final val value: String = "kug"
  }

  case object Kushi extends Iso639_3 {
    final val value: String = "kuh"
  }

  case object KuikuroKalapalo extends Iso639_3 {
    final val value: String = "kui"
  }

  case object Kuria extends Iso639_3 {
    final val value: String = "kuj"
  }

  case object Kepo extends Iso639_3 {
    final val value: String = "kuk"
  }

  case object Kulere extends Iso639_3 {
    final val value: String = "kul"
  }

  case object Kumyk extends Iso639_3 {
    final val value: String = "kum"
  }

  case object Kunama extends Iso639_3 {
    final val value: String = "kun"
  }

  case object Kumukio extends Iso639_3 {
    final val value: String = "kuo"
  }

  case object Kunimaipa extends Iso639_3 {
    final val value: String = "kup"
  }

  case object Karipuna extends Iso639_3 {
    final val value: String = "kuq"
  }

  case object Kurdish extends Iso639_3 {
    final val value: String = "kur"
  }

  case object Kusaal extends Iso639_3 {
    final val value: String = "kus"
  }

  case object Kutenai extends Iso639_3 {
    final val value: String = "kut"
  }

  case object UpperKuskokwim extends Iso639_3 {
    final val value: String = "kuu"
  }

  case object Kur extends Iso639_3 {
    final val value: String = "kuv"
  }

  case object Kpagua extends Iso639_3 {
    final val value: String = "kuw"
  }

  case object Kukatja extends Iso639_3 {
    final val value: String = "kux"
  }

  case object KuukuYau extends Iso639_3 {
    final val value: String = "kuy"
  }

  case object Bagvalal extends Iso639_3 {
    final val value: String = "kva"
  }

  case object Kubu extends Iso639_3 {
    final val value: String = "kvb"
  }

  case object Kove extends Iso639_3 {
    final val value: String = "kvc"
  }

  case object IndonesianKui extends Iso639_3 {
    final val value: String = "kvd"
  }

  case object Kalabakan extends Iso639_3 {
    final val value: String = "kve"
  }

  case object Kabalai extends Iso639_3 {
    final val value: String = "kvf"
  }

  case object KuniBoazi extends Iso639_3 {
    final val value: String = "kvg"
  }

  case object Komodo extends Iso639_3 {
    final val value: String = "kvh"
  }

  case object Kwang extends Iso639_3 {
    final val value: String = "kvi"
  }

  case object Psikye extends Iso639_3 {
    final val value: String = "kvj"
  }

  case object KoreanSignLanguage extends Iso639_3 {
    final val value: String = "kvk"
  }

  case object Kayaw extends Iso639_3 {
    final val value: String = "kvl"
  }

  case object Kendem extends Iso639_3 {
    final val value: String = "kvm"
  }

  case object BorderKuna extends Iso639_3 {
    final val value: String = "kvn"
  }

  case object Dobel extends Iso639_3 {
    final val value: String = "kvo"
  }

  case object Kompane extends Iso639_3 {
    final val value: String = "kvp"
  }

  case object GebaKaren extends Iso639_3 {
    final val value: String = "kvq"
  }

  case object Kerinci extends Iso639_3 {
    final val value: String = "kvr"
  }

  case object LahtaKaren extends Iso639_3 {
    final val value: String = "kvt"
  }

  case object YinbawKaren extends Iso639_3 {
    final val value: String = "kvu"
  }

  case object Kola extends Iso639_3 {
    final val value: String = "kvv"
  }

  case object Wersing extends Iso639_3 {
    final val value: String = "kvw"
  }

  case object ParkariKoli extends Iso639_3 {
    final val value: String = "kvx"
  }

  case object YintaleKaren extends Iso639_3 {
    final val value: String = "kvy"
  }

  case object Tsakwambo extends Iso639_3 {
    final val value: String = "kvz"
  }

  case object Daw extends Iso639_3 {
    final val value: String = "kwa"
  }

  case object Kwa extends Iso639_3 {
    final val value: String = "kwb"
  }

  case object Likwala extends Iso639_3 {
    final val value: String = "kwc"
  }

  case object Kwaio extends Iso639_3 {
    final val value: String = "kwd"
  }

  case object Kwerba extends Iso639_3 {
    final val value: String = "kwe"
  }

  case object Kwaraae extends Iso639_3 {
    final val value: String = "kwf"
  }

  case object KabaDeme extends Iso639_3 {
    final val value: String = "kwg"
  }

  case object Kowiai extends Iso639_3 {
    final val value: String = "kwh"
  }

  case object AwaCuaiquer extends Iso639_3 {
    final val value: String = "kwi"
  }

  case object Kwanga extends Iso639_3 {
    final val value: String = "kwj"
  }

  case object Kwakiutl extends Iso639_3 {
    final val value: String = "kwk"
  }

  case object Kofyar extends Iso639_3 {
    final val value: String = "kwl"
  }

  case object Kwambi extends Iso639_3 {
    final val value: String = "kwm"
  }

  case object Kwangali extends Iso639_3 {
    final val value: String = "kwn"
  }

  case object Kwomtari extends Iso639_3 {
    final val value: String = "kwo"
  }

  case object Kodia extends Iso639_3 {
    final val value: String = "kwp"
  }

  case object Kwer extends Iso639_3 {
    final val value: String = "kwr"
  }

  case object Kwese extends Iso639_3 {
    final val value: String = "kws"
  }

  case object Kwesten extends Iso639_3 {
    final val value: String = "kwt"
  }

  case object Kwakum extends Iso639_3 {
    final val value: String = "kwu"
  }

  case object SaraKabaNaa extends Iso639_3 {
    final val value: String = "kwv"
  }

  case object Kwinti extends Iso639_3 {
    final val value: String = "kww"
  }

  case object Khirwar extends Iso639_3 {
    final val value: String = "kwx"
  }

  case object SalvadorKongo extends Iso639_3 {
    final val value: String = "kwy"
  }

  case object Kairiru extends Iso639_3 {
    final val value: String = "kxa"
  }

  case object Krobu extends Iso639_3 {
    final val value: String = "kxb"
  }

  case object Konso extends Iso639_3 {
    final val value: String = "kxc"
  }

  case object Brunei extends Iso639_3 {
    final val value: String = "kxd"
  }

  case object ManumanawKaren extends Iso639_3 {
    final val value: String = "kxf"
  }

  case object EthiopianKaro extends Iso639_3 {
    final val value: String = "kxh"
  }

  case object KeningauMurut extends Iso639_3 {
    final val value: String = "kxi"
  }

  case object Kulfa extends Iso639_3 {
    final val value: String = "kxj"
  }

  case object ZayeinKaren extends Iso639_3 {
    final val value: String = "kxk"
  }

  case object NepaliKurux extends Iso639_3 {
    final val value: String = "kxl"
  }

  case object NorthernKhmer extends Iso639_3 {
    final val value: String = "kxm"
  }

  case object TanjongMelanau extends Iso639_3 {
    final val value: String = "kxn"
  }

  case object WadiyaraKoli extends Iso639_3 {
    final val value: String = "kxp"
  }

  case object SmarkyKanum extends Iso639_3 {
    final val value: String = "kxq"
  }

  case object PapuaNewGuineanKoro extends Iso639_3 {
    final val value: String = "kxr"
  }

  case object Kangjia extends Iso639_3 {
    final val value: String = "kxs"
  }

  case object Koiwat extends Iso639_3 {
    final val value: String = "kxt"
  }

  case object IndianKui extends Iso639_3 {
    final val value: String = "kxu"
  }

  case object Kuvi extends Iso639_3 {
    final val value: String = "kxv"
  }

  case object Konai extends Iso639_3 {
    final val value: String = "kxw"
  }

  case object Likuba extends Iso639_3 {
    final val value: String = "kxx"
  }

  case object Kayong extends Iso639_3 {
    final val value: String = "kxy"
  }

  case object Kerewo extends Iso639_3 {
    final val value: String = "kxz"
  }

  case object Kwaya extends Iso639_3 {
    final val value: String = "kya"
  }

  case object ButbutKalinga extends Iso639_3 {
    final val value: String = "kyb"
  }

  case object Kyaka extends Iso639_3 {
    final val value: String = "kyc"
  }

  case object Karey extends Iso639_3 {
    final val value: String = "kyd"
  }

  case object Krache extends Iso639_3 {
    final val value: String = "kye"
  }

  case object Kouya extends Iso639_3 {
    final val value: String = "kyf"
  }

  case object Keyagana extends Iso639_3 {
    final val value: String = "kyg"
  }

  case object Karok extends Iso639_3 {
    final val value: String = "kyh"
  }

  case object Kiput extends Iso639_3 {
    final val value: String = "kyi"
  }

  case object Karao extends Iso639_3 {
    final val value: String = "kyj"
  }

  case object Kamayo extends Iso639_3 {
    final val value: String = "kyk"
  }

  case object Kalapuya extends Iso639_3 {
    final val value: String = "kyl"
  }

  case object Kpatili extends Iso639_3 {
    final val value: String = "kym"
  }

  case object NorthernBinukidnon extends Iso639_3 {
    final val value: String = "kyn"
  }

  case object Kelon extends Iso639_3 {
    final val value: String = "kyo"
  }

  case object Kang extends Iso639_3 {
    final val value: String = "kyp"
  }

  case object Kenga extends Iso639_3 {
    final val value: String = "kyq"
  }

  case object Kuruaya extends Iso639_3 {
    final val value: String = "kyr"
  }

  case object BaramKayan extends Iso639_3 {
    final val value: String = "kys"
  }

  case object Kayagar extends Iso639_3 {
    final val value: String = "kyt"
  }

  case object WesternKayah extends Iso639_3 {
    final val value: String = "kyu"
  }

  case object Kayort extends Iso639_3 {
    final val value: String = "kyv"
  }

  case object Kudmali extends Iso639_3 {
    final val value: String = "kyw"
  }

  case object Rapoisi extends Iso639_3 {
    final val value: String = "kyx"
  }

  case object Kambaira extends Iso639_3 {
    final val value: String = "kyy"
  }

  case object Kayabi extends Iso639_3 {
    final val value: String = "kyz"
  }

  case object WesternKaraboro extends Iso639_3 {
    final val value: String = "kza"
  }

  case object Kaibobo extends Iso639_3 {
    final val value: String = "kzb"
  }

  case object BondoukouKulango extends Iso639_3 {
    final val value: String = "kzc"
  }

  case object Kadai extends Iso639_3 {
    final val value: String = "kzd"
  }

  case object Kosena extends Iso639_3 {
    final val value: String = "kze"
  }

  case object DaaKaili extends Iso639_3 {
    final val value: String = "kzf"
  }

  case object Kikai extends Iso639_3 {
    final val value: String = "kzg"
  }

  case object Kelabit extends Iso639_3 {
    final val value: String = "kzi"
  }

  case object Kayeli extends Iso639_3 {
    final val value: String = "kzl"
  }

  case object Kais extends Iso639_3 {
    final val value: String = "kzm"
  }

  case object Kokola extends Iso639_3 {
    final val value: String = "kzn"
  }

  case object Kaningi extends Iso639_3 {
    final val value: String = "kzo"
  }

  case object Kaidipang extends Iso639_3 {
    final val value: String = "kzp"
  }

  case object Kaike extends Iso639_3 {
    final val value: String = "kzq"
  }

  case object Karang extends Iso639_3 {
    final val value: String = "kzr"
  }

  case object SugutDusun extends Iso639_3 {
    final val value: String = "kzs"
  }

  case object Kayupulau extends Iso639_3 {
    final val value: String = "kzu"
  }

  case object Komyandaret extends Iso639_3 {
    final val value: String = "kzv"
  }

  case object TshopoKango extends Iso639_3 {
    final val value: String = "kzy"
  }

  case object Kalabra extends Iso639_3 {
    final val value: String = "kzz"
  }

  case object SouthernSubanen extends Iso639_3 {
    final val value: String = "laa"
  }

  case object Lacandon extends Iso639_3 {
    final val value: String = "lac"
  }

  case object Ladino extends Iso639_3 {
    final val value: String = "lad"
  }

  case object Pattani extends Iso639_3 {
    final val value: String = "lae"
  }

  case object Lafofa extends Iso639_3 {
    final val value: String = "laf"
  }

  case object Langi extends Iso639_3 {
    final val value: String = "lag"
  }

  case object Lahnda extends Iso639_3 {
    final val value: String = "lah"
  }

  case object Lambya extends Iso639_3 {
    final val value: String = "lai"
  }

  case object UgandanLango extends Iso639_3 {
    final val value: String = "laj"
  }

  case object NigerianLaka extends Iso639_3 {
    final val value: String = "lak"
  }

  case object Lalia extends Iso639_3 {
    final val value: String = "lal"
  }

  case object Lamba extends Iso639_3 {
    final val value: String = "lam"
  }

  case object Laru extends Iso639_3 {
    final val value: String = "lan"
  }

  case object Lao extends Iso639_3 {
    final val value: String = "lao"
  }

  case object ChadLaka extends Iso639_3 {
    final val value: String = "lap"
  }

  case object Qabiao extends Iso639_3 {
    final val value: String = "laq"
  }

  case object Larteh extends Iso639_3 {
    final val value: String = "lar"
  }

  case object TogoLama extends Iso639_3 {
    final val value: String = "las"
  }

  case object Laba extends Iso639_3 {
    final val value: String = "lau"
  }

  case object Latvian extends Iso639_3 {
    final val value: String = "lav"
  }

  case object Lauje extends Iso639_3 {
    final val value: String = "law"
  }

  case object Tiwa extends Iso639_3 {
    final val value: String = "lax"
  }

  case object LamaBai extends Iso639_3 {
    final val value: String = "lay"
  }

  case object Label extends Iso639_3 {
    final val value: String = "lbb"
  }

  case object Lakkia extends Iso639_3 {
    final val value: String = "lbc"
  }

  case object Lak extends Iso639_3 {
    final val value: String = "lbe"
  }

  case object Tinani extends Iso639_3 {
    final val value: String = "lbf"
  }

  case object Laopang extends Iso639_3 {
    final val value: String = "lbg"
  }

  case object Labi extends Iso639_3 {
    final val value: String = "lbi"
  }

  case object Ladakhi extends Iso639_3 {
    final val value: String = "lbj"
  }

  case object CentralBontok extends Iso639_3 {
    final val value: String = "lbk"
  }

  case object LibonBikol extends Iso639_3 {
    final val value: String = "lbl"
  }

  case object Lodhi extends Iso639_3 {
    final val value: String = "lbm"
  }

  case object Lamet extends Iso639_3 {
    final val value: String = "lbn"
  }

  case object Laven extends Iso639_3 {
    final val value: String = "lbo"
  }

  case object Wampar extends Iso639_3 {
    final val value: String = "lbq"
  }

  case object Lohorung extends Iso639_3 {
    final val value: String = "lbr"
  }

  case object LibyanSignLanguage extends Iso639_3 {
    final val value: String = "lbs"
  }

  case object Lachi extends Iso639_3 {
    final val value: String = "lbt"
  }

  case object Labu extends Iso639_3 {
    final val value: String = "lbu"
  }

  case object LavatburaLamusong extends Iso639_3 {
    final val value: String = "lbv"
  }

  case object Tolaki extends Iso639_3 {
    final val value: String = "lbw"
  }

  case object Lawangan extends Iso639_3 {
    final val value: String = "lbx"
  }

  case object Lardil extends Iso639_3 {
    final val value: String = "lbz"
  }

  case object Legenyem extends Iso639_3 {
    final val value: String = "lcc"
  }

  case object Lola extends Iso639_3 {
    final val value: String = "lcd"
  }

  case object Loncong extends Iso639_3 {
    final val value: String = "lce"
  }

  case object Lubu extends Iso639_3 {
    final val value: String = "lcf"
  }

  case object Luchazi extends Iso639_3 {
    final val value: String = "lch"
  }

  case object Lisela extends Iso639_3 {
    final val value: String = "lcl"
  }

  case object Tungag extends Iso639_3 {
    final val value: String = "lcm"
  }

  case object WesternLawa extends Iso639_3 {
    final val value: String = "lcp"
  }

  case object Luhu extends Iso639_3 {
    final val value: String = "lcq"
  }

  case object LisabataNuniali extends Iso639_3 {
    final val value: String = "lcs"
  }

  case object KlaDan extends Iso639_3 {
    final val value: String = "lda"
  }

  case object Duya extends Iso639_3 {
    final val value: String = "ldb"
  }

  case object Luri extends Iso639_3 {
    final val value: String = "ldd"
  }

  case object Lenyima extends Iso639_3 {
    final val value: String = "ldg"
  }

  case object LamjaDengsaTola extends Iso639_3 {
    final val value: String = "ldh"
  }

  case object Laari extends Iso639_3 {
    final val value: String = "ldi"
  }

  case object Lemoro extends Iso639_3 {
    final val value: String = "ldj"
  }

  case object Leelau extends Iso639_3 {
    final val value: String = "ldk"
  }

  case object Kaan extends Iso639_3 {
    final val value: String = "ldl"
  }

  case object Landoma extends Iso639_3 {
    final val value: String = "ldm"
  }

  case object Loo extends Iso639_3 {
    final val value: String = "ldo"
  }

  case object Tso extends Iso639_3 {
    final val value: String = "ldp"
  }

  case object Lufu extends Iso639_3 {
    final val value: String = "ldq"
  }

  case object LegaShabunda extends Iso639_3 {
    final val value: String = "lea"
  }

  case object LalaBisa extends Iso639_3 {
    final val value: String = "leb"
  }

  case object Leco extends Iso639_3 {
    final val value: String = "lec"
  }

  case object Lendu extends Iso639_3 {
    final val value: String = "led"
  }

  case object Lyele extends Iso639_3 {
    final val value: String = "lee"
  }

  case object Lelemi extends Iso639_3 {
    final val value: String = "lef"
  }

  case object Lenje extends Iso639_3 {
    final val value: String = "leh"
  }

  case object Lemio extends Iso639_3 {
    final val value: String = "lei"
  }

  case object Lengola extends Iso639_3 {
    final val value: String = "lej"
  }

  case object Leipon extends Iso639_3 {
    final val value: String = "lek"
  }

  case object DemocraticRepublicOfCongoeseLele extends Iso639_3 {
    final val value: String = "lel"
  }

  case object Nomaande extends Iso639_3 {
    final val value: String = "lem"
  }

  case object CameroonianLeti extends Iso639_3 {
    final val value: String = "leo"
  }

  case object Lepcha extends Iso639_3 {
    final val value: String = "lep"
  }

  case object Lembena extends Iso639_3 {
    final val value: String = "leq"
  }

  case object Lenkau extends Iso639_3 {
    final val value: String = "ler"
  }

  case object Lese extends Iso639_3 {
    final val value: String = "les"
  }

  case object LesingGelimi extends Iso639_3 {
    final val value: String = "let"
  }

  case object PapuaNewGuineanKara extends Iso639_3 {
    final val value: String = "leu"
  }

  case object Lamma extends Iso639_3 {
    final val value: String = "lev"
  }

  case object LedoKaili extends Iso639_3 {
    final val value: String = "lew"
  }

  case object Luang extends Iso639_3 {
    final val value: String = "lex"
  }

  case object Lemolang extends Iso639_3 {
    final val value: String = "ley"
  }

  case object Lezghian extends Iso639_3 {
    final val value: String = "lez"
  }

  case object Lefa extends Iso639_3 {
    final val value: String = "lfa"
  }

  case object Lungga extends Iso639_3 {
    final val value: String = "lga"
  }

  case object Laghu extends Iso639_3 {
    final val value: String = "lgb"
  }

  case object Lugbara extends Iso639_3 {
    final val value: String = "lgg"
  }

  case object Laghuu extends Iso639_3 {
    final val value: String = "lgh"
  }

  case object Lengilu extends Iso639_3 {
    final val value: String = "lgi"
  }

  case object Lingarak extends Iso639_3 {
    final val value: String = "lgk"
  }

  case object Wala extends Iso639_3 {
    final val value: String = "lgl"
  }

  case object LegaMwenga extends Iso639_3 {
    final val value: String = "lgm"
  }

  case object Tapo extends Iso639_3 {
    final val value: String = "lgn"
  }

  case object Logba extends Iso639_3 {
    final val value: String = "lgq"
  }

  case object Lengo extends Iso639_3 {
    final val value: String = "lgr"
  }

  case object Pahi extends Iso639_3 {
    final val value: String = "lgt"
  }

  case object Longgu extends Iso639_3 {
    final val value: String = "lgu"
  }

  case object Ligenza extends Iso639_3 {
    final val value: String = "lgz"
  }

  case object VietnameseLaha extends Iso639_3 {
    final val value: String = "lha"
  }

  case object IndonesianLaha extends Iso639_3 {
    final val value: String = "lhh"
  }

  case object LahuShi extends Iso639_3 {
    final val value: String = "lhi"
  }

  case object LahulLohar extends Iso639_3 {
    final val value: String = "lhl"
  }

  case object Lhomi extends Iso639_3 {
    final val value: String = "lhm"
  }

  case object Lahanan extends Iso639_3 {
    final val value: String = "lhn"
  }

  case object Lhokpu extends Iso639_3 {
    final val value: String = "lhp"
  }

  case object LoToga extends Iso639_3 {
    final val value: String = "lht"
  }

  case object Lahu extends Iso639_3 {
    final val value: String = "lhu"
  }

  case object CentralLimba extends Iso639_3 {
    final val value: String = "lia"
  }

  case object Likum extends Iso639_3 {
    final val value: String = "lib"
  }

  case object Hlai extends Iso639_3 {
    final val value: String = "lic"
  }

  case object Nyindrou extends Iso639_3 {
    final val value: String = "lid"
  }

  case object Likila extends Iso639_3 {
    final val value: String = "lie"
  }

  case object Limbu extends Iso639_3 {
    final val value: String = "lif"
  }

  case object Ligbi extends Iso639_3 {
    final val value: String = "lig"
  }

  case object Lihir extends Iso639_3 {
    final val value: String = "lih"
  }

  case object Ligurian extends Iso639_3 {
    final val value: String = "lij"
  }

  case object Lika extends Iso639_3 {
    final val value: String = "lik"
  }

  case object Lillooet extends Iso639_3 {
    final val value: String = "lil"
  }

  case object Limburgan extends Iso639_3 {
    final val value: String = "lim"
  }

  case object Lingala extends Iso639_3 {
    final val value: String = "lin"
  }

  case object Liki extends Iso639_3 {
    final val value: String = "lio"
  }

  case object Sekpele extends Iso639_3 {
    final val value: String = "lip"
  }

  case object Libido extends Iso639_3 {
    final val value: String = "liq"
  }

  case object LiberianEnglish extends Iso639_3 {
    final val value: String = "lir"
  }

  case object Lisu extends Iso639_3 {
    final val value: String = "lis"
  }

  case object Lithuanian extends Iso639_3 {
    final val value: String = "lit"
  }

  case object Logorik extends Iso639_3 {
    final val value: String = "liu"
  }

  case object Liv extends Iso639_3 {
    final val value: String = "liv"
  }

  case object Col extends Iso639_3 {
    final val value: String = "liw"
  }

  case object Liabuku extends Iso639_3 {
    final val value: String = "lix"
  }

  case object BandaBambari extends Iso639_3 {
    final val value: String = "liy"
  }

  case object Libinza extends Iso639_3 {
    final val value: String = "liz"
  }

  case object Rampi extends Iso639_3 {
    final val value: String = "lje"
  }

  case object Laiyolo extends Iso639_3 {
    final val value: String = "lji"
  }

  case object Lio extends Iso639_3 {
    final val value: String = "ljl"
  }

  case object LampungApi extends Iso639_3 {
    final val value: String = "ljp"
  }

  case object Yirandali extends Iso639_3 {
    final val value: String = "ljw"
  }

  case object Lakalei extends Iso639_3 {
    final val value: String = "lka"
  }

  case object Kabras extends Iso639_3 {
    final val value: String = "lkb"
  }

  case object Kucong extends Iso639_3 {
    final val value: String = "lkc"
  }

  case object Lakonde extends Iso639_3 {
    final val value: String = "lkd"
  }

  case object Kenyi extends Iso639_3 {
    final val value: String = "lke"
  }

  case object Lakha extends Iso639_3 {
    final val value: String = "lkh"
  }

  case object Laki extends Iso639_3 {
    final val value: String = "lki"
  }

  case object Remun extends Iso639_3 {
    final val value: String = "lkj"
  }

  case object LaekoLibuat extends Iso639_3 {
    final val value: String = "lkl"
  }

  case object Lakon extends Iso639_3 {
    final val value: String = "lkn"
  }

  case object Khayo extends Iso639_3 {
    final val value: String = "lko"
  }

  case object Pari extends Iso639_3 {
    final val value: String = "lkr"
  }

  case object Kisa extends Iso639_3 {
    final val value: String = "lks"
  }

  case object Lakota extends Iso639_3 {
    final val value: String = "lkt"
  }

  case object Lokoya extends Iso639_3 {
    final val value: String = "lky"
  }

  case object LalaRoba extends Iso639_3 {
    final val value: String = "lla"
  }

  case object Lolo extends Iso639_3 {
    final val value: String = "llb"
  }

  case object GuineanLele extends Iso639_3 {
    final val value: String = "llc"
  }

  case object Ladin extends Iso639_3 {
    final val value: String = "lld"
  }

  case object PapuaNewGuineanLele extends Iso639_3 {
    final val value: String = "lle"
  }

  case object Lole extends Iso639_3 {
    final val value: String = "llg"
  }

  case object Lamu extends Iso639_3 {
    final val value: String = "llh"
  }

  case object TekeLaali extends Iso639_3 {
    final val value: String = "lli"
  }

  case object Lilau extends Iso639_3 {
    final val value: String = "lll"
  }

  case object Lasalimu extends Iso639_3 {
    final val value: String = "llm"
  }

  case object ChadLele extends Iso639_3 {
    final val value: String = "lln"
  }

  case object Khlor extends Iso639_3 {
    final val value: String = "llo"
  }

  case object NorthEfate extends Iso639_3 {
    final val value: String = "llp"
  }

  case object Lolak extends Iso639_3 {
    final val value: String = "llq"
  }

  case object LithuanianSignLanguage extends Iso639_3 {
    final val value: String = "lls"
  }

  case object Lau extends Iso639_3 {
    final val value: String = "llu"
  }

  case object Lauan extends Iso639_3 {
    final val value: String = "llx"
  }

  case object EastLimba extends Iso639_3 {
    final val value: String = "lma"
  }

  case object Merei extends Iso639_3 {
    final val value: String = "lmb"
  }

  case object Lumun extends Iso639_3 {
    final val value: String = "lmd"
  }

  case object Peve extends Iso639_3 {
    final val value: String = "lme"
  }

  case object SouthLembata extends Iso639_3 {
    final val value: String = "lmf"
  }

  case object Lamogai extends Iso639_3 {
    final val value: String = "lmg"
  }

  case object Lambichhong extends Iso639_3 {
    final val value: String = "lmh"
  }

  case object Lombi extends Iso639_3 {
    final val value: String = "lmi"
  }

  case object WestLembata extends Iso639_3 {
    final val value: String = "lmj"
  }

  case object Lamkang extends Iso639_3 {
    final val value: String = "lmk"
  }

  case object Hano extends Iso639_3 {
    final val value: String = "lml"
  }

  case object Lambadi extends Iso639_3 {
    final val value: String = "lmn"
  }

  case object Lombard extends Iso639_3 {
    final val value: String = "lmo"
  }

  case object Limbum extends Iso639_3 {
    final val value: String = "lmp"
  }

  case object Lamatuka extends Iso639_3 {
    final val value: String = "lmq"
  }

  case object Lamalera extends Iso639_3 {
    final val value: String = "lmr"
  }

  case object Lamenu extends Iso639_3 {
    final val value: String = "lmu"
  }

  case object Lomaiviti extends Iso639_3 {
    final val value: String = "lmv"
  }

  case object LakeMiwok extends Iso639_3 {
    final val value: String = "lmw"
  }

  case object Laimbue extends Iso639_3 {
    final val value: String = "lmx"
  }

  case object Lamboya extends Iso639_3 {
    final val value: String = "lmy"
  }

  case object Langbashe extends Iso639_3 {
    final val value: String = "lna"
  }

  case object Mbalanhu extends Iso639_3 {
    final val value: String = "lnb"
  }

  case object Lundayeh extends Iso639_3 {
    final val value: String = "lnd"
  }

  case object Lanoh extends Iso639_3 {
    final val value: String = "lnh"
  }

  case object Daantanai extends Iso639_3 {
    final val value: String = "lni"
  }

  case object CentralBanda extends Iso639_3 {
    final val value: String = "lnl"
  }

  case object Langam extends Iso639_3 {
    final val value: String = "lnm"
  }

  case object Lorediakarkar extends Iso639_3 {
    final val value: String = "lnn"
  }

  case object SouthSudaneseLango extends Iso639_3 {
    final val value: String = "lno"
  }

  case object Lamnso extends Iso639_3 {
    final val value: String = "lns"
  }

  case object Longuda extends Iso639_3 {
    final val value: String = "lnu"
  }

  case object Lonzo extends Iso639_3 {
    final val value: String = "lnz"
  }

  case object Loloda extends Iso639_3 {
    final val value: String = "loa"
  }

  case object Lobi extends Iso639_3 {
    final val value: String = "lob"
  }

  case object Inonhan extends Iso639_3 {
    final val value: String = "loc"
  }

  case object Saluan extends Iso639_3 {
    final val value: String = "loe"
  }

  case object Logol extends Iso639_3 {
    final val value: String = "lof"
  }

  case object Logo extends Iso639_3 {
    final val value: String = "log"
  }

  case object Narim extends Iso639_3 {
    final val value: String = "loh"
  }

  case object CotedIvoireLoma extends Iso639_3 {
    final val value: String = "loi"
  }

  case object Lou extends Iso639_3 {
    final val value: String = "loj"
  }

  case object Loko extends Iso639_3 {
    final val value: String = "lok"
  }

  case object Mongo extends Iso639_3 {
    final val value: String = "lol"
  }

  case object LiberianLoma extends Iso639_3 {
    final val value: String = "lom"
  }

  case object MalawiLomwe extends Iso639_3 {
    final val value: String = "lon"
  }

  case object Lombo extends Iso639_3 {
    final val value: String = "loo"
  }

  case object Lopa extends Iso639_3 {
    final val value: String = "lop"
  }

  case object Lobala extends Iso639_3 {
    final val value: String = "loq"
  }

  case object Teen extends Iso639_3 {
    final val value: String = "lor"
  }

  case object Loniu extends Iso639_3 {
    final val value: String = "los"
  }

  case object Otuho extends Iso639_3 {
    final val value: String = "lot"
  }

  case object LouisianaCreole extends Iso639_3 {
    final val value: String = "lou"
  }

  case object Lopi extends Iso639_3 {
    final val value: String = "lov"
  }

  case object TampiasLobu extends Iso639_3 {
    final val value: String = "low"
  }

  case object Loun extends Iso639_3 {
    final val value: String = "lox"
  }

  case object Loke extends Iso639_3 {
    final val value: String = "loy"
  }

  case object Lozi extends Iso639_3 {
    final val value: String = "loz"
  }

  case object Lelepa extends Iso639_3 {
    final val value: String = "lpa"
  }

  case object Lepki extends Iso639_3 {
    final val value: String = "lpe"
  }

  case object PhuriNaga extends Iso639_3 {
    final val value: String = "lpn"
  }

  case object Lipo extends Iso639_3 {
    final val value: String = "lpo"
  }

  case object Lopit extends Iso639_3 {
    final val value: String = "lpx"
  }

  case object RaraBakati extends Iso639_3 {
    final val value: String = "lra"
  }

  case object NorthernLuri extends Iso639_3 {
    final val value: String = "lrc"
  }

  case object Marachi extends Iso639_3 {
    final val value: String = "lri"
  }

  case object Loarki extends Iso639_3 {
    final val value: String = "lrk"
  }

  case object Lari extends Iso639_3 {
    final val value: String = "lrl"
  }

  case object Marama extends Iso639_3 {
    final val value: String = "lrm"
  }

  case object Lorang extends Iso639_3 {
    final val value: String = "lrn"
  }

  case object Laro extends Iso639_3 {
    final val value: String = "lro"
  }

  case object SouthernYamphu extends Iso639_3 {
    final val value: String = "lrr"
  }

  case object LarantukaMalay extends Iso639_3 {
    final val value: String = "lrt"
  }

  case object Larevat extends Iso639_3 {
    final val value: String = "lrv"
  }

  case object Lemerig extends Iso639_3 {
    final val value: String = "lrz"
  }

  case object Lasgerdi extends Iso639_3 {
    final val value: String = "lsa"
  }

  case object LishanaDeni extends Iso639_3 {
    final val value: String = "lsd"
  }

  case object Lusengo extends Iso639_3 {
    final val value: String = "lse"
  }

  case object Lish extends Iso639_3 {
    final val value: String = "lsh"
  }

  case object Lashi extends Iso639_3 {
    final val value: String = "lsi"
  }

  case object LatvianSignLanguage extends Iso639_3 {
    final val value: String = "lsl"
  }

  case object Saamia extends Iso639_3 {
    final val value: String = "lsm"
  }

  case object LaosSignLanguage extends Iso639_3 {
    final val value: String = "lso"
  }

  case object PanamanianSignLanguage extends Iso639_3 {
    final val value: String = "lsp"
  }

  case object Aruop extends Iso639_3 {
    final val value: String = "lsr"
  }

  case object Lasi extends Iso639_3 {
    final val value: String = "lss"
  }

  case object TrinidadAndTobagoSignLanguage extends Iso639_3 {
    final val value: String = "lst"
  }

  case object MauritianSignLanguage extends Iso639_3 {
    final val value: String = "lsy"
  }

  case object Latgalian extends Iso639_3 {
    final val value: String = "ltg"
  }

  case object Thur extends Iso639_3 {
    final val value: String = "lth"
  }

  case object IndonesianLeti extends Iso639_3 {
    final val value: String = "lti"
  }

  case object Latunde extends Iso639_3 {
    final val value: String = "ltn"
  }

  case object Tsotso extends Iso639_3 {
    final val value: String = "lto"
  }

  case object Tachoni extends Iso639_3 {
    final val value: String = "lts"
  }

  case object Latu extends Iso639_3 {
    final val value: String = "ltu"
  }

  case object Luxembourgish extends Iso639_3 {
    final val value: String = "ltz"
  }

  case object LubaLulua extends Iso639_3 {
    final val value: String = "lua"
  }

  case object LubaKatanga extends Iso639_3 {
    final val value: String = "lub"
  }

  case object Aringa extends Iso639_3 {
    final val value: String = "luc"
  }

  case object Ludian extends Iso639_3 {
    final val value: String = "lud"
  }

  case object Luvale extends Iso639_3 {
    final val value: String = "lue"
  }

  case object Laua extends Iso639_3 {
    final val value: String = "luf"
  }

  case object Ganda extends Iso639_3 {
    final val value: String = "lug"
  }

  case object Luiseno extends Iso639_3 {
    final val value: String = "lui"
  }

  case object Luna extends Iso639_3 {
    final val value: String = "luj"
  }

  case object Lunanakha extends Iso639_3 {
    final val value: String = "luk"
  }

  case object Olubo extends Iso639_3 {
    final val value: String = "lul"
  }

  case object Luimbi extends Iso639_3 {
    final val value: String = "lum"
  }

  case object Lunda extends Iso639_3 {
    final val value: String = "lun"
  }

  case object KenyanAndTanzanianLuo extends Iso639_3 {
    final val value: String = "luo"
  }

  case object Lumbu extends Iso639_3 {
    final val value: String = "lup"
  }

  case object Lucumi extends Iso639_3 {
    final val value: String = "luq"
  }

  case object Laura extends Iso639_3 {
    final val value: String = "lur"
  }

  case object Lushai extends Iso639_3 {
    final val value: String = "lus"
  }

  case object Lushootseed extends Iso639_3 {
    final val value: String = "lut"
  }

  case object LumbaYakkha extends Iso639_3 {
    final val value: String = "luu"
  }

  case object Luwati extends Iso639_3 {
    final val value: String = "luv"
  }

  case object CameroonianLuo extends Iso639_3 {
    final val value: String = "luw"
  }

  case object Luyia extends Iso639_3 {
    final val value: String = "luy"
  }

  case object SouthernLuri extends Iso639_3 {
    final val value: String = "luz"
  }

  case object Makua extends Iso639_3 {
    final val value: String = "lva"
  }

  case object Lavukaleve extends Iso639_3 {
    final val value: String = "lvk"
  }

  case object StandardLatvian extends Iso639_3 {
    final val value: String = "lvs"
  }

  case object Levuka extends Iso639_3 {
    final val value: String = "lvu"
  }

  case object Lwalu extends Iso639_3 {
    final val value: String = "lwa"
  }

  case object LewoEleng extends Iso639_3 {
    final val value: String = "lwe"
  }

  case object Wanga extends Iso639_3 {
    final val value: String = "lwg"
  }

  case object WhiteLachi extends Iso639_3 {
    final val value: String = "lwh"
  }

  case object EasternLawa extends Iso639_3 {
    final val value: String = "lwl"
  }

  case object Laomian extends Iso639_3 {
    final val value: String = "lwm"
  }

  case object Luwo extends Iso639_3 {
    final val value: String = "lwo"
  }

  case object MalawianSignLanguage extends Iso639_3 {
    final val value: String = "lws"
  }

  case object Lewotobi extends Iso639_3 {
    final val value: String = "lwt"
  }

  case object Lawu extends Iso639_3 {
    final val value: String = "lwu"
  }

  case object Lewo extends Iso639_3 {
    final val value: String = "lww"
  }

  case object Layakha extends Iso639_3 {
    final val value: String = "lya"
  }

  case object Lyngngam extends Iso639_3 {
    final val value: String = "lyg"
  }

  case object Luyana extends Iso639_3 {
    final val value: String = "lyn"
  }

  case object Litzlitz extends Iso639_3 {
    final val value: String = "lzl"
  }

  case object LeinongNaga extends Iso639_3 {
    final val value: String = "lzn"
  }

  case object Laz extends Iso639_3 {
    final val value: String = "lzz"
  }
  case object SanJeronimoTecoatlMazatec extends Iso639_3 {
    final val value: String = "maa"
  }

  case object YutanduchiMixtec extends Iso639_3 {
    final val value: String = "mab"
  }

  case object Madurese extends Iso639_3 {
    final val value: String = "mad"
  }

  case object BoRukul extends Iso639_3 {
    final val value: String = "mae"
  }

  case object Mafa extends Iso639_3 {
    final val value: String = "maf"
  }

  case object Magahi extends Iso639_3 {
    final val value: String = "mag"
  }

  case object Marshallese extends Iso639_3 {
    final val value: String = "mah"
  }

  case object Maithili extends Iso639_3 {
    final val value: String = "mai"
  }

  case object JalapaDeDiazMazatec extends Iso639_3 {
    final val value: String = "maj"
  }

  case object Makasar extends Iso639_3 {
    final val value: String = "mak"
  }

  case object Malayalam extends Iso639_3 {
    final val value: String = "mal"
  }

  case object Mam extends Iso639_3 {
    final val value: String = "mam"
  }

  case object Mandingo extends Iso639_3 {
    final val value: String = "man"
  }

  case object ChiquihuitlanMazatec extends Iso639_3 {
    final val value: String = "maq"
  }

  case object Marathi extends Iso639_3 {
    final val value: String = "mar"
  }

  case object Masai extends Iso639_3 {
    final val value: String = "mas"
  }

  case object FranciscoMatlatzinca extends Iso639_3 {
    final val value: String = "mat"
  }

  case object HuautlaMazatec extends Iso639_3 {
    final val value: String = "mau"
  }

  case object SatereMawe extends Iso639_3 {
    final val value: String = "mav"
  }

  case object Mampruli extends Iso639_3 {
    final val value: String = "maw"
  }

  case object MoluccanMalay extends Iso639_3 {
    final val value: String = "max"
  }

  case object CentralMazahua extends Iso639_3 {
    final val value: String = "maz"
  }

  case object Higaonon extends Iso639_3 {
    final val value: String = "mba"
  }

  case object BukidnonManobo extends Iso639_3 {
    final val value: String = "mbb"
  }

  case object Macushi extends Iso639_3 {
    final val value: String = "mbc"
  }

  case object DibabawonManobo extends Iso639_3 {
    final val value: String = "mbd"
  }

  case object BabaMalay extends Iso639_3 {
    final val value: String = "mbf"
  }

  case object Mangseng extends Iso639_3 {
    final val value: String = "mbh"
  }

  case object IlianenManobo extends Iso639_3 {
    final val value: String = "mbi"
  }

  case object Nadeb extends Iso639_3 {
    final val value: String = "mbj"
  }

  case object Malol extends Iso639_3 {
    final val value: String = "mbk"
  }

  case object Maxakali extends Iso639_3 {
    final val value: String = "mbl"
  }

  case object Ombamba extends Iso639_3 {
    final val value: String = "mbm"
  }

  case object Macaguan extends Iso639_3 {
    final val value: String = "mbn"
  }

  case object CameroonianMbo extends Iso639_3 {
    final val value: String = "mbo"
  }

  case object Malayo extends Iso639_3 {
    final val value: String = "mbp"
  }

  case object Maisin extends Iso639_3 {
    final val value: String = "mbq"
  }

  case object NukakMaku extends Iso639_3 {
    final val value: String = "mbr"
  }

  case object SaranganiManobo extends Iso639_3 {
    final val value: String = "mbs"
  }

  case object MatigsalugManobo extends Iso639_3 {
    final val value: String = "mbt"
  }

  case object MbulaBwazza extends Iso639_3 {
    final val value: String = "mbu"
  }

  case object Mbulungish extends Iso639_3 {
    final val value: String = "mbv"
  }

  case object Maring extends Iso639_3 {
    final val value: String = "mbw"
  }

  case object EastSepikMari extends Iso639_3 {
    final val value: String = "mbx"
  }

  case object Memoni extends Iso639_3 {
    final val value: String = "mby"
  }

  case object AmoltepecMixtec extends Iso639_3 {
    final val value: String = "mbz"
  }

  case object Maca extends Iso639_3 {
    final val value: String = "mca"
  }

  case object Machiguenga extends Iso639_3 {
    final val value: String = "mcb"
  }

  case object Bitur extends Iso639_3 {
    final val value: String = "mcc"
  }

  case object Sharanahua extends Iso639_3 {
    final val value: String = "mcd"
  }

  case object ItundujiaMixtec extends Iso639_3 {
    final val value: String = "mce"
  }

  case object Matses extends Iso639_3 {
    final val value: String = "mcf"
  }

  case object Mapoyo extends Iso639_3 {
    final val value: String = "mcg"
  }

  case object Maquiritari extends Iso639_3 {
    final val value: String = "mch"
  }

  case object Mese extends Iso639_3 {
    final val value: String = "mci"
  }

  case object Mvanip extends Iso639_3 {
    final val value: String = "mcj"
  }

  case object Mbunda extends Iso639_3 {
    final val value: String = "mck"
  }

  case object CreolePortuguese extends Iso639_3 {
    final val value: String = "mcm"
  }

  case object Masana extends Iso639_3 {
    final val value: String = "mcn"
  }

  case object CoatlanMixe extends Iso639_3 {
    final val value: String = "mco"
  }

  case object Makaa extends Iso639_3 {
    final val value: String = "mcp"
  }

  case object Ese extends Iso639_3 {
    final val value: String = "mcq"
  }

  case object Menya extends Iso639_3 {
    final val value: String = "mcr"
  }

  case object Mambai extends Iso639_3 {
    final val value: String = "mcs"
  }

  case object Mengisa extends Iso639_3 {
    final val value: String = "mct"
  }

  case object CameroonMambila extends Iso639_3 {
    final val value: String = "mcu"
  }

  case object Minanibai extends Iso639_3 {
    final val value: String = "mcv"
  }

  case object ChadMawa extends Iso639_3 {
    final val value: String = "mcw"
  }

  case object Mpiemo extends Iso639_3 {
    final val value: String = "mcx"
  }

  case object SouthWatut extends Iso639_3 {
    final val value: String = "mcy"
  }

  case object Mawan extends Iso639_3 {
    final val value: String = "mcz"
  }

  case object NigerianMada extends Iso639_3 {
    final val value: String = "mda"
  }

  case object Morigi extends Iso639_3 {
    final val value: String = "mdb"
  }

  case object PapuaNewGuineanMale extends Iso639_3 {
    final val value: String = "mdc"
  }

  case object Mbum extends Iso639_3 {
    final val value: String = "mdd"
  }

  case object ChadMaba extends Iso639_3 {
    final val value: String = "mde"
  }

  case object Moksha extends Iso639_3 {
    final val value: String = "mdf"
  }

  case object Massalat extends Iso639_3 {
    final val value: String = "mdg"
  }

  case object Maguindanaon extends Iso639_3 {
    final val value: String = "mdh"
  }

  case object Mamvu extends Iso639_3 {
    final val value: String = "mdi"
  }

  case object Mangbetu extends Iso639_3 {
    final val value: String = "mdj"
  }

  case object Mangbutu extends Iso639_3 {
    final val value: String = "mdk"
  }

  case object MalteseSignLanguage extends Iso639_3 {
    final val value: String = "mdl"
  }

  case object Mayogo extends Iso639_3 {
    final val value: String = "mdm"
  }

  case object Mbati extends Iso639_3 {
    final val value: String = "mdn"
  }

  case object Mbala extends Iso639_3 {
    final val value: String = "mdp"
  }

  case object Mbole extends Iso639_3 {
    final val value: String = "mdq"
  }

  case object Mandar extends Iso639_3 {
    final val value: String = "mdr"
  }

  case object PapuaNewGuineanMaria extends Iso639_3 {
    final val value: String = "mds"
  }

  case object Mbere extends Iso639_3 {
    final val value: String = "mdt"
  }

  case object Mboko extends Iso639_3 {
    final val value: String = "mdu"
  }

  case object SantaLuciaMonteverdeMixtec extends Iso639_3 {
    final val value: String = "mdv"
  }

  case object Mbosi extends Iso639_3 {
    final val value: String = "mdw"
  }

  case object Dizin extends Iso639_3 {
    final val value: String = "mdx"
  }

  case object EthiopianMale extends Iso639_3 {
    final val value: String = "mdy"
  }

  case object SuruiDoPara extends Iso639_3 {
    final val value: String = "mdz"
  }

  case object Menka extends Iso639_3 {
    final val value: String = "mea"
  }

  case object Ikobi extends Iso639_3 {
    final val value: String = "meb"
  }

  case object Mara extends Iso639_3 {
    final val value: String = "mec"
  }

  case object Melpa extends Iso639_3 {
    final val value: String = "med"
  }

  case object Mengen extends Iso639_3 {
    final val value: String = "mee"
  }

  case object Megam extends Iso639_3 {
    final val value: String = "mef"
  }

  case object TlaxiacoMixtec extends Iso639_3 {
    final val value: String = "meh"
  }

  case object Midob extends Iso639_3 {
    final val value: String = "mei"
  }

  case object Meyah extends Iso639_3 {
    final val value: String = "mej"
  }

  case object Mekeo extends Iso639_3 {
    final val value: String = "mek"
  }

  case object CentralMelanau extends Iso639_3 {
    final val value: String = "mel"
  }

  case object SierraLeoneMende extends Iso639_3 {
    final val value: String = "men"
  }

  case object KedahMalay extends Iso639_3 {
    final val value: String = "meo"
  }

  case object Miriwung extends Iso639_3 {
    final val value: String = "mep"
  }

  case object Merey extends Iso639_3 {
    final val value: String = "meq"
  }

  case object Meru extends Iso639_3 {
    final val value: String = "mer"
  }

  case object Masmaje extends Iso639_3 {
    final val value: String = "mes"
  }

  case object Mato extends Iso639_3 {
    final val value: String = "met"
  }

  case object Motu extends Iso639_3 {
    final val value: String = "meu"
  }

  case object Mano extends Iso639_3 {
    final val value: String = "mev"
  }

  case object Maaka extends Iso639_3 {
    final val value: String = "mew"
  }

  case object Hassaniyya extends Iso639_3 {
    final val value: String = "mey"
  }

  case object Menominee extends Iso639_3 {
    final val value: String = "mez"
  }

  case object PattaniMalay extends Iso639_3 {
    final val value: String = "mfa"
  }

  case object Bangka extends Iso639_3 {
    final val value: String = "mfb"
  }

  case object Mba extends Iso639_3 {
    final val value: String = "mfc"
  }

  case object MendankweNkwen extends Iso639_3 {
    final val value: String = "mfd"
  }

  case object Morisyen extends Iso639_3 {
    final val value: String = "mfe"
  }

  case object Naki extends Iso639_3 {
    final val value: String = "mff"
  }

  case object Mogofin extends Iso639_3 {
    final val value: String = "mfg"
  }

  case object Matal extends Iso639_3 {
    final val value: String = "mfh"
  }

  case object Wandala extends Iso639_3 {
    final val value: String = "mfi"
  }

  case object Mefele extends Iso639_3 {
    final val value: String = "mfj"
  }

  case object NorthMofu extends Iso639_3 {
    final val value: String = "mfk"
  }

  case object Putai extends Iso639_3 {
    final val value: String = "mfl"
  }

  case object MarghiSouth extends Iso639_3 {
    final val value: String = "mfm"
  }

  case object RiverMbembe extends Iso639_3 {
    final val value: String = "mfn"
  }

  case object Mbe extends Iso639_3 {
    final val value: String = "mfo"
  }

  case object MakassarMalay extends Iso639_3 {
    final val value: String = "mfp"
  }

  case object Moba extends Iso639_3 {
    final val value: String = "mfq"
  }

  case object Marithiel extends Iso639_3 {
    final val value: String = "mfr"
  }

  case object MexicanSignLanguage extends Iso639_3 {
    final val value: String = "mfs"
  }

  case object Mokerang extends Iso639_3 {
    final val value: String = "mft"
  }

  case object Mbwela extends Iso639_3 {
    final val value: String = "mfu"
  }

  case object Mandjak extends Iso639_3 {
    final val value: String = "mfv"
  }

  case object Melo extends Iso639_3 {
    final val value: String = "mfx"
  }

  case object Mayo extends Iso639_3 {
    final val value: String = "mfy"
  }

  case object Mabaan extends Iso639_3 {
    final val value: String = "mfz"
  }

  case object Mararit extends Iso639_3 {
    final val value: String = "mgb"
  }

  case object Morokodo extends Iso639_3 {
    final val value: String = "mgc"
  }

  case object Moru extends Iso639_3 {
    final val value: String = "mgd"
  }

  case object Mango extends Iso639_3 {
    final val value: String = "mge"
  }

  case object Maklew extends Iso639_3 {
    final val value: String = "mgf"
  }

  case object Mpumpong extends Iso639_3 {
    final val value: String = "mgg"
  }

  case object MakhuwaMeetto extends Iso639_3 {
    final val value: String = "mgh"
  }

  case object Lijili extends Iso639_3 {
    final val value: String = "mgi"
  }

  case object Abureni extends Iso639_3 {
    final val value: String = "mgj"
  }

  case object Mawes extends Iso639_3 {
    final val value: String = "mgk"
  }

  case object MaleuKilenge extends Iso639_3 {
    final val value: String = "mgl"
  }

  case object Mambae extends Iso639_3 {
    final val value: String = "mgm"
  }

  case object Mbangi extends Iso639_3 {
    final val value: String = "mgn"
  }

  case object Meta extends Iso639_3 {
    final val value: String = "mgo"
  }

  case object EasternMagar extends Iso639_3 {
    final val value: String = "mgp"
  }

  case object Malila extends Iso639_3 {
    final val value: String = "mgq"
  }

  case object MambweLungu extends Iso639_3 {
    final val value: String = "mgr"
  }

  case object TanzanianManda extends Iso639_3 {
    final val value: String = "mgs"
  }

  case object Mongol extends Iso639_3 {
    final val value: String = "mgt"
  }

  case object Mailu extends Iso639_3 {
    final val value: String = "mgu"
  }

  case object Matengo extends Iso639_3 {
    final val value: String = "mgv"
  }

  case object Matumbi extends Iso639_3 {
    final val value: String = "mgw"
  }

  case object Mbunga extends Iso639_3 {
    final val value: String = "mgy"
  }

  case object Mbugwe extends Iso639_3 {
    final val value: String = "mgz"
  }

  case object IndianManda extends Iso639_3 {
    final val value: String = "mha"
  }

  case object Mahongwe extends Iso639_3 {
    final val value: String = "mhb"
  }

  case object Mocho extends Iso639_3 {
    final val value: String = "mhc"
  }

  case object Mbugu extends Iso639_3 {
    final val value: String = "mhd"
  }

  case object Besisi extends Iso639_3 {
    final val value: String = "mhe"
  }

  case object Mamaa extends Iso639_3 {
    final val value: String = "mhf"
  }

  case object Margu extends Iso639_3 {
    final val value: String = "mhg"
  }

  case object Ma_di extends Iso639_3 {
    final val value: String = "mhi"
  }

  case object Mogholi extends Iso639_3 {
    final val value: String = "mhj"
  }

  case object Mungaka extends Iso639_3 {
    final val value: String = "mhk"
  }

  case object Mauwake extends Iso639_3 {
    final val value: String = "mhl"
  }

  case object MakhuwaMoniga extends Iso639_3 {
    final val value: String = "mhm"
  }

  case object Mocheno extends Iso639_3 {
    final val value: String = "mhn"
  }

  case object ZambianMashi extends Iso639_3 {
    final val value: String = "mho"
  }

  case object BalineseMalay extends Iso639_3 {
    final val value: String = "mhp"
  }

  case object Mandan extends Iso639_3 {
    final val value: String = "mhq"
  }

  case object EasternMari extends Iso639_3 {
    final val value: String = "mhr"
  }

  case object IndonesianBuru extends Iso639_3 {
    final val value: String = "mhs"
  }

  case object Mandahuaca extends Iso639_3 {
    final val value: String = "mht"
  }

  case object DigaroMishmi extends Iso639_3 {
    final val value: String = "mhu"
  }

  case object Mbukushu extends Iso639_3 {
    final val value: String = "mhw"
  }

  case object Maru extends Iso639_3 {
    final val value: String = "mhx"
  }

  case object Maanyan extends Iso639_3 {
    final val value: String = "mhy"
  }

  case object MorIslandsMor extends Iso639_3 {
    final val value: String = "mhz"
  }

  case object Miami extends Iso639_3 {
    final val value: String = "mia"
  }

  case object AtatlahucaMixtec extends Iso639_3 {
    final val value: String = "mib"
  }

  case object Mikmaq extends Iso639_3 {
    final val value: String = "mic"
  }

  case object Mandaic extends Iso639_3 {
    final val value: String = "mid"
  }

  case object OcotepecMixtec extends Iso639_3 {
    final val value: String = "mie"
  }

  case object MofuGudur extends Iso639_3 {
    final val value: String = "mif"
  }

  case object MiguelElGrandeMixtec extends Iso639_3 {
    final val value: String = "mig"
  }

  case object ChayucoMixtec extends Iso639_3 {
    final val value: String = "mih"
  }

  case object ChigmecatitlanMixtec extends Iso639_3 {
    final val value: String = "mii"
  }

  case object Abar extends Iso639_3 {
    final val value: String = "mij"
  }

  case object Mikasuki extends Iso639_3 {
    final val value: String = "mik"
  }

  case object PenolesMixtec extends Iso639_3 {
    final val value: String = "mil"
  }

  case object AlacatlatzalaMixtec extends Iso639_3 {
    final val value: String = "mim"
  }

  case object Minangkabau extends Iso639_3 {
    final val value: String = "min"
  }

  case object NacionalMixtec extends Iso639_3 {
    final val value: String = "mio"
  }

  case object ApoalaMixtec extends Iso639_3 {
    final val value: String = "mip"
  }

  case object Miskito extends Iso639_3 {
    final val value: String = "miq"
  }

  case object IsthmusMixe extends Iso639_3 {
    final val value: String = "mir"
  }

  case object PueblaMixtec extends Iso639_3 {
    final val value: String = "mit"
  }

  case object CacaloxtepecMixtec extends Iso639_3 {
    final val value: String = "miu"
  }

  case object Akoye extends Iso639_3 {
    final val value: String = "miw"
  }

  case object MixtepecMixtec extends Iso639_3 {
    final val value: String = "mix"
  }

  case object AyutlaMixtec extends Iso639_3 {
    final val value: String = "miy"
  }

  case object CoatzospanMixtec extends Iso639_3 {
    final val value: String = "miz"
  }

  case object Makalero extends Iso639_3 {
    final val value: String = "mjb"
  }

  case object SanJuanColoradoMixtec extends Iso639_3 {
    final val value: String = "mjc"
  }

  case object NorthwestMaidu extends Iso639_3 {
    final val value: String = "mjd"
  }

  case object Tu extends Iso639_3 {
    final val value: String = "mjg"
  }

  case object NyasaMwera extends Iso639_3 {
    final val value: String = "mjh"
  }

  case object KimMun extends Iso639_3 {
    final val value: String = "mji"
  }

  case object Mawak extends Iso639_3 {
    final val value: String = "mjj"
  }

  case object Matukar extends Iso639_3 {
    final val value: String = "mjk"
  }

  case object Mandeali extends Iso639_3 {
    final val value: String = "mjl"
  }

  case object Medebur extends Iso639_3 {
    final val value: String = "mjm"
  }

  case object PapuaNewGuineanMa extends Iso639_3 {
    final val value: String = "mjn"
  }

  case object Malankuravan extends Iso639_3 {
    final val value: String = "mjo"
  }

  case object Malapandaram extends Iso639_3 {
    final val value: String = "mjp"
  }

  case object Malavedan extends Iso639_3 {
    final val value: String = "mjr"
  }

  case object Miship extends Iso639_3 {
    final val value: String = "mjs"
  }

  case object SauriaPaharia extends Iso639_3 {
    final val value: String = "mjt"
  }

  case object MannaDora extends Iso639_3 {
    final val value: String = "mju"
  }

  case object Mannan extends Iso639_3 {
    final val value: String = "mjv"
  }

  case object Karbi extends Iso639_3 {
    final val value: String = "mjw"
  }

  case object Mahali extends Iso639_3 {
    final val value: String = "mjx"
  }

  case object Majhi extends Iso639_3 {
    final val value: String = "mjz"
  }

  case object Mbre extends Iso639_3 {
    final val value: String = "mka"
  }

  case object MalPaharia extends Iso639_3 {
    final val value: String = "mkb"
  }

  case object Siliput extends Iso639_3 {
    final val value: String = "mkc"
  }

  case object Macedonian extends Iso639_3 {
    final val value: String = "mkd"
  }

  case object Mawchi extends Iso639_3 {
    final val value: String = "mke"
  }

  case object Miya extends Iso639_3 {
    final val value: String = "mkf"
  }

  case object ChineseMak extends Iso639_3 {
    final val value: String = "mkg"
  }

  case object Dhatki extends Iso639_3 {
    final val value: String = "mki"
  }

  case object Mokilese extends Iso639_3 {
    final val value: String = "mkj"
  }

  case object Byep extends Iso639_3 {
    final val value: String = "mkk"
  }

  case object Mokole extends Iso639_3 {
    final val value: String = "mkl"
  }

  case object Moklen extends Iso639_3 {
    final val value: String = "mkm"
  }

  case object KupangMalay extends Iso639_3 {
    final val value: String = "mkn"
  }

  case object MingangDoso extends Iso639_3 {
    final val value: String = "mko"
  }

  case object Moikodi extends Iso639_3 {
    final val value: String = "mkp"
  }

  case object Malas extends Iso639_3 {
    final val value: String = "mkr"
  }

  case object SilacayoapanMixtec extends Iso639_3 {
    final val value: String = "mks"
  }

  case object Vamale extends Iso639_3 {
    final val value: String = "mkt"
  }

  case object KonyankaManinka extends Iso639_3 {
    final val value: String = "mku"
  }

  case object Mafea extends Iso639_3 {
    final val value: String = "mkv"
  }

  case object CongeseKituba extends Iso639_3 {
    final val value: String = "mkw"
  }

  case object KinamigingManobo extends Iso639_3 {
    final val value: String = "mkx"
  }

  case object EastMakian extends Iso639_3 {
    final val value: String = "mky"
  }

  case object Makasae extends Iso639_3 {
    final val value: String = "mkz"
  }

  case object Malo extends Iso639_3 {
    final val value: String = "mla"
  }

  case object Mbule extends Iso639_3 {
    final val value: String = "mlb"
  }

  case object CaoLan extends Iso639_3 {
    final val value: String = "mlc"
  }

  case object Manambu extends Iso639_3 {
    final val value: String = "mle"
  }

  case object Mal extends Iso639_3 {
    final val value: String = "mlf"
  }

  case object Malagasy extends Iso639_3 {
    final val value: String = "mlg"
  }

  case object Mape extends Iso639_3 {
    final val value: String = "mlh"
  }

  case object Malimpung extends Iso639_3 {
    final val value: String = "mli"
  }

  case object Miltu extends Iso639_3 {
    final val value: String = "mlj"
  }

  case object Ilwana extends Iso639_3 {
    final val value: String = "mlk"
  }

  case object MaluaBay extends Iso639_3 {
    final val value: String = "mll"
  }

  case object Mulam extends Iso639_3 {
    final val value: String = "mlm"
  }

  case object Malango extends Iso639_3 {
    final val value: String = "mln"
  }

  case object Mlomp extends Iso639_3 {
    final val value: String = "mlo"
  }

  case object Bargam extends Iso639_3 {
    final val value: String = "mlp"
  }

  case object WesternManinkakan extends Iso639_3 {
    final val value: String = "mlq"
  }

  case object Vame extends Iso639_3 {
    final val value: String = "mlr"
  }

  case object Masalit extends Iso639_3 {
    final val value: String = "mls"
  }

  case object Maltese extends Iso639_3 {
    final val value: String = "mlt"
  }

  case object Toabaita extends Iso639_3 {
    final val value: String = "mlu"
  }

  case object Motlav extends Iso639_3 {
    final val value: String = "mlv"
  }

  case object Moloko extends Iso639_3 {
    final val value: String = "mlw"
  }

  case object Malfaxal extends Iso639_3 {
    final val value: String = "mlx"
  }

  case object Malaynon extends Iso639_3 {
    final val value: String = "mlz"
  }

  case object Mama extends Iso639_3 {
    final val value: String = "mma"
  }

  case object Momina extends Iso639_3 {
    final val value: String = "mmb"
  }

  case object MichoacanMazahua extends Iso639_3 {
    final val value: String = "mmc"
  }

  case object Maonan extends Iso639_3 {
    final val value: String = "mmd"
  }

  case object Mae extends Iso639_3 {
    final val value: String = "mme"
  }

  case object Mundat extends Iso639_3 {
    final val value: String = "mmf"
  }

  case object NorthAmbrym extends Iso639_3 {
    final val value: String = "mmg"
  }

  case object Mehinaku extends Iso639_3 {
    final val value: String = "mmh"
  }

  case object Musar extends Iso639_3 {
    final val value: String = "mmi"
  }

  case object Majhwar extends Iso639_3 {
    final val value: String = "mmj"
  }

  case object MukhaDora extends Iso639_3 {
    final val value: String = "mmk"
  }

  case object ManMet extends Iso639_3 {
    final val value: String = "mml"
  }

  case object Maii extends Iso639_3 {
    final val value: String = "mmm"
  }

  case object Mamanwa extends Iso639_3 {
    final val value: String = "mmn"
  }

  case object ManggaBuang extends Iso639_3 {
    final val value: String = "mmo"
  }

  case object Siawi extends Iso639_3 {
    final val value: String = "mmp"
  }

  case object Musak extends Iso639_3 {
    final val value: String = "mmq"
  }

  case object XiangxiMiao extends Iso639_3 {
    final val value: String = "mmr"
  }

  case object Malalamai extends Iso639_3 {
    final val value: String = "mmt"
  }

  case object Mmaala extends Iso639_3 {
    final val value: String = "mmu"
  }

  case object Emae extends Iso639_3 {
    final val value: String = "mmw"
  }

  case object Madak extends Iso639_3 {
    final val value: String = "mmx"
  }

  case object Migaama extends Iso639_3 {
    final val value: String = "mmy"
  }

  case object Mabaale extends Iso639_3 {
    final val value: String = "mmz"
  }

  case object Mbula extends Iso639_3 {
    final val value: String = "mna"
  }

  case object Muna extends Iso639_3 {
    final val value: String = "mnb"
  }

  case object Manchu extends Iso639_3 {
    final val value: String = "mnc"
  }

  case object Monde extends Iso639_3 {
    final val value: String = "mnd"
  }

  case object Naba extends Iso639_3 {
    final val value: String = "mne"
  }

  case object Mundani extends Iso639_3 {
    final val value: String = "mnf"
  }

  case object EasternMnong extends Iso639_3 {
    final val value: String = "mng"
  }

  case object DemocraticRepublicOfCongoeseMono extends Iso639_3 {
    final val value: String = "mnh"
  }

  case object Manipuri extends Iso639_3 {
    final val value: String = "mni"
  }

  case object Munji extends Iso639_3 {
    final val value: String = "mnj"
  }

  case object Mandinka extends Iso639_3 {
    final val value: String = "mnk"
  }

  case object Tiale extends Iso639_3 {
    final val value: String = "mnl"
  }

  case object Mapena extends Iso639_3 {
    final val value: String = "mnm"
  }

  case object SouthernMnong extends Iso639_3 {
    final val value: String = "mnn"
  }

  case object BeiChinese extends Iso639_3 {
    final val value: String = "mnp"
  }

  case object Minriq extends Iso639_3 {
    final val value: String = "mnq"
  }

  case object AmericanMono extends Iso639_3 {
    final val value: String = "mnr"
  }

  case object Mansi extends Iso639_3 {
    final val value: String = "mns"
  }

  case object Mer extends Iso639_3 {
    final val value: String = "mnu"
  }

  case object RennellBellona extends Iso639_3 {
    final val value: String = "mnv"
  }

  case object Mon extends Iso639_3 {
    final val value: String = "mnw"
  }

  case object Manikion extends Iso639_3 {
    final val value: String = "mnx"
  }

  case object Manyawa extends Iso639_3 {
    final val value: String = "mny"
  }

  case object Moni extends Iso639_3 {
    final val value: String = "mnz"
  }

  case object Mwan extends Iso639_3 {
    final val value: String = "moa"
  }

  case object Mocovi extends Iso639_3 {
    final val value: String = "moc"
  }

  case object Montagnais extends Iso639_3 {
    final val value: String = "moe"
  }

  case object Mongondow extends Iso639_3 {
    final val value: String = "mog"
  }

  case object Mohawk extends Iso639_3 {
    final val value: String = "moh"
  }

  case object Mboi extends Iso639_3 {
    final val value: String = "moi"
  }

  case object Monzombo extends Iso639_3 {
    final val value: String = "moj"
  }

  case object Morori extends Iso639_3 {
    final val value: String = "mok"
  }

  case object Mongolian extends Iso639_3 {
    final val value: String = "mon"
  }

  case object Monom extends Iso639_3 {
    final val value: String = "moo"
  }

  case object MopanMaya extends Iso639_3 {
    final val value: String = "mop"
  }

  case object BomberaiMor extends Iso639_3 {
    final val value: String = "moq"
  }

  case object Moro extends Iso639_3 {
    final val value: String = "mor"
  }

  case object Mossi extends Iso639_3 {
    final val value: String = "mos"
  }

  case object Barii extends Iso639_3 {
    final val value: String = "mot"
  }

  case object Mogum extends Iso639_3 {
    final val value: String = "mou"
  }

  case object Mohave extends Iso639_3 {
    final val value: String = "mov"
  }

  case object CongoeseMoi extends Iso639_3 {
    final val value: String = "mow"
  }

  case object Molima extends Iso639_3 {
    final val value: String = "mox"
  }

  case object Shekkacho extends Iso639_3 {
    final val value: String = "moy"
  }

  case object Mukulu extends Iso639_3 {
    final val value: String = "moz"
  }

  case object Mpoto extends Iso639_3 {
    final val value: String = "mpa"
  }

  case object Mullukmulluk extends Iso639_3 {
    final val value: String = "mpb"
  }

  case object Mangarayi extends Iso639_3 {
    final val value: String = "mpc"
  }

  case object Machinere extends Iso639_3 {
    final val value: String = "mpd"
  }

  case object Majang extends Iso639_3 {
    final val value: String = "mpe"
  }

  case object Marba extends Iso639_3 {
    final val value: String = "mpg"
  }

  case object Maung extends Iso639_3 {
    final val value: String = "mph"
  }

  case object Mpade extends Iso639_3 {
    final val value: String = "mpi"
  }

  case object MartuWangka extends Iso639_3 {
    final val value: String = "mpj"
  }

  case object ChadMbara extends Iso639_3 {
    final val value: String = "mpk"
  }

  case object MiddleWatut extends Iso639_3 {
    final val value: String = "mpl"
  }

  case object YosonduaMixtec extends Iso639_3 {
    final val value: String = "mpm"
  }

  case object Mindiri extends Iso639_3 {
    final val value: String = "mpn"
  }

  case object Miu extends Iso639_3 {
    final val value: String = "mpo"
  }

  case object Migabac extends Iso639_3 {
    final val value: String = "mpp"
  }

  case object Matis extends Iso639_3 {
    final val value: String = "mpq"
  }

  case object Vangunu extends Iso639_3 {
    final val value: String = "mpr"
  }

  case object Dadibi extends Iso639_3 {
    final val value: String = "mps"
  }

  case object Mian extends Iso639_3 {
    final val value: String = "mpt"
  }

  case object Makurap extends Iso639_3 {
    final val value: String = "mpu"
  }

  case object Mungkip extends Iso639_3 {
    final val value: String = "mpv"
  }

  case object Mapidian extends Iso639_3 {
    final val value: String = "mpw"
  }

  case object MisimaPanaeati extends Iso639_3 {
    final val value: String = "mpx"
  }

  case object Mapia extends Iso639_3 {
    final val value: String = "mpy"
  }

  case object Mpi extends Iso639_3 {
    final val value: String = "mpz"
  }

  case object IndonesianMaba extends Iso639_3 {
    final val value: String = "mqa"
  }

  case object Mbuko extends Iso639_3 {
    final val value: String = "mqb"
  }

  case object Mangole extends Iso639_3 {
    final val value: String = "mqc"
  }

  case object Matepi extends Iso639_3 {
    final val value: String = "mqe"
  }

  case object Momuna extends Iso639_3 {
    final val value: String = "mqf"
  }

  case object BangunKutaiMalay extends Iso639_3 {
    final val value: String = "mqg"
  }

  case object TlazoyaltepecMixtec extends Iso639_3 {
    final val value: String = "mqh"
  }

  case object Mariri extends Iso639_3 {
    final val value: String = "mqi"
  }

  case object Mamasa extends Iso639_3 {
    final val value: String = "mqj"
  }

  case object KabunsuwanManobo extends Iso639_3 {
    final val value: String = "mqk"
  }

  case object Mbelime extends Iso639_3 {
    final val value: String = "mql"
  }

  case object SouthMarquesan extends Iso639_3 {
    final val value: String = "mqm"
  }

  case object Moronene extends Iso639_3 {
    final val value: String = "mqn"
  }

  case object Modole extends Iso639_3 {
    final val value: String = "mqo"
  }

  case object Manipa extends Iso639_3 {
    final val value: String = "mqp"
  }

  case object Minokok extends Iso639_3 {
    final val value: String = "mqq"
  }

  case object Mander extends Iso639_3 {
    final val value: String = "mqr"
  }

  case object WestMakian extends Iso639_3 {
    final val value: String = "mqs"
  }

  case object Mok extends Iso639_3 {
    final val value: String = "mqt"
  }

  case object Mandari extends Iso639_3 {
    final val value: String = "mqu"
  }

  case object Mosimo extends Iso639_3 {
    final val value: String = "mqv"
  }

  case object Murupi extends Iso639_3 {
    final val value: String = "mqw"
  }

  case object Mamuju extends Iso639_3 {
    final val value: String = "mqx"
  }

  case object Manggarai extends Iso639_3 {
    final val value: String = "mqy"
  }

  case object Pano extends Iso639_3 {
    final val value: String = "mqz"
  }

  case object Mlabri extends Iso639_3 {
    final val value: String = "mra"
  }

  case object Marino extends Iso639_3 {
    final val value: String = "mrb"
  }

  case object Maricopa extends Iso639_3 {
    final val value: String = "mrc"
  }

  case object WesternMagar extends Iso639_3 {
    final val value: String = "mrd"
  }

  case object Elseng extends Iso639_3 {
    final val value: String = "mrf"
  }

  case object Mising extends Iso639_3 {
    final val value: String = "mrg"
  }

  case object MaraChin extends Iso639_3 {
    final val value: String = "mrh"
  }

  case object Maori extends Iso639_3 {
    final val value: String = "mri"
  }

  case object WesternMari extends Iso639_3 {
    final val value: String = "mrj"
  }

  case object Hmwaveke extends Iso639_3 {
    final val value: String = "mrk"
  }

  case object Mortlockese extends Iso639_3 {
    final val value: String = "mrl"
  }

  case object Merlav extends Iso639_3 {
    final val value: String = "mrm"
  }

  case object ChekeHolo extends Iso639_3 {
    final val value: String = "mrn"
  }

  case object Mru extends Iso639_3 {
    final val value: String = "mro"
  }

  case object Morouas extends Iso639_3 {
    final val value: String = "mrp"
  }

  case object NorthMarquesan extends Iso639_3 {
    final val value: String = "mrq"
  }

  case object IndianMaria extends Iso639_3 {
    final val value: String = "mrr"
  }

  case object Maragus extends Iso639_3 {
    final val value: String = "mrs"
  }

  case object MarghiCentral extends Iso639_3 {
    final val value: String = "mrt"
  }

  case object CameroonianMono extends Iso639_3 {
    final val value: String = "mru"
  }

  case object Mangareva extends Iso639_3 {
    final val value: String = "mrv"
  }

  case object Maranao extends Iso639_3 {
    final val value: String = "mrw"
  }

  case object Maremgi extends Iso639_3 {
    final val value: String = "mrx"
  }

  case object Mandaya extends Iso639_3 {
    final val value: String = "mry"
  }

  case object Marind extends Iso639_3 {
    final val value: String = "mrz"
  }

  case object MacrolanguageMalay extends Iso639_3 {
    final val value: String = "msa"
  }

  case object Masbatenyo extends Iso639_3 {
    final val value: String = "msb"
  }

  case object SankaranManinka extends Iso639_3 {
    final val value: String = "msc"
  }

  case object YucatecMayaSignLanguage extends Iso639_3 {
    final val value: String = "msd"
  }

  case object Musey extends Iso639_3 {
    final val value: String = "mse"
  }

  case object Mekwei extends Iso639_3 {
    final val value: String = "msf"
  }

  case object Moraid extends Iso639_3 {
    final val value: String = "msg"
  }

  case object MasikoroMalagasy extends Iso639_3 {
    final val value: String = "msh"
  }

  case object SabahMalay extends Iso639_3 {
    final val value: String = "msi"
  }

  case object DemocraticRepublicOfCongoeseMa extends Iso639_3 {
    final val value: String = "msj"
  }

  case object Mansaka extends Iso639_3 {
    final val value: String = "msk"
  }

  case object Molof extends Iso639_3 {
    final val value: String = "msl"
  }

  case object AgusanManobo extends Iso639_3 {
    final val value: String = "msm"
  }

  case object Vures extends Iso639_3 {
    final val value: String = "msn"
  }

  case object Mombum extends Iso639_3 {
    final val value: String = "mso"
  }

  case object Caac extends Iso639_3 {
    final val value: String = "msq"
  }

  case object MongolianSignLanguage extends Iso639_3 {
    final val value: String = "msr"
  }

  case object WestMasela extends Iso639_3 {
    final val value: String = "mss"
  }

  case object Musom extends Iso639_3 {
    final val value: String = "msu"
  }

  case object Maslam extends Iso639_3 {
    final val value: String = "msv"
  }

  case object Mansoanka extends Iso639_3 {
    final val value: String = "msw"
  }

  case object Moresada extends Iso639_3 {
    final val value: String = "msx"
  }

  case object Aruamu extends Iso639_3 {
    final val value: String = "msy"
  }

  case object Momare extends Iso639_3 {
    final val value: String = "msz"
  }

  case object CotabatoManobo extends Iso639_3 {
    final val value: String = "mta"
  }

  case object AnyinMorofo extends Iso639_3 {
    final val value: String = "mtb"
  }

  case object Munit extends Iso639_3 {
    final val value: String = "mtc"
  }

  case object Mualang extends Iso639_3 {
    final val value: String = "mtd"
  }

  case object SolomonIslandsMono extends Iso639_3 {
    final val value: String = "mte"
  }

  case object PapuaNewGuineanMurik extends Iso639_3 {
    final val value: String = "mtf"
  }

  case object Una extends Iso639_3 {
    final val value: String = "mtg"
  }

  case object Munggui extends Iso639_3 {
    final val value: String = "mth"
  }

  case object PapuaNewGuineanMaiwa extends Iso639_3 {
    final val value: String = "mti"
  }

  case object Moskona extends Iso639_3 {
    final val value: String = "mtj"
  }

  case object Mbe_ extends Iso639_3 {
    final val value: String = "mtk"
  }

  case object Montol extends Iso639_3 {
    final val value: String = "mtl"
  }

  case object TotontepecMixe extends Iso639_3 {
    final val value: String = "mto"
  }

  case object WichiLhamtesNocten extends Iso639_3 {
    final val value: String = "mtp"
  }

  case object Muong extends Iso639_3 {
    final val value: String = "mtq"
  }

  case object Mewari extends Iso639_3 {
    final val value: String = "mtr"
  }

  case object Yora extends Iso639_3 {
    final val value: String = "mts"
  }

  case object Mota extends Iso639_3 {
    final val value: String = "mtt"
  }

  case object TututepecMixtec extends Iso639_3 {
    final val value: String = "mtu"
  }

  case object Asaroo extends Iso639_3 {
    final val value: String = "mtv"
  }

  case object SouthernBinukidnon extends Iso639_3 {
    final val value: String = "mtw"
  }

  case object TidaaMixtec extends Iso639_3 {
    final val value: String = "mtx"
  }

  case object Nabi extends Iso639_3 {
    final val value: String = "mty"
  }

  case object Mundang extends Iso639_3 {
    final val value: String = "mua"
  }

  case object Mubi extends Iso639_3 {
    final val value: String = "mub"
  }

  case object Ajumbu extends Iso639_3 {
    final val value: String = "muc"
  }

  case object MednyjAleut extends Iso639_3 {
    final val value: String = "mud"
  }

  case object MediaLengua extends Iso639_3 {
    final val value: String = "mue"
  }

  case object Musgu extends Iso639_3 {
    final val value: String = "mug"
  }

  case object Mundu extends Iso639_3 {
    final val value: String = "muh"
  }

  case object Musi extends Iso639_3 {
    final val value: String = "mui"
  }

  case object Mabire extends Iso639_3 {
    final val value: String = "muj"
  }

  case object Mugom extends Iso639_3 {
    final val value: String = "muk"
  }

  case object Maiwala extends Iso639_3 {
    final val value: String = "mum"
  }

  case object Nyong extends Iso639_3 {
    final val value: String = "muo"
  }

  case object Malvi extends Iso639_3 {
    final val value: String = "mup"
  }

  case object EasternXiangxiMiao extends Iso639_3 {
    final val value: String = "muq"
  }

  case object Murle extends Iso639_3 {
    final val value: String = "mur"
  }

  case object Creek extends Iso639_3 {
    final val value: String = "mus"
  }

  case object WesternMuria extends Iso639_3 {
    final val value: String = "mut"
  }

  case object Yaaku extends Iso639_3 {
    final val value: String = "muu"
  }

  case object Muthuvan extends Iso639_3 {
    final val value: String = "muv"
  }

  case object BoUng extends Iso639_3 {
    final val value: String = "mux"
  }

  case object Muyang extends Iso639_3 {
    final val value: String = "muy"
  }

  case object Mursi extends Iso639_3 {
    final val value: String = "muz"
  }

  case object Manam extends Iso639_3 {
    final val value: String = "mva"
  }

  case object Mamboru extends Iso639_3 {
    final val value: String = "mvd"
  }

  case object PakistaniMarwari extends Iso639_3 {
    final val value: String = "mve"
  }

  case object PeripheralMongolian extends Iso639_3 {
    final val value: String = "mvf"
  }

  case object YucuaneMixtec extends Iso639_3 {
    final val value: String = "mvg"
  }

  case object Mulgi extends Iso639_3 {
    final val value: String = "mvh"
  }

  case object Miyako extends Iso639_3 {
    final val value: String = "mvi"
  }

  case object Mekmek extends Iso639_3 {
    final val value: String = "mvk"
  }

  case object Muya extends Iso639_3 {
    final val value: String = "mvm"
  }

  case object Minaveha extends Iso639_3 {
    final val value: String = "mvn"
  }

  case object Marovo extends Iso639_3 {
    final val value: String = "mvo"
  }

  case object Duri extends Iso639_3 {
    final val value: String = "mvp"
  }

  case object Moere extends Iso639_3 {
    final val value: String = "mvq"
  }

  case object Marau extends Iso639_3 {
    final val value: String = "mvr"
  }

  case object Massep extends Iso639_3 {
    final val value: String = "mvs"
  }

  case object Mpotovoro extends Iso639_3 {
    final val value: String = "mvt"
  }

  case object Marfa extends Iso639_3 {
    final val value: String = "mvu"
  }

  case object TagalMurut extends Iso639_3 {
    final val value: String = "mvv"
  }

  case object Machinga extends Iso639_3 {
    final val value: String = "mvw"
  }

  case object Meoswar extends Iso639_3 {
    final val value: String = "mvx"
  }

  case object IndusKohistani extends Iso639_3 {
    final val value: String = "mvy"
  }

  case object Mesqan extends Iso639_3 {
    final val value: String = "mvz"
  }

  case object Mwatebu extends Iso639_3 {
    final val value: String = "mwa"
  }

  case object Juwal extends Iso639_3 {
    final val value: String = "mwb"
  }

  case object Are extends Iso639_3 {
    final val value: String = "mwc"
  }

  case object ChimweraMwera extends Iso639_3 {
    final val value: String = "mwe"
  }

  case object MurrinhPatha extends Iso639_3 {
    final val value: String = "mwf"
  }

  case object Aiklep extends Iso639_3 {
    final val value: String = "mwg"
  }

  case object MoukAria extends Iso639_3 {
    final val value: String = "mwh"
  }

  case object Labo extends Iso639_3 {
    final val value: String = "mwi"
  }

  case object KitaManinkakan extends Iso639_3 {
    final val value: String = "mwk"
  }

  case object Mirandese extends Iso639_3 {
    final val value: String = "mwl"
  }

  case object Sar extends Iso639_3 {
    final val value: String = "mwm"
  }

  case object Nyamwanga extends Iso639_3 {
    final val value: String = "mwn"
  }

  case object CentralMaewo extends Iso639_3 {
    final val value: String = "mwo"
  }

  case object LagawYa extends Iso639_3 {
    final val value: String = "mwp"
  }

  case object MunChin extends Iso639_3 {
    final val value: String = "mwq"
  }

  case object Marwari extends Iso639_3 {
    final val value: String = "mwr"
  }

  case object MwimbiMuthambi extends Iso639_3 {
    final val value: String = "mws"
  }

  case object Moken extends Iso639_3 {
    final val value: String = "mwt"
  }

  case object Mentawai extends Iso639_3 {
    final val value: String = "mwv"
  }

  case object HmongDaw extends Iso639_3 {
    final val value: String = "mww"
  }

  case object Moingi extends Iso639_3 {
    final val value: String = "mwz"
  }

  case object OaxacaMixtec extends Iso639_3 {
    final val value: String = "mxa"
  }

  case object TezoatlanMixtec extends Iso639_3 {
    final val value: String = "mxb"
  }

  case object Manyika extends Iso639_3 {
    final val value: String = "mxc"
  }

  case object Modang extends Iso639_3 {
    final val value: String = "mxd"
  }

  case object MeleFila extends Iso639_3 {
    final val value: String = "mxe"
  }

  case object Malgbe extends Iso639_3 {
    final val value: String = "mxf"
  }

  case object Mbangala extends Iso639_3 {
    final val value: String = "mxg"
  }

  case object Mvuba extends Iso639_3 {
    final val value: String = "mxh"
  }

  case object MijuMishmi extends Iso639_3 {
    final val value: String = "mxj"
  }

  case object Monumbo extends Iso639_3 {
    final val value: String = "mxk"
  }

  case object MaxiGbe extends Iso639_3 {
    final val value: String = "mxl"
  }

  case object Meramera extends Iso639_3 {
    final val value: String = "mxm"
  }

  case object IndonesianMoi extends Iso639_3 {
    final val value: String = "mxn"
  }

  case object Mbowe extends Iso639_3 {
    final val value: String = "mxo"
  }

  case object TlahuitoltepecMixe extends Iso639_3 {
    final val value: String = "mxp"
  }

  case object JuquilaMixe extends Iso639_3 {
    final val value: String = "mxq"
  }

  case object MalaysianMurik extends Iso639_3 {
    final val value: String = "mxr"
  }

  case object HuitepecMixtec extends Iso639_3 {
    final val value: String = "mxs"
  }

  case object JamiltepecMixtec extends Iso639_3 {
    final val value: String = "mxt"
  }

  case object CameroonianMada extends Iso639_3 {
    final val value: String = "mxu"
  }

  case object MetlatonocMixtec extends Iso639_3 {
    final val value: String = "mxv"
  }

  case object Namo extends Iso639_3 {
    final val value: String = "mxw"
  }

  case object Mahou extends Iso639_3 {
    final val value: String = "mxx"
  }

  case object SoutheasternNochixtlanMixtec extends Iso639_3 {
    final val value: String = "mxy"
  }

  case object CentralMasela extends Iso639_3 {
    final val value: String = "mxz"
  }

  case object Burmese extends Iso639_3 {
    final val value: String = "mya"
  }

  case object Mbay extends Iso639_3 {
    final val value: String = "myb"
  }

  case object Mayeka extends Iso639_3 {
    final val value: String = "myc"
  }

  case object Maramba extends Iso639_3 {
    final val value: String = "myd"
  }

  case object Myene extends Iso639_3 {
    final val value: String = "mye"
  }

  case object Bambassi extends Iso639_3 {
    final val value: String = "myf"
  }

  case object Manta extends Iso639_3 {
    final val value: String = "myg"
  }

  case object Makah extends Iso639_3 {
    final val value: String = "myh"
  }

  case object IndianMina extends Iso639_3 {
    final val value: String = "myi"
  }

  case object Mangayat extends Iso639_3 {
    final val value: String = "myj"
  }

  case object MamaraSenoufo extends Iso639_3 {
    final val value: String = "myk"
  }

  case object Moma extends Iso639_3 {
    final val value: String = "myl"
  }

  case object Meen extends Iso639_3 {
    final val value: String = "mym"
  }

  case object Anfillo extends Iso639_3 {
    final val value: String = "myo"
  }

  case object Piraha extends Iso639_3 {
    final val value: String = "myp"
  }

  case object Muniche extends Iso639_3 {
    final val value: String = "myr"
  }

  case object Munduruku extends Iso639_3 {
    final val value: String = "myu"
  }

  case object Erzya extends Iso639_3 {
    final val value: String = "myv"
  }

  case object Muyuw extends Iso639_3 {
    final val value: String = "myw"
  }

  case object Masaaba extends Iso639_3 {
    final val value: String = "myx"
  }

  case object Macuna extends Iso639_3 {
    final val value: String = "myy"
  }

  case object SantaMariaZacatepecMixtec extends Iso639_3 {
    final val value: String = "mza"
  }

  case object Tumzabt extends Iso639_3 {
    final val value: String = "mzb"
  }

  case object MadagascarSignLanguage extends Iso639_3 {
    final val value: String = "mzc"
  }

  case object Malimba extends Iso639_3 {
    final val value: String = "mzd"
  }

  case object Morawa extends Iso639_3 {
    final val value: String = "mze"
  }

  case object MonasticSignLanguage extends Iso639_3 {
    final val value: String = "mzg"
  }

  case object WichiLhamtesGuisnay extends Iso639_3 {
    final val value: String = "mzh"
  }

  case object IxcatlanMazatec extends Iso639_3 {
    final val value: String = "mzi"
  }

  case object Manya extends Iso639_3 {
    final val value: String = "mzj"
  }

  case object NigeriaMambila extends Iso639_3 {
    final val value: String = "mzk"
  }

  case object MazatlanMixe extends Iso639_3 {
    final val value: String = "mzl"
  }

  case object Mumuye extends Iso639_3 {
    final val value: String = "mzm"
  }

  case object Mazanderani extends Iso639_3 {
    final val value: String = "mzn"
  }

  case object Movima extends Iso639_3 {
    final val value: String = "mzp"
  }

  case object MoriAtas extends Iso639_3 {
    final val value: String = "mzq"
  }

  case object Marubo extends Iso639_3 {
    final val value: String = "mzr"
  }

  case object Macanese extends Iso639_3 {
    final val value: String = "mzs"
  }

  case object Mintil extends Iso639_3 {
    final val value: String = "mzt"
  }

  case object Inapang extends Iso639_3 {
    final val value: String = "mzu"
  }

  case object Manza extends Iso639_3 {
    final val value: String = "mzv"
  }

  case object Deg extends Iso639_3 {
    final val value: String = "mzw"
  }

  case object Mawayana extends Iso639_3 {
    final val value: String = "mzx"
  }

  case object MozambicanSignLanguage extends Iso639_3 {
    final val value: String = "mzy"
  }

  case object Maiadomu extends Iso639_3 {
    final val value: String = "mzz"
  }

  case object Namla extends Iso639_3 {
    final val value: String = "naa"
  }

  case object SouthernNambikuara extends Iso639_3 {
    final val value: String = "nab"
  }

  case object Narak extends Iso639_3 {
    final val value: String = "nac"
  }

  case object Nabak extends Iso639_3 {
    final val value: String = "naf"
  }

  case object NagaPidgin extends Iso639_3 {
    final val value: String = "nag"
  }

  case object Nalu extends Iso639_3 {
    final val value: String = "naj"
  }

  case object Nakanai extends Iso639_3 {
    final val value: String = "nak"
  }

  case object Nalik extends Iso639_3 {
    final val value: String = "nal"
  }

  case object Ngangityemerri extends Iso639_3 {
    final val value: String = "nam"
  }

  case object NanChinese extends Iso639_3 {
    final val value: String = "nan"
  }

  case object Naaba extends Iso639_3 {
    final val value: String = "nao"
  }

  case object Neapolitan extends Iso639_3 {
    final val value: String = "nap"
  }

  case object Khoekhoe extends Iso639_3 {
    final val value: String = "naq"
  }

  case object Iguta extends Iso639_3 {
    final val value: String = "nar"
  }

  case object Naasioi extends Iso639_3 {
    final val value: String = "nas"
  }

  case object Cahungwarya extends Iso639_3 {
    final val value: String = "nat"
  }

  case object Nauru extends Iso639_3 {
    final val value: String = "nau"
  }

  case object Navajo extends Iso639_3 {
    final val value: String = "nav"
  }

  case object Nawuri extends Iso639_3 {
    final val value: String = "naw"
  }

  case object Nakwi extends Iso639_3 {
    final val value: String = "nax"
  }

  case object CoatepecNahuatl extends Iso639_3 {
    final val value: String = "naz"
  }

  case object Nyemba extends Iso639_3 {
    final val value: String = "nba"
  }

  case object Ndoe extends Iso639_3 {
    final val value: String = "nbb"
  }

  case object ChangNaga extends Iso639_3 {
    final val value: String = "nbc"
  }

  case object Ngbinda extends Iso639_3 {
    final val value: String = "nbd"
  }

  case object KonyakNaga extends Iso639_3 {
    final val value: String = "nbe"
  }

  case object Nagarchal extends Iso639_3 {
    final val value: String = "nbg"
  }

  case object Ngamo extends Iso639_3 {
    final val value: String = "nbh"
  }

  case object MaoNaga extends Iso639_3 {
    final val value: String = "nbi"
  }

  case object Ngarinman extends Iso639_3 {
    final val value: String = "nbj"
  }

  case object Nake extends Iso639_3 {
    final val value: String = "nbk"
  }

  case object SouthNdebele extends Iso639_3 {
    final val value: String = "nbl"
  }

  case object NgbakaMabo extends Iso639_3 {
    final val value: String = "nbm"
  }

  case object Kuri extends Iso639_3 {
    final val value: String = "nbn"
  }

  case object Nkukoli extends Iso639_3 {
    final val value: String = "nbo"
  }

  case object Nnam extends Iso639_3 {
    final val value: String = "nbp"
  }

  case object Nggem extends Iso639_3 {
    final val value: String = "nbq"
  }

  case object NumanaNunkuGbantuNumbu extends Iso639_3 {
    final val value: String = "nbr"
  }

  case object NamibianSignLanguage extends Iso639_3 {
    final val value: String = "nbs"
  }

  case object Na extends Iso639_3 {
    final val value: String = "nbt"
  }

  case object RongmeiNaga extends Iso639_3 {
    final val value: String = "nbu"
  }

  case object Ngamambo extends Iso639_3 {
    final val value: String = "nbv"
  }

  case object SouthernNgbandi extends Iso639_3 {
    final val value: String = "nbw"
  }

  case object Ningera extends Iso639_3 {
    final val value: String = "nby"
  }

  case object Iyo extends Iso639_3 {
    final val value: String = "nca"
  }

  case object CentralNicobarese extends Iso639_3 {
    final val value: String = "ncb"
  }

  case object Ponam extends Iso639_3 {
    final val value: String = "ncc"
  }

  case object Nachering extends Iso639_3 {
    final val value: String = "ncd"
  }

  case object Yale extends Iso639_3 {
    final val value: String = "nce"
  }

  case object Notsi extends Iso639_3 {
    final val value: String = "ncf"
  }

  case object Nisgaa extends Iso639_3 {
    final val value: String = "ncg"
  }

  case object HuastecaNahuatl extends Iso639_3 {
    final val value: String = "nch"
  }

  case object NorthernPueblaNahuatl extends Iso639_3 {
    final val value: String = "ncj"
  }

  case object Nakara extends Iso639_3 {
    final val value: String = "nck"
  }

  case object MichoacanNahuatl extends Iso639_3 {
    final val value: String = "ncl"
  }

  case object Nambo extends Iso639_3 {
    final val value: String = "ncm"
  }

  case object Nauna extends Iso639_3 {
    final val value: String = "ncn"
  }

  case object Sibe extends Iso639_3 {
    final val value: String = "nco"
  }

  case object NorthernKatang extends Iso639_3 {
    final val value: String = "ncq"
  }

  case object Ncane extends Iso639_3 {
    final val value: String = "ncr"
  }

  case object NicaraguanSignLanguage extends Iso639_3 {
    final val value: String = "ncs"
  }

  case object ChotheNaga extends Iso639_3 {
    final val value: String = "nct"
  }

  case object Chumburung extends Iso639_3 {
    final val value: String = "ncu"
  }

  case object CentralPueblaNahuatl extends Iso639_3 {
    final val value: String = "ncx"
  }

  case object Ndasa extends Iso639_3 {
    final val value: String = "nda"
  }

  case object KensweiNsei extends Iso639_3 {
    final val value: String = "ndb"
  }

  case object Ndau extends Iso639_3 {
    final val value: String = "ndc"
  }

  case object NdeNseleNta extends Iso639_3 {
    final val value: String = "ndd"
  }

  case object NorthNdebele extends Iso639_3 {
    final val value: String = "nde"
  }

  case object Ndengereko extends Iso639_3 {
    final val value: String = "ndg"
  }

  case object Ndali extends Iso639_3 {
    final val value: String = "ndh"
  }

  case object SambaLeko extends Iso639_3 {
    final val value: String = "ndi"
  }

  case object Ndamba extends Iso639_3 {
    final val value: String = "ndj"
  }

  case object Ndaka extends Iso639_3 {
    final val value: String = "ndk"
  }

  case object Ndolo extends Iso639_3 {
    final val value: String = "ndl"
  }

  case object Ndam extends Iso639_3 {
    final val value: String = "ndm"
  }

  case object Ngundi extends Iso639_3 {
    final val value: String = "ndn"
  }

  case object Ndonga extends Iso639_3 {
    final val value: String = "ndo"
  }

  case object Ndo extends Iso639_3 {
    final val value: String = "ndp"
  }

  case object Ndombe extends Iso639_3 {
    final val value: String = "ndq"
  }

  case object Ndoola extends Iso639_3 {
    final val value: String = "ndr"
  }

  case object LowGerman extends Iso639_3 {
    final val value: String = "nds"
  }

  case object Ndunga extends Iso639_3 {
    final val value: String = "ndt"
  }

  case object Dugun extends Iso639_3 {
    final val value: String = "ndu"
  }

  case object Ndut extends Iso639_3 {
    final val value: String = "ndv"
  }

  case object Ndobo extends Iso639_3 {
    final val value: String = "ndw"
  }

  case object Nduga extends Iso639_3 {
    final val value: String = "ndx"
  }

  case object Lutos extends Iso639_3 {
    final val value: String = "ndy"
  }

  case object Ndogo extends Iso639_3 {
    final val value: String = "ndz"
  }

  case object EasternNgada extends Iso639_3 {
    final val value: String = "nea"
  }

  case object CotedIvoireToura extends Iso639_3 {
    final val value: String = "neb"
  }

  case object Nedebang extends Iso639_3 {
    final val value: String = "nec"
  }

  case object NdeGbite extends Iso639_3 {
    final val value: String = "ned"
  }

  case object NelemwaNixumwak extends Iso639_3 {
    final val value: String = "nee"
  }

  case object Nefamese extends Iso639_3 {
    final val value: String = "nef"
  }

  case object Negidal extends Iso639_3 {
    final val value: String = "neg"
  }

  case object Nyenkha extends Iso639_3 {
    final val value: String = "neh"
  }

  case object Neko extends Iso639_3 {
    final val value: String = "nej"
  }

  case object Neku extends Iso639_3 {
    final val value: String = "nek"
  }

  case object Nemi extends Iso639_3 {
    final val value: String = "nem"
  }

  case object Nengone extends Iso639_3 {
    final val value: String = "nen"
  }

  case object NaMeo extends Iso639_3 {
    final val value: String = "neo"
  }

  case object MacrolanguageNepali extends Iso639_3 {
    final val value: String = "nep"
  }

  case object CentralMixe extends Iso639_3 {
    final val value: String = "neq"
  }

  case object Yahadian extends Iso639_3 {
    final val value: String = "ner"
  }

  case object BhotiKinnauri extends Iso639_3 {
    final val value: String = "nes"
  }

  case object Nete extends Iso639_3 {
    final val value: String = "net"
  }

  case object Nyaheun extends Iso639_3 {
    final val value: String = "nev"
  }

  case object Newari extends Iso639_3 {
    final val value: String = "new"
  }

  case object Neme extends Iso639_3 {
    final val value: String = "nex"
  }

  case object Neyo extends Iso639_3 {
    final val value: String = "ney"
  }

  case object NezPerce extends Iso639_3 {
    final val value: String = "nez"
  }

  case object Dhao extends Iso639_3 {
    final val value: String = "nfa"
  }

  case object Ahwai extends Iso639_3 {
    final val value: String = "nfd"
  }

  case object Ayiwo extends Iso639_3 {
    final val value: String = "nfl"
  }

  case object Nafaanra extends Iso639_3 {
    final val value: String = "nfr"
  }

  case object Mfumte extends Iso639_3 {
    final val value: String = "nfu"
  }

  case object Ngbaka extends Iso639_3 {
    final val value: String = "nga"
  }

  case object NorthernNgbandi extends Iso639_3 {
    final val value: String = "ngb"
  }

  case object DemocraticRepublicOfCongoeseNgombe extends Iso639_3 {
    final val value: String = "ngc"
  }

  case object CentralAfricanRepublicanNgando extends Iso639_3 {
    final val value: String = "ngd"
  }

  case object Ngemba extends Iso639_3 {
    final val value: String = "nge"
  }

  case object NgbakaManza extends Iso639_3 {
    final val value: String = "ngg"
  }

  case object Nu extends Iso639_3 {
    final val value: String = "ngh"
  }

  case object Ngizim extends Iso639_3 {
    final val value: String = "ngi"
  }

  case object Ngie extends Iso639_3 {
    final val value: String = "ngj"
  }

  case object Dalabon extends Iso639_3 {
    final val value: String = "ngk"
  }

  case object Lomwe extends Iso639_3 {
    final val value: String = "ngl"
  }

  case object NgatikMensCreole extends Iso639_3 {
    final val value: String = "ngm"
  }

  case object Ngwo extends Iso639_3 {
    final val value: String = "ngn"
  }

  case object Ngoni extends Iso639_3 {
    final val value: String = "ngo"
  }

  case object Ngulu extends Iso639_3 {
    final val value: String = "ngp"
  }

  case object Ngurimi extends Iso639_3 {
    final val value: String = "ngq"
  }

  case object Engdewu extends Iso639_3 {
    final val value: String = "ngr"
  }

  case object Gvoko extends Iso639_3 {
    final val value: String = "ngs"
  }

  case object Kriang extends Iso639_3 {
    final val value: String = "ngt"
  }

  case object GuerreroNahuatl extends Iso639_3 {
    final val value: String = "ngu"
  }

  case object Ngwaba extends Iso639_3 {
    final val value: String = "ngw"
  }

  case object Nggwahyi extends Iso639_3 {
    final val value: String = "ngx"
  }

  case object Tibea extends Iso639_3 {
    final val value: String = "ngy"
  }

  case object Ngungwel extends Iso639_3 {
    final val value: String = "ngz"
  }

  case object Nhanda extends Iso639_3 {
    final val value: String = "nha"
  }

  case object Beng extends Iso639_3 {
    final val value: String = "nhb"
  }

  case object Chiripa extends Iso639_3 {
    final val value: String = "nhd"
  }

  case object EasternHuastecaNahuatl extends Iso639_3 {
    final val value: String = "nhe"
  }

  case object Nhuwala extends Iso639_3 {
    final val value: String = "nhf"
  }

  case object TetelcingoNahuatl extends Iso639_3 {
    final val value: String = "nhg"
  }

  case object Nahari extends Iso639_3 {
    final val value: String = "nhh"
  }

  case object ZacatlanAhuacatlanTepetzintlaNahuatl extends Iso639_3 {
    final val value: String = "nhi"
  }

  case object CosoleacaqueNahuatl extends Iso639_3 {
    final val value: String = "nhk"
  }

  case object MorelosNahuatl extends Iso639_3 {
    final val value: String = "nhm"
  }

  case object CentralNahuatl extends Iso639_3 {
    final val value: String = "nhn"
  }

  case object Takuu extends Iso639_3 {
    final val value: String = "nho"
  }

  case object PajapanNahuatl extends Iso639_3 {
    final val value: String = "nhp"
  }

  case object HuaxcalecaNahuatl extends Iso639_3 {
    final val value: String = "nhq"
  }

  case object Naro extends Iso639_3 {
    final val value: String = "nhr"
  }

  case object OmetepecNahuatl extends Iso639_3 {
    final val value: String = "nht"
  }

  case object Noone extends Iso639_3 {
    final val value: String = "nhu"
  }

  case object TemascaltepecNahuatl extends Iso639_3 {
    final val value: String = "nhv"
  }

  case object WesternHuastecaNahuatl extends Iso639_3 {
    final val value: String = "nhw"
  }

  case object MecayapanNahuatl extends Iso639_3 {
    final val value: String = "nhx"
  }

  case object OaxacaNahuatl extends Iso639_3 {
    final val value: String = "nhy"
  }

  case object SantaMariaLaAltaNahuatl extends Iso639_3 {
    final val value: String = "nhz"
  }

  case object Nias extends Iso639_3 {
    final val value: String = "nia"
  }

  case object Nakame extends Iso639_3 {
    final val value: String = "nib"
  }

  case object Niellim extends Iso639_3 {
    final val value: String = "nie"
  }

  case object Nek extends Iso639_3 {
    final val value: String = "nif"
  }

  case object TanzanianNyiha extends Iso639_3 {
    final val value: String = "nih"
  }

  case object Nii extends Iso639_3 {
    final val value: String = "nii"
  }

  case object Ngaju extends Iso639_3 {
    final val value: String = "nij"
  }

  case object SouthernNicobarese extends Iso639_3 {
    final val value: String = "nik"
  }

  case object Nila extends Iso639_3 {
    final val value: String = "nil"
  }

  case object Nilamba extends Iso639_3 {
    final val value: String = "nim"
  }

  case object Ninzo extends Iso639_3 {
    final val value: String = "nin"
  }

  case object Nganasan extends Iso639_3 {
    final val value: String = "nio"
  }

  case object Nandi extends Iso639_3 {
    final val value: String = "niq"
  }

  case object Nimboran extends Iso639_3 {
    final val value: String = "nir"
  }

  case object Nimi extends Iso639_3 {
    final val value: String = "nis"
  }

  case object SoutheasternKolami extends Iso639_3 {
    final val value: String = "nit"
  }

  case object Niuean extends Iso639_3 {
    final val value: String = "niu"
  }

  case object Gilyak extends Iso639_3 {
    final val value: String = "niv"
  }

  case object Nimo extends Iso639_3 {
    final val value: String = "niw"
  }

  case object Hema extends Iso639_3 {
    final val value: String = "nix"
  }

  case object Ngiti extends Iso639_3 {
    final val value: String = "niy"
  }

  case object Ningil extends Iso639_3 {
    final val value: String = "niz"
  }

  case object Nzanyi extends Iso639_3 {
    final val value: String = "nja"
  }

  case object NocteNaga extends Iso639_3 {
    final val value: String = "njb"
  }

  case object NdondeHamba extends Iso639_3 {
    final val value: String = "njd"
  }

  case object LothaNaga extends Iso639_3 {
    final val value: String = "njh"
  }

  case object Gudanji extends Iso639_3 {
    final val value: String = "nji"
  }

  case object Njen extends Iso639_3 {
    final val value: String = "njj"
  }

  case object Njalgulgule extends Iso639_3 {
    final val value: String = "njl"
  }

  case object AngamiNaga extends Iso639_3 {
    final val value: String = "njm"
  }

  case object LiangmaiNaga extends Iso639_3 {
    final val value: String = "njn"
  }

  case object AoNaga extends Iso639_3 {
    final val value: String = "njo"
  }

  case object Njerep extends Iso639_3 {
    final val value: String = "njr"
  }

  case object Nisa extends Iso639_3 {
    final val value: String = "njs"
  }

  case object TrioPidgin extends Iso639_3 {
    final val value: String = "njt"
  }

  case object Ngadjunmaya extends Iso639_3 {
    final val value: String = "nju"
  }

  case object Kunyi extends Iso639_3 {
    final val value: String = "njx"
  }

  case object Njyem extends Iso639_3 {
    final val value: String = "njy"
  }

  case object Nyishi extends Iso639_3 {
    final val value: String = "njz"
  }

  case object Nkoya extends Iso639_3 {
    final val value: String = "nka"
  }

  case object KhoibuNaga extends Iso639_3 {
    final val value: String = "nkb"
  }

  case object Nkongho extends Iso639_3 {
    final val value: String = "nkc"
  }

  case object Koireng extends Iso639_3 {
    final val value: String = "nkd"
  }

  case object Duke extends Iso639_3 {
    final val value: String = "nke"
  }

  case object InpuiNaga extends Iso639_3 {
    final val value: String = "nkf"
  }

  case object Nekgini extends Iso639_3 {
    final val value: String = "nkg"
  }

  case object KhezhaNaga extends Iso639_3 {
    final val value: String = "nkh"
  }

  case object ThangalNaga extends Iso639_3 {
    final val value: String = "nki"
  }

  case object Nakai extends Iso639_3 {
    final val value: String = "nkj"
  }

  case object Nokuku extends Iso639_3 {
    final val value: String = "nkk"
  }

  case object Namat extends Iso639_3 {
    final val value: String = "nkm"
  }

  case object Nkangala extends Iso639_3 {
    final val value: String = "nkn"
  }

  case object Nkonya extends Iso639_3 {
    final val value: String = "nko"
  }

  case object Nkami extends Iso639_3 {
    final val value: String = "nkq"
  }

  case object Nukuoro extends Iso639_3 {
    final val value: String = "nkr"
  }

  case object NorthAsmat extends Iso639_3 {
    final val value: String = "nks"
  }

  case object TanzanianNyika extends Iso639_3 {
    final val value: String = "nkt"
  }

  case object BounaKulango extends Iso639_3 {
    final val value: String = "nku"
  }

  case object MalawiAndZambianNyika extends Iso639_3 {
    final val value: String = "nkv"
  }

  case object Nkutu extends Iso639_3 {
    final val value: String = "nkw"
  }

  case object Nkoroo extends Iso639_3 {
    final val value: String = "nkx"
  }

  case object Nkari extends Iso639_3 {
    final val value: String = "nkz"
  }

  case object Ngombale extends Iso639_3 {
    final val value: String = "nla"
  }

  case object Nalca extends Iso639_3 {
    final val value: String = "nlc"
  }

  case object Dutch extends Iso639_3 {
    final val value: String = "nld"
  }

  case object EastNyala extends Iso639_3 {
    final val value: String = "nle"
  }

  case object Gela extends Iso639_3 {
    final val value: String = "nlg"
  }

  case object Grangali extends Iso639_3 {
    final val value: String = "nli"
  }

  case object Nyali extends Iso639_3 {
    final val value: String = "nlj"
  }

  case object NiniaYali extends Iso639_3 {
    final val value: String = "nlk"
  }

  case object Nihali extends Iso639_3 {
    final val value: String = "nll"
  }

  case object Mankiyali extends Iso639_3 {
    final val value: String = "nlm"
  }

  case object Ngul extends Iso639_3 {
    final val value: String = "nlo"
  }

  case object LaoNaga extends Iso639_3 {
    final val value: String = "nlq"
  }

  case object Nchumbulu extends Iso639_3 {
    final val value: String = "nlu"
  }

  case object OrizabaNahuatl extends Iso639_3 {
    final val value: String = "nlv"
  }

  case object Nahali extends Iso639_3 {
    final val value: String = "nlx"
  }

  case object Nyamal extends Iso639_3 {
    final val value: String = "nly"
  }

  case object Nalogo extends Iso639_3 {
    final val value: String = "nlz"
  }

  case object MaramNaga extends Iso639_3 {
    final val value: String = "nma"
  }

  case object BigNambas extends Iso639_3 {
    final val value: String = "nmb"
  }

  case object Ngam extends Iso639_3 {
    final val value: String = "nmc"
  }

  case object Ndumu extends Iso639_3 {
    final val value: String = "nmd"
  }

  case object MziemeNaga extends Iso639_3 {
    final val value: String = "nme"
  }

  case object IndianTangkhulNaga extends Iso639_3 {
    final val value: String = "nmf"
  }

  case object Kwasio extends Iso639_3 {
    final val value: String = "nmg"
  }

  case object MonsangNaga extends Iso639_3 {
    final val value: String = "nmh"
  }

  case object Nyam extends Iso639_3 {
    final val value: String = "nmi"
  }

  case object CentralAfricanRepublicanNgombe extends Iso639_3 {
    final val value: String = "nmj"
  }

  case object Namakura extends Iso639_3 {
    final val value: String = "nmk"
  }

  case object Ndemli extends Iso639_3 {
    final val value: String = "nml"
  }

  case object Manangba extends Iso639_3 {
    final val value: String = "nmm"
  }

  case object Xoo extends Iso639_3 {
    final val value: String = "nmn"
  }

  case object MoyonNaga extends Iso639_3 {
    final val value: String = "nmo"
  }

  case object Nambya extends Iso639_3 {
    final val value: String = "nmq"
  }

  case object Letemboi extends Iso639_3 {
    final val value: String = "nms"
  }

  case object Namonuito extends Iso639_3 {
    final val value: String = "nmt"
  }

  case object NortheastMaidu extends Iso639_3 {
    final val value: String = "nmu"
  }

  case object Nimoa extends Iso639_3 {
    final val value: String = "nmw"
  }

  case object PapuaNewGuineanNama extends Iso639_3 {
    final val value: String = "nmx"
  }

  case object Namuyi extends Iso639_3 {
    final val value: String = "nmy"
  }

  case object Nawdm extends Iso639_3 {
    final val value: String = "nmz"
  }

  case object Nyangumarta extends Iso639_3 {
    final val value: String = "nna"
  }

  case object Nande extends Iso639_3 {
    final val value: String = "nnb"
  }

  case object Nancere extends Iso639_3 {
    final val value: String = "nnc"
  }

  case object WestAmbae extends Iso639_3 {
    final val value: String = "nnd"
  }

  case object Ngandyera extends Iso639_3 {
    final val value: String = "nne"
  }

  case object Ngaing extends Iso639_3 {
    final val value: String = "nnf"
  }

  case object MaringNaga extends Iso639_3 {
    final val value: String = "nng"
  }

  case object Ngiemboon extends Iso639_3 {
    final val value: String = "nnh"
  }

  case object NorthNuaulu extends Iso639_3 {
    final val value: String = "nni"
  }

  case object Nyangatom extends Iso639_3 {
    final val value: String = "nnj"
  }

  case object Nankina extends Iso639_3 {
    final val value: String = "nnk"
  }

  case object RengmaNaga extends Iso639_3 {
    final val value: String = "nnl"
  }

  case object Namia extends Iso639_3 {
    final val value: String = "nnm"
  }

  case object Ngete extends Iso639_3 {
    final val value: String = "nnn"
  }

  case object NorwegianNynorsk extends Iso639_3 {
    final val value: String = "nno"
  }

  case object WanchoNaga extends Iso639_3 {
    final val value: String = "nnp"
  }

  case object Ngindo extends Iso639_3 {
    final val value: String = "nnq"
  }

  case object Ningye extends Iso639_3 {
    final val value: String = "nns"
  }

  case object Dwang extends Iso639_3 {
    final val value: String = "nnu"
  }

  case object SouthernNuni extends Iso639_3 {
    final val value: String = "nnw"
  }

  case object Ndanda extends Iso639_3 {
    final val value: String = "nnz"
  }

  case object WounMeu extends Iso639_3 {
    final val value: String = "noa"
  }

  case object NorwegianBokmal extends Iso639_3 {
    final val value: String = "nob"
  }

  case object Nuk extends Iso639_3 {
    final val value: String = "noc"
  }

  case object NorthernThai extends Iso639_3 {
    final val value: String = "nod"
  }

  case object Nimadi extends Iso639_3 {
    final val value: String = "noe"
  }

  case object Nomane extends Iso639_3 {
    final val value: String = "nof"
  }

  case object Nogai extends Iso639_3 {
    final val value: String = "nog"
  }

  case object Nomu extends Iso639_3 {
    final val value: String = "noh"
  }

  case object Noiri extends Iso639_3 {
    final val value: String = "noi"
  }

  case object Nonuya extends Iso639_3 {
    final val value: String = "noj"
  }

  case object Numanggang extends Iso639_3 {
    final val value: String = "nop"
  }

  case object Ngongo extends Iso639_3 {
    final val value: String = "noq"
  }

  case object Norwegian extends Iso639_3 {
    final val value: String = "nor"
  }

  case object EasternNisu extends Iso639_3 {
    final val value: String = "nos"
  }

  case object Nomatsiguenga extends Iso639_3 {
    final val value: String = "not"
  }

  case object EwageNotu extends Iso639_3 {
    final val value: String = "nou"
  }

  case object Nyambo extends Iso639_3 {
    final val value: String = "now"
  }

  case object Noy extends Iso639_3 {
    final val value: String = "noy"
  }

  case object Nayi extends Iso639_3 {
    final val value: String = "noz"
  }

  case object NarPhu extends Iso639_3 {
    final val value: String = "npa"
  }

  case object Nupbikha extends Iso639_3 {
    final val value: String = "npb"
  }

  case object GongwangNaga extends Iso639_3 {
    final val value: String = "npg"
  }

  case object PhomNaga extends Iso639_3 {
    final val value: String = "nph"
  }

  case object Nepali extends Iso639_3 {
    final val value: String = "npi"
  }

  case object SoutheasternPueblaNahuatl extends Iso639_3 {
    final val value: String = "npl"
  }

  case object Mondropolon extends Iso639_3 {
    final val value: String = "npn"
  }

  case object PochuriNaga extends Iso639_3 {
    final val value: String = "npo"
  }

  case object Nipsan extends Iso639_3 {
    final val value: String = "nps"
  }

  case object PuimeiNaga extends Iso639_3 {
    final val value: String = "npu"
  }

  case object Noipx extends Iso639_3 {
    final val value: String = "npx"
  }

  case object Napu extends Iso639_3 {
    final val value: String = "npy"
  }

  case object SouthernNago extends Iso639_3 {
    final val value: String = "nqg"
  }

  case object EdeNago extends Iso639_3 {
    final val value: String = "nqk"
  }

  case object Ngendelengo extends Iso639_3 {
    final val value: String = "nql"
  }

  case object Ndom extends Iso639_3 {
    final val value: String = "nqm"
  }

  case object Nen extends Iso639_3 {
    final val value: String = "nqn"
  }

  case object NKo extends Iso639_3 {
    final val value: String = "nqo"
  }

  case object KaryawNaga extends Iso639_3 {
    final val value: String = "nqq"
  }

  case object AriNaga extends Iso639_3 {
    final val value: String = "nqy"
  }

  case object Ngom extends Iso639_3 {
    final val value: String = "nra"
  }

  case object Nara extends Iso639_3 {
    final val value: String = "nrb"
  }

  case object SouthernRengmaNaga extends Iso639_3 {
    final val value: String = "nre"
  }

  case object Jerriais extends Iso639_3 {
    final val value: String = "nrf"
  }

  case object Narango extends Iso639_3 {
    final val value: String = "nrg"
  }

  case object ChokriNaga extends Iso639_3 {
    final val value: String = "nri"
  }

  case object Ngarla extends Iso639_3 {
    final val value: String = "nrk"
  }

  case object Ngarluma extends Iso639_3 {
    final val value: String = "nrl"
  }

  case object Narom extends Iso639_3 {
    final val value: String = "nrm"
  }

  case object Narua extends Iso639_3 {
    final val value: String = "nru"
  }

  case object Lala extends Iso639_3 {
    final val value: String = "nrz"
  }

  case object SangtamNaga extends Iso639_3 {
    final val value: String = "nsa"
  }

  case object Nshi extends Iso639_3 {
    final val value: String = "nsc"
  }

  case object SouthernNisu extends Iso639_3 {
    final val value: String = "nsd"
  }

  case object Nsenga extends Iso639_3 {
    final val value: String = "nse"
  }

  case object NorthwesternNisu extends Iso639_3 {
    final val value: String = "nsf"
  }

  case object Ngasa extends Iso639_3 {
    final val value: String = "nsg"
  }

  case object Ngoshie extends Iso639_3 {
    final val value: String = "nsh"
  }

  case object NigerianSignLanguage extends Iso639_3 {
    final val value: String = "nsi"
  }

  case object Naskapi extends Iso639_3 {
    final val value: String = "nsk"
  }

  case object NorwegianSignLanguage extends Iso639_3 {
    final val value: String = "nsl"
  }

  case object SumiNaga extends Iso639_3 {
    final val value: String = "nsm"
  }

  case object Nehan extends Iso639_3 {
    final val value: String = "nsn"
  }

  case object Pedi extends Iso639_3 {
    final val value: String = "nso"
  }

  case object NepaleseSignLanguage extends Iso639_3 {
    final val value: String = "nsp"
  }

  case object NorthernSierraMiwok extends Iso639_3 {
    final val value: String = "nsq"
  }

  case object MaritimeSignLanguage extends Iso639_3 {
    final val value: String = "nsr"
  }

  case object Nali extends Iso639_3 {
    final val value: String = "nss"
  }

  case object TaseNaga extends Iso639_3 {
    final val value: String = "nst"
  }

  case object NegraNahuatl extends Iso639_3 {
    final val value: String = "nsu"
  }

  case object SouthwesternNisu extends Iso639_3 {
    final val value: String = "nsv"
  }

  case object Navut extends Iso639_3 {
    final val value: String = "nsw"
  }

  case object Nsongo extends Iso639_3 {
    final val value: String = "nsx"
  }

  case object Nasal extends Iso639_3 {
    final val value: String = "nsy"
  }

  case object Nisenan extends Iso639_3 {
    final val value: String = "nsz"
  }

  case object NorthernTidung extends Iso639_3 {
    final val value: String = "ntd"
  }

  case object Nathembo extends Iso639_3 {
    final val value: String = "nte"
  }

  case object Natioro extends Iso639_3 {
    final val value: String = "nti"
  }

  case object Ngaanyatjarra extends Iso639_3 {
    final val value: String = "ntj"
  }

  case object IkomaNataIsenye extends Iso639_3 {
    final val value: String = "ntk"
  }

  case object Nateni extends Iso639_3 {
    final val value: String = "ntm"
  }

  case object Ntomba extends Iso639_3 {
    final val value: String = "nto"
  }

  case object NorthernTepehuan extends Iso639_3 {
    final val value: String = "ntp"
  }

  case object Delo extends Iso639_3 {
    final val value: String = "ntr"
  }

  case object Natugu extends Iso639_3 {
    final val value: String = "ntu"
  }

  case object MyanmarTangkhulNaga extends Iso639_3 {
    final val value: String = "ntx"
  }

  case object Mantsi extends Iso639_3 {
    final val value: String = "nty"
  }

  case object Natanzi extends Iso639_3 {
    final val value: String = "ntz"
  }

  case object Yuanga extends Iso639_3 {
    final val value: String = "nua"
  }

  case object Ngala extends Iso639_3 {
    final val value: String = "nud"
  }

  case object Ngundu extends Iso639_3 {
    final val value: String = "nue"
  }

  case object Nusu extends Iso639_3 {
    final val value: String = "nuf"
  }

  case object Ndunda extends Iso639_3 {
    final val value: String = "nuh"
  }

  case object Ngumbi extends Iso639_3 {
    final val value: String = "nui"
  }

  case object Nyole extends Iso639_3 {
    final val value: String = "nuj"
  }

  case object Nuuchahnulth extends Iso639_3 {
    final val value: String = "nuk"
  }

  case object Niuafoou extends Iso639_3 {
    final val value: String = "num"
  }

  case object Anong extends Iso639_3 {
    final val value: String = "nun"
  }

  case object Nguon extends Iso639_3 {
    final val value: String = "nuo"
  }

  case object NupeNupeTako extends Iso639_3 {
    final val value: String = "nup"
  }

  case object Nukumanu extends Iso639_3 {
    final val value: String = "nuq"
  }

  case object Nukuria extends Iso639_3 {
    final val value: String = "nur"
  }

  case object Nuer extends Iso639_3 {
    final val value: String = "nus"
  }

  case object VietnameseNung extends Iso639_3 {
    final val value: String = "nut"
  }

  case object Ngbundu extends Iso639_3 {
    final val value: String = "nuu"
  }

  case object NorthernNuni extends Iso639_3 {
    final val value: String = "nuv"
  }

  case object Nguluwan extends Iso639_3 {
    final val value: String = "nuw"
  }

  case object Mehek extends Iso639_3 {
    final val value: String = "nux"
  }

  case object Nunggubuyu extends Iso639_3 {
    final val value: String = "nuy"
  }

  case object TlamacazapaNahuatl extends Iso639_3 {
    final val value: String = "nuz"
  }

  case object Nasarian extends Iso639_3 {
    final val value: String = "nvh"
  }

  case object Namiae extends Iso639_3 {
    final val value: String = "nvm"
  }

  case object Nyokon extends Iso639_3 {
    final val value: String = "nvo"
  }

  case object Nyabwa extends Iso639_3 {
    final val value: String = "nwb"
  }

  case object Ngwe extends Iso639_3 {
    final val value: String = "nwe"
  }

  case object SouthwestTanna extends Iso639_3 {
    final val value: String = "nwi"
  }

  case object NyamusaMolo extends Iso639_3 {
    final val value: String = "nwm"
  }

  case object Nawaru extends Iso639_3 {
    final val value: String = "nwr"
  }

  case object Nauete extends Iso639_3 {
    final val value: String = "nxa"
  }

  case object DemocraticRepublicOfCongoeseNgando extends Iso639_3 {
    final val value: String = "nxd"
  }

  case object Nage extends Iso639_3 {
    final val value: String = "nxe"
  }

  case object Ngada extends Iso639_3 {
    final val value: String = "nxg"
  }

  case object Nindi extends Iso639_3 {
    final val value: String = "nxi"
  }

  case object KokiNaga extends Iso639_3 {
    final val value: String = "nxk"
  }

  case object SouthNuaulu extends Iso639_3 {
    final val value: String = "nxl"
  }

  case object Ndambomo extends Iso639_3 {
    final val value: String = "nxo"
  }

  case object Naxi extends Iso639_3 {
    final val value: String = "nxq"
  }

  case object Ninggerum extends Iso639_3 {
    final val value: String = "nxr"
  }

  case object Nafri extends Iso639_3 {
    final val value: String = "nxx"
  }

  case object Nyanja extends Iso639_3 {
    final val value: String = "nya"
  }

  case object Nyangbo extends Iso639_3 {
    final val value: String = "nyb"
  }

  case object Nyangali extends Iso639_3 {
    final val value: String = "nyc"
  }

  case object Nyore extends Iso639_3 {
    final val value: String = "nyd"
  }

  case object Nyengo extends Iso639_3 {
    final val value: String = "nye"
  }

  case object Giryama extends Iso639_3 {
    final val value: String = "nyf"
  }

  case object Nyindu extends Iso639_3 {
    final val value: String = "nyg"
  }

  case object Nyigina extends Iso639_3 {
    final val value: String = "nyh"
  }

  case object SudaneseAma extends Iso639_3 {
    final val value: String = "nyi"
  }

  case object Nyanga extends Iso639_3 {
    final val value: String = "nyj"
  }

  case object Nyaneka extends Iso639_3 {
    final val value: String = "nyk"
  }

  case object Nyeu extends Iso639_3 {
    final val value: String = "nyl"
  }

  case object Nyamwezi extends Iso639_3 {
    final val value: String = "nym"
  }

  case object Nyankole extends Iso639_3 {
    final val value: String = "nyn"
  }

  case object Nyoro extends Iso639_3 {
    final val value: String = "nyo"
  }

  case object Nayini extends Iso639_3 {
    final val value: String = "nyq"
  }

  case object MalawiNyiha extends Iso639_3 {
    final val value: String = "nyr"
  }

  case object Nyunga extends Iso639_3 {
    final val value: String = "nys"
  }

  case object Nyungwe extends Iso639_3 {
    final val value: String = "nyu"
  }

  case object Nyaw extends Iso639_3 {
    final val value: String = "nyw"
  }

  case object NyakyusaNgonde extends Iso639_3 {
    final val value: String = "nyy"
  }

  case object TigonMbembe extends Iso639_3 {
    final val value: String = "nza"
  }

  case object Njebi extends Iso639_3 {
    final val value: String = "nzb"
  }

  case object Nzadi extends Iso639_3 {
    final val value: String = "nzd"
  }

  case object Nzima extends Iso639_3 {
    final val value: String = "nzi"
  }

  case object Nzakara extends Iso639_3 {
    final val value: String = "nzk"
  }

  case object ZemeNaga extends Iso639_3 {
    final val value: String = "nzm"
  }

  case object NewZealandSignLanguage extends Iso639_3 {
    final val value: String = "nzs"
  }

  case object TekeNzikou extends Iso639_3 {
    final val value: String = "nzu"
  }

  case object Nzakambay extends Iso639_3 {
    final val value: String = "nzy"
  }

  case object DamaDogon extends Iso639_3 {
    final val value: String = "nzz"
  }

  case object Orok extends Iso639_3 {
    final val value: String = "oaa"
  }

  case object Oroch extends Iso639_3 {
    final val value: String = "oac"
  }

  case object SouthernBontok extends Iso639_3 {
    final val value: String = "obk"
  }

  case object Oblo extends Iso639_3 {
    final val value: String = "obl"
  }

  case object OboManobo extends Iso639_3 {
    final val value: String = "obo"
  }

  case object Obulom extends Iso639_3 {
    final val value: String = "obu"
  }

  case object Ocaina extends Iso639_3 {
    final val value: String = "oca"
  }

  case object Post1500Occitan extends Iso639_3 {
    final val value: String = "oci"
  }

  case object AtzingoMatlatzinca extends Iso639_3 {
    final val value: String = "ocu"
  }

  case object Odut extends Iso639_3 {
    final val value: String = "oda"
  }

  case object Od extends Iso639_3 {
    final val value: String = "odk"
  }

  case object Odual extends Iso639_3 {
    final val value: String = "odu"
  }

  case object Efutop extends Iso639_3 {
    final val value: String = "ofu"
  }

  case object Ogbia extends Iso639_3 {
    final val value: String = "ogb"
  }

  case object Ogbah extends Iso639_3 {
    final val value: String = "ogc"
  }

  case object Ogbogolo extends Iso639_3 {
    final val value: String = "ogg"
  }

  case object Khana extends Iso639_3 {
    final val value: String = "ogo"
  }

  case object Ogbronuagum extends Iso639_3 {
    final val value: String = "ogu"
  }

  case object Oirata extends Iso639_3 {
    final val value: String = "oia"
  }

  case object InebuOne extends Iso639_3 {
    final val value: String = "oin"
  }

  case object NorthwesternOjibwa extends Iso639_3 {
    final val value: String = "ojb"
  }

  case object CentralOjibwa extends Iso639_3 {
    final val value: String = "ojc"
  }

  case object EasternOjibwa extends Iso639_3 {
    final val value: String = "ojg"
  }

  case object Ojibwa extends Iso639_3 {
    final val value: String = "oji"
  }

  case object SevernOjibwa extends Iso639_3 {
    final val value: String = "ojs"
  }

  case object OntongJava extends Iso639_3 {
    final val value: String = "ojv"
  }

  case object WesternOjibwa extends Iso639_3 {
    final val value: String = "ojw"
  }

  case object Okanagan extends Iso639_3 {
    final val value: String = "oka"
  }

  case object Okobo extends Iso639_3 {
    final val value: String = "okb"
  }

  case object Okodia extends Iso639_3 {
    final val value: String = "okd"
  }

  case object SouthwesternEdoOkpe extends Iso639_3 {
    final val value: String = "oke"
  }

  case object KoresheRostam extends Iso639_3 {
    final val value: String = "okh"
  }

  case object Okiek extends Iso639_3 {
    final val value: String = "oki"
  }

  case object KwamtimOne extends Iso639_3 {
    final val value: String = "okk"
  }

  case object OkiNoErabu extends Iso639_3 {
    final val value: String = "okn"
  }

  case object Kirike extends Iso639_3 {
    final val value: String = "okr"
  }

  case object OkoEniOsayen extends Iso639_3 {
    final val value: String = "oks"
  }

  case object Oku extends Iso639_3 {
    final val value: String = "oku"
  }

  case object Orokaiva extends Iso639_3 {
    final val value: String = "okv"
  }

  case object NorthwesternEdoOkpe extends Iso639_3 {
    final val value: String = "okx"
  }

  case object Walungge extends Iso639_3 {
    final val value: String = "ola"
  }

  case object Mochi extends Iso639_3 {
    final val value: String = "old"
  }

  case object Olekha extends Iso639_3 {
    final val value: String = "ole"
  }

  case object Oloma extends Iso639_3 {
    final val value: String = "olm"
  }

  case object Livvi extends Iso639_3 {
    final val value: String = "olo"
  }

  case object Olrat extends Iso639_3 {
    final val value: String = "olr"
  }

  case object Kuvale extends Iso639_3 {
    final val value: String = "olu"
  }

  case object OmahaPonca extends Iso639_3 {
    final val value: String = "oma"
  }

  case object EastAmbae extends Iso639_3 {
    final val value: String = "omb"
  }

  case object Omagua extends Iso639_3 {
    final val value: String = "omg"
  }

  case object Omi extends Iso639_3 {
    final val value: String = "omi"
  }

  case object Ombo extends Iso639_3 {
    final val value: String = "oml"
  }

  case object Utarmbung extends Iso639_3 {
    final val value: String = "omo"
  }

  case object Omotik extends Iso639_3 {
    final val value: String = "omt"
  }

  case object SouthTairora extends Iso639_3 {
    final val value: String = "omw"
  }

  case object Ona extends Iso639_3 {
    final val value: String = "ona"
  }

  case object Lingao extends Iso639_3 {
    final val value: String = "onb"
  }

  case object Oneida extends Iso639_3 {
    final val value: String = "one"
  }

  case object Olo extends Iso639_3 {
    final val value: String = "ong"
  }

  case object Onin extends Iso639_3 {
    final val value: String = "oni"
  }

  case object Onjob extends Iso639_3 {
    final val value: String = "onj"
  }

  case object KaboreOne extends Iso639_3 {
    final val value: String = "onk"
  }

  case object Onobasulu extends Iso639_3 {
    final val value: String = "onn"
  }

  case object Onondaga extends Iso639_3 {
    final val value: String = "ono"
  }

  case object Sartang extends Iso639_3 {
    final val value: String = "onp"
  }

  case object NorthernOne extends Iso639_3 {
    final val value: String = "onr"
  }

  case object Ono extends Iso639_3 {
    final val value: String = "ons"
  }

  case object Ontenu extends Iso639_3 {
    final val value: String = "ont"
  }

  case object Unua extends Iso639_3 {
    final val value: String = "onu"
  }

  case object OninBasedPidgin extends Iso639_3 {
    final val value: String = "onx"
  }

  case object TohonoOodham extends Iso639_3 {
    final val value: String = "ood"
  }

  case object Ong extends Iso639_3 {
    final val value: String = "oog"
  }

  case object onge extends Iso639_3 {
    final val value: String = "oon"
  }

  case object Oorlams extends Iso639_3 {
    final val value: String = "oor"
  }

  case object Okpamheri extends Iso639_3 {
    final val value: String = "opa"
  }

  case object Kopkaka extends Iso639_3 {
    final val value: String = "opk"
  }

  case object Oksapmin extends Iso639_3 {
    final val value: String = "opm"
  }

  case object Opao extends Iso639_3 {
    final val value: String = "opo"
  }

  case object Ofaye extends Iso639_3 {
    final val value: String = "opy"
  }

  case object Oroha extends Iso639_3 {
    final val value: String = "ora"
  }

  case object Orma extends Iso639_3 {
    final val value: String = "orc"
  }

  case object Orejon extends Iso639_3 {
    final val value: String = "ore"
  }

  case object Oring extends Iso639_3 {
    final val value: String = "org"
  }

  case object Oroqen extends Iso639_3 {
    final val value: String = "orh"
  }

  case object Oriya extends Iso639_3 {
    final val value: String = "ori"
  }

  case object Oromo extends Iso639_3 {
    final val value: String = "orm"
  }

  case object OrangKanaq extends Iso639_3 {
    final val value: String = "orn"
  }

  case object Orokolo extends Iso639_3 {
    final val value: String = "oro"
  }

  case object Oruma extends Iso639_3 {
    final val value: String = "orr"
  }

  case object OrangSeletar extends Iso639_3 {
    final val value: String = "ors"
  }

  case object AdivasiOriya extends Iso639_3 {
    final val value: String = "ort"
  }

  case object Ormuri extends Iso639_3 {
    final val value: String = "oru"
  }

  case object OroWin extends Iso639_3 {
    final val value: String = "orw"
  }

  case object Oro extends Iso639_3 {
    final val value: String = "orx"
  }

  case object Odia extends Iso639_3 {
    final val value: String = "ory"
  }

  case object Ormu extends Iso639_3 {
    final val value: String = "orz"
  }

  case object Osage extends Iso639_3 {
    final val value: String = "osa"
  }

  case object Osing extends Iso639_3 {
    final val value: String = "osi"
  }

  case object Ososo extends Iso639_3 {
    final val value: String = "oso"
  }

  case object Ossetian extends Iso639_3 {
    final val value: String = "oss"
  }

  case object Osatu extends Iso639_3 {
    final val value: String = "ost"
  }

  case object SouthernOne extends Iso639_3 {
    final val value: String = "osu"
  }

  case object OtDanum extends Iso639_3 {
    final val value: String = "otd"
  }

  case object MezquitalOtomi extends Iso639_3 {
    final val value: String = "ote"
  }

  case object TilapaOtomi extends Iso639_3 {
    final val value: String = "otl"
  }

  case object HighlandOtomi extends Iso639_3 {
    final val value: String = "otm"
  }

  case object TenangoOtomi extends Iso639_3 {
    final val value: String = "otn"
  }

  case object QueretaroOtomi extends Iso639_3 {
    final val value: String = "otq"
  }

  case object Otoro extends Iso639_3 {
    final val value: String = "otr"
  }

  case object EstadoDeMexicoOtomi extends Iso639_3 {
    final val value: String = "ots"
  }

  case object TemoayaOtomi extends Iso639_3 {
    final val value: String = "ott"
  }

  case object Ottawa extends Iso639_3 {
    final val value: String = "otw"
  }

  case object TexcatepecOtomi extends Iso639_3 {
    final val value: String = "otx"
  }

  case object IxtencoOtomi extends Iso639_3 {
    final val value: String = "otz"
  }

  case object Tagargrent extends Iso639_3 {
    final val value: String = "oua"
  }

  case object GlioOubi extends Iso639_3 {
    final val value: String = "oub"
  }

  case object Oune extends Iso639_3 {
    final val value: String = "oue"
  }

  case object Elfdalian extends Iso639_3 {
    final val value: String = "ovd"
  }

  case object Owiniga extends Iso639_3 {
    final val value: String = "owi"
  }

  case object Oy extends Iso639_3 {
    final val value: String = "oyb"
  }

  case object Oyda extends Iso639_3 {
    final val value: String = "oyd"
  }

  case object Wayampi extends Iso639_3 {
    final val value: String = "oym"
  }

  case object Oyaoya extends Iso639_3 {
    final val value: String = "oyy"
  }

  case object Koonzime extends Iso639_3 {
    final val value: String = "ozm"
  }

  case object Parecis extends Iso639_3 {
    final val value: String = "pab"
  }

  case object Pacoh extends Iso639_3 {
    final val value: String = "pac"
  }

  case object Paumari extends Iso639_3 {
    final val value: String = "pad"
  }

  case object Pagibete extends Iso639_3 {
    final val value: String = "pae"
  }

  case object Pangasinan extends Iso639_3 {
    final val value: String = "pag"
  }

  case object Tenharim extends Iso639_3 {
    final val value: String = "pah"
  }

  case object Pe extends Iso639_3 {
    final val value: String = "pai"
  }

  case object Parakana extends Iso639_3 {
    final val value: String = "pak"
  }

  case object Pampanga extends Iso639_3 {
    final val value: String = "pam"
  }

  case object Panjabi extends Iso639_3 {
    final val value: String = "pan"
  }

  case object NorthernPaiute extends Iso639_3 {
    final val value: String = "pao"
  }

  case object Papiamento extends Iso639_3 {
    final val value: String = "pap"
  }

  case object Parya extends Iso639_3 {
    final val value: String = "paq"
  }

  case object Panamint extends Iso639_3 {
    final val value: String = "par"
  }

  case object Papasena extends Iso639_3 {
    final val value: String = "pas"
  }

  case object Papitalai extends Iso639_3 {
    final val value: String = "pat"
  }

  case object Palauan extends Iso639_3 {
    final val value: String = "pau"
  }

  case object Pakaasnovos extends Iso639_3 {
    final val value: String = "pav"
  }

  case object Pawnee extends Iso639_3 {
    final val value: String = "paw"
  }

  case object Pech extends Iso639_3 {
    final val value: String = "pay"
  }

  case object Paez extends Iso639_3 {
    final val value: String = "pbb"
  }

  case object Patamona extends Iso639_3 {
    final val value: String = "pbc"
  }

  case object MezontlaPopoloca extends Iso639_3 {
    final val value: String = "pbe"
  }

  case object CoyotepecPopoloca extends Iso639_3 {
    final val value: String = "pbf"
  }

  case object EnapaWoromaipu extends Iso639_3 {
    final val value: String = "pbh"
  }

  case object Parkwa extends Iso639_3 {
    final val value: String = "pbi"
  }

  case object NigerianMak extends Iso639_3 {
    final val value: String = "pbl"
  }

  case object PueblaMazatec extends Iso639_3 {
    final val value: String = "pbm"
  }

  case object Kpasam extends Iso639_3 {
    final val value: String = "pbn"
  }

  case object Papel extends Iso639_3 {
    final val value: String = "pbo"
  }

  case object Badyara extends Iso639_3 {
    final val value: String = "pbp"
  }

  case object Pangwa extends Iso639_3 {
    final val value: String = "pbr"
  }

  case object CentralPame extends Iso639_3 {
    final val value: String = "pbs"
  }

  case object SouthernPashto extends Iso639_3 {
    final val value: String = "pbt"
  }

  case object NorthernPashto extends Iso639_3 {
    final val value: String = "pbu"
  }

  case object Pnar extends Iso639_3 {
    final val value: String = "pbv"
  }

  case object PapuaNewGuineanPyu extends Iso639_3 {
    final val value: String = "pby"
  }

  case object SantaInesAhuatempanPopoloca extends Iso639_3 {
    final val value: String = "pca"
  }

  case object Pear extends Iso639_3 {
    final val value: String = "pcb"
  }

  case object Bouyei extends Iso639_3 {
    final val value: String = "pcc"
  }

  case object Picard extends Iso639_3 {
    final val value: String = "pcd"
  }

  case object RuchingPalaung extends Iso639_3 {
    final val value: String = "pce"
  }

  case object Paliyan extends Iso639_3 {
    final val value: String = "pcf"
  }

  case object Paniya extends Iso639_3 {
    final val value: String = "pcg"
  }

  case object Pardhan extends Iso639_3 {
    final val value: String = "pch"
  }

  case object Duruwa extends Iso639_3 {
    final val value: String = "pci"
  }

  case object Parenga extends Iso639_3 {
    final val value: String = "pcj"
  }

  case object PaiteChin extends Iso639_3 {
    final val value: String = "pck"
  }

  case object Pardhi extends Iso639_3 {
    final val value: String = "pcl"
  }

  case object NigerianPidgin extends Iso639_3 {
    final val value: String = "pcm"
  }

  case object Piti extends Iso639_3 {
    final val value: String = "pcn"
  }

  case object Pacahuara extends Iso639_3 {
    final val value: String = "pcp"
  }

  case object Pyapun extends Iso639_3 {
    final val value: String = "pcw"
  }

  case object Anam extends Iso639_3 {
    final val value: String = "pda"
  }

  case object PennsylvaniaGerman extends Iso639_3 {
    final val value: String = "pdc"
  }

  case object PaDi extends Iso639_3 {
    final val value: String = "pdi"
  }

  case object Podena extends Iso639_3 {
    final val value: String = "pdn"
  }

  case object Padoe extends Iso639_3 {
    final val value: String = "pdo"
  }

  case object Plautdietsch extends Iso639_3 {
    final val value: String = "pdt"
  }

  case object Kayan extends Iso639_3 {
    final val value: String = "pdu"
  }

  case object PeranakanIndonesian extends Iso639_3 {
    final val value: String = "pea"
  }

  case object PapuaNewGuineanMala extends Iso639_3 {
    final val value: String = "ped"
  }

  case object Taje extends Iso639_3 {
    final val value: String = "pee"
  }

  case object Pengo extends Iso639_3 {
    final val value: String = "peg"
  }

  case object Bonan extends Iso639_3 {
    final val value: String = "peh"
  }

  case object ChichimecaJonaz extends Iso639_3 {
    final val value: String = "pei"
  }

  case object Penchal extends Iso639_3 {
    final val value: String = "pek"
  }

  case object Pekal extends Iso639_3 {
    final val value: String = "pel"
  }

  case object Phende extends Iso639_3 {
    final val value: String = "pem"
  }

  case object Kunja extends Iso639_3 {
    final val value: String = "pep"
  }

  case object SouthernPomo extends Iso639_3 {
    final val value: String = "peq"
  }

  case object IranianPersian extends Iso639_3 {
    final val value: String = "pes"
  }

  case object Pemono extends Iso639_3 {
    final val value: String = "pev"
  }

  case object Petats extends Iso639_3 {
    final val value: String = "pex"
  }

  case object Petjo extends Iso639_3 {
    final val value: String = "pey"
  }

  case object EasternPenan extends Iso639_3 {
    final val value: String = "pez"
  }

  case object Paafang extends Iso639_3 {
    final val value: String = "pfa"
  }

  case object Peere extends Iso639_3 {
    final val value: String = "pfe"
  }

  case object Pfaelzisch extends Iso639_3 {
    final val value: String = "pfl"
  }

  case object CreoleArabic extends Iso639_3 {
    final val value: String = "pga"
  }

  case object Pangwali extends Iso639_3 {
    final val value: String = "pgg"
  }

  case object Pagi extends Iso639_3 {
    final val value: String = "pgi"
  }

  case object Rerep extends Iso639_3 {
    final val value: String = "pgk"
  }

  case object Pangseng extends Iso639_3 {
    final val value: String = "pgs"
  }

  case object Pagu extends Iso639_3 {
    final val value: String = "pgu"
  }

  case object PapuaNewGuineanSignLanguage extends Iso639_3 {
    final val value: String = "pgz"
  }

  case object PaHng extends Iso639_3 {
    final val value: String = "pha"
  }

  case object Phudagi extends Iso639_3 {
    final val value: String = "phd"
  }

  case object Phuong extends Iso639_3 {
    final val value: String = "phg"
  }

  case object Phukha extends Iso639_3 {
    final val value: String = "phh"
  }

  case object Phake extends Iso639_3 {
    final val value: String = "phk"
  }

  case object Phalura extends Iso639_3 {
    final val value: String = "phl"
  }

  case object Phimbi extends Iso639_3 {
    final val value: String = "phm"
  }

  case object Phunoi extends Iso639_3 {
    final val value: String = "pho"
  }

  case object Phana extends Iso639_3 {
    final val value: String = "phq"
  }

  case object PahariPotwari extends Iso639_3 {
    final val value: String = "phr"
  }

  case object PhuThai extends Iso639_3 {
    final val value: String = "pht"
  }

  case object Phuan extends Iso639_3 {
    final val value: String = "phu"
  }

  case object Pahlavani extends Iso639_3 {
    final val value: String = "phv"
  }

  case object Phangduwali extends Iso639_3 {
    final val value: String = "phw"
  }

  case object PimaBajo extends Iso639_3 {
    final val value: String = "pia"
  }

  case object Yine extends Iso639_3 {
    final val value: String = "pib"
  }

  case object Pinji extends Iso639_3 {
    final val value: String = "pic"
  }

  case object Piaroa extends Iso639_3 {
    final val value: String = "pid"
  }

  case object Pingelapese extends Iso639_3 {
    final val value: String = "pif"
  }

  case object Pisabo extends Iso639_3 {
    final val value: String = "pig"
  }

  case object PitcairnNorfolk extends Iso639_3 {
    final val value: String = "pih"
  }

  case object Pini extends Iso639_3 {
    final val value: String = "pii"
  }

  case object Yom extends Iso639_3 {
    final val value: String = "pil"
  }

  case object Piame extends Iso639_3 {
    final val value: String = "pin"
  }

  case object Piapoco extends Iso639_3 {
    final val value: String = "pio"
  }

  case object Pero extends Iso639_3 {
    final val value: String = "pip"
  }

  case object Piratapuyo extends Iso639_3 {
    final val value: String = "pir"
  }

  case object Pijin extends Iso639_3 {
    final val value: String = "pis"
  }

  case object PintupiLuritja extends Iso639_3 {
    final val value: String = "piu"
  }

  case object Pileni extends Iso639_3 {
    final val value: String = "piv"
  }

  case object Pimbwe extends Iso639_3 {
    final val value: String = "piw"
  }

  case object Piu extends Iso639_3 {
    final val value: String = "pix"
  }

  case object PiyaKwonci extends Iso639_3 {
    final val value: String = "piy"
  }

  case object Pije extends Iso639_3 {
    final val value: String = "piz"
  }

  case object Pitjantjatjara extends Iso639_3 {
    final val value: String = "pjt"
  }

  case object Pokomo extends Iso639_3 {
    final val value: String = "pkb"
  }

  case object PakTong extends Iso639_3 {
    final val value: String = "pkg"
  }

  case object Pankhu extends Iso639_3 {
    final val value: String = "pkh"
  }

  case object Pakanha extends Iso639_3 {
    final val value: String = "pkn"
  }

  case object Pokoot extends Iso639_3 {
    final val value: String = "pko"
  }

  case object Pukapuka extends Iso639_3 {
    final val value: String = "pkp"
  }

  case object AttapadyKurumba extends Iso639_3 {
    final val value: String = "pkr"
  }

  case object PakistanSignLanguage extends Iso639_3 {
    final val value: String = "pks"
  }

  case object Maleng extends Iso639_3 {
    final val value: String = "pkt"
  }

  case object Paku extends Iso639_3 {
    final val value: String = "pku"
  }

  case object Miani extends Iso639_3 {
    final val value: String = "pla"
  }

  case object Polonombauk extends Iso639_3 {
    final val value: String = "plb"
  }

  case object CentralPalawano extends Iso639_3 {
    final val value: String = "plc"
  }

  case object Polari extends Iso639_3 {
    final val value: String = "pld"
  }

  case object Palue extends Iso639_3 {
    final val value: String = "ple"
  }

  case object Pilaga extends Iso639_3 {
    final val value: String = "plg"
  }

  case object Paulohi extends Iso639_3 {
    final val value: String = "plh"
  }

  case object Polci extends Iso639_3 {
    final val value: String = "plj"
  }

  case object KohistaniShina extends Iso639_3 {
    final val value: String = "plk"
  }

  case object ShwePalaung extends Iso639_3 {
    final val value: String = "pll"
  }

  case object Palenquero extends Iso639_3 {
    final val value: String = "pln"
  }

  case object OlutaPopoluca extends Iso639_3 {
    final val value: String = "plo"
  }

  case object Palpa extends Iso639_3 {
    final val value: String = "plp"
  }

  case object PalakaSenoufo extends Iso639_3 {
    final val value: String = "plr"
  }

  case object MarcosTlacoyalcoPopoloca extends Iso639_3 {
    final val value: String = "pls"
  }

  case object PlateauMalagasy extends Iso639_3 {
    final val value: String = "plt"
  }

  case object Palikur extends Iso639_3 {
    final val value: String = "plu"
  }

  case object SouthwestPalawano extends Iso639_3 {
    final val value: String = "plv"
  }

  case object BrookesPointPalawano extends Iso639_3 {
    final val value: String = "plw"
  }

  case object Bolyu extends Iso639_3 {
    final val value: String = "ply"
  }

  case object Paluan extends Iso639_3 {
    final val value: String = "plz"
  }

  case object Paama extends Iso639_3 {
    final val value: String = "pma"
  }

  case object Pambia extends Iso639_3 {
    final val value: String = "pmb"
  }

  case object Pwaamei extends Iso639_3 {
    final val value: String = "pme"
  }

  case object Pamona extends Iso639_3 {
    final val value: String = "pmf"
  }

  case object NorthernPumi extends Iso639_3 {
    final val value: String = "pmi"
  }

  case object SouthernPumi extends Iso639_3 {
    final val value: String = "pmj"
  }

  case object Pomo extends Iso639_3 {
    final val value: String = "pmm"
  }

  case object Pam extends Iso639_3 {
    final val value: String = "pmn"
  }

  case object Pom extends Iso639_3 {
    final val value: String = "pmo"
  }

  case object NorthernPame extends Iso639_3 {
    final val value: String = "pmq"
  }

  case object Paynamar extends Iso639_3 {
    final val value: String = "pmr"
  }

  case object Piemontese extends Iso639_3 {
    final val value: String = "pms"
  }

  case object Tuamotuan extends Iso639_3 {
    final val value: String = "pmt"
  }

  case object PlainsMiwok extends Iso639_3 {
    final val value: String = "pmw"
  }

  case object PoumeiNaga extends Iso639_3 {
    final val value: String = "pmx"
  }

  case object PapuanMalay extends Iso639_3 {
    final val value: String = "pmy"
  }

  case object PunanBahBiau extends Iso639_3 {
    final val value: String = "pna"
  }

  case object WesternPanjabi extends Iso639_3 {
    final val value: String = "pnb"
  }

  case object Pannei extends Iso639_3 {
    final val value: String = "pnc"
  }

  case object WesternPenan extends Iso639_3 {
    final val value: String = "pne"
  }

  case object Pongu extends Iso639_3 {
    final val value: String = "png"
  }

  case object Penrhyn extends Iso639_3 {
    final val value: String = "pnh"
  }

  case object Aoheng extends Iso639_3 {
    final val value: String = "pni"
  }

  case object Paunaka extends Iso639_3 {
    final val value: String = "pnk"
  }

  case object Paleni extends Iso639_3 {
    final val value: String = "pnl"
  }

  case object PunanBatu extends Iso639_3 {
    final val value: String = "pnm"
  }

  case object PinaiHagahai extends Iso639_3 {
    final val value: String = "pnn"
  }

  case object Pancana extends Iso639_3 {
    final val value: String = "pnp"
  }

  case object BurkinaFasoPana extends Iso639_3 {
    final val value: String = "pnq"
  }

  case object Panim extends Iso639_3 {
    final val value: String = "pnr"
  }

  case object Ponosakan extends Iso639_3 {
    final val value: String = "pns"
  }

  case object Pontic extends Iso639_3 {
    final val value: String = "pnt"
  }

  case object JiongnaiBunu extends Iso639_3 {
    final val value: String = "pnu"
  }

  case object Pinigura extends Iso639_3 {
    final val value: String = "pnv"
  }

  case object Panytyima extends Iso639_3 {
    final val value: String = "pnw"
  }

  case object PhongKniang extends Iso639_3 {
    final val value: String = "pnx"
  }

  case object Pinyin extends Iso639_3 {
    final val value: String = "pny"
  }

  case object CentralAfricanRepublicanPana extends Iso639_3 {
    final val value: String = "pnz"
  }

  case object Poqomam extends Iso639_3 {
    final val value: String = "poc"
  }

  case object JuanAtzingoPopoloca extends Iso639_3 {
    final val value: String = "poe"
  }

  case object Poke extends Iso639_3 {
    final val value: String = "pof"
  }

  case object Poqomchi extends Iso639_3 {
    final val value: String = "poh"
  }

  case object HighlandPopoluca extends Iso639_3 {
    final val value: String = "poi"
  }

  case object Pokanga extends Iso639_3 {
    final val value: String = "pok"
  }

  case object Polish extends Iso639_3 {
    final val value: String = "pol"
  }

  case object SoutheasternPomo extends Iso639_3 {
    final val value: String = "pom"
  }

  case object Pohnpeian extends Iso639_3 {
    final val value: String = "pon"
  }

  case object CentralPomo extends Iso639_3 {
    final val value: String = "poo"
  }

  case object Pwapwa extends Iso639_3 {
    final val value: String = "pop"
  }

  case object TexistepecPopoluca extends Iso639_3 {
    final val value: String = "poq"
  }

  case object Portuguese extends Iso639_3 {
    final val value: String = "por"
  }

  case object SayulaPopoluca extends Iso639_3 {
    final val value: String = "pos"
  }

  case object Potawatomi extends Iso639_3 {
    final val value: String = "pot"
  }

  case object GuineaCrioulo extends Iso639_3 {
    final val value: String = "pov"
  }

  case object FelipeOtlaltepecPopoloca extends Iso639_3 {
    final val value: String = "pow"
  }

  case object Pogolo extends Iso639_3 {
    final val value: String = "poy"
  }

  case object Papi extends Iso639_3 {
    final val value: String = "ppe"
  }

  case object Paipai extends Iso639_3 {
    final val value: String = "ppi"
  }

  case object Uma extends Iso639_3 {
    final val value: String = "ppk"
  }

  case object Pipil extends Iso639_3 {
    final val value: String = "ppl"
  }

  case object Papuma extends Iso639_3 {
    final val value: String = "ppm"
  }

  case object Papapana extends Iso639_3 {
    final val value: String = "ppn"
  }

  case object Folopa extends Iso639_3 {
    final val value: String = "ppo"
  }

  case object Pelende extends Iso639_3 {
    final val value: String = "ppp"
  }

  case object Pei extends Iso639_3 {
    final val value: String = "ppq"
  }

  case object SanLuisTemalacayucaPopoloca extends Iso639_3 {
    final val value: String = "pps"
  }

  case object Pare extends Iso639_3 {
    final val value: String = "ppt"
  }

  case object Paa extends Iso639_3 {
    final val value: String = "pqa"
  }

  case object MalecitePassamaquoddy extends Iso639_3 {
    final val value: String = "pqm"
  }

  case object Parachi extends Iso639_3 {
    final val value: String = "prc"
  }

  case object ParsiDari extends Iso639_3 {
    final val value: String = "prd"
  }

  case object Principense extends Iso639_3 {
    final val value: String = "pre"
  }

  case object Paranan extends Iso639_3 {
    final val value: String = "prf"
  }

  case object Prussian extends Iso639_3 {
    final val value: String = "prg"
  }

  case object Porohanon extends Iso639_3 {
    final val value: String = "prh"
  }

  case object Paici extends Iso639_3 {
    final val value: String = "pri"
  }

  case object Parauk extends Iso639_3 {
    final val value: String = "prk"
  }

  case object PeruvianSignLanguage extends Iso639_3 {
    final val value: String = "prl"
  }

  case object Kibiri extends Iso639_3 {
    final val value: String = "prm"
  }

  case object Prasuni extends Iso639_3 {
    final val value: String = "prn"
  }

  case object Parsi extends Iso639_3 {
    final val value: String = "prp"
  }

  case object AsheninkaPerene extends Iso639_3 {
    final val value: String = "prq"
  }

  case object Dari extends Iso639_3 {
    final val value: String = "prs"
  }

  case object Phai extends Iso639_3 {
    final val value: String = "prt"
  }

  case object Puragi extends Iso639_3 {
    final val value: String = "pru"
  }

  case object Parawen extends Iso639_3 {
    final val value: String = "prw"
  }

  case object Purik extends Iso639_3 {
    final val value: String = "prx"
  }

  case object ProvidenciaSignLanguage extends Iso639_3 {
    final val value: String = "prz"
  }

  case object AsueAwyu extends Iso639_3 {
    final val value: String = "psa"
  }

  case object PersianSignLanguage extends Iso639_3 {
    final val value: String = "psc"
  }

  case object PlainsIndianSignLanguage extends Iso639_3 {
    final val value: String = "psd"
  }

  case object CentralMalay extends Iso639_3 {
    final val value: String = "pse"
  }

  case object PenangSignLanguage extends Iso639_3 {
    final val value: String = "psg"
  }

  case object SouthwestPashai extends Iso639_3 {
    final val value: String = "psh"
  }

  case object SoutheastPashai extends Iso639_3 {
    final val value: String = "psi"
  }

  case object PuertoRicanSignLanguage extends Iso639_3 {
    final val value: String = "psl"
  }

  case object Panasuan extends Iso639_3 {
    final val value: String = "psn"
  }

  case object PolishthSignLanguage extends Iso639_3 {
    final val value: String = "pso"
  }

  case object PhilippineSignLanguage extends Iso639_3 {
    final val value: String = "psp"
  }

  case object Pasi extends Iso639_3 {
    final val value: String = "psq"
  }

  case object PortugueseSignLanguage extends Iso639_3 {
    final val value: String = "psr"
  }

  case object Kaulong extends Iso639_3 {
    final val value: String = "pss"
  }

  case object CentralPashto extends Iso639_3 {
    final val value: String = "pst"
  }

  case object PortSandwich extends Iso639_3 {
    final val value: String = "psw"
  }

  case object PaiTavytera extends Iso639_3 {
    final val value: String = "pta"
  }

  case object Pintiini extends Iso639_3 {
    final val value: String = "pti"
  }

  case object Patani extends Iso639_3 {
    final val value: String = "ptn"
  }

  case object Zoe extends Iso639_3 {
    final val value: String = "pto"
  }

  case object Patep extends Iso639_3 {
    final val value: String = "ptp"
  }

  case object Pattapu extends Iso639_3 {
    final val value: String = "ptq"
  }

  case object Piamatsina extends Iso639_3 {
    final val value: String = "ptr"
  }

  case object Enrekang extends Iso639_3 {
    final val value: String = "ptt"
  }

  case object Bambam extends Iso639_3 {
    final val value: String = "ptu"
  }

  case object PortVato extends Iso639_3 {
    final val value: String = "ptv"
  }

  case object Pathiya extends Iso639_3 {
    final val value: String = "pty"
  }

  case object HighlandPurepecha extends Iso639_3 {
    final val value: String = "pua"
  }

  case object Purum extends Iso639_3 {
    final val value: String = "pub"
  }

  case object PunanMerap extends Iso639_3 {
    final val value: String = "puc"
  }

  case object PunanAput extends Iso639_3 {
    final val value: String = "pud"
  }

  case object PunanMerah extends Iso639_3 {
    final val value: String = "puf"
  }

  case object Phuie extends Iso639_3 {
    final val value: String = "pug"
  }

  case object Puinave extends Iso639_3 {
    final val value: String = "pui"
  }

  case object PunanTubu extends Iso639_3 {
    final val value: String = "puj"
  }

  case object Puma extends Iso639_3 {
    final val value: String = "pum"
  }

  case object Puoc extends Iso639_3 {
    final val value: String = "puo"
  }

  case object Pulabu extends Iso639_3 {
    final val value: String = "pup"
  }

  case object Purubora extends Iso639_3 {
    final val value: String = "pur"
  }

  case object Pushto extends Iso639_3 {
    final val value: String = "pus"
  }

  case object Putoh extends Iso639_3 {
    final val value: String = "put"
  }

  case object Punu extends Iso639_3 {
    final val value: String = "puu"
  }

  case object Puluwatese extends Iso639_3 {
    final val value: String = "puw"
  }

  case object Puare extends Iso639_3 {
    final val value: String = "pux"
  }

  case object Pawaia extends Iso639_3 {
    final val value: String = "pwa"
  }

  case object Panawa extends Iso639_3 {
    final val value: String = "pwb"
  }

  case object Gapapaiwa extends Iso639_3 {
    final val value: String = "pwg"
  }

  case object Molbog extends Iso639_3 {
    final val value: String = "pwm"
  }

  case object Paiwan extends Iso639_3 {
    final val value: String = "pwn"
  }

  case object WesternKaren extends Iso639_3 {
    final val value: String = "pwo"
  }

  case object Powari extends Iso639_3 {
    final val value: String = "pwr"
  }

  case object NorthernKaren extends Iso639_3 {
    final val value: String = "pww"
  }

  case object QuetzaltepecMixe extends Iso639_3 {
    final val value: String = "pxm"
  }

  case object PyeKrumen extends Iso639_3 {
    final val value: String = "pye"
  }

  case object Fyam extends Iso639_3 {
    final val value: String = "pym"
  }

  case object Poyanawa extends Iso639_3 {
    final val value: String = "pyn"
  }

  case object ParaguayanSignLanguage extends Iso639_3 {
    final val value: String = "pys"
  }

  case object Puyuma extends Iso639_3 {
    final val value: String = "pyu"
  }

  case object Pyen extends Iso639_3 {
    final val value: String = "pyy"
  }

  case object ParaNaga extends Iso639_3 {
    final val value: String = "pzn"
  }

  case object Quapaw extends Iso639_3 {
    final val value: String = "qua"
  }

  case object HuallagaHuanucoQuechua extends Iso639_3 {
    final val value: String = "qub"
  }

  case object Kiche extends Iso639_3 {
    final val value: String = "quc"
  }

  case object CalderonHighlandQuichua extends Iso639_3 {
    final val value: String = "qud"
  }

  case object Quechua extends Iso639_3 {
    final val value: String = "que"
  }

  case object LambayequeQuechua extends Iso639_3 {
    final val value: String = "quf"
  }

  case object HighlandQuichua extends Iso639_3 {
    final val value: String = "qug"
  }

  case object BolivianQuechua extends Iso639_3 {
    final val value: String = "quh"
  }

  case object Quileute extends Iso639_3 {
    final val value: String = "qui"
  }

  case object ChachapoyasQuechua extends Iso639_3 {
    final val value: String = "quk"
  }

  case object NorthBolivianQuechua extends Iso639_3 {
    final val value: String = "qul"
  }

  case object Sipacapense extends Iso639_3 {
    final val value: String = "qum"
  }

  case object PastazaQuechua extends Iso639_3 {
    final val value: String = "qup"
  }

  case object Quinqui extends Iso639_3 {
    final val value: String = "quq"
  }

  case object PascoQuechua extends Iso639_3 {
    final val value: String = "qur"
  }

  case object SantiagoDelEsteroQuichua extends Iso639_3 {
    final val value: String = "qus"
  }

  case object Sacapulteco extends Iso639_3 {
    final val value: String = "quv"
  }

  case object LowlandQuichua extends Iso639_3 {
    final val value: String = "quw"
  }

  case object YauyosQuechua extends Iso639_3 {
    final val value: String = "qux"
  }

  case object AyacuchoQuechua extends Iso639_3 {
    final val value: String = "quy"
  }

  case object CuscoQuechua extends Iso639_3 {
    final val value: String = "quz"
  }

  case object AmboPascoQuechua extends Iso639_3 {
    final val value: String = "qva"
  }

  case object CajamarcaQuechua extends Iso639_3 {
    final val value: String = "qvc"
  }

  case object EasternApurimacQuechua extends Iso639_3 {
    final val value: String = "qve"
  }

  case object HuamaliesDosDeMayoHuanucoQuechua extends Iso639_3 {
    final val value: String = "qvh"
  }

  case object ImbaburaHighlandQuichua extends Iso639_3 {
    final val value: String = "qvi"
  }

  case object LojaHighlandQuichua extends Iso639_3 {
    final val value: String = "qvj"
  }

  case object NorthLimaQuechua extends Iso639_3 {
    final val value: String = "qvl"
  }

  case object LauricochaQuechua extends Iso639_3 {
    final val value: String = "qvm"
  }

  case object NorthJuninQuechua extends Iso639_3 {
    final val value: String = "qvn"
  }

  case object LowlandQuechua extends Iso639_3 {
    final val value: String = "qvo"
  }

  case object PacaraosQuechua extends Iso639_3 {
    final val value: String = "qvp"
  }

  case object SanMartinQuechua extends Iso639_3 {
    final val value: String = "qvs"
  }

  case object WancaQuechua extends Iso639_3 {
    final val value: String = "qvw"
  }

  case object Queyu extends Iso639_3 {
    final val value: String = "qvy"
  }

  case object PastazaQuichua extends Iso639_3 {
    final val value: String = "qvz"
  }

  case object CorongoAncashQuechua extends Iso639_3 {
    final val value: String = "qwa"
  }

  case object SihuasAncashQuechua extends Iso639_3 {
    final val value: String = "qwh"
  }

  case object AncashQuechua extends Iso639_3 {
    final val value: String = "qws"
  }

  case object ChiquianAncashQuechua extends Iso639_3 {
    final val value: String = "qxa"
  }

  case object ChinchaQuechua extends Iso639_3 {
    final val value: String = "qxc"
  }

  case object PanaoHuanucoQuechua extends Iso639_3 {
    final val value: String = "qxh"
  }

  case object SalasacaHighlandQuichua extends Iso639_3 {
    final val value: String = "qxl"
  }

  case object NorthernConchucosAncashQuechua extends Iso639_3 {
    final val value: String = "qxn"
  }

  case object SouthernConchucosAncashQuechua extends Iso639_3 {
    final val value: String = "qxo"
  }

  case object PunoQuechua extends Iso639_3 {
    final val value: String = "qxp"
  }

  case object Qashqai extends Iso639_3 {
    final val value: String = "qxq"
  }

  case object CanarHighlandQuichua extends Iso639_3 {
    final val value: String = "qxr"
  }

  case object SouthernQiang extends Iso639_3 {
    final val value: String = "qxs"
  }

  case object SantaAnaDeTusiPascoQuechua extends Iso639_3 {
    final val value: String = "qxt"
  }

  case object ArequipaLaUnionQuechua extends Iso639_3 {
    final val value: String = "qxu"
  }

  case object JaujaWancaQuechua extends Iso639_3 {
    final val value: String = "qxw"
  }

  case object Dungmali extends Iso639_3 {
    final val value: String = "raa"
  }

  case object Camling extends Iso639_3 {
    final val value: String = "rab"
  }

  case object Rasawa extends Iso639_3 {
    final val value: String = "rac"
  }

  case object Rade extends Iso639_3 {
    final val value: String = "rad"
  }

  case object WesternMeohang extends Iso639_3 {
    final val value: String = "raf"
  }

  case object Logooli extends Iso639_3 {
    final val value: String = "rag"
  }

  case object Rabha extends Iso639_3 {
    final val value: String = "rah"
  }

  case object Ramoaaina extends Iso639_3 {
    final val value: String = "rai"
  }

  case object Rajasthani extends Iso639_3 {
    final val value: String = "raj"
  }

  case object TuluBohuai extends Iso639_3 {
    final val value: String = "rak"
  }

  case object Ralte extends Iso639_3 {
    final val value: String = "ral"
  }

  case object Canela extends Iso639_3 {
    final val value: String = "ram"
  }

  case object Riantana extends Iso639_3 {
    final val value: String = "ran"
  }

  case object Rao extends Iso639_3 {
    final val value: String = "rao"
  }

  case object Rapanui extends Iso639_3 {
    final val value: String = "rap"
  }

  case object Saam extends Iso639_3 {
    final val value: String = "raq"
  }

  case object Rarotongan extends Iso639_3 {
    final val value: String = "rar"
  }

  case object Tegali extends Iso639_3 {
    final val value: String = "ras"
  }

  case object Razajerdi extends Iso639_3 {
    final val value: String = "rat"
  }

  case object Raute extends Iso639_3 {
    final val value: String = "rau"
  }

  case object Sampang extends Iso639_3 {
    final val value: String = "rav"
  }

  case object Rawang extends Iso639_3 {
    final val value: String = "raw"
  }

  case object Rang extends Iso639_3 {
    final val value: String = "rax"
  }

  case object Rapa extends Iso639_3 {
    final val value: String = "ray"
  }

  case object Rahambuu extends Iso639_3 {
    final val value: String = "raz"
  }

  case object RumaiPalaung extends Iso639_3 {
    final val value: String = "rbb"
  }

  case object NorthernBontok extends Iso639_3 {
    final val value: String = "rbk"
  }

  case object MirayaBikol extends Iso639_3 {
    final val value: String = "rbl"
  }

  case object ReunionCreoleFrench extends Iso639_3 {
    final val value: String = "rcf"
  }

  case object Rudbari extends Iso639_3 {
    final val value: String = "rdb"
  }

  case object Rerau extends Iso639_3 {
    final val value: String = "rea"
  }

  case object Rembong extends Iso639_3 {
    final val value: String = "reb"
  }

  case object RejangKayan extends Iso639_3 {
    final val value: String = "ree"
  }

  case object TanzanianKara extends Iso639_3 {
    final val value: String = "reg"
  }

  case object Reli extends Iso639_3 {
    final val value: String = "rei"
  }

  case object Rejang extends Iso639_3 {
    final val value: String = "rej"
  }

  case object Rendille extends Iso639_3 {
    final val value: String = "rel"
  }

  case object Rengao extends Iso639_3 {
    final val value: String = "ren"
  }

  case object Reshe extends Iso639_3 {
    final val value: String = "res"
  }

  case object Retta extends Iso639_3 {
    final val value: String = "ret"
  }

  case object Reyesano extends Iso639_3 {
    final val value: String = "rey"
  }

  case object Roria extends Iso639_3 {
    final val value: String = "rga"
  }

  case object RomanoGreek extends Iso639_3 {
    final val value: String = "rge"
  }

  case object Romagnol extends Iso639_3 {
    final val value: String = "rgn"
  }

  case object Resigaro extends Iso639_3 {
    final val value: String = "rgr"
  }

  case object SouthernRoglai extends Iso639_3 {
    final val value: String = "rgs"
  }

  case object Ringgou extends Iso639_3 {
    final val value: String = "rgu"
  }

  case object Rohingya extends Iso639_3 {
    final val value: String = "rhg"
  }

  case object Yahang extends Iso639_3 {
    final val value: String = "rhp"
  }

  case object IndianRiang  extends Iso639_3 {
    final val value: String = "ria"
  }

  case object Tarifit extends Iso639_3 {
    final val value: String = "rif"
  }

  case object MyanmarRiang extends Iso639_3 {
    final val value: String = "ril"
  }

  case object Nyaturu extends Iso639_3 {
    final val value: String = "rim"
  }

  case object Nungu extends Iso639_3 {
    final val value: String = "rin"
  }

  case object Ribun extends Iso639_3 {
    final val value: String = "rir"
  }

  case object Ritarungo extends Iso639_3 {
    final val value: String = "rit"
  }

  case object Riung extends Iso639_3 {
    final val value: String = "riu"
  }

  case object Rajong extends Iso639_3 {
    final val value: String = "rjg"
  }

  case object Raji extends Iso639_3 {
    final val value: String = "rji"
  }

  case object Rajbanshi extends Iso639_3 {
    final val value: String = "rjs"
  }

  case object Kraol extends Iso639_3 {
    final val value: String = "rka"
  }

  case object Rikbaktsa extends Iso639_3 {
    final val value: String = "rkb"
  }

  case object RakahangaManihiki extends Iso639_3 {
    final val value: String = "rkh"
  }

  case object Rakhine extends Iso639_3 {
    final val value: String = "rki"
  }

  case object Marka extends Iso639_3 {
    final val value: String = "rkm"
  }

  case object Rangpuri extends Iso639_3 {
    final val value: String = "rkt"
  }

  case object Rama extends Iso639_3 {
    final val value: String = "rma"
  }

  case object Rembarunga extends Iso639_3 {
    final val value: String = "rmb"
  }

  case object CarpathianRomani extends Iso639_3 {
    final val value: String = "rmc"
  }

  case object Angloromani extends Iso639_3 {
    final val value: String = "rme"
  }

  case object FinnishRomani extends Iso639_3 {
    final val value: String = "rmf"
  }

  case object TravellerNorwegian extends Iso639_3 {
    final val value: String = "rmg"
  }

  case object Murkim extends Iso639_3 {
    final val value: String = "rmh"
  }

  case object Lomavren extends Iso639_3 {
    final val value: String = "rmi"
  }

  case object Romkun extends Iso639_3 {
    final val value: String = "rmk"
  }

  case object BalticRomani extends Iso639_3 {
    final val value: String = "rml"
  }

  case object Roma extends Iso639_3 {
    final val value: String = "rmm"
  }

  case object BalkanRomani extends Iso639_3 {
    final val value: String = "rmn"
  }

  case object SinteRomani extends Iso639_3 {
    final val value: String = "rmo"
  }

  case object Rempi extends Iso639_3 {
    final val value: String = "rmp"
  }

  case object Calo extends Iso639_3 {
    final val value: String = "rmq"
  }

  case object RomanianSignLanguage extends Iso639_3 {
    final val value: String = "rms"
  }

  case object Domari extends Iso639_3 {
    final val value: String = "rmt"
  }

  case object TavringerRomani extends Iso639_3 {
    final val value: String = "rmu"
  }

  case object WelshRomani extends Iso639_3 {
    final val value: String = "rmw"
  }

  case object Romam extends Iso639_3 {
    final val value: String = "rmx"
  }

  case object VlaxRomani extends Iso639_3 {
    final val value: String = "rmy"
  }

  case object Marma extends Iso639_3 {
    final val value: String = "rmz"
  }

  case object Ruund extends Iso639_3 {
    final val value: String = "rnd"
  }

  case object Ronga extends Iso639_3 {
    final val value: String = "rng"
  }

  case object Ranglong extends Iso639_3 {
    final val value: String = "rnl"
  }

  case object Roon extends Iso639_3 {
    final val value: String = "rnn"
  }

  case object Rongpo extends Iso639_3 {
    final val value: String = "rnp"
  }

  case object Rungwa extends Iso639_3 {
    final val value: String = "rnw"
  }

  case object Tae extends Iso639_3 {
    final val value: String = "rob"
  }

  case object CacgiaRoglai extends Iso639_3 {
    final val value: String = "roc"
  }

  case object Rogo extends Iso639_3 {
    final val value: String = "rod"
  }

  case object Ronji extends Iso639_3 {
    final val value: String = "roe"
  }

  case object Rombo extends Iso639_3 {
    final val value: String = "rof"
  }

  case object NorthernRoglai extends Iso639_3 {
    final val value: String = "rog"
  }

  case object Romansh extends Iso639_3 {
    final val value: String = "roh"
  }

  case object Romblomanon extends Iso639_3 {
    final val value: String = "rol"
  }

  case object Romany extends Iso639_3 {
    final val value: String = "rom"
  }

  case object Romanian extends Iso639_3 {
    final val value: String = "ron"
  }

  case object Rotokas extends Iso639_3 {
    final val value: String = "roo"
  }

  case object Kriol extends Iso639_3 {
    final val value: String = "rop"
  }

  case object Rongga extends Iso639_3 {
    final val value: String = "ror"
  }

  case object Runga extends Iso639_3 {
    final val value: String = "rou"
  }

  case object DelaOenale extends Iso639_3 {
    final val value: String = "row"
  }

  case object Repanbitip extends Iso639_3 {
    final val value: String = "rpn"
  }

  case object Rapting extends Iso639_3 {
    final val value: String = "rpt"
  }

  case object Ririo extends Iso639_3 {
    final val value: String = "rri"
  }

  case object Waima extends Iso639_3 {
    final val value: String = "rro"
  }

  case object RomanoSerbian extends Iso639_3 {
    final val value: String = "rsb"
  }

  case object RussianSignLanguage extends Iso639_3 {
    final val value: String = "rsl"
  }

  case object MiriwoongSignLanguage extends Iso639_3 {
    final val value: String = "rsm"
  }

  case object RungtuChin extends Iso639_3 {
    final val value: String = "rtc"
  }

  case object Ratahan extends Iso639_3 {
    final val value: String = "rth"
  }

  case object Rotuman extends Iso639_3 {
    final val value: String = "rtm"
  }

  case object Rathawi extends Iso639_3 {
    final val value: String = "rtw"
  }

  case object Gungu extends Iso639_3 {
    final val value: String = "rub"
  }

  case object Ruuli extends Iso639_3 {
    final val value: String = "ruc"
  }

  case object Rusyn extends Iso639_3 {
    final val value: String = "rue"
  }

  case object Luguru extends Iso639_3 {
    final val value: String = "ruf"
  }

  case object Roviana extends Iso639_3 {
    final val value: String = "rug"
  }

  case object Ruga extends Iso639_3 {
    final val value: String = "ruh"
  }

  case object Rufiji extends Iso639_3 {
    final val value: String = "rui"
  }

  case object Che extends Iso639_3 {
    final val value: String = "ruk"
  }

  case object Rundi extends Iso639_3 {
    final val value: String = "run"
  }

  case object IstroRomanian extends Iso639_3 {
    final val value: String = "ruo"
  }

  case object MacedoRomanian extends Iso639_3 {
    final val value: String = "rup"
  }

  case object MeglenoRomanian extends Iso639_3 {
    final val value: String = "ruq"
  }

  case object Russian extends Iso639_3 {
    final val value: String = "rus"
  }

  case object Rutul extends Iso639_3 {
    final val value: String = "rut"
  }

  case object LanasLobu extends Iso639_3 {
    final val value: String = "ruu"
  }

  case object NigerianMala extends Iso639_3 {
    final val value: String = "ruy"
  }

  case object Ruma extends Iso639_3 {
    final val value: String = "ruz"
  }

  case object Rawo extends Iso639_3 {
    final val value: String = "rwa"
  }

  case object Rwa extends Iso639_3 {
    final val value: String = "rwk"
  }

  case object UgandanAmba extends Iso639_3 {
    final val value: String = "rwm"
  }

  case object Rawa extends Iso639_3 {
    final val value: String = "rwo"
  }

  case object IndianMarwari extends Iso639_3 {
    final val value: String = "rwr"
  }

  case object Ngardi extends Iso639_3 {
    final val value: String = "rxd"
  }

  case object NorthernAmamiOshima extends Iso639_3 {
    final val value: String = "ryn"
  }

  case object Yaeyama extends Iso639_3 {
    final val value: String = "rys"
  }

  case object CentralOkinawan extends Iso639_3 {
    final val value: String = "ryu"
  }

  case object Razihi extends Iso639_3 {
    final val value: String = "rzh"
  }

  case object Saba extends Iso639_3 {
    final val value: String = "saa"
  }

  case object Buglere extends Iso639_3 {
    final val value: String = "sab"
  }

  case object Meskwaki extends Iso639_3 {
    final val value: String = "sac"
  }

  case object Sandawe extends Iso639_3 {
    final val value: String = "sad"
  }

  case object Sabane extends Iso639_3 {
    final val value: String = "sae"
  }

  case object Safaliba extends Iso639_3 {
    final val value: String = "saf"
  }

  case object Sango extends Iso639_3 {
    final val value: String = "sag"
  }

  case object Yakut extends Iso639_3 {
    final val value: String = "sah"
  }

  case object Sahu extends Iso639_3 {
    final val value: String = "saj"
  }

  case object Sake extends Iso639_3 {
    final val value: String = "sak"
  }

  case object Sause extends Iso639_3 {
    final val value: String = "sao"
  }

  case object Samburu extends Iso639_3 {
    final val value: String = "saq"
  }

  case object Sasak extends Iso639_3 {
    final val value: String = "sas"
  }

  case object Santali extends Iso639_3 {
    final val value: String = "sat"
  }

  case object Saleman extends Iso639_3 {
    final val value: String = "sau"
  }

  case object SaafiSaafi extends Iso639_3 {
    final val value: String = "sav"
  }

  case object Sawi extends Iso639_3 {
    final val value: String = "saw"
  }

  case object Sa extends Iso639_3 {
    final val value: String = "sax"
  }

  case object Saya extends Iso639_3 {
    final val value: String = "say"
  }

  case object Saurashtra extends Iso639_3 {
    final val value: String = "saz"
  }

  case object Ngambay extends Iso639_3 {
    final val value: String = "sba"
  }

  case object Simbo extends Iso639_3 {
    final val value: String = "sbb"
  }

  case object PapuaNewGuineanKele extends Iso639_3 {
    final val value: String = "sbc"
  }

  case object SouthernSamo extends Iso639_3 {
    final val value: String = "sbd"
  }

  case object Saliba extends Iso639_3 {
    final val value: String = "sbe"
  }

  case object Chabu extends Iso639_3 {
    final val value: String = "sbf"
  }

  case object Seget extends Iso639_3 {
    final val value: String = "sbg"
  }

  case object SoriHarengan extends Iso639_3 {
    final val value: String = "sbh"
  }

  case object Seti extends Iso639_3 {
    final val value: String = "sbi"
  }

  case object Surbakhal extends Iso639_3 {
    final val value: String = "sbj"
  }

  case object Safwa extends Iso639_3 {
    final val value: String = "sbk"
  }

  case object BotolanSambal extends Iso639_3 {
    final val value: String = "sbl"
  }

  case object Sagala extends Iso639_3 {
    final val value: String = "sbm"
  }

  case object SindhiBhil extends Iso639_3 {
    final val value: String = "sbn"
  }

  case object Sabum extends Iso639_3 {
    final val value: String = "sbo"
  }

  case object TanzanianSangu extends Iso639_3 {
    final val value: String = "sbp"
  }

  case object Sileibi extends Iso639_3 {
    final val value: String = "sbq"
  }

  case object SembakungMurut extends Iso639_3 {
    final val value: String = "sbr"
  }

  case object Subiya extends Iso639_3 {
    final val value: String = "sbs"
  }

  case object Kimki extends Iso639_3 {
    final val value: String = "sbt"
  }

  case object StodBhoti extends Iso639_3 {
    final val value: String = "sbu"
  }

  case object Simba extends Iso639_3 {
    final val value: String = "sbw"
  }

  case object Seberuang extends Iso639_3 {
    final val value: String = "sbx"
  }

  case object Soli extends Iso639_3 {
    final val value: String = "sby"
  }

  case object SaraKaba extends Iso639_3 {
    final val value: String = "sbz"
  }

  case object Chut extends Iso639_3 {
    final val value: String = "scb"
  }

  case object Dongxiang extends Iso639_3 {
    final val value: String = "sce"
  }

  case object SanMiguelCreoleFrench extends Iso639_3 {
    final val value: String = "scf"
  }

  case object Sanggau extends Iso639_3 {
    final val value: String = "scg"
  }

  case object Sakachep extends Iso639_3 {
    final val value: String = "sch"
  }

  case object SriLankanCreoleMalay extends Iso639_3 {
    final val value: String = "sci"
  }

  case object Sadri extends Iso639_3 {
    final val value: String = "sck"
  }

  case object Shina extends Iso639_3 {
    final val value: String = "scl"
  }

  case object Sicilian extends Iso639_3 {
    final val value: String = "scn"
  }

  case object Scots extends Iso639_3 {
    final val value: String = "sco"
  }

  case object Hyolmo extends Iso639_3 {
    final val value: String = "scp"
  }

  case object Saoch extends Iso639_3 {
    final val value: String = "scq"
  }

  case object NorthSlavey extends Iso639_3 {
    final val value: String = "scs"
  }

  case object SouthernKatang extends Iso639_3 {
    final val value: String = "sct"
  }

  case object Shumcho extends Iso639_3 {
    final val value: String = "scu"
  }

  case object Sheni extends Iso639_3 {
    final val value: String = "scv"
  }

  case object Sha extends Iso639_3 {
    final val value: String = "scw"
  }

  case object TorajaSadan extends Iso639_3 {
    final val value: String = "sda"
  }

  case object Shabak extends Iso639_3 {
    final val value: String = "sdb"
  }

  case object SassareseSardinian extends Iso639_3 {
    final val value: String = "sdc"
  }

  case object Surubu extends Iso639_3 {
    final val value: String = "sde"
  }

  case object Sarli extends Iso639_3 {
    final val value: String = "sdf"
  }

  case object Savi extends Iso639_3 {
    final val value: String = "sdg"
  }

  case object SouthernKurdish extends Iso639_3 {
    final val value: String = "sdh"
  }

  case object Suundi extends Iso639_3 {
    final val value: String = "sdj"
  }

  case object SosKundi extends Iso639_3 {
    final val value: String = "sdk"
  }

  case object SaudiArabianSignLanguage extends Iso639_3 {
    final val value: String = "sdl"
  }

  case object Semandang extends Iso639_3 {
    final val value: String = "sdm"
  }

  case object GallureseSardinian extends Iso639_3 {
    final val value: String = "sdn"
  }

  case object SadungBidayuh extends Iso639_3 {
    final val value: String = "sdo"
  }

  case object Sherdukpen extends Iso639_3 {
    final val value: String = "sdp"
  }

  case object OraonSadri extends Iso639_3 {
    final val value: String = "sdr"
  }

  case object Sarudu extends Iso639_3 {
    final val value: String = "sdu"
  }

  case object SibuMelanau extends Iso639_3 {
    final val value: String = "sdx"
  }

  case object Sallands extends Iso639_3 {
    final val value: String = "sdz"
  }

  case object Semai extends Iso639_3 {
    final val value: String = "sea"
  }

  case object ShempireSenoufo extends Iso639_3 {
    final val value: String = "seb"
  }

  case object Sechelt extends Iso639_3 {
    final val value: String = "sec"
  }

  case object Sedang extends Iso639_3 {
    final val value: String = "sed"
  }

  case object Seneca extends Iso639_3 {
    final val value: String = "see"
  }

  case object CebaaraSenoufo extends Iso639_3 {
    final val value: String = "sef"
  }

  case object Segeju extends Iso639_3 {
    final val value: String = "seg"
  }

  case object Sena extends Iso639_3 {
    final val value: String = "seh"
  }

  case object Seri extends Iso639_3 {
    final val value: String = "sei"
  }

  case object Sene extends Iso639_3 {
    final val value: String = "sej"
  }

  case object Sekani extends Iso639_3 {
    final val value: String = "sek"
  }

  case object Selkup extends Iso639_3 {
    final val value: String = "sel"
  }

  case object NanerigeSenoufo extends Iso639_3 {
    final val value: String = "sen"
  }

  case object Suarmin extends Iso639_3 {
    final val value: String = "seo"
  }

  case object SaciteSenoufo extends Iso639_3 {
    final val value: String = "sep"
  }

  case object SenaraSenoufo extends Iso639_3 {
    final val value: String = "seq"
  }

  case object Serrano extends Iso639_3 {
    final val value: String = "ser"
  }

  case object SenniSonghai extends Iso639_3 {
    final val value: String = "ses"
  }

  case object Sentani extends Iso639_3 {
    final val value: String = "set"
  }

  case object SeruiLaut extends Iso639_3 {
    final val value: String = "seu"
  }

  case object NyarafoloSenoufo extends Iso639_3 {
    final val value: String = "sev"
  }

  case object SewaBay extends Iso639_3 {
    final val value: String = "sew"
  }

  case object Secoya extends Iso639_3 {
    final val value: String = "sey"
  }

  case object SenthangChin extends Iso639_3 {
    final val value: String = "sez"
  }

  case object LangueDesSignesDeBelgiqueFrancophone extends Iso639_3 {
    final val value: String = "sfb"
  }

  case object EasternSubanen extends Iso639_3 {
    final val value: String = "sfe"
  }

  case object SmallFloweryMiao extends Iso639_3 {
    final val value: String = "sfm"
  }

  case object SouthAfricanSignLanguage extends Iso639_3 {
    final val value: String = "sfs"
  }

  case object Sehwi extends Iso639_3 {
    final val value: String = "sfw"
  }

  case object MagantsiAyta extends Iso639_3 {
    final val value: String = "sgb"
  }

  case object Kipsigis extends Iso639_3 {
    final val value: String = "sgc"
  }

  case object Surigaonon extends Iso639_3 {
    final val value: String = "sgd"
  }

  case object Segai extends Iso639_3 {
    final val value: String = "sge"
  }

  case object SwissGermanSignLanguage extends Iso639_3 {
    final val value: String = "sgg"
  }

  case object Shughni extends Iso639_3 {
    final val value: String = "sgh"
  }

  case object Suga extends Iso639_3 {
    final val value: String = "sgi"
  }

  case object Surgujia extends Iso639_3 {
    final val value: String = "sgj"
  }

  case object Sangkong extends Iso639_3 {
    final val value: String = "sgk"
  }

  case object Singpho extends Iso639_3 {
    final val value: String = "sgp"
  }

  case object Sangisari extends Iso639_3 {
    final val value: String = "sgr"
  }

  case object Samogitian extends Iso639_3 {
    final val value: String = "sgs"
  }

  case object Brokpake extends Iso639_3 {
    final val value: String = "sgt"
  }

  case object Salas extends Iso639_3 {
    final val value: String = "sgu"
  }

  case object BetGurage extends Iso639_3 {
    final val value: String = "sgw"
  }

  case object SierraLeoneSignLanguage extends Iso639_3 {
    final val value: String = "sgx"
  }

  case object Sanglechi extends Iso639_3 {
    final val value: String = "sgy"
  }

  case object Sursurunga extends Iso639_3 {
    final val value: String = "sgz"
  }

  case object ShallZwall extends Iso639_3 {
    final val value: String = "sha"
  }

  case object Ninam extends Iso639_3 {
    final val value: String = "shb"
  }

  case object Sonde extends Iso639_3 {
    final val value: String = "shc"
  }

  case object KundalShahi extends Iso639_3 {
    final val value: String = "shd"
  }

  case object Sheko extends Iso639_3 {
    final val value: String = "she"
  }

  case object Shua extends Iso639_3 {
    final val value: String = "shg"
  }

  case object Shoshoni extends Iso639_3 {
    final val value: String = "shh"
  }

  case object Tachelhit extends Iso639_3 {
    final val value: String = "shi"
  }

  case object Shatt extends Iso639_3 {
    final val value: String = "shj"
  }

  case object Shilluk extends Iso639_3 {
    final val value: String = "shk"
  }

  case object Shendu extends Iso639_3 {
    final val value: String = "shl"
  }

  case object Shahrudi extends Iso639_3 {
    final val value: String = "shm"
  }

  case object Shan extends Iso639_3 {
    final val value: String = "shn"
  }

  case object Shanga extends Iso639_3 {
    final val value: String = "sho"
  }

  case object ShipiboConibo extends Iso639_3 {
    final val value: String = "shp"
  }

  case object Sala extends Iso639_3 {
    final val value: String = "shq"
  }

  case object Shi extends Iso639_3 {
    final val value: String = "shr"
  }

  case object Shuswap extends Iso639_3 {
    final val value: String = "shs"
  }

  case object ChadianArabic extends Iso639_3 {
    final val value: String = "shu"
  }

  case object Shehri extends Iso639_3 {
    final val value: String = "shv"
  }

  case object Shwai extends Iso639_3 {
    final val value: String = "shw"
  }

  case object She extends Iso639_3 {
    final val value: String = "shx"
  }

  case object Tachawit extends Iso639_3 {
    final val value: String = "shy"
  }

  case object SyenaraSenoufo extends Iso639_3 {
    final val value: String = "shz"
  }

  case object Sebop extends Iso639_3 {
    final val value: String = "sib"
  }

  case object Sidamo extends Iso639_3 {
    final val value: String = "sid"
  }

  case object Simaa extends Iso639_3 {
    final val value: String = "sie"
  }

  case object Siamou extends Iso639_3 {
    final val value: String = "sif"
  }

  case object Paasaal extends Iso639_3 {
    final val value: String = "sig"
  }

  case object Zire extends Iso639_3 {
    final val value: String = "sih"
  }

  case object ShomPeng extends Iso639_3 {
    final val value: String = "sii"
  }

  case object Numbami extends Iso639_3 {
    final val value: String = "sij"
  }

  case object Sikiana extends Iso639_3 {
    final val value: String = "sik"
  }

  case object TumulungSisaala extends Iso639_3 {
    final val value: String = "sil"
  }

  case object PapuaNewGuineanMende extends Iso639_3 {
    final val value: String = "sim"
  }

  case object Sinhala extends Iso639_3 {
    final val value: String = "sin"
  }

  case object Sikkimese extends Iso639_3 {
    final val value: String = "sip"
  }

  case object Sonia extends Iso639_3 {
    final val value: String = "siq"
  }

  case object Siri extends Iso639_3 {
    final val value: String = "sir"
  }

  case object Sinagen extends Iso639_3 {
    final val value: String = "siu"
  }

  case object Sumariup extends Iso639_3 {
    final val value: String = "siv"
  }

  case object Siwai extends Iso639_3 {
    final val value: String = "siw"
  }

  case object Sumau extends Iso639_3 {
    final val value: String = "six"
  }

  case object Sivandi extends Iso639_3 {
    final val value: String = "siy"
  }

  case object Siwi extends Iso639_3 {
    final val value: String = "siz"
  }

  case object Epena extends Iso639_3 {
    final val value: String = "sja"
  }

  case object SajauBasap extends Iso639_3 {
    final val value: String = "sjb"
  }

  case object KildinSami extends Iso639_3 {
    final val value: String = "sjd"
  }

  case object PiteSami extends Iso639_3 {
    final val value: String = "sje"
  }

  case object Assangori extends Iso639_3 {
    final val value: String = "sjg"
  }

  case object Sajalong extends Iso639_3 {
    final val value: String = "sjl"
  }

  case object Mapun extends Iso639_3 {
    final val value: String = "sjm"
  }

  case object Xibe extends Iso639_3 {
    final val value: String = "sjo"
  }

  case object Surjapuri extends Iso639_3 {
    final val value: String = "sjp"
  }

  case object SiarLak extends Iso639_3 {
    final val value: String = "sjr"
  }

  case object TerSami extends Iso639_3 {
    final val value: String = "sjt"
  }

  case object UmeSami extends Iso639_3 {
    final val value: String = "sju"
  }

  case object Shawnee extends Iso639_3 {
    final val value: String = "sjw"
  }

  case object Skagit extends Iso639_3 {
    final val value: String = "ska"
  }

  case object Saek extends Iso639_3 {
    final val value: String = "skb"
  }

  case object MaManda extends Iso639_3 {
    final val value: String = "skc"
  }

  case object SouthernSierraMiwok extends Iso639_3 {
    final val value: String = "skd"
  }

  case object VanuatuanSeke extends Iso639_3 {
    final val value: String = "ske"
  }

  case object Sakirabia extends Iso639_3 {
    final val value: String = "skf"
  }

  case object SakalavaMalagasy extends Iso639_3 {
    final val value: String = "skg"
  }

  case object Sikule extends Iso639_3 {
    final val value: String = "skh"
  }

  case object Sika extends Iso639_3 {
    final val value: String = "ski"
  }

  case object NepaliSeke extends Iso639_3 {
    final val value: String = "skj"
  }

  case object Kutong extends Iso639_3 {
    final val value: String = "skm"
  }

  case object KolibuganSubanon extends Iso639_3 {
    final val value: String = "skn"
  }

  case object SekoTengah extends Iso639_3 {
    final val value: String = "sko"
  }

  case object Sekapan extends Iso639_3 {
    final val value: String = "skp"
  }

  case object Sininkere extends Iso639_3 {
    final val value: String = "skq"
  }

  case object Saraiki extends Iso639_3 {
    final val value: String = "skr"
  }

  case object Maia extends Iso639_3 {
    final val value: String = "sks"
  }

  case object Sakata extends Iso639_3 {
    final val value: String = "skt"
  }

  case object Sakao extends Iso639_3 {
    final val value: String = "sku"
  }

  case object Skou extends Iso639_3 {
    final val value: String = "skv"
  }

  case object SekoPadang extends Iso639_3 {
    final val value: String = "skx"
  }

  case object Sikaiana extends Iso639_3 {
    final val value: String = "sky"
  }

  case object Sekar extends Iso639_3 {
    final val value: String = "skz"
  }

  case object Saaliba extends Iso639_3 {
    final val value: String = "slc"
  }

  case object Sissala extends Iso639_3 {
    final val value: String = "sld"
  }

  case object Sholaga extends Iso639_3 {
    final val value: String = "sle"
  }

  case object SwissItalianSignLanguage extends Iso639_3 {
    final val value: String = "slf"
  }

  case object SelungaiMurut extends Iso639_3 {
    final val value: String = "slg"
  }

  case object PugetSoundSalish extends Iso639_3 {
    final val value: String = "slh"
  }

  case object LowerSilesian extends Iso639_3 {
    final val value: String = "sli"
  }

  case object Saluma extends Iso639_3 {
    final val value: String = "slj"
  }

  case object Slovak extends Iso639_3 {
    final val value: String = "slk"
  }

  case object SaltYui extends Iso639_3 {
    final val value: String = "sll"
  }

  case object PangutaranSama extends Iso639_3 {
    final val value: String = "slm"
  }

  case object Lamaholot extends Iso639_3 {
    final val value: String = "slp"
  }

  case object Salar extends Iso639_3 {
    final val value: String = "slr"
  }

  case object SingaporeSignLanguage extends Iso639_3 {
    final val value: String = "sls"
  }

  case object Sila extends Iso639_3 {
    final val value: String = "slt"
  }

  case object Selaru extends Iso639_3 {
    final val value: String = "slu"
  }

  case object Slovenian extends Iso639_3 {
    final val value: String = "slv"
  }

  case object Sialum extends Iso639_3 {
    final val value: String = "slw"
  }

  case object Salampasu extends Iso639_3 {
    final val value: String = "slx"
  }

  case object Selayar extends Iso639_3 {
    final val value: String = "sly"
  }

  case object Maya extends Iso639_3 {
    final val value: String = "slz"
  }

  case object SouthernSami extends Iso639_3 {
    final val value: String = "sma"
  }

  case object Simbari extends Iso639_3 {
    final val value: String = "smb"
  }

  case object Sama extends Iso639_3 {
    final val value: String = "smd"
  }

  case object NorthernSami extends Iso639_3 {
    final val value: String = "sme"
  }

  case object Auwe extends Iso639_3 {
    final val value: String = "smf"
  }

  case object Simbali extends Iso639_3 {
    final val value: String = "smg"
  }

  case object Samei extends Iso639_3 {
    final val value: String = "smh"
  }

  case object LuleSami extends Iso639_3 {
    final val value: String = "smj"
  }

  case object Bolinao extends Iso639_3 {
    final val value: String = "smk"
  }

  case object CentralSama extends Iso639_3 {
    final val value: String = "sml"
  }

  case object Musasa extends Iso639_3 {
    final val value: String = "smm"
  }

  case object InariSami extends Iso639_3 {
    final val value: String = "smn"
  }

  case object Samoan extends Iso639_3 {
    final val value: String = "smo"
  }

  case object Samo extends Iso639_3 {
    final val value: String = "smq"
  }

  case object Simeulue extends Iso639_3 {
    final val value: String = "smr"
  }

  case object SkoltSami extends Iso639_3 {
    final val value: String = "sms"
  }

  case object Simte extends Iso639_3 {
    final val value: String = "smt"
  }

  case object Samvedi extends Iso639_3 {
    final val value: String = "smv"
  }

  case object Sumbawa extends Iso639_3 {
    final val value: String = "smw"
  }

  case object Samba extends Iso639_3 {
    final val value: String = "smx"
  }

  case object Semnani extends Iso639_3 {
    final val value: String = "smy"
  }

  case object Simeku extends Iso639_3 {
    final val value: String = "smz"
  }

  case object Shona extends Iso639_3 {
    final val value: String = "sna"
  }

  case object Sebuyau extends Iso639_3 {
    final val value: String = "snb"
  }

  case object Sinaugoro extends Iso639_3 {
    final val value: String = "snc"
  }

  case object Sindhi extends Iso639_3 {
    final val value: String = "snd"
  }

  case object BauBidayuh extends Iso639_3 {
    final val value: String = "sne"
  }

  case object Noon extends Iso639_3 {
    final val value: String = "snf"
  }

  case object DemocraticRepublicOfCongoeseSanga extends Iso639_3 {
    final val value: String = "sng"
  }

  case object RiverainSango extends Iso639_3 {
    final val value: String = "snj"
  }

  case object Soninke extends Iso639_3 {
    final val value: String = "snk"
  }

  case object Sangil extends Iso639_3 {
    final val value: String = "snl"
  }

  case object SouthernMadi extends Iso639_3 {
    final val value: String = "snm"
  }

  case object Siona extends Iso639_3 {
    final val value: String = "snn"
  }

  case object Snohomish extends Iso639_3 {
    final val value: String = "sno"
  }

  case object Siane extends Iso639_3 {
    final val value: String = "snp"
  }

  case object GabonSangu extends Iso639_3 {
    final val value: String = "snq"
  }

  case object Sihan extends Iso639_3 {
    final val value: String = "snr"
  }

  case object WestBay extends Iso639_3 {
    final val value: String = "sns"
  }

  case object Senggi extends Iso639_3 {
    final val value: String = "snu"
  }

  case object Saban extends Iso639_3 {
    final val value: String = "snv"
  }

  case object Selee extends Iso639_3 {
    final val value: String = "snw"
  }

  case object Sam extends Iso639_3 {
    final val value: String = "snx"
  }

  case object SaniyoHiyewe extends Iso639_3 {
    final val value: String = "sny"
  }

  case object Sinsauru extends Iso639_3 {
    final val value: String = "snz"
  }

  case object ThaiSong extends Iso639_3 {
    final val value: String = "soa"
  }

  case object Sobei extends Iso639_3 {
    final val value: String = "sob"
  }

  case object DemocraticRepublicOfCongoeseSo extends Iso639_3 {
    final val value: String = "soc"
  }

  case object Songoora extends Iso639_3 {
    final val value: String = "sod"
  }

  case object Songomeno extends Iso639_3 {
    final val value: String = "soe"
  }

  case object Aka extends Iso639_3 {
    final val value: String = "soh"
  }

  case object Sonha extends Iso639_3 {
    final val value: String = "soi"
  }

  case object Soi extends Iso639_3 {
    final val value: String = "soj"
  }

  case object Sokoro extends Iso639_3 {
    final val value: String = "sok"
  }

  case object Solos extends Iso639_3 {
    final val value: String = "sol"
  }

  case object Somali extends Iso639_3 {
    final val value: String = "som"
  }

  case object Songo extends Iso639_3 {
    final val value: String = "soo"
  }

  case object Songe extends Iso639_3 {
    final val value: String = "sop"
  }

  case object Kanasi extends Iso639_3 {
    final val value: String = "soq"
  }

  case object Somrai extends Iso639_3 {
    final val value: String = "sor"
  }

  case object Seeku extends Iso639_3 {
    final val value: String = "sos"
  }

  case object SouthernSotho extends Iso639_3 {
    final val value: String = "sot"
  }

  case object SouthernThai extends Iso639_3 {
    final val value: String = "sou"
  }

  case object Sonsorol extends Iso639_3 {
    final val value: String = "sov"
  }

  case object Sowanda extends Iso639_3 {
    final val value: String = "sow"
  }

  case object Swo extends Iso639_3 {
    final val value: String = "sox"
  }

  case object Miyobe extends Iso639_3 {
    final val value: String = "soy"
  }

  case object Temi extends Iso639_3 {
    final val value: String = "soz"
  }

  case object Spanish extends Iso639_3 {
    final val value: String = "spa"
  }

  case object IndonesianSepa extends Iso639_3 {
    final val value: String = "spb"
  }

  case object Sape extends Iso639_3 {
    final val value: String = "spc"
  }

  case object Saep extends Iso639_3 {
    final val value: String = "spd"
  }

  case object PapuaNewGuineanSepa extends Iso639_3 {
    final val value: String = "spe"
  }

  case object Sian extends Iso639_3 {
    final val value: String = "spg"
  }

  case object Saponi extends Iso639_3 {
    final val value: String = "spi"
  }

  case object Sengo extends Iso639_3 {
    final val value: String = "spk"
  }

  case object Selepet extends Iso639_3 {
    final val value: String = "spl"
  }

  case object Akukem extends Iso639_3 {
    final val value: String = "spm"
  }

  case object Sanapana extends Iso639_3 {
    final val value: String = "spn"
  }

  case object Spokane extends Iso639_3 {
    final val value: String = "spo"
  }

  case object SupyireSenoufo extends Iso639_3 {
    final val value: String = "spp"
  }

  case object UcayaliSpanish extends Iso639_3 {
    final val value: String = "spq"
  }

  case object Saparua extends Iso639_3 {
    final val value: String = "spr"
  }

  case object Saposa extends Iso639_3 {
    final val value: String = "sps"
  }

  case object SpitiBhoti extends Iso639_3 {
    final val value: String = "spt"
  }

  case object Sapuan extends Iso639_3 {
    final val value: String = "spu"
  }

  case object Sambalpuri extends Iso639_3 {
    final val value: String = "spv"
  }

  case object Sabaot extends Iso639_3 {
    final val value: String = "spy"
  }

  case object ShamaSambuga extends Iso639_3 {
    final val value: String = "sqa"
  }

  case object Shau extends Iso639_3 {
    final val value: String = "sqh"
  }

  case object Albanian extends Iso639_3 {
    final val value: String = "sqi"
  }

  case object AlbanianSignLanguage extends Iso639_3 {
    final val value: String = "sqk"
  }

  case object Suma extends Iso639_3 {
    final val value: String = "sqm"
  }

  case object Sorkhei extends Iso639_3 {
    final val value: String = "sqo"
  }

  case object Sou extends Iso639_3 {
    final val value: String = "sqq"
  }

  case object SriLankanSignLanguage extends Iso639_3 {
    final val value: String = "sqs"
  }

  case object Soqotri extends Iso639_3 {
    final val value: String = "sqt"
  }

  case object Squamish extends Iso639_3 {
    final val value: String = "squ"
  }

  case object Saruga extends Iso639_3 {
    final val value: String = "sra"
  }

  case object Sora extends Iso639_3 {
    final val value: String = "srb"
  }

  case object LogudoreseSardinian extends Iso639_3 {
    final val value: String = "src"
  }

  case object Sardinian extends Iso639_3 {
    final val value: String = "srd"
  }

  case object Sara extends Iso639_3 {
    final val value: String = "sre"
  }

  case object Nafi extends Iso639_3 {
    final val value: String = "srf"
  }

  case object Sulod extends Iso639_3 {
    final val value: String = "srg"
  }

  case object Sarikoli extends Iso639_3 {
    final val value: String = "srh"
  }

  case object Siriano extends Iso639_3 {
    final val value: String = "sri"
  }

  case object SerudungMurut extends Iso639_3 {
    final val value: String = "srk"
  }

  case object Isirawa extends Iso639_3 {
    final val value: String = "srl"
  }

  case object Saramaccan extends Iso639_3 {
    final val value: String = "srm"
  }

  case object SrananTongo extends Iso639_3 {
    final val value: String = "srn"
  }

  case object CampidaneseSardinian extends Iso639_3 {
    final val value: String = "sro"
  }

  case object Serbian extends Iso639_3 {
    final val value: String = "srp"
  }

  case object Siriono extends Iso639_3 {
    final val value: String = "srq"
  }

  case object Serer extends Iso639_3 {
    final val value: String = "srr"
  }

  case object Sarsi extends Iso639_3 {
    final val value: String = "srs"
  }

  case object Sauri extends Iso639_3 {
    final val value: String = "srt"
  }

  case object Surui extends Iso639_3 {
    final val value: String = "sru"
  }

  case object SouthernSorsoganon extends Iso639_3 {
    final val value: String = "srv"
  }

  case object Serua extends Iso639_3 {
    final val value: String = "srw"
  }

  case object Sirmauri extends Iso639_3 {
    final val value: String = "srx"
  }

  case object Sera extends Iso639_3 {
    final val value: String = "sry"
  }

  case object Shahmirzadi extends Iso639_3 {
    final val value: String = "srz"
  }

  case object SouthernSama extends Iso639_3 {
    final val value: String = "ssb"
  }

  case object SubaSimbiti extends Iso639_3 {
    final val value: String = "ssc"
  }

  case object Siroi extends Iso639_3 {
    final val value: String = "ssd"
  }

  case object Balangingi extends Iso639_3 {
    final val value: String = "sse"
  }

  case object Thao extends Iso639_3 {
    final val value: String = "ssf"
  }

  case object Seimat extends Iso639_3 {
    final val value: String = "ssg"
  }

  case object ShihhiArabic extends Iso639_3 {
    final val value: String = "ssh"
  }

  case object Sansi extends Iso639_3 {
    final val value: String = "ssi"
  }

  case object Sausi extends Iso639_3 {
    final val value: String = "ssj"
  }

  case object Sunam extends Iso639_3 {
    final val value: String = "ssk"
  }

  case object WesternSisaala extends Iso639_3 {
    final val value: String = "ssl"
  }

  case object Semnam extends Iso639_3 {
    final val value: String = "ssm"
  }

  case object Waata extends Iso639_3 {
    final val value: String = "ssn"
  }

  case object Sissano extends Iso639_3 {
    final val value: String = "sso"
  }

  case object SpanishSignLanguage extends Iso639_3 {
    final val value: String = "ssp"
  }

  case object Soa extends Iso639_3 {
    final val value: String = "ssq"
  }

  case object SwissFrenchSignLanguage extends Iso639_3 {
    final val value: String = "ssr"
  }

  case object So extends Iso639_3 {
    final val value: String = "sss"
  }

  case object Sinasina extends Iso639_3 {
    final val value: String = "sst"
  }

  case object Susuami extends Iso639_3 {
    final val value: String = "ssu"
  }

  case object SharkBay extends Iso639_3 {
    final val value: String = "ssv"
  }

  case object Swati extends Iso639_3 {
    final val value: String = "ssw"
  }

  case object Samberigi extends Iso639_3 {
    final val value: String = "ssx"
  }

  case object Saho extends Iso639_3 {
    final val value: String = "ssy"
  }

  case object Sengseng extends Iso639_3 {
    final val value: String = "ssz"
  }

  case object Settla extends Iso639_3 {
    final val value: String = "sta"
  }

  case object NorthernSubanen extends Iso639_3 {
    final val value: String = "stb"
  }

  case object Sentinel extends Iso639_3 {
    final val value: String = "std"
  }

  case object LianaSeti extends Iso639_3 {
    final val value: String = "ste"
  }

  case object Seta extends Iso639_3 {
    final val value: String = "stf"
  }

  case object Trieng extends Iso639_3 {
    final val value: String = "stg"
  }

  case object Shelta extends Iso639_3 {
    final val value: String = "sth"
  }

  case object BuloStieng extends Iso639_3 {
    final val value: String = "sti"
  }

  case object MatyaSamo extends Iso639_3 {
    final val value: String = "stj"
  }

  case object Arammba extends Iso639_3 {
    final val value: String = "stk"
  }

  case object Stellingwerfs extends Iso639_3 {
    final val value: String = "stl"
  }

  case object Setaman extends Iso639_3 {
    final val value: String = "stm"
  }

  case object Owa extends Iso639_3 {
    final val value: String = "stn"
  }

  case object Stoney extends Iso639_3 {
    final val value: String = "sto"
  }

  case object SoutheasternTepehuan extends Iso639_3 {
    final val value: String = "stp"
  }

  case object Saterfriesisch extends Iso639_3 {
    final val value: String = "stq"
  }

  case object StraitsSalish extends Iso639_3 {
    final val value: String = "str"
  }

  case object Shumashti extends Iso639_3 {
    final val value: String = "sts"
  }

  case object BudehStieng extends Iso639_3 {
    final val value: String = "stt"
  }

  case object Samtao extends Iso639_3 {
    final val value: String = "stu"
  }

  case object Silte extends Iso639_3 {
    final val value: String = "stv"
  }

  case object Satawalese extends Iso639_3 {
    final val value: String = "stw"
  }

  case object SiberianTatar extends Iso639_3 {
    final val value: String = "sty"
  }

  case object Sulka extends Iso639_3 {
    final val value: String = "sua"
  }

  case object Suku extends Iso639_3 {
    final val value: String = "sub"
  }

  case object WesternSubanon extends Iso639_3 {
    final val value: String = "suc"
  }

  case object Suena extends Iso639_3 {
    final val value: String = "sue"
  }

  case object Suganga extends Iso639_3 {
    final val value: String = "sug"
  }

  case object Suki extends Iso639_3 {
    final val value: String = "sui"
  }

  case object Shubi extends Iso639_3 {
    final val value: String = "suj"
  }

  case object Sukuma extends Iso639_3 {
    final val value: String = "suk"
  }

  case object Sundanese extends Iso639_3 {
    final val value: String = "sun"
  }

  case object Suri extends Iso639_3 {
    final val value: String = "suq"
  }

  case object Mwaghavul extends Iso639_3 {
    final val value: String = "sur"
  }

  case object Susu extends Iso639_3 {
    final val value: String = "sus"
  }

  case object Puroik extends Iso639_3 {
    final val value: String = "suv"
  }

  case object Sumbwa extends Iso639_3 {
    final val value: String = "suw"
  }

  case object Suya extends Iso639_3 {
    final val value: String = "suy"
  }

  case object Sunwar extends Iso639_3 {
    final val value: String = "suz"
  }

  case object Svan extends Iso639_3 {
    final val value: String = "sva"
  }

  case object UlauSuain extends Iso639_3 {
    final val value: String = "svb"
  }

  case object VincentianCreoleEnglish extends Iso639_3 {
    final val value: String = "svc"
  }

  case object Serili extends Iso639_3 {
    final val value: String = "sve"
  }

  case object SlovakianSignLanguage extends Iso639_3 {
    final val value: String = "svk"
  }

  case object Slavomolisano extends Iso639_3 {
    final val value: String = "svm"
  }

  case object Savosavo extends Iso639_3 {
    final val value: String = "svs"
  }

  case object MacrolanguageSwahili extends Iso639_3 {
    final val value: String = "swa"
  }

  case object MaoreComorian extends Iso639_3 {
    final val value: String = "swb"
  }

  case object CongoSwahili extends Iso639_3 {
    final val value: String = "swc"
  }

  case object Swedish extends Iso639_3 {
    final val value: String = "swe"
  }

  case object Sere extends Iso639_3 {
    final val value: String = "swf"
  }

  case object Swabian extends Iso639_3 {
    final val value: String = "swg"
  }

  case object Swahili extends Iso639_3 {
    final val value: String = "swh"
  }

  case object Sui extends Iso639_3 {
    final val value: String = "swi"
  }

  case object Sira extends Iso639_3 {
    final val value: String = "swj"
  }

  case object MalawiSena extends Iso639_3 {
    final val value: String = "swk"
  }

  case object SwedishSignLanguage extends Iso639_3 {
    final val value: String = "swl"
  }

  case object Samosa extends Iso639_3 {
    final val value: String = "swm"
  }

  case object Sawknah extends Iso639_3 {
    final val value: String = "swn"
  }

  case object Shanenawa extends Iso639_3 {
    final val value: String = "swo"
  }

  case object Suau extends Iso639_3 {
    final val value: String = "swp"
  }

  case object Sharwa extends Iso639_3 {
    final val value: String = "swq"
  }

  case object Saweru extends Iso639_3 {
    final val value: String = "swr"
  }

  case object Seluwasan extends Iso639_3 {
    final val value: String = "sws"
  }

  case object Sawila extends Iso639_3 {
    final val value: String = "swt"
  }

  case object Suwawa extends Iso639_3 {
    final val value: String = "swu"
  }

  case object Shekhawati extends Iso639_3 {
    final val value: String = "swv"
  }

  case object Suruaha extends Iso639_3 {
    final val value: String = "swx"
  }

  case object Sarua extends Iso639_3 {
    final val value: String = "swy"
  }

  case object Suba extends Iso639_3 {
    final val value: String = "sxb"
  }

  case object Sighu extends Iso639_3 {
    final val value: String = "sxe"
  }

  case object Shuhi extends Iso639_3 {
    final val value: String = "sxg"
  }

  case object Samre extends Iso639_3 {
    final val value: String = "sxm"
  }

  case object Sangir extends Iso639_3 {
    final val value: String = "sxn"
  }

  case object Saaroa extends Iso639_3 {
    final val value: String = "sxr"
  }

  case object Sasaru extends Iso639_3 {
    final val value: String = "sxs"
  }

  case object UpperSaxon extends Iso639_3 {
    final val value: String = "sxu"
  }

  case object SaxweGbe extends Iso639_3 {
    final val value: String = "sxw"
  }

  case object Siang extends Iso639_3 {
    final val value: String = "sya"
  }

  case object CentralSubanen extends Iso639_3 {
    final val value: String = "syb"
  }

  case object Seki extends Iso639_3 {
    final val value: String = "syi"
  }

  case object Sukur extends Iso639_3 {
    final val value: String = "syk"
  }

  case object Sylheti extends Iso639_3 {
    final val value: String = "syl"
  }

  case object MayaSamo extends Iso639_3 {
    final val value: String = "sym"
  }

  case object Senaya extends Iso639_3 {
    final val value: String = "syn"
  }

  case object Suoy extends Iso639_3 {
    final val value: String = "syo"
  }

  case object Syriac extends Iso639_3 {
    final val value: String = "syr"
  }

  case object Sinyar extends Iso639_3 {
    final val value: String = "sys"
  }

  case object Kagate extends Iso639_3 {
    final val value: String = "syw"
  }

  case object Samay extends Iso639_3 {
    final val value: String = "syx"
  }

  case object SayyidBedouinSignLanguage extends Iso639_3 {
    final val value: String = "syy"
  }

  case object Semelai extends Iso639_3 {
    final val value: String = "sza"
  }

  case object Ngalum extends Iso639_3 {
    final val value: String = "szb"
  }

  case object SemaqBeri extends Iso639_3 {
    final val value: String = "szc"
  }

  case object Seze extends Iso639_3 {
    final val value: String = "sze"
  }

  case object Sengele extends Iso639_3 {
    final val value: String = "szg"
  }

  case object Silesian extends Iso639_3 {
    final val value: String = "szl"
  }

  case object Sula extends Iso639_3 {
    final val value: String = "szn"
  }

  case object Suabo extends Iso639_3 {
    final val value: String = "szp"
  }

  case object SolomonIslandsSignLanguage extends Iso639_3 {
    final val value: String = "szs"
  }

  case object FakoIsu extends Iso639_3 {
    final val value: String = "szv"
  }

  case object Sawai extends Iso639_3 {
    final val value: String = "szw"
  }

  case object LowerTanana extends Iso639_3 {
    final val value: String = "taa"
  }

  case object Tabassaran extends Iso639_3 {
    final val value: String = "tab"
  }

  case object LowlandTarahumara extends Iso639_3 {
    final val value: String = "tac"
  }

  case object Tause extends Iso639_3 {
    final val value: String = "tad"
  }

  case object Tariana extends Iso639_3 {
    final val value: String = "tae"
  }

  case object Tapirape extends Iso639_3 {
    final val value: String = "taf"
  }

  case object Tagoi extends Iso639_3 {
    final val value: String = "tag"
  }

  case object Tahitian extends Iso639_3 {
    final val value: String = "tah"
  }

  case object EasternTamang extends Iso639_3 {
    final val value: String = "taj"
  }

  case object Tala extends Iso639_3 {
    final val value: String = "tak"
  }

  case object Tal extends Iso639_3 {
    final val value: String = "tal"
  }

  case object Tamil extends Iso639_3 {
    final val value: String = "tam"
  }

  case object Tangale extends Iso639_3 {
    final val value: String = "tan"
  }

  case object Yami extends Iso639_3 {
    final val value: String = "tao"
  }

  case object Taabwa extends Iso639_3 {
    final val value: String = "tap"
  }

  case object Tamasheq extends Iso639_3 {
    final val value: String = "taq"
  }

  case object CentralTarahumara extends Iso639_3 {
    final val value: String = "tar"
  }

  case object Tatar extends Iso639_3 {
    final val value: String = "tat"
  }

  case object UpperTanana extends Iso639_3 {
    final val value: String = "tau"
  }

  case object Tatuyo extends Iso639_3 {
    final val value: String = "tav"
  }

  case object Tai extends Iso639_3 {
    final val value: String = "taw"
  }

  case object Tamki extends Iso639_3 {
    final val value: String = "tax"
  }

  case object Atayal extends Iso639_3 {
    final val value: String = "tay"
  }

  case object Tocho extends Iso639_3 {
    final val value: String = "taz"
  }

  case object Aikana extends Iso639_3 {
    final val value: String = "tba"
  }

  case object Takia extends Iso639_3 {
    final val value: String = "tbc"
  }

  case object KakiAe extends Iso639_3 {
    final val value: String = "tbd"
  }

  case object Tanimbili extends Iso639_3 {
    final val value: String = "tbe"
  }

  case object Mandara extends Iso639_3 {
    final val value: String = "tbf"
  }

  case object NorthTairora extends Iso639_3 {
    final val value: String = "tbg"
  }

  case object Gaam extends Iso639_3 {
    final val value: String = "tbi"
  }

  case object Tiang extends Iso639_3 {
    final val value: String = "tbj"
  }

  case object CalamianTagbanwa extends Iso639_3 {
    final val value: String = "tbk"
  }

  case object Tboli extends Iso639_3 {
    final val value: String = "tbl"
  }

  case object Tagbu extends Iso639_3 {
    final val value: String = "tbm"
  }

  case object NegroTunebo extends Iso639_3 {
    final val value: String = "tbn"
  }

  case object Tawala extends Iso639_3 {
    final val value: String = "tbo"
  }

  case object Taworta extends Iso639_3 {
    final val value: String = "tbp"
  }

  case object Tumtum extends Iso639_3 {
    final val value: String = "tbr"
  }

  case object Tanguat extends Iso639_3 {
    final val value: String = "tbs"
  }

  case object Tembo extends Iso639_3 {
    final val value: String = "tbt"
  }

  case object Tobo extends Iso639_3 {
    final val value: String = "tbv"
  }

  case object Tagbanwa extends Iso639_3 {
    final val value: String = "tbw"
  }

  case object Kapin extends Iso639_3 {
    final val value: String = "tbx"
  }

  case object Tabaru extends Iso639_3 {
    final val value: String = "tby"
  }

  case object Ditammari extends Iso639_3 {
    final val value: String = "tbz"
  }

  case object Ticuna extends Iso639_3 {
    final val value: String = "tca"
  }

  case object Tanacross extends Iso639_3 {
    final val value: String = "tcb"
  }

  case object Datooga extends Iso639_3 {
    final val value: String = "tcc"
  }

  case object Tafi extends Iso639_3 {
    final val value: String = "tcd"
  }

  case object SouthernTutchone extends Iso639_3 {
    final val value: String = "tce"
  }

  case object MalinaltepecMephaa extends Iso639_3 {
    final val value: String = "tcf"
  }

  case object Tamagario extends Iso639_3 {
    final val value: String = "tcg"
  }

  case object TurksAndCaicosCreoleEnglish extends Iso639_3 {
    final val value: String = "tch"
  }

  case object Waara extends Iso639_3 {
    final val value: String = "tci"
  }

  case object Tchitchege extends Iso639_3 {
    final val value: String = "tck"
  }

  case object Tanahmerah extends Iso639_3 {
    final val value: String = "tcm"
  }

  case object Tichurong extends Iso639_3 {
    final val value: String = "tcn"
  }

  case object Taungyo extends Iso639_3 {
    final val value: String = "tco"
  }

  case object TawrChin extends Iso639_3 {
    final val value: String = "tcp"
  }

  case object Kaiy extends Iso639_3 {
    final val value: String = "tcq"
  }

  case object StraitCreole extends Iso639_3 {
    final val value: String = "tcs"
  }

  case object Ten extends Iso639_3 {
    final val value: String = "tct"
  }

  case object SoutheasternTarahumara extends Iso639_3 {
    final val value: String = "tcu"
  }

  case object TecpatlanTotonac extends Iso639_3 {
    final val value: String = "tcw"
  }

  case object Toda extends Iso639_3 {
    final val value: String = "tcx"
  }

  case object Tulu extends Iso639_3 {
    final val value: String = "tcy"
  }

  case object ThadoChin extends Iso639_3 {
    final val value: String = "tcz"
  }

  case object Tagdal extends Iso639_3 {
    final val value: String = "tda"
  }

  case object Panchpargania extends Iso639_3 {
    final val value: String = "tdb"
  }

  case object EmberaTado extends Iso639_3 {
    final val value: String = "tdc"
  }

  case object TaiNua extends Iso639_3 {
    final val value: String = "tdd"
  }

  case object DigaDogon extends Iso639_3 {
    final val value: String = "tde"
  }

  case object Talieng extends Iso639_3 {
    final val value: String = "tdf"
  }

  case object WesternTamang extends Iso639_3 {
    final val value: String = "tdg"
  }

  case object Thulung extends Iso639_3 {
    final val value: String = "tdh"
  }

  case object Tomadino extends Iso639_3 {
    final val value: String = "tdi"
  }

  case object Tajio extends Iso639_3 {
    final val value: String = "tdj"
  }

  case object Tambas extends Iso639_3 {
    final val value: String = "tdk"
  }

  case object Sur extends Iso639_3 {
    final val value: String = "tdl"
  }

  case object Taruma extends Iso639_3 {
    final val value: String = "tdm"
  }

  case object Tondano extends Iso639_3 {
    final val value: String = "tdn"
  }

  case object Teme extends Iso639_3 {
    final val value: String = "tdo"
  }

  case object Tita extends Iso639_3 {
    final val value: String = "tdq"
  }

  case object Todrah extends Iso639_3 {
    final val value: String = "tdr"
  }

  case object Doutai extends Iso639_3 {
    final val value: String = "tds"
  }

  case object TetunDili extends Iso639_3 {
    final val value: String = "tdt"
  }

  case object Toro extends Iso639_3 {
    final val value: String = "tdv"
  }

  case object MahafalyMalagasy extends Iso639_3 {
    final val value: String = "tdx"
  }

  case object Tadyawan extends Iso639_3 {
    final val value: String = "tdy"
  }

  case object Temiar extends Iso639_3 {
    final val value: String = "tea"
  }

  case object Terik extends Iso639_3 {
    final val value: String = "tec"
  }

  case object TepoKrumen extends Iso639_3 {
    final val value: String = "ted"
  }

  case object HuehuetlaTepehua extends Iso639_3 {
    final val value: String = "tee"
  }

  case object Teressa extends Iso639_3 {
    final val value: String = "tef"
  }

  case object TekeTege extends Iso639_3 {
    final val value: String = "teg"
  }

  case object Tehuelche extends Iso639_3 {
    final val value: String = "teh"
  }

  case object Torricelli extends Iso639_3 {
    final val value: String = "tei"
  }

  case object IbaliTeke extends Iso639_3 {
    final val value: String = "tek"
  }

  case object Telugu extends Iso639_3 {
    final val value: String = "tel"
  }

  case object Timne extends Iso639_3 {
    final val value: String = "tem"
  }

  case object Teso extends Iso639_3 {
    final val value: String = "teo"
  }

  case object Temein extends Iso639_3 {
    final val value: String = "teq"
  }

  case object Tereno extends Iso639_3 {
    final val value: String = "ter"
  }

  case object Tengger extends Iso639_3 {
    final val value: String = "tes"
  }

  case object Tetum extends Iso639_3 {
    final val value: String = "tet"
  }

  case object Soo extends Iso639_3 {
    final val value: String = "teu"
  }

  case object Teor extends Iso639_3 {
    final val value: String = "tev"
  }

  case object AmericanTewa extends Iso639_3 {
    final val value: String = "tew"
  }

  case object Tennet extends Iso639_3 {
    final val value: String = "tex"
  }

  case object Tulishi extends Iso639_3 {
    final val value: String = "tey"
  }

  case object Tetserret extends Iso639_3 {
    final val value: String = "tez"
  }

  case object TofinGbe extends Iso639_3 {
    final val value: String = "tfi"
  }

  case object Tanaina extends Iso639_3 {
    final val value: String = "tfn"
  }

  case object Tefaro extends Iso639_3 {
    final val value: String = "tfo"
  }

  case object Teribe extends Iso639_3 {
    final val value: String = "tfr"
  }

  case object Ternate extends Iso639_3 {
    final val value: String = "tft"
  }

  case object Sagalla extends Iso639_3 {
    final val value: String = "tga"
  }

  case object Tobilung extends Iso639_3 {
    final val value: String = "tgb"
  }

  case object Tigak extends Iso639_3 {
    final val value: String = "tgc"
  }

  case object Ciwogai extends Iso639_3 {
    final val value: String = "tgd"
  }

  case object GorkhaTamang extends Iso639_3 {
    final val value: String = "tge"
  }

  case object Chalikha extends Iso639_3 {
    final val value: String = "tgf"
  }

  case object TobagonianCreoleEnglish extends Iso639_3 {
    final val value: String = "tgh"
  }

  case object Lawunuia extends Iso639_3 {
    final val value: String = "tgi"
  }

  case object Tagin extends Iso639_3 {
    final val value: String = "tgj"
  }

  case object Tajik extends Iso639_3 {
    final val value: String = "tgk"
  }

  case object Tagalog extends Iso639_3 {
    final val value: String = "tgl"
  }

  case object Tandaganon extends Iso639_3 {
    final val value: String = "tgn"
  }

  case object Sudest extends Iso639_3 {
    final val value: String = "tgo"
  }

  case object Tangoa extends Iso639_3 {
    final val value: String = "tgp"
  }

  case object Tring extends Iso639_3 {
    final val value: String = "tgq"
  }

  case object Tareng extends Iso639_3 {
    final val value: String = "tgr"
  }

  case object Nume extends Iso639_3 {
    final val value: String = "tgs"
  }

  case object CentralTagbanwa extends Iso639_3 {
    final val value: String = "tgt"
  }

  case object Tanggu extends Iso639_3 {
    final val value: String = "tgu"
  }

  case object TagwanaSenoufo extends Iso639_3 {
    final val value: String = "tgw"
  }

  case object Tagish extends Iso639_3 {
    final val value: String = "tgx"
  }

  case object Thai extends Iso639_3 {
    final val value: String = "tha"
  }

  case object Thayore extends Iso639_3 {
    final val value: String = "thd"
  }

  case object ChitwaniaTharu extends Iso639_3 {
    final val value: String = "the"
  }

  case object Thangmi extends Iso639_3 {
    final val value: String = "thf"
  }

  case object NorthernTarahumara extends Iso639_3 {
    final val value: String = "thh"
  }

  case object TaiLong extends Iso639_3 {
    final val value: String = "thi"
  }

  case object Tharaka extends Iso639_3 {
    final val value: String = "thk"
  }

  case object DangauraTharu extends Iso639_3 {
    final val value: String = "thl"
  }

  case object Aheu extends Iso639_3 {
    final val value: String = "thm"
  }

  case object Thachanadan extends Iso639_3 {
    final val value: String = "thn"
  }

  case object Thompson extends Iso639_3 {
    final val value: String = "thp"
  }

  case object KochilaTharu extends Iso639_3 {
    final val value: String = "thq"
  }

  case object RanaTharu extends Iso639_3 {
    final val value: String = "thr"
  }

  case object Thakali extends Iso639_3 {
    final val value: String = "ths"
  }

  case object Tahltan extends Iso639_3 {
    final val value: String = "tht"
  }

  case object Thuri extends Iso639_3 {
    final val value: String = "thu"
  }

  case object TahaggartTamahaq extends Iso639_3 {
    final val value: String = "thv"
  }

  case object Thudam extends Iso639_3 {
    final val value: String = "thw"
  }

  case object Tha extends Iso639_3 {
    final val value: String = "thy"
  }

  case object TayartTamajeq extends Iso639_3 {
    final val value: String = "thz"
  }

  case object TidikeltTamazight extends Iso639_3 {
    final val value: String = "tia"
  }

  case object Tira extends Iso639_3 {
    final val value: String = "tic"
  }

  case object Tifal extends Iso639_3 {
    final val value: String = "tif"
  }

  case object Tigre extends Iso639_3 {
    final val value: String = "tig"
  }

  case object TimugonMurut extends Iso639_3 {
    final val value: String = "tih"
  }

  case object Tiene extends Iso639_3 {
    final val value: String = "tii"
  }

  case object Tilung extends Iso639_3 {
    final val value: String = "tij"
  }

  case object Tikar extends Iso639_3 {
    final val value: String = "tik"
  }

  case object Timbe extends Iso639_3 {
    final val value: String = "tim"
  }

  case object Tindi extends Iso639_3 {
    final val value: String = "tin"
  }

  case object Teop extends Iso639_3 {
    final val value: String = "tio"
  }

  case object Trimuris extends Iso639_3 {
    final val value: String = "tip"
  }

  case object Tiefo extends Iso639_3 {
    final val value: String = "tiq"
  }

  case object Tigrinya extends Iso639_3 {
    final val value: String = "tir"
  }

  case object MasadiitItneg extends Iso639_3 {
    final val value: String = "tis"
  }

  case object Tinigua extends Iso639_3 {
    final val value: String = "tit"
  }

  case object Adasen extends Iso639_3 {
    final val value: String = "tiu"
  }

  case object Tiv extends Iso639_3 {
    final val value: String = "tiv"
  }

  case object Tiwi extends Iso639_3 {
    final val value: String = "tiw"
  }

  case object SouthernTiwa extends Iso639_3 {
    final val value: String = "tix"
  }

  case object Tiruray extends Iso639_3 {
    final val value: String = "tiy"
  }

  case object TaiHongjin extends Iso639_3 {
    final val value: String = "tiz"
  }

  case object Tajuasohn extends Iso639_3 {
    final val value: String = "tja"
  }

  case object Tunjung extends Iso639_3 {
    final val value: String = "tjg"
  }

  case object NorthernTujia extends Iso639_3 {
    final val value: String = "tji"
  }

  case object TaiLaing extends Iso639_3 {
    final val value: String = "tjl"
  }

  case object TemacineTamazight extends Iso639_3 {
    final val value: String = "tjo"
  }

  case object SouthernTujia extends Iso639_3 {
    final val value: String = "tjs"
  }

  case object Djabwurrung extends Iso639_3 {
    final val value: String = "tjw"
  }

  case object Buksa extends Iso639_3 {
    final val value: String = "tkb"
  }

  case object Tukudede extends Iso639_3 {
    final val value: String = "tkd"
  }

  case object Takwane extends Iso639_3 {
    final val value: String = "tke"
  }

  case object TesakaMalagasy extends Iso639_3 {
    final val value: String = "tkg"
  }

  case object Tokelau extends Iso639_3 {
    final val value: String = "tkl"
  }

  case object TokuNoShima extends Iso639_3 {
    final val value: String = "tkn"
  }

  case object Tikopia extends Iso639_3 {
    final val value: String = "tkp"
  }

  case object Tee extends Iso639_3 {
    final val value: String = "tkq"
  }

  case object Tsakhur extends Iso639_3 {
    final val value: String = "tkr"
  }

  case object Takestani extends Iso639_3 {
    final val value: String = "tks"
  }

  case object KathoriyaTharu extends Iso639_3 {
    final val value: String = "tkt"
  }

  case object NecaxaTotonac extends Iso639_3 {
    final val value: String = "tku"
  }

  case object MurPano extends Iso639_3 {
    final val value: String = "tkv"
  }

  case object Teanu extends Iso639_3 {
    final val value: String = "tkw"
  }

  case object Tangko extends Iso639_3 {
    final val value: String = "tkx"
  }

  case object Takua extends Iso639_3 {
    final val value: String = "tkz"
  }

  case object SouthwesternTepehuan extends Iso639_3 {
    final val value: String = "tla"
  }

  case object Tobelo extends Iso639_3 {
    final val value: String = "tlb"
  }

  case object YecuatlaTotonac extends Iso639_3 {
    final val value: String = "tlc"
  }

  case object Talaud extends Iso639_3 {
    final val value: String = "tld"
  }

  case object Telefol extends Iso639_3 {
    final val value: String = "tlf"
  }

  case object Tofanma extends Iso639_3 {
    final val value: String = "tlg"
  }

  case object Tlingit extends Iso639_3 {
    final val value: String = "tli"
  }

  case object TalingaBwisi extends Iso639_3 {
    final val value: String = "tlj"
  }

  case object Taloki extends Iso639_3 {
    final val value: String = "tlk"
  }

  case object Tetela extends Iso639_3 {
    final val value: String = "tll"
  }

  case object Tolomako extends Iso639_3 {
    final val value: String = "tlm"
  }

  case object Talondo extends Iso639_3 {
    final val value: String = "tln"
  }

  case object Talodi extends Iso639_3 {
    final val value: String = "tlo"
  }

  case object FilomenaMataCoahuitlanTotonac extends Iso639_3 {
    final val value: String = "tlp"
  }

  case object TaiLoi extends Iso639_3 {
    final val value: String = "tlq"
  }

  case object Talise extends Iso639_3 {
    final val value: String = "tlr"
  }

  case object Tambotalo extends Iso639_3 {
    final val value: String = "tls"
  }

  case object SouNama extends Iso639_3 {
    final val value: String = "tlt"
  }

  case object Tulehu extends Iso639_3 {
    final val value: String = "tlu"
  }

  case object Taliabu extends Iso639_3 {
    final val value: String = "tlv"
  }

  case object Khehek extends Iso639_3 {
    final val value: String = "tlx"
  }

  case object Talysh extends Iso639_3 {
    final val value: String = "tly"
  }

  case object ChadTama extends Iso639_3 {
    final val value: String = "tma"
  }

  case object Katbol extends Iso639_3 {
    final val value: String = "tmb"
  }

  case object Tumak extends Iso639_3 {
    final val value: String = "tmc"
  }

  case object Haruai extends Iso639_3 {
    final val value: String = "tmd"
  }

  case object TobaMaskoy extends Iso639_3 {
    final val value: String = "tmf"
  }

  case object Tamashek extends Iso639_3 {
    final val value: String = "tmh"
  }

  case object Tutuba extends Iso639_3 {
    final val value: String = "tmi"
  }

  case object Samarokena extends Iso639_3 {
    final val value: String = "tmj"
  }

  case object NorthwesternTamang extends Iso639_3 {
    final val value: String = "tmk"
  }

  case object TamnimCitak extends Iso639_3 {
    final val value: String = "tml"
  }

  case object TaiThanh extends Iso639_3 {
    final val value: String = "tmm"
  }

  case object IndonesianTaman extends Iso639_3 {
    final val value: String = "tmn"
  }

  case object Temoq extends Iso639_3 {
    final val value: String = "tmo"
  }

  case object Tumleo extends Iso639_3 {
    final val value: String = "tmq"
  }

  case object Tima extends Iso639_3 {
    final val value: String = "tms"
  }

  case object Tasmate extends Iso639_3 {
    final val value: String = "tmt"
  }

  case object Iau extends Iso639_3 {
    final val value: String = "tmu"
  }

  case object Motembo extends Iso639_3 {
    final val value: String = "tmv"
  }

  case object Temuan extends Iso639_3 {
    final val value: String = "tmw"
  }

  case object Tami extends Iso639_3 {
    final val value: String = "tmy"
  }

  case object Tacana extends Iso639_3 {
    final val value: String = "tna"
  }

  case object WesternTunebo extends Iso639_3 {
    final val value: String = "tnb"
  }

  case object TanimucaRetuara extends Iso639_3 {
    final val value: String = "tnc"
  }

  case object AngosturasTunebo extends Iso639_3 {
    final val value: String = "tnd"
  }

  case object Tobanga extends Iso639_3 {
    final val value: String = "tng"
  }

  case object Maiani extends Iso639_3 {
    final val value: String = "tnh"
  }

  case object Tandia extends Iso639_3 {
    final val value: String = "tni"
  }

  case object Kwamera extends Iso639_3 {
    final val value: String = "tnk"
  }

  case object Lenakel extends Iso639_3 {
    final val value: String = "tnl"
  }

  case object Tabla extends Iso639_3 {
    final val value: String = "tnm"
  }

  case object NorthTanna extends Iso639_3 {
    final val value: String = "tnn"
  }

  case object Toromono extends Iso639_3 {
    final val value: String = "tno"
  }

  case object Whitesands extends Iso639_3 {
    final val value: String = "tnp"
  }

  case object Menik extends Iso639_3 {
    final val value: String = "tnr"
  }

  case object Tenis extends Iso639_3 {
    final val value: String = "tns"
  }

  case object Tontemboan extends Iso639_3 {
    final val value: String = "tnt"
  }

  case object TayKhang extends Iso639_3 {
    final val value: String = "tnu"
  }

  case object Tangchangya extends Iso639_3 {
    final val value: String = "tnv"
  }

  case object Tonsawang extends Iso639_3 {
    final val value: String = "tnw"
  }

  case object Tanema extends Iso639_3 {
    final val value: String = "tnx"
  }

  case object Tongwe extends Iso639_3 {
    final val value: String = "tny"
  }

  case object Tenedn extends Iso639_3 {
    final val value: String = "tnz"
  }

  case object Toba extends Iso639_3 {
    final val value: String = "tob"
  }

  case object CoyutlaTotonac extends Iso639_3 {
    final val value: String = "toc"
  }

  case object Toma extends Iso639_3 {
    final val value: String = "tod"
  }

  case object Gizrra extends Iso639_3 {
    final val value: String = "tof"
  }

  case object NyasaTonga extends Iso639_3 {
    final val value: String = "tog"
  }

  case object Gitonga extends Iso639_3 {
    final val value: String = "toh"
  }

  case object ZambianTonga extends Iso639_3 {
    final val value: String = "toi"
  }

  case object Tojolabal extends Iso639_3 {
    final val value: String = "toj"
  }

  case object Tolowa extends Iso639_3 {
    final val value: String = "tol"
  }

  case object Tombulu extends Iso639_3 {
    final val value: String = "tom"
  }

  case object TongaIslandsTonga extends Iso639_3 {
    final val value: String = "ton"
  }

  case object DeJuarezTotonac extends Iso639_3 {
    final val value: String = "too"
  }

  case object PapantlaTotonac extends Iso639_3 {
    final val value: String = "top"
  }

  case object Toposa extends Iso639_3 {
    final val value: String = "toq"
  }

  case object VaraBanda extends Iso639_3 {
    final val value: String = "tor"
  }

  case object HighlandTotonac extends Iso639_3 {
    final val value: String = "tos"
  }

  case object Tho extends Iso639_3 {
    final val value: String = "tou"
  }

  case object UpperTaromi extends Iso639_3 {
    final val value: String = "tov"
  }

  case object Jemez extends Iso639_3 {
    final val value: String = "tow"
  }

  case object Tobian extends Iso639_3 {
    final val value: String = "tox"
  }

  case object Topoiyo extends Iso639_3 {
    final val value: String = "toy"
  }

  case object To extends Iso639_3 {
    final val value: String = "toz"
  }

  case object Taupota extends Iso639_3 {
    final val value: String = "tpa"
  }

  case object AzoyuMephaa extends Iso639_3 {
    final val value: String = "tpc"
  }

  case object Tippera extends Iso639_3 {
    final val value: String = "tpe"
  }

  case object Tarpia extends Iso639_3 {
    final val value: String = "tpf"
  }

  case object Kula extends Iso639_3 {
    final val value: String = "tpg"
  }

  case object TokPisin extends Iso639_3 {
    final val value: String = "tpi"
  }

  case object Tapiete extends Iso639_3 {
    final val value: String = "tpj"
  }

  case object TlacoapaMephaa extends Iso639_3 {
    final val value: String = "tpl"
  }

  case object Tampulma extends Iso639_3 {
    final val value: String = "tpm"
  }

  case object TaiPao extends Iso639_3 {
    final val value: String = "tpo"
  }

  case object PisafloresTepehua extends Iso639_3 {
    final val value: String = "tpp"
  }

  case object Tukpa extends Iso639_3 {
    final val value: String = "tpq"
  }

  case object Tupari extends Iso639_3 {
    final val value: String = "tpr"
  }

  case object TlachichilcoTepehua extends Iso639_3 {
    final val value: String = "tpt"
  }

  case object Tampuan extends Iso639_3 {
    final val value: String = "tpu"
  }

  case object Tanapag extends Iso639_3 {
    final val value: String = "tpv"
  }

  case object AcatepecMephaa extends Iso639_3 {
    final val value: String = "tpx"
  }

  case object Trumai extends Iso639_3 {
    final val value: String = "tpy"
  }

  case object Tinputz extends Iso639_3 {
    final val value: String = "tpz"
  }

  case object Tembe extends Iso639_3 {
    final val value: String = "tqb"
  }

  case object Lehali extends Iso639_3 {
    final val value: String = "tql"
  }

  case object Turumsa extends Iso639_3 {
    final val value: String = "tqm"
  }

  case object Tenino extends Iso639_3 {
    final val value: String = "tqn"
  }

  case object Toaripi extends Iso639_3 {
    final val value: String = "tqo"
  }

  case object Tomoip extends Iso639_3 {
    final val value: String = "tqp"
  }

  case object Tunni extends Iso639_3 {
    final val value: String = "tqq"
  }

  case object WesternTotonac extends Iso639_3 {
    final val value: String = "tqt"
  }

  case object Touo extends Iso639_3 {
    final val value: String = "tqu"
  }

  case object Tirahi extends Iso639_3 {
    final val value: String = "tra"
  }

  case object Terebu extends Iso639_3 {
    final val value: String = "trb"
  }

  case object CopalaTriqui extends Iso639_3 {
    final val value: String = "trc"
  }

  case object Turi extends Iso639_3 {
    final val value: String = "trd"
  }

  case object EastTarangan extends Iso639_3 {
    final val value: String = "tre"
  }

  case object TrinidadianCreoleEnglish extends Iso639_3 {
    final val value: String = "trf"
  }

  case object LishanDidan extends Iso639_3 {
    final val value: String = "trg"
  }

  case object Turaka extends Iso639_3 {
    final val value: String = "trh"
  }

  case object Trio extends Iso639_3 {
    final val value: String = "tri"
  }

  case object Toram extends Iso639_3 {
    final val value: String = "trj"
  }

  case object TravellerScottish extends Iso639_3 {
    final val value: String = "trl"
  }

  case object Tregami extends Iso639_3 {
    final val value: String = "trm"
  }

  case object Trinitario extends Iso639_3 {
    final val value: String = "trn"
  }

  case object TaraoNaga extends Iso639_3 {
    final val value: String = "tro"
  }

  case object KokBorok extends Iso639_3 {
    final val value: String = "trp"
  }

  case object SanMartinItunyosoTriqui extends Iso639_3 {
    final val value: String = "trq"
  }

  case object Taushiro extends Iso639_3 {
    final val value: String = "trr"
  }

  case object ChicahuaxtlaTriqui extends Iso639_3 {
    final val value: String = "trs"
  }

  case object Tunggare extends Iso639_3 {
    final val value: String = "trt"
  }

  case object Turoyo extends Iso639_3 {
    final val value: String = "tru"
  }

  case object Taroko extends Iso639_3 {
    final val value: String = "trv"
  }

  case object Torwali extends Iso639_3 {
    final val value: String = "trw"
  }

  case object SembaanBidayuh extends Iso639_3 {
    final val value: String = "trx"
  }

  case object Tsaangi extends Iso639_3 {
    final val value: String = "tsa"
  }

  case object Tsamai extends Iso639_3 {
    final val value: String = "tsb"
  }

  case object Tswa extends Iso639_3 {
    final val value: String = "tsc"
  }

  case object Tsakonian extends Iso639_3 {
    final val value: String = "tsd"
  }

  case object TunisianSignLanguage extends Iso639_3 {
    final val value: String = "tse"
  }

  case object Tausug extends Iso639_3 {
    final val value: String = "tsg"
  }

  case object Tsuvan extends Iso639_3 {
    final val value: String = "tsh"
  }

  case object Tsimshian extends Iso639_3 {
    final val value: String = "tsi"
  }

  case object Tshangla extends Iso639_3 {
    final val value: String = "tsj"
  }

  case object Tseku extends Iso639_3 {
    final val value: String = "tsk"
  }

  case object TsunLao extends Iso639_3 {
    final val value: String = "tsl"
  }

  case object TurkishSignLanguage extends Iso639_3 {
    final val value: String = "tsm"
  }

  case object Tswana extends Iso639_3 {
    final val value: String = "tsn"
  }

  case object Tsonga extends Iso639_3 {
    final val value: String = "tso"
  }

  case object NorthernToussian extends Iso639_3 {
    final val value: String = "tsp"
  }

  case object ThaiSignLanguage extends Iso639_3 {
    final val value: String = "tsq"
  }

  case object Akei extends Iso639_3 {
    final val value: String = "tsr"
  }

  case object TaiwanSignLanguage extends Iso639_3 {
    final val value: String = "tss"
  }

  case object SongwayKiini extends Iso639_3 {
    final val value: String = "tst"
  }

  case object Tsou extends Iso639_3 {
    final val value: String = "tsu"
  }

  case object Tsogo extends Iso639_3 {
    final val value: String = "tsv"
  }

  case object Tsishingini extends Iso639_3 {
    final val value: String = "tsw"
  }

  case object Mubami extends Iso639_3 {
    final val value: String = "tsx"
  }

  case object TebulSignLanguage extends Iso639_3 {
    final val value: String = "tsy"
  }

  case object Purepecha extends Iso639_3 {
    final val value: String = "tsz"
  }

  case object Gaa extends Iso639_3 {
    final val value: String = "ttb"
  }

  case object Tektiteko extends Iso639_3 {
    final val value: String = "ttc"
  }

  case object Tauade extends Iso639_3 {
    final val value: String = "ttd"
  }

  case object Bwanabwana extends Iso639_3 {
    final val value: String = "tte"
  }

  case object Tuotomb extends Iso639_3 {
    final val value: String = "ttf"
  }

  case object Tutong extends Iso639_3 {
    final val value: String = "ttg"
  }

  case object UpperTaoih extends Iso639_3 {
    final val value: String = "tth"
  }

  case object Tobati extends Iso639_3 {
    final val value: String = "tti"
  }

  case object Tooro extends Iso639_3 {
    final val value: String = "ttj"
  }

  case object Totoro extends Iso639_3 {
    final val value: String = "ttk"
  }

  case object Totela extends Iso639_3 {
    final val value: String = "ttl"
  }

  case object NorthernTutchone extends Iso639_3 {
    final val value: String = "ttm"
  }

  case object Towei extends Iso639_3 {
    final val value: String = "ttn"
  }

  case object LowerTaoih extends Iso639_3 {
    final val value: String = "tto"
  }

  case object Tombelala extends Iso639_3 {
    final val value: String = "ttp"
  }

  case object TawallammatTamajaq extends Iso639_3 {
    final val value: String = "ttq"
  }

  case object Tera extends Iso639_3 {
    final val value: String = "ttr"
  }

  case object NortheasternThai extends Iso639_3 {
    final val value: String = "tts"
  }

  case object MuslimTat extends Iso639_3 {
    final val value: String = "ttt"
  }

  case object Torau extends Iso639_3 {
    final val value: String = "ttu"
  }

  case object Titan extends Iso639_3 {
    final val value: String = "ttv"
  }

  case object LongWat extends Iso639_3 {
    final val value: String = "ttw"
  }

  case object Sikaritai extends Iso639_3 {
    final val value: String = "tty"
  }

  case object Tsum extends Iso639_3 {
    final val value: String = "ttz"
  }

  case object Wiarumus extends Iso639_3 {
    final val value: String = "tua"
  }

  case object Tubatulabal extends Iso639_3 {
    final val value: String = "tub"
  }

  case object Mutu extends Iso639_3 {
    final val value: String = "tuc"
  }

  case object Tuyuca extends Iso639_3 {
    final val value: String = "tue"
  }

  case object CentralTunebo extends Iso639_3 {
    final val value: String = "tuf"
  }

  case object Tunia extends Iso639_3 {
    final val value: String = "tug"
  }

  case object Taulil extends Iso639_3 {
    final val value: String = "tuh"
  }

  case object Tupuri extends Iso639_3 {
    final val value: String = "tui"
  }

  case object Tugutil extends Iso639_3 {
    final val value: String = "tuj"
  }

  case object Turkmen extends Iso639_3 {
    final val value: String = "tuk"
  }

  case object Tula extends Iso639_3 {
    final val value: String = "tul"
  }

  case object Tumbuka extends Iso639_3 {
    final val value: String = "tum"
  }

  case object Tucano extends Iso639_3 {
    final val value: String = "tuo"
  }

  case object Tedaga extends Iso639_3 {
    final val value: String = "tuq"
  }

  case object Turkish extends Iso639_3 {
    final val value: String = "tur"
  }

  case object Tuscarora extends Iso639_3 {
    final val value: String = "tus"
  }

  case object Tututni extends Iso639_3 {
    final val value: String = "tuu"
  }

  case object Turkana extends Iso639_3 {
    final val value: String = "tuv"
  }

  case object Tugen extends Iso639_3 {
    final val value: String = "tuy"
  }

  case object Turka extends Iso639_3 {
    final val value: String = "tuz"
  }

  case object Vaghua extends Iso639_3 {
    final val value: String = "tva"
  }

  case object Tsuvadi extends Iso639_3 {
    final val value: String = "tvd"
  }

  case object Teun extends Iso639_3 {
    final val value: String = "tve"
  }

  case object SoutheastAmbrym extends Iso639_3 {
    final val value: String = "tvk"
  }

  case object Tuvalu extends Iso639_3 {
    final val value: String = "tvl"
  }

  case object TelaMasbuar extends Iso639_3 {
    final val value: String = "tvm"
  }

  case object Tavoyan extends Iso639_3 {
    final val value: String = "tvn"
  }

  case object Tidore extends Iso639_3 {
    final val value: String = "tvo"
  }

  case object Taveta extends Iso639_3 {
    final val value: String = "tvs"
  }

  case object TutsaNaga extends Iso639_3 {
    final val value: String = "tvt"
  }

  case object Tunen extends Iso639_3 {
    final val value: String = "tvu"
  }

  case object Sedoa extends Iso639_3 {
    final val value: String = "tvw"
  }

  case object WesternTawbuid extends Iso639_3 {
    final val value: String = "twb"
  }

  case object Twents extends Iso639_3 {
    final val value: String = "twd"
  }

  case object IndonesianTewa extends Iso639_3 {
    final val value: String = "twe"
  }

  case object NorthernTiwa extends Iso639_3 {
    final val value: String = "twf"
  }

  case object Tereweng extends Iso639_3 {
    final val value: String = "twg"
  }

  case object TaiDon extends Iso639_3 {
    final val value: String = "twh"
  }

  case object Twi extends Iso639_3 {
    final val value: String = "twi"
  }

  case object Tawara extends Iso639_3 {
    final val value: String = "twl"
  }

  case object TawangMonpa extends Iso639_3 {
    final val value: String = "twm"
  }

  case object Twendi extends Iso639_3 {
    final val value: String = "twn"
  }

  case object Tswapong extends Iso639_3 {
    final val value: String = "two"
  }

  case object Ere extends Iso639_3 {
    final val value: String = "twp"
  }

  case object Tasawaq extends Iso639_3 {
    final val value: String = "twq"
  }

  case object SouthwesternTarahumara extends Iso639_3 {
    final val value: String = "twr"
  }

  case object Termanu extends Iso639_3 {
    final val value: String = "twu"
  }

  case object Tuwari extends Iso639_3 {
    final val value: String = "tww"
  }

  case object Tewe extends Iso639_3 {
    final val value: String = "twx"
  }

  case object Tawoyan extends Iso639_3 {
    final val value: String = "twy"
  }

  case object Tombonuo extends Iso639_3 {
    final val value: String = "txa"
  }

  case object Totoli extends Iso639_3 {
    final val value: String = "txe"
  }

  case object Ikpeng extends Iso639_3 {
    final val value: String = "txi"
  }

  case object Tarjumo extends Iso639_3 {
    final val value: String = "txj"
  }

  case object Tomini extends Iso639_3 {
    final val value: String = "txm"
  }

  case object WestTarangan extends Iso639_3 {
    final val value: String = "txn"
  }

  case object Toto extends Iso639_3 {
    final val value: String = "txo"
  }

  case object Tii extends Iso639_3 {
    final val value: String = "txq"
  }

  case object Tonsea extends Iso639_3 {
    final val value: String = "txs"
  }

  case object Citak extends Iso639_3 {
    final val value: String = "txt"
  }

  case object Kayapo extends Iso639_3 {
    final val value: String = "txu"
  }

  case object Tatana extends Iso639_3 {
    final val value: String = "txx"
  }

  case object TanosyMalagasy extends Iso639_3 {
    final val value: String = "txy"
  }

  case object Tauya extends Iso639_3 {
    final val value: String = "tya"
  }

  case object Kyanga extends Iso639_3 {
    final val value: String = "tye"
  }

  case object Odu extends Iso639_3 {
    final val value: String = "tyh"
  }

  case object TekeTsaayi extends Iso639_3 {
    final val value: String = "tyi"
  }

  case object TaiDo extends Iso639_3 {
    final val value: String = "tyj"
  }

  case object ThuLao extends Iso639_3 {
    final val value: String = "tyl"
  }

  case object Kombai extends Iso639_3 {
    final val value: String = "tyn"
  }

  case object TaiDaeng extends Iso639_3 {
    final val value: String = "tyr"
  }

  case object TaySaPa extends Iso639_3 {
    final val value: String = "tys"
  }

  case object TayTac extends Iso639_3 {
    final val value: String = "tyt"
  }

  case object Kua extends Iso639_3 {
    final val value: String = "tyu"
  }

  case object Tuvinian extends Iso639_3 {
    final val value: String = "tyv"
  }

  case object TekeTyee extends Iso639_3 {
    final val value: String = "tyx"
  }

  case object Tay extends Iso639_3 {
    final val value: String = "tyz"
  }

  case object TanzanianSignLanguage extends Iso639_3 {
    final val value: String = "tza"
  }

  case object Tzeltal extends Iso639_3 {
    final val value: String = "tzh"
  }

  case object Tzutujil extends Iso639_3 {
    final val value: String = "tzj"
  }

  case object AtlasTamazight extends Iso639_3 {
    final val value: String = "tzm"
  }

  case object Tugun extends Iso639_3 {
    final val value: String = "tzn"
  }

  case object Tzotzil extends Iso639_3 {
    final val value: String = "tzo"
  }

  case object Tabriak extends Iso639_3 {
    final val value: String = "tzx"
  }

  case object Kuan extends Iso639_3 {
    final val value: String = "uan"
  }

  case object Tairuma extends Iso639_3 {
    final val value: String = "uar"
  }

  case object Ubang extends Iso639_3 {
    final val value: String = "uba"
  }

  case object Ubi extends Iso639_3 {
    final val value: String = "ubi"
  }

  case object BuhinonBikol extends Iso639_3 {
    final val value: String = "ubl"
  }

  case object Ubir extends Iso639_3 {
    final val value: String = "ubr"
  }

  case object UmbuUngu extends Iso639_3 {
    final val value: String = "ubu"
  }

  case object Uda extends Iso639_3 {
    final val value: String = "uda"
  }

  case object Udihe extends Iso639_3 {
    final val value: String = "ude"
  }

  case object Muduga extends Iso639_3 {
    final val value: String = "udg"
  }

  case object Udi extends Iso639_3 {
    final val value: String = "udi"
  }

  case object Ujir extends Iso639_3 {
    final val value: String = "udj"
  }

  case object Wuzlam extends Iso639_3 {
    final val value: String = "udl"
  }

  case object Udmurt extends Iso639_3 {
    final val value: String = "udm"
  }

  case object Uduk extends Iso639_3 {
    final val value: String = "udu"
  }

  case object Kioko extends Iso639_3 {
    final val value: String = "ues"
  }

  case object Ufim extends Iso639_3 {
    final val value: String = "ufi"
  }

  case object Ughele extends Iso639_3 {
    final val value: String = "uge"
  }

  case object UgandanSignLanguage extends Iso639_3 {
    final val value: String = "ugn"
  }

  case object Ugong extends Iso639_3 {
    final val value: String = "ugo"
  }

  case object UruguayanSignLanguage extends Iso639_3 {
    final val value: String = "ugy"
  }

  case object Uhami extends Iso639_3 {
    final val value: String = "uha"
  }

  case object Damal extends Iso639_3 {
    final val value: String = "uhn"
  }

  case object Uighur extends Iso639_3 {
    final val value: String = "uig"
  }

  case object Uisai extends Iso639_3 {
    final val value: String = "uis"
  }

  case object Iyive extends Iso639_3 {
    final val value: String = "uiv"
  }

  case object Tanjijili extends Iso639_3 {
    final val value: String = "uji"
  }

  case object Kaburi extends Iso639_3 {
    final val value: String = "uka"
  }

  case object Ukuriguma extends Iso639_3 {
    final val value: String = "ukg"
  }

  case object Ukhwejo extends Iso639_3 {
    final val value: String = "ukh"
  }

  case object MuakSaaak extends Iso639_3 {
    final val value: String = "ukk"
  }

  case object UkrainianSignLanguage extends Iso639_3 {
    final val value: String = "ukl"
  }

  case object UkpeBayobiri extends Iso639_3 {
    final val value: String = "ukp"
  }

  case object Ukwa extends Iso639_3 {
    final val value: String = "ukq"
  }

  case object Ukrainian extends Iso639_3 {
    final val value: String = "ukr"
  }

  case object UrubuKaaporSignLanguage extends Iso639_3 {
    final val value: String = "uks"
  }

  case object Ukue extends Iso639_3 {
    final val value: String = "uku"
  }

  case object UkwuaniAbohNdoni extends Iso639_3 {
    final val value: String = "ukw"
  }

  case object Fungwa extends Iso639_3 {
    final val value: String = "ula"
  }

  case object Ulukwumi extends Iso639_3 {
    final val value: String = "ulb"
  }

  case object Ulch extends Iso639_3 {
    final val value: String = "ulc"
  }

  case object Usku extends Iso639_3 {
    final val value: String = "ulf"
  }

  case object Ulithian extends Iso639_3 {
    final val value: String = "uli"
  }

  case object Meriam extends Iso639_3 {
    final val value: String = "ulk"
  }

  case object Ullatan extends Iso639_3 {
    final val value: String = "ull"
  }

  case object Ulumanda extends Iso639_3 {
    final val value: String = "ulm"
  }

  case object Unserdeutsch extends Iso639_3 {
    final val value: String = "uln"
  }

  case object UmaLung extends Iso639_3 {
    final val value: String = "ulu"
  }

  case object Ulwa extends Iso639_3 {
    final val value: String = "ulw"
  }

  case object Umatilla extends Iso639_3 {
    final val value: String = "uma"
  }

  case object Umbundu extends Iso639_3 {
    final val value: String = "umb"
  }

  case object Ukit extends Iso639_3 {
    final val value: String = "umi"
  }

  case object Umon extends Iso639_3 {
    final val value: String = "umm"
  }

  case object MakyanNaga extends Iso639_3 {
    final val value: String = "umn"
  }

  case object Umpila extends Iso639_3 {
    final val value: String = "ump"
  }

  case object Pendau extends Iso639_3 {
    final val value: String = "ums"
  }

  case object Munsee extends Iso639_3 {
    final val value: String = "umu"
  }

  case object NorthWatut extends Iso639_3 {
    final val value: String = "una"
  }

  case object Uneme extends Iso639_3 {
    final val value: String = "une"
  }

  case object Ngarinyin extends Iso639_3 {
    final val value: String = "ung"
  }

  case object EnaweneNawe extends Iso639_3 {
    final val value: String = "unk"
  }

  case object Kurnai extends Iso639_3 {
    final val value: String = "unn"
  }

  case object Mundari extends Iso639_3 {
    final val value: String = "unr"
  }

  case object Unubahe extends Iso639_3 {
    final val value: String = "unu"
  }

  case object Munda extends Iso639_3 {
    final val value: String = "unx"
  }

  case object UndeKaili extends Iso639_3 {
    final val value: String = "unz"
  }

  case object Umeda extends Iso639_3 {
    final val value: String = "upi"
  }

  case object UripivWalaRanoAtchin extends Iso639_3 {
    final val value: String = "upv"
  }

  case object Urarina extends Iso639_3 {
    final val value: String = "ura"
  }

  case object UrubuKaapor extends Iso639_3 {
    final val value: String = "urb"
  }

  case object Urdu extends Iso639_3 {
    final val value: String = "urd"
  }

  case object Uru extends Iso639_3 {
    final val value: String = "ure"
  }

  case object Urigina extends Iso639_3 {
    final val value: String = "urg"
  }

  case object Urhobo extends Iso639_3 {
    final val value: String = "urh"
  }

  case object Urim extends Iso639_3 {
    final val value: String = "uri"
  }

  case object UrakLawoi extends Iso639_3 {
    final val value: String = "urk"
  }

  case object Urali extends Iso639_3 {
    final val value: String = "url"
  }

  case object Urapmin extends Iso639_3 {
    final val value: String = "urm"
  }

  case object Uruangnirin extends Iso639_3 {
    final val value: String = "urn"
  }

  case object PapuaNewGuineanUra extends Iso639_3 {
    final val value: String = "uro"
  }

  case object UruPaIn extends Iso639_3 {
    final val value: String = "urp"
  }

  case object Lehalurup extends Iso639_3 {
    final val value: String = "urr"
  }

  case object Urat extends Iso639_3 {
    final val value: String = "urt"
  }

  case object Sop extends Iso639_3 {
    final val value: String = "urw"
  }

  case object Urimo extends Iso639_3 {
    final val value: String = "urx"
  }

  case object Orya extends Iso639_3 {
    final val value: String = "ury"
  }

  case object UruEuWauWau extends Iso639_3 {
    final val value: String = "urz"
  }

  case object Usarufa extends Iso639_3 {
    final val value: String = "usa"
  }

  case object Ushojo extends Iso639_3 {
    final val value: String = "ush"
  }

  case object Usui extends Iso639_3 {
    final val value: String = "usi"
  }

  case object Usaghade extends Iso639_3 {
    final val value: String = "usk"
  }

  case object Uspanteco extends Iso639_3 {
    final val value: String = "usp"
  }

  case object Uya extends Iso639_3 {
    final val value: String = "usu"
  }

  case object Otank extends Iso639_3 {
    final val value: String = "uta"
  }

  case object SouthernPaiute extends Iso639_3 {
    final val value: String = "ute"
  }

  case object SolomonIslandsAmba extends Iso639_3 {
    final val value: String = "utp"
  }

  case object Etulo extends Iso639_3 {
    final val value: String = "utr"
  }

  case object Utu extends Iso639_3 {
    final val value: String = "utu"
  }

  case object Urum extends Iso639_3 {
    final val value: String = "uum"
  }

  case object KulonPazeh extends Iso639_3 {
    final val value: String = "uun"
  }

  case object VanuatuanUra extends Iso639_3 {
    final val value: String = "uur"
  }

  case object U extends Iso639_3 {
    final val value: String = "uuu"
  }

  case object WestUvean extends Iso639_3 {
    final val value: String = "uve"
  }

  case object Uri extends Iso639_3 {
    final val value: String = "uvh"
  }

  case object Lote extends Iso639_3 {
    final val value: String = "uvl"
  }

  case object KukuUwanh extends Iso639_3 {
    final val value: String = "uwa"
  }

  case object DokoUyanga extends Iso639_3 {
    final val value: String = "uya"
  }

  case object Uzbek extends Iso639_3 {
    final val value: String = "uzb"
  }

  case object NorthernUzbek extends Iso639_3 {
    final val value: String = "uzn"
  }

  case object SouthernUzbek extends Iso639_3 {
    final val value: String = "uzs"
  }

  case object VaagriBooli extends Iso639_3 {
    final val value: String = "vaa"
  }

  case object Vale extends Iso639_3 {
    final val value: String = "vae"
  }

  case object Vafsi extends Iso639_3 {
    final val value: String = "vaf"
  }

  case object Vagla extends Iso639_3 {
    final val value: String = "vag"
  }

  case object VarhadiNagpuri extends Iso639_3 {
    final val value: String = "vah"
  }

  case object Vai extends Iso639_3 {
    final val value: String = "vai"
  }

  case object Sekele extends Iso639_3 {
    final val value: String = "vaj"
  }

  case object Vehes extends Iso639_3 {
    final val value: String = "val"
  }

  case object Vanimo extends Iso639_3 {
    final val value: String = "vam"
  }

  case object Valman extends Iso639_3 {
    final val value: String = "van"
  }

  case object Vao extends Iso639_3 {
    final val value: String = "vao"
  }

  case object Vaiphei extends Iso639_3 {
    final val value: String = "vap"
  }

  case object Huarijio extends Iso639_3 {
    final val value: String = "var"
  }

  case object Vasavi extends Iso639_3 {
    final val value: String = "vas"
  }

  case object Vanuma extends Iso639_3 {
    final val value: String = "vau"
  }

  case object Varli extends Iso639_3 {
    final val value: String = "vav"
  }

  case object Wayu extends Iso639_3 {
    final val value: String = "vay"
  }

  case object SoutheastBabar extends Iso639_3 {
    final val value: String = "vbb"
  }

  case object SouthwesternBontok extends Iso639_3 {
    final val value: String = "vbk"
  }

  case object Venetian extends Iso639_3 {
    final val value: String = "vec"
  }

  case object Veddah extends Iso639_3 {
    final val value: String = "ved"
  }

  case object Veluws extends Iso639_3 {
    final val value: String = "vel"
  }

  case object VemgoMabas extends Iso639_3 {
    final val value: String = "vem"
  }

  case object Venda extends Iso639_3 {
    final val value: String = "ven"
  }

  case object Veps extends Iso639_3 {
    final val value: String = "vep"
  }

  case object MomJango extends Iso639_3 {
    final val value: String = "ver"
  }

  case object Vaghri extends Iso639_3 {
    final val value: String = "vgr"
  }

  case object VlaamseGebarentaal extends Iso639_3 {
    final val value: String = "vgt"
  }

  case object VirginIslandsCreoleEnglish extends Iso639_3 {
    final val value: String = "vic"
  }

  case object Vidunda extends Iso639_3 {
    final val value: String = "vid"
  }

  case object Vietnamese extends Iso639_3 {
    final val value: String = "vie"
  }

  case object Vili extends Iso639_3 {
    final val value: String = "vif"
  }

  case object Viemo extends Iso639_3 {
    final val value: String = "vig"
  }

  case object Vilela extends Iso639_3 {
    final val value: String = "vil"
  }

  case object Vinza extends Iso639_3 {
    final val value: String = "vin"
  }

  case object Vishavan extends Iso639_3 {
    final val value: String = "vis"
  }

  case object Viti extends Iso639_3 {
    final val value: String = "vit"
  }

  case object Iduna extends Iso639_3 {
    final val value: String = "viv"
  }

  case object IjaZuba extends Iso639_3 {
    final val value: String = "vki"
  }

  case object Kujarge extends Iso639_3 {
    final val value: String = "vkj"
  }

  case object Kaur extends Iso639_3 {
    final val value: String = "vkk"
  }

  case object Kulisusu extends Iso639_3 {
    final val value: String = "vkl"
  }

  case object Kodeoha extends Iso639_3 {
    final val value: String = "vko"
  }

  case object KorlaiCreolePortuguese extends Iso639_3 {
    final val value: String = "vkp"
  }

  case object KutaiMalay extends Iso639_3 {
    final val value: String = "vkt"
  }

  case object Kurrama extends Iso639_3 {
    final val value: String = "vku"
  }

  case object Valpei extends Iso639_3 {
    final val value: String = "vlp"
  }

  case object Vlaams extends Iso639_3 {
    final val value: String = "vls"
  }

  case object Martuyhunira extends Iso639_3 {
    final val value: String = "vma"
  }

  case object JuxtlahuacaMixtec extends Iso639_3 {
    final val value: String = "vmc"
  }

  case object MuduKoraga extends Iso639_3 {
    final val value: String = "vmd"
  }

  case object EastMasela extends Iso639_3 {
    final val value: String = "vme"
  }

  case object Mainfrankisch extends Iso639_3 {
    final val value: String = "vmf"
  }

  case object Lungalunga extends Iso639_3 {
    final val value: String = "vmg"
  }

  case object Maraghei extends Iso639_3 {
    final val value: String = "vmh"
  }

  case object IxtayutlaMixtec extends Iso639_3 {
    final val value: String = "vmj"
  }

  case object MakhuwaShirima extends Iso639_3 {
    final val value: String = "vmk"
  }

  case object MitlatongoMixtec extends Iso639_3 {
    final val value: String = "vmm"
  }

  case object SoyaltepecMazatec extends Iso639_3 {
    final val value: String = "vmp"
  }

  case object SoyaltepecMixtec extends Iso639_3 {
    final val value: String = "vmq"
  }

  case object Marenje extends Iso639_3 {
    final val value: String = "vmr"
  }

  case object Makhuwa extends Iso639_3 {
    final val value: String = "vmw"
  }

  case object TamazolaMixtec extends Iso639_3 {
    final val value: String = "vmx"
  }

  case object AyautlaMazatec extends Iso639_3 {
    final val value: String = "vmy"
  }

  case object MazatlanMazatec extends Iso639_3 {
    final val value: String = "vmz"
  }

  case object Vano extends Iso639_3 {
    final val value: String = "vnk"
  }

  case object Vinmavis extends Iso639_3 {
    final val value: String = "vnm"
  }

  case object Vunapu extends Iso639_3 {
    final val value: String = "vnp"
  }

  case object Voro extends Iso639_3 {
    final val value: String = "vor"
  }

  case object Votic extends Iso639_3 {
    final val value: String = "vot"
  }

  case object Veraa extends Iso639_3 {
    final val value: String = "vra"
  }

  case object Vooro extends Iso639_3 {
    final val value: String = "vro"
  }

  case object Varisi extends Iso639_3 {
    final val value: String = "vrs"
  }

  case object Burmbar extends Iso639_3 {
    final val value: String = "vrt"
  }

  case object MoldovaSignLanguage extends Iso639_3 {
    final val value: String = "vsi"
  }

  case object VenezuelanSignLanguage extends Iso639_3 {
    final val value: String = "vsl"
  }

  case object ValencianSignLanguage extends Iso639_3 {
    final val value: String = "vsv"
  }

  case object Vitou extends Iso639_3 {
    final val value: String = "vto"
  }

  case object Vumbu extends Iso639_3 {
    final val value: String = "vum"
  }

  case object Vunjo extends Iso639_3 {
    final val value: String = "vun"
  }

  case object Vute extends Iso639_3 {
    final val value: String = "vut"
  }

  case object ChineseAwa extends Iso639_3 {
    final val value: String = "vwa"
  }

  case object WallaWalla extends Iso639_3 {
    final val value: String = "waa"
  }

  case object Wab extends Iso639_3 {
    final val value: String = "wab"
  }

  case object WascoWishram extends Iso639_3 {
    final val value: String = "wac"
  }

  case object Wandamen extends Iso639_3 {
    final val value: String = "wad"
  }

  case object Walser extends Iso639_3 {
    final val value: String = "wae"
  }

  case object Waema extends Iso639_3 {
    final val value: String = "wag"
  }

  case object Watubela extends Iso639_3 {
    final val value: String = "wah"
  }

  case object Wares extends Iso639_3 {
    final val value: String = "wai"
  }

  case object Waffa extends Iso639_3 {
    final val value: String = "waj"
  }

  case object Wolaytta extends Iso639_3 {
    final val value: String = "wal"
  }

  case object Wan extends Iso639_3 {
    final val value: String = "wan"
  }

  case object Wapishana extends Iso639_3 {
    final val value: String = "wap"
  }

  case object Wageman extends Iso639_3 {
    final val value: String = "waq"
  }

  case object PhilippinesWaray extends Iso639_3 {
    final val value: String = "war"
  }

  case object Washo extends Iso639_3 {
    final val value: String = "was"
  }

  case object Kaninuwa extends Iso639_3 {
    final val value: String = "wat"
  }

  case object Waura extends Iso639_3 {
    final val value: String = "wau"
  }

  case object Waka extends Iso639_3 {
    final val value: String = "wav"
  }

  case object Waiwai extends Iso639_3 {
    final val value: String = "waw"
  }

  case object Watam extends Iso639_3 {
    final val value: String = "wax"
  }

  case object Wayana extends Iso639_3 {
    final val value: String = "way"
  }

  case object Wampur extends Iso639_3 {
    final val value: String = "waz"
  }

  case object Warao extends Iso639_3 {
    final val value: String = "wba"
  }

  case object Wabo extends Iso639_3 {
    final val value: String = "wbb"
  }

  case object Waritai extends Iso639_3 {
    final val value: String = "wbe"
  }

  case object Wara extends Iso639_3 {
    final val value: String = "wbf"
  }

  case object Wanda extends Iso639_3 {
    final val value: String = "wbh"
  }

  case object Vwanji extends Iso639_3 {
    final val value: String = "wbi"
  }

  case object Alagwa extends Iso639_3 {
    final val value: String = "wbj"
  }

  case object Waigali extends Iso639_3 {
    final val value: String = "wbk"
  }

  case object Wakhi extends Iso639_3 {
    final val value: String = "wbl"
  }

  case object Wa extends Iso639_3 {
    final val value: String = "wbm"
  }

  case object Warlpiri extends Iso639_3 {
    final val value: String = "wbp"
  }

  case object Waddar extends Iso639_3 {
    final val value: String = "wbq"
  }

  case object Wagdi extends Iso639_3 {
    final val value: String = "wbr"
  }

  case object WestBengalSignLanguage extends Iso639_3 {
    final val value: String = "wbs"
  }

  case object Wanman extends Iso639_3 {
    final val value: String = "wbt"
  }

  case object Wajarri extends Iso639_3 {
    final val value: String = "wbv"
  }

  case object Woi extends Iso639_3 {
    final val value: String = "wbw"
  }

  case object Yanomami extends Iso639_3 {
    final val value: String = "wca"
  }

  case object WaciGbe extends Iso639_3 {
    final val value: String = "wci"
  }

  case object Wandji extends Iso639_3 {
    final val value: String = "wdd"
  }

  case object Wadaginam extends Iso639_3 {
    final val value: String = "wdg"
  }

  case object Wadjiginy extends Iso639_3 {
    final val value: String = "wdj"
  }

  case object WeWestern extends Iso639_3 {
    final val value: String = "wec"
  }

  case object Wedau extends Iso639_3 {
    final val value: String = "wed"
  }

  case object Wergaia extends Iso639_3 {
    final val value: String = "weg"
  }

  case object Weh extends Iso639_3 {
    final val value: String = "weh"
  }

  case object Kiunum extends Iso639_3 {
    final val value: String = "wei"
  }

  case object WemeGbe extends Iso639_3 {
    final val value: String = "wem"
  }

  case object Wemale extends Iso639_3 {
    final val value: String = "weo"
  }

  case object Westphalien extends Iso639_3 {
    final val value: String = "wep"
  }

  case object Weri extends Iso639_3 {
    final val value: String = "wer"
  }

  case object CameroonPidgin extends Iso639_3 {
    final val value: String = "wes"
  }

  case object Perai extends Iso639_3 {
    final val value: String = "wet"
  }

  case object RawngtuChin extends Iso639_3 {
    final val value: String = "weu"
  }

  case object Wejewa extends Iso639_3 {
    final val value: String = "wew"
  }

  case object Yafi extends Iso639_3 {
    final val value: String = "wfg"
  }

  case object Wagawaga extends Iso639_3 {
    final val value: String = "wgb"
  }

  case object Wahgi extends Iso639_3 {
    final val value: String = "wgi"
  }

  case object Waigeo extends Iso639_3 {
    final val value: String = "wgo"
  }

  case object Warrgamay extends Iso639_3 {
    final val value: String = "wgy"
  }

  case object SouUpaa extends Iso639_3 {
    final val value: String = "wha"
  }

  case object NorthWahgi extends Iso639_3 {
    final val value: String = "whg"
  }

  case object WahauKenyah extends Iso639_3 {
    final val value: String = "whk"
  }

  case object WahauKayan extends Iso639_3 {
    final val value: String = "whu"
  }

  case object SouthernToussian extends Iso639_3 {
    final val value: String = "wib"
  }

  case object Wichita extends Iso639_3 {
    final val value: String = "wic"
  }

  case object WikNgathana extends Iso639_3 {
    final val value: String = "wig"
  }

  case object WikMeanha extends Iso639_3 {
    final val value: String = "wih"
  }

  case object Minidien extends Iso639_3 {
    final val value: String = "wii"
  }

  case object WikIiyanh extends Iso639_3 {
    final val value: String = "wij"
  }

  case object Wikalkan extends Iso639_3 {
    final val value: String = "wik"
  }

  case object WikMungkan extends Iso639_3 {
    final val value: String = "wim"
  }

  case object HoChunk extends Iso639_3 {
    final val value: String = "win"
  }

  case object Wiru extends Iso639_3 {
    final val value: String = "wiu"
  }

  case object Vitu extends Iso639_3 {
    final val value: String = "wiv"
  }

  case object Waja extends Iso639_3 {
    final val value: String = "wja"
  }

  case object Warji extends Iso639_3 {
    final val value: String = "wji"
  }

  case object Kumbaran extends Iso639_3 {
    final val value: String = "wkb"
  }

  case object Wakde extends Iso639_3 {
    final val value: String = "wkd"
  }

  case object Kalanadi extends Iso639_3 {
    final val value: String = "wkl"
  }

  case object Kunduvadi extends Iso639_3 {
    final val value: String = "wku"
  }

  case object Walio extends Iso639_3 {
    final val value: String = "wla"
  }

  case object MwaliComorian extends Iso639_3 {
    final val value: String = "wlc"
  }

  case object Wolane extends Iso639_3 {
    final val value: String = "wle"
  }

  case object Kunbarlang extends Iso639_3 {
    final val value: String = "wlg"
  }

  case object Waioli extends Iso639_3 {
    final val value: String = "wli"
  }

  case object SudaneseWali extends Iso639_3 {
    final val value: String = "wll"
  }

  case object Walloon extends Iso639_3 {
    final val value: String = "wln"
  }

  case object Wolio extends Iso639_3 {
    final val value: String = "wlo"
  }

  case object Wailapa extends Iso639_3 {
    final val value: String = "wlr"
  }

  case object Wallisian extends Iso639_3 {
    final val value: String = "wls"
  }

  case object WichiLhamtesVejoz extends Iso639_3 {
    final val value: String = "wlv"
  }

  case object Walak extends Iso639_3 {
    final val value: String = "wlw"
  }

  case object GhanaianWali extends Iso639_3 {
    final val value: String = "wlx"
  }

  case object Wambaya extends Iso639_3 {
    final val value: String = "wmb"
  }

  case object Wamas extends Iso639_3 {
    final val value: String = "wmc"
  }

  case object Mamainde extends Iso639_3 {
    final val value: String = "wmd"
  }

  case object Wambule extends Iso639_3 {
    final val value: String = "wme"
  }

  case object Waimaa extends Iso639_3 {
    final val value: String = "wmh"
  }

  case object IndonesianMaiwa extends Iso639_3 {
    final val value: String = "wmm"
  }

  case object PapuaNewGuineanWom extends Iso639_3 {
    final val value: String = "wmo"
  }

  case object Wambon extends Iso639_3 {
    final val value: String = "wms"
  }

  case object Walmajarri extends Iso639_3 {
    final val value: String = "wmt"
  }

  case object Mwani extends Iso639_3 {
    final val value: String = "wmw"
  }

  case object Womo extends Iso639_3 {
    final val value: String = "wmx"
  }

  case object Wanambre extends Iso639_3 {
    final val value: String = "wnb"
  }

  case object Wantoat extends Iso639_3 {
    final val value: String = "wnc"
  }

  case object Waneci extends Iso639_3 {
    final val value: String = "wne"
  }

  case object Wanggom extends Iso639_3 {
    final val value: String = "wng"
  }

  case object NdzwaniComorian extends Iso639_3 {
    final val value: String = "wni"
  }

  case object Wanukaka extends Iso639_3 {
    final val value: String = "wnk"
  }

  case object Wano extends Iso639_3 {
    final val value: String = "wno"
  }

  case object Wanap extends Iso639_3 {
    final val value: String = "wnp"
  }

  case object Usan extends Iso639_3 {
    final val value: String = "wnu"
  }

  case object Wintu extends Iso639_3 {
    final val value: String = "wnw"
  }

  case object Wanyi extends Iso639_3 {
    final val value: String = "wny"
  }

  case object Tyaraity extends Iso639_3 {
    final val value: String = "woa"
  }

  case object WeNorthern extends Iso639_3 {
    final val value: String = "wob"
  }

  case object Wogeo extends Iso639_3 {
    final val value: String = "woc"
  }

  case object Wolani extends Iso639_3 {
    final val value: String = "wod"
  }

  case object Woleaian extends Iso639_3 {
    final val value: String = "woe"
  }

  case object GambianWolof extends Iso639_3 {
    final val value: String = "wof"
  }

  case object Wogamusin extends Iso639_3 {
    final val value: String = "wog"
  }

  case object Kamang extends Iso639_3 {
    final val value: String = "woi"
  }

  case object Longto extends Iso639_3 {
    final val value: String = "wok"
  }

  case object Wolof extends Iso639_3 {
    final val value: String = "wol"
  }

  case object NigerianWom extends Iso639_3 {
    final val value: String = "wom"
  }

  case object Wongo extends Iso639_3 {
    final val value: String = "won"
  }

  case object Manombai extends Iso639_3 {
    final val value: String = "woo"
  }

  case object Woria extends Iso639_3 {
    final val value: String = "wor"
  }

  case object HangaHundi extends Iso639_3 {
    final val value: String = "wos"
  }

  case object Wawonii extends Iso639_3 {
    final val value: String = "wow"
  }

  case object Maco extends Iso639_3 {
    final val value: String = "wpc"
  }

  case object Warapu extends Iso639_3 {
    final val value: String = "wra"
  }

  case object Warduji extends Iso639_3 {
    final val value: String = "wrd"
  }

  case object Garrwa extends Iso639_3 {
    final val value: String = "wrk"
  }

  case object Warlmanpa extends Iso639_3 {
    final val value: String = "wrl"
  }

  case object Warumungu extends Iso639_3 {
    final val value: String = "wrm"
  }

  case object Warnang extends Iso639_3 {
    final val value: String = "wrn"
  }

  case object Waropen extends Iso639_3 {
    final val value: String = "wrp"
  }

  case object Wardaman extends Iso639_3 {
    final val value: String = "wrr"
  }

  case object Waris extends Iso639_3 {
    final val value: String = "wrs"
  }

  case object Waru extends Iso639_3 {
    final val value: String = "wru"
  }

  case object Waruna extends Iso639_3 {
    final val value: String = "wrv"
  }

  case object WaeRana extends Iso639_3 {
    final val value: String = "wrx"
  }

  case object Merwari extends Iso639_3 {
    final val value: String = "wry"
  }

  case object Warembori extends Iso639_3 {
    final val value: String = "wsa"
  }

  case object AdilabadGondi extends Iso639_3 {
    final val value: String = "wsg"
  }

  case object Wusi extends Iso639_3 {
    final val value: String = "wsi"
  }

  case object Waskia extends Iso639_3 {
    final val value: String = "wsk"
  }

  case object Owenia extends Iso639_3 {
    final val value: String = "wsr"
  }

  case object Wasa extends Iso639_3 {
    final val value: String = "wss"
  }

  case object Watiwa extends Iso639_3 {
    final val value: String = "wtf"
  }

  case object Berta extends Iso639_3 {
    final val value: String = "wti"
  }

  case object Watakataui extends Iso639_3 {
    final val value: String = "wtk"
  }

  case object Mewati extends Iso639_3 {
    final val value: String = "wtm"
  }

  case object Wotu extends Iso639_3 {
    final val value: String = "wtw"
  }

  case object Wikngenchera extends Iso639_3 {
    final val value: String = "wua"
  }

  case object Wunambal extends Iso639_3 {
    final val value: String = "wub"
  }

  case object Wudu extends Iso639_3 {
    final val value: String = "wud"
  }

  case object Wutunhua extends Iso639_3 {
    final val value: String = "wuh"
  }

  case object Silimo extends Iso639_3 {
    final val value: String = "wul"
  }

  case object Wumbvu extends Iso639_3 {
    final val value: String = "wum"
  }

  case object Bungu extends Iso639_3 {
    final val value: String = "wun"
  }

  case object Wutung extends Iso639_3 {
    final val value: String = "wut"
  }

  case object WuChinese extends Iso639_3 {
    final val value: String = "wuu"
  }

  case object WuvuluAua extends Iso639_3 {
    final val value: String = "wuv"
  }

  case object Wulna extends Iso639_3 {
    final val value: String = "wux"
  }

  case object Wauyai extends Iso639_3 {
    final val value: String = "wuy"
  }

  case object Waama extends Iso639_3 {
    final val value: String = "wwa"
  }

  case object Wetamut extends Iso639_3 {
    final val value: String = "wwo"
  }

  case object Wawa extends Iso639_3 {
    final val value: String = "www"
  }

  case object Waxianghua extends Iso639_3 {
    final val value: String = "wxa"
  }

  case object Wyandot extends Iso639_3 {
    final val value: String = "wya"
  }

  case object WangaaybuwanNgiyambaa extends Iso639_3 {
    final val value: String = "wyb"
  }

  case object Wymysorys extends Iso639_3 {
    final val value: String = "wym"
  }

  case object Wayoro extends Iso639_3 {
    final val value: String = "wyr"
  }

  case object WesternFijian extends Iso639_3 {
    final val value: String = "wyy"
  }

  case object Sambe extends Iso639_3 {
    final val value: String = "xab"
  }

  case object Kachari extends Iso639_3 {
    final val value: String = "xac"
  }

  case object Kalmyk extends Iso639_3 {
    final val value: String = "xal"
  }

  case object Xamtanga extends Iso639_3 {
    final val value: String = "xan"
  }

  case object Khao extends Iso639_3 {
    final val value: String = "xao"
  }

  case object Katawixi extends Iso639_3 {
    final val value: String = "xat"
  }

  case object Kauwera extends Iso639_3 {
    final val value: String = "xau"
  }

  case object Xavante extends Iso639_3 {
    final val value: String = "xav"
  }

  case object Kawaiisu extends Iso639_3 {
    final val value: String = "xaw"
  }

  case object KayanMahakam extends Iso639_3 {
    final val value: String = "xay"
  }

  case object Kombio extends Iso639_3 {
    final val value: String = "xbi"
  }

  case object Kambera extends Iso639_3 {
    final val value: String = "xbr"
  }

  case object Batyala extends Iso639_3 {
    final val value: String = "xby"
  }

  case object Darkinyung extends Iso639_3 {
    final val value: String = "xda"
  }

  case object Kwandu extends Iso639_3 {
    final val value: String = "xdo"
  }

  case object MalayicDayak extends Iso639_3 {
    final val value: String = "xdy"
  }

  case object Hdi extends Iso639_3 {
    final val value: String = "xed"
  }

  case object Kelo extends Iso639_3 {
    final val value: String = "xel"
  }

  case object Kembayan extends Iso639_3 {
    final val value: String = "xem"
  }

  case object Xerente extends Iso639_3 {
    final val value: String = "xer"
  }

  case object Kesawai extends Iso639_3 {
    final val value: String = "xes"
  }

  case object Xeta extends Iso639_3 {
    final val value: String = "xet"
  }

  case object KeoruAhia extends Iso639_3 {
    final val value: String = "xeu"
  }

  case object Unggumi extends Iso639_3 {
    final val value: String = "xgu"
  }

  case object Khetrani extends Iso639_3 {
    final val value: String = "xhe"
  }

  case object Xhosa extends Iso639_3 {
    final val value: String = "xho"
  }

  case object Khua extends Iso639_3 {
    final val value: String = "xhv"
  }

  case object Xiri extends Iso639_3 {
    final val value: String = "xii"
  }

  case object Kisan extends Iso639_3 {
    final val value: String = "xis"
  }

  case object Xipaya extends Iso639_3 {
    final val value: String = "xiy"
  }

  case object Kalkoti extends Iso639_3 {
    final val value: String = "xka"
  }

  case object NorthernNago extends Iso639_3 {
    final val value: String = "xkb"
  }

  case object Khoini extends Iso639_3 {
    final val value: String = "xkc"
  }

  case object MendalamKayan extends Iso639_3 {
    final val value: String = "xkd"
  }

  case object Kereho extends Iso639_3 {
    final val value: String = "xke"
  }

  case object Khengkha extends Iso639_3 {
    final val value: String = "xkf"
  }

  case object Kagoro extends Iso639_3 {
    final val value: String = "xkg"
  }

  case object KenyanSignLanguage extends Iso639_3 {
    final val value: String = "xki"
  }

  case object Kajali extends Iso639_3 {
    final val value: String = "xkj"
  }

  case object Kaco extends Iso639_3 {
    final val value: String = "xkk"
  }

  case object MainstreamKenyah extends Iso639_3 {
    final val value: String = "xkl"
  }

  case object RiverKayan extends Iso639_3 {
    final val value: String = "xkn"
  }

  case object Kiorr extends Iso639_3 {
    final val value: String = "xko"
  }

  case object Kabatei extends Iso639_3 {
    final val value: String = "xkp"
  }

  case object Koroni extends Iso639_3 {
    final val value: String = "xkq"
  }

  case object Kumbewaha extends Iso639_3 {
    final val value: String = "xks"
  }

  case object Kantosi extends Iso639_3 {
    final val value: String = "xkt"
  }

  case object Kaamba extends Iso639_3 {
    final val value: String = "xku"
  }

  case object Kgalagadi extends Iso639_3 {
    final val value: String = "xkv"
  }

  case object Kembra extends Iso639_3 {
    final val value: String = "xkw"
  }

  case object Karore extends Iso639_3 {
    final val value: String = "xkx"
  }

  case object UmaLasan extends Iso639_3 {
    final val value: String = "xky"
  }

  case object Kurtokha extends Iso639_3 {
    final val value: String = "xkz"
  }

  case object Kamula extends Iso639_3 {
    final val value: String = "xla"
  }

  case object Mushungulu extends Iso639_3 {
    final val value: String = "xma"
  }

  case object Mbonga extends Iso639_3 {
    final val value: String = "xmb"
  }

  case object MakhuwaMarrevone extends Iso639_3 {
    final val value: String = "xmc"
  }

  case object Mbudum extends Iso639_3 {
    final val value: String = "xmd"
  }

  case object Mingrelian extends Iso639_3 {
    final val value: String = "xmf"
  }

  case object Mengaka extends Iso639_3 {
    final val value: String = "xmg"
  }

  case object KukuMuminh extends Iso639_3 {
    final val value: String = "xmh"
  }

  case object Majera extends Iso639_3 {
    final val value: String = "xmj"
  }

  case object MalaysianSignLanguage extends Iso639_3 {
    final val value: String = "xml"
  }

  case object ManadoMalay extends Iso639_3 {
    final val value: String = "xmm"
  }

  case object Morerebi extends Iso639_3 {
    final val value: String = "xmo"
  }

  case object MoroccanSignLanguage extends Iso639_3 {
    final val value: String = "xms"
  }

  case object Matbat extends Iso639_3 {
    final val value: String = "xmt"
  }

  case object AntankaranaMalagasy extends Iso639_3 {
    final val value: String = "xmv"
  }

  case object TsimihetyMalagasy extends Iso639_3 {
    final val value: String = "xmw"
  }

  case object Maden extends Iso639_3 {
    final val value: String = "xmx"
  }

  case object Mayaguduna extends Iso639_3 {
    final val value: String = "xmy"
  }

  case object MoriBawah extends Iso639_3 {
    final val value: String = "xmz"
  }

  case object Kanakanabu extends Iso639_3 {
    final val value: String = "xnb"
  }

  case object Kuanhua extends Iso639_3 {
    final val value: String = "xnh"
  }

  case object NorthernKankanay extends Iso639_3 {
    final val value: String = "xnn"
  }

  case object Kangri extends Iso639_3 {
    final val value: String = "xnr"
  }

  case object Kanashi extends Iso639_3 {
    final val value: String = "xns"
  }

  case object Nyiyaparli extends Iso639_3 {
    final val value: String = "xny"
  }

  case object Kenzi extends Iso639_3 {
    final val value: String = "xnz"
  }

  case object Kokoda extends Iso639_3 {
    final val value: String = "xod"
  }

  case object Soga extends Iso639_3 {
    final val value: String = "xog"
  }

  case object Kominimung extends Iso639_3 {
    final val value: String = "xoi"
  }

  case object Xokleng extends Iso639_3 {
    final val value: String = "xok"
  }

  case object SudaneseKomo extends Iso639_3 {
    final val value: String = "xom"
  }

  case object Konkomba extends Iso639_3 {
    final val value: String = "xon"
  }

  case object Kopar extends Iso639_3 {
    final val value: String = "xop"
  }

  case object Korubo extends Iso639_3 {
    final val value: String = "xor"
  }

  case object Kowaki extends Iso639_3 {
    final val value: String = "xow"
  }

  case object LiberiaKpelle extends Iso639_3 {
    final val value: String = "xpe"
  }

  case object KulinaPano extends Iso639_3 {
    final val value: String = "xpk"
  }

  case object Kraho extends Iso639_3 {
    final val value: String = "xra"
  }

  case object EasternKaraboro extends Iso639_3 {
    final val value: String = "xrb"
  }

  case object Kreye extends Iso639_3 {
    final val value: String = "xre"
  }

  case object KrikatiTimbira extends Iso639_3 {
    final val value: String = "xri"
  }

  case object Marriammu extends Iso639_3 {
    final val value: String = "xru"
  }

  case object Karawa extends Iso639_3 {
    final val value: String = "xrw"
  }

  case object Sambal extends Iso639_3 {
    final val value: String = "xsb"
  }

  case object Sempan extends Iso639_3 {
    final val value: String = "xse"
  }

  case object Shamang extends Iso639_3 {
    final val value: String = "xsh"
  }

  case object Sio extends Iso639_3 {
    final val value: String = "xsi"
  }

  case object SouthSlavey extends Iso639_3 {
    final val value: String = "xsl"
  }

  case object Kasem extends Iso639_3 {
    final val value: String = "xsm"
  }

  case object NigerianSanga extends Iso639_3 {
    final val value: String = "xsn"
  }

  case object Silopi extends Iso639_3 {
    final val value: String = "xsp"
  }

  case object MakhuwaSaka extends Iso639_3 {
    final val value: String = "xsq"
  }

  case object Sherpa extends Iso639_3 {
    final val value: String = "xsr"
  }

  case object Sanuma extends Iso639_3 {
    final val value: String = "xsu"
  }

  case object Saisiyat extends Iso639_3 {
    final val value: String = "xsy"
  }

  case object AlcozaucaMixtec extends Iso639_3 {
    final val value: String = "xta"
  }

  case object ChazumbaMixtec extends Iso639_3 {
    final val value: String = "xtb"
  }

  case object KatchaKadugliMiri extends Iso639_3 {
    final val value: String = "xtc"
  }

  case object TilantongoMixtec extends Iso639_3 {
    final val value: String = "xtd"
  }

  case object Ketengban extends Iso639_3 {
    final val value: String = "xte"
  }

  case object SinicahuaMixtec extends Iso639_3 {
    final val value: String = "xti"
  }

  case object JuanTeitaMixtec extends Iso639_3 {
    final val value: String = "xtj"
  }

  case object TijaltepecMixtec extends Iso639_3 {
    final val value: String = "xtl"
  }

  case object MagdalenaPenascoMixtec extends Iso639_3 {
    final val value: String = "xtm"
  }

  case object NorthernTlaxiacoMixtec extends Iso639_3 {
    final val value: String = "xtn"
  }

  case object MiguelPiedrasMixtec extends Iso639_3 {
    final val value: String = "xtp"
  }

  case object SindihuiMixtec extends Iso639_3 {
    final val value: String = "xts"
  }

  case object TacahuaMixtec extends Iso639_3 {
    final val value: String = "xtt"
  }

  case object CuyamecalcoMixtec extends Iso639_3 {
    final val value: String = "xtu"
  }

  case object Tawande extends Iso639_3 {
    final val value: String = "xtw"
  }

  case object YoloxochitlMixtec extends Iso639_3 {
    final val value: String = "xty"
  }

  case object AluKurumba extends Iso639_3 {
    final val value: String = "xua"
  }

  case object BettaKurumba extends Iso639_3 {
    final val value: String = "xub"
  }

  case object Kunigami extends Iso639_3 {
    final val value: String = "xug"
  }

  case object JennuKurumba extends Iso639_3 {
    final val value: String = "xuj"
  }

  case object Kuo extends Iso639_3 {
    final val value: String = "xuo"
  }

  case object Kxoe extends Iso639_3 {
    final val value: String = "xuu"
  }

  case object Kamviri extends Iso639_3 {
    final val value: String = "xvi"
  }

  case object Kwaza extends Iso639_3 {
    final val value: String = "xwa"
  }

  case object XwelaGbe extends Iso639_3 {
    final val value: String = "xwe"
  }

  case object Kwegu extends Iso639_3 {
    final val value: String = "xwg"
  }

  case object WesternXwlaGbe extends Iso639_3 {
    final val value: String = "xwl"
  }

  case object KwerbaMamberamo extends Iso639_3 {
    final val value: String = "xwr"
  }

  case object Keo extends Iso639_3 {
    final val value: String = "xxk"
  }

  case object YortaYorta extends Iso639_3 {
    final val value: String = "xyy"
  }

  case object Yaminahua extends Iso639_3 {
    final val value: String = "yaa"
  }

  case object Yuhup extends Iso639_3 {
    final val value: String = "yab"
  }

  case object ValleyYali extends Iso639_3 {
    final val value: String = "yac"
  }

  case object Yagua extends Iso639_3 {
    final val value: String = "yad"
  }

  case object Pume extends Iso639_3 {
    final val value: String = "yae"
  }

  case object DemocraticRepublicOfCongoeseYaka extends Iso639_3 {
    final val value: String = "yaf"
  }

  case object Yamana extends Iso639_3 {
    final val value: String = "yag"
  }

  case object Yazgulyam extends Iso639_3 {
    final val value: String = "yah"
  }

  case object Yagnobi extends Iso639_3 {
    final val value: String = "yai"
  }

  case object BandaYangere extends Iso639_3 {
    final val value: String = "yaj"
  }

  case object Yakama extends Iso639_3 {
    final val value: String = "yak"
  }

  case object Yalunka extends Iso639_3 {
    final val value: String = "yal"
  }

  case object Yamba extends Iso639_3 {
    final val value: String = "yam"
  }

  case object Mayangna extends Iso639_3 {
    final val value: String = "yan"
  }

  case object Yao extends Iso639_3 {
    final val value: String = "yao"
  }

  case object Yapese extends Iso639_3 {
    final val value: String = "yap"
  }

  case object Yaqui extends Iso639_3 {
    final val value: String = "yaq"
  }

  case object Yabarana extends Iso639_3 {
    final val value: String = "yar"
  }

  case object CameroonianNugunu extends Iso639_3 {
    final val value: String = "yas"
  }

  case object Yambeta extends Iso639_3 {
    final val value: String = "yat"
  }

  case object Yuwana extends Iso639_3 {
    final val value: String = "yau"
  }

  case object Yangben extends Iso639_3 {
    final val value: String = "yav"
  }

  case object Yawalapiti extends Iso639_3 {
    final val value: String = "yaw"
  }

  case object Yauma extends Iso639_3 {
    final val value: String = "yax"
  }

  case object Agwagwune extends Iso639_3 {
    final val value: String = "yay"
  }

  case object Lokaa extends Iso639_3 {
    final val value: String = "yaz"
  }

  case object Yala extends Iso639_3 {
    final val value: String = "yba"
  }

  case object Yemba extends Iso639_3 {
    final val value: String = "ybb"
  }

  case object WestYugur extends Iso639_3 {
    final val value: String = "ybe"
  }

  case object Yakha extends Iso639_3 {
    final val value: String = "ybh"
  }

  case object Yamphu extends Iso639_3 {
    final val value: String = "ybi"
  }

  case object Hasha extends Iso639_3 {
    final val value: String = "ybj"
  }

  case object Bokha extends Iso639_3 {
    final val value: String = "ybk"
  }

  case object Yukuben extends Iso639_3 {
    final val value: String = "ybl"
  }

  case object Yaben extends Iso639_3 {
    final val value: String = "ybm"
  }

  case object Yabong extends Iso639_3 {
    final val value: String = "ybo"
  }

  case object Yawiyo extends Iso639_3 {
    final val value: String = "ybx"
  }

  case object Yaweyuha extends Iso639_3 {
    final val value: String = "yby"
  }

  case object Chesu extends Iso639_3 {
    final val value: String = "ych"
  }

  case object Lolopo extends Iso639_3 {
    final val value: String = "ycl"
  }

  case object Yucuna extends Iso639_3 {
    final val value: String = "ycn"
  }

  case object Chepya extends Iso639_3 {
    final val value: String = "ycp"
  }

  case object EasternYiddish extends Iso639_3 {
    final val value: String = "ydd"
  }

  case object YangumDey extends Iso639_3 {
    final val value: String = "yde"
  }

  case object Yidgha extends Iso639_3 {
    final val value: String = "ydg"
  }

  case object Yoidik extends Iso639_3 {
    final val value: String = "ydk"
  }

  case object Ravula extends Iso639_3 {
    final val value: String = "yea"
  }

  case object Yeniche extends Iso639_3 {
    final val value: String = "yec"
  }

  case object Yimas extends Iso639_3 {
    final val value: String = "yee"
  }

  case object Yevanic extends Iso639_3 {
    final val value: String = "yej"
  }

  case object Yela extends Iso639_3 {
    final val value: String = "yel"
  }

  case object Tarok extends Iso639_3 {
    final val value: String = "yer"
  }

  case object Nyankpa extends Iso639_3 {
    final val value: String = "yes"
  }

  case object Yetfa extends Iso639_3 {
    final val value: String = "yet"
  }

  case object Yerukula extends Iso639_3 {
    final val value: String = "yeu"
  }

  case object Yapunda extends Iso639_3 {
    final val value: String = "yev"
  }

  case object Yeyi extends Iso639_3 {
    final val value: String = "yey"
  }

  case object YangumGel extends Iso639_3 {
    final val value: String = "ygl"
  }

  case object Yagomi extends Iso639_3 {
    final val value: String = "ygm"
  }

  case object Gepo extends Iso639_3 {
    final val value: String = "ygp"
  }

  case object Yagaria extends Iso639_3 {
    final val value: String = "ygr"
  }

  case object YolnguSignLanguage extends Iso639_3 {
    final val value: String = "ygs"
  }

  case object Yugul extends Iso639_3 {
    final val value: String = "ygu"
  }

  case object Yagwoia extends Iso639_3 {
    final val value: String = "ygw"
  }

  case object BahaBuyang extends Iso639_3 {
    final val value: String = "yha"
  }

  case object IraqiArabic extends Iso639_3 {
    final val value: String = "yhd"
  }

  case object HlephoPhowa extends Iso639_3 {
    final val value: String = "yhl"
  }

  case object YannhanguSignLanguage extends Iso639_3 {
    final val value: String = "yhs"
  }

  case object Yinggarda extends Iso639_3 {
    final val value: String = "yia"
  }

  case object Yiddish extends Iso639_3 {
    final val value: String = "yid"
  }

  case object Ache extends Iso639_3 {
    final val value: String = "yif"
  }

  case object WusaNasu extends Iso639_3 {
    final val value: String = "yig"
  }

  case object WesternYiddish extends Iso639_3 {
    final val value: String = "yih"
  }

  case object Yidiny extends Iso639_3 {
    final val value: String = "yii"
  }

  case object Yindjibarndi extends Iso639_3 {
    final val value: String = "yij"
  }

  case object DongshanbaLalo extends Iso639_3 {
    final val value: String = "yik"
  }

  case object YimchungruNaga extends Iso639_3 {
    final val value: String = "yim"
  }

  case object Yinchia extends Iso639_3 {
    final val value: String = "yin"
  }

  case object Pholo extends Iso639_3 {
    final val value: String = "yip"
  }

  case object Miqie extends Iso639_3 {
    final val value: String = "yiq"
  }

  case object NorthAwyu extends Iso639_3 {
    final val value: String = "yir"
  }

  case object Yis extends Iso639_3 {
    final val value: String = "yis"
  }

  case object EasternLalu extends Iso639_3 {
    final val value: String = "yit"
  }

  case object Awu extends Iso639_3 {
    final val value: String = "yiu"
  }

  case object NorthernNisu extends Iso639_3 {
    final val value: String = "yiv"
  }

  case object AxiYi extends Iso639_3 {
    final val value: String = "yix"
  }

  case object Azhe extends Iso639_3 {
    final val value: String = "yiz"
  }

  case object Yakan extends Iso639_3 {
    final val value: String = "yka"
  }

  case object NorthernYukaghir extends Iso639_3 {
    final val value: String = "ykg"
  }

  case object Yoke extends Iso639_3 {
    final val value: String = "yki"
  }

  case object Yakaikeke extends Iso639_3 {
    final val value: String = "ykk"
  }

  case object Khlula extends Iso639_3 {
    final val value: String = "ykl"
  }

  case object Kap extends Iso639_3 {
    final val value: String = "ykm"
  }

  case object Kuansi extends Iso639_3 {
    final val value: String = "ykn"
  }

  case object Yasa extends Iso639_3 {
    final val value: String = "yko"
  }

  case object Yekora extends Iso639_3 {
    final val value: String = "ykr"
  }

  case object Kathu extends Iso639_3 {
    final val value: String = "ykt"
  }

  case object Kuamasi extends Iso639_3 {
    final val value: String = "yku"
  }

  case object Yakoma extends Iso639_3 {
    final val value: String = "yky"
  }

  case object Yaul extends Iso639_3 {
    final val value: String = "yla"
  }

  case object Yaleba extends Iso639_3 {
    final val value: String = "ylb"
  }

  case object Yele extends Iso639_3 {
    final val value: String = "yle"
  }

  case object Yelogu extends Iso639_3 {
    final val value: String = "ylg"
  }

  case object AnggurukYali extends Iso639_3 {
    final val value: String = "yli"
  }

  case object Yil extends Iso639_3 {
    final val value: String = "yll"
  }

  case object Limi extends Iso639_3 {
    final val value: String = "ylm"
  }

  case object LangnianBuyang extends Iso639_3 {
    final val value: String = "yln"
  }

  case object NaluoYi extends Iso639_3 {
    final val value: String = "ylo"
  }

  case object Aribwaung extends Iso639_3 {
    final val value: String = "ylu"
  }

  case object Nyalayu extends Iso639_3 {
    final val value: String = "yly"
  }

  case object Yambes extends Iso639_3 {
    final val value: String = "ymb"
  }

  case object SouthernMuji extends Iso639_3 {
    final val value: String = "ymc"
  }

  case object Muda extends Iso639_3 {
    final val value: String = "ymd"
  }

  case object Yamongeri extends Iso639_3 {
    final val value: String = "ymg"
  }

  case object Mili extends Iso639_3 {
    final val value: String = "ymh"
  }

  case object Moji extends Iso639_3 {
    final val value: String = "ymi"
  }

  case object Makwe extends Iso639_3 {
    final val value: String = "ymk"
  }

  case object Iamalele extends Iso639_3 {
    final val value: String = "yml"
  }

  case object Maay extends Iso639_3 {
    final val value: String = "ymm"
  }

  case object Yamna extends Iso639_3 {
    final val value: String = "ymn"
  }

  case object YangumMon extends Iso639_3 {
    final val value: String = "ymo"
  }

  case object Yamap extends Iso639_3 {
    final val value: String = "ymp"
  }

  case object QilaMuji extends Iso639_3 {
    final val value: String = "ymq"
  }

  case object Malasar extends Iso639_3 {
    final val value: String = "ymr"
  }

  case object NorthernMuji extends Iso639_3 {
    final val value: String = "ymx"
  }

  case object Muzi extends Iso639_3 {
    final val value: String = "ymz"
  }

  case object Aluo extends Iso639_3 {
    final val value: String = "yna"
  }

  case object Lange extends Iso639_3 {
    final val value: String = "yne"
  }

  case object Yango extends Iso639_3 {
    final val value: String = "yng"
  }

  case object NaukanYupik extends Iso639_3 {
    final val value: String = "ynk"
  }

  case object Yangulam extends Iso639_3 {
    final val value: String = "ynl"
  }

  case object Yong extends Iso639_3 {
    final val value: String = "yno"
  }

  case object Yendang extends Iso639_3 {
    final val value: String = "ynq"
  }

  case object Yansi extends Iso639_3 {
    final val value: String = "yns"
  }

  case object Yogad extends Iso639_3 {
    final val value: String = "yog"
  }

  case object Yonaguni extends Iso639_3 {
    final val value: String = "yoi"
  }

  case object Yokuts extends Iso639_3 {
    final val value: String = "yok"
  }

  case object Yombe extends Iso639_3 {
    final val value: String = "yom"
  }

  case object Yongkom extends Iso639_3 {
    final val value: String = "yon"
  }

  case object Yoruba extends Iso639_3 {
    final val value: String = "yor"
  }

  case object Yotti extends Iso639_3 {
    final val value: String = "yot"
  }

  case object Yoron extends Iso639_3 {
    final val value: String = "yox"
  }

  case object Yoy extends Iso639_3 {
    final val value: String = "yoy"
  }

  case object Phala extends Iso639_3 {
    final val value: String = "ypa"
  }

  case object LaboPhowa extends Iso639_3 {
    final val value: String = "ypb"
  }

  case object Phola extends Iso639_3 {
    final val value: String = "ypg"
  }

  case object Phupha extends Iso639_3 {
    final val value: String = "yph"
  }

  case object Phuma extends Iso639_3 {
    final val value: String = "ypm"
  }

  case object AniPhowa extends Iso639_3 {
    final val value: String = "ypn"
  }

  case object AloPhola extends Iso639_3 {
    final val value: String = "ypo"
  }

  case object Phupa extends Iso639_3 {
    final val value: String = "ypp"
  }

  case object Phuza extends Iso639_3 {
    final val value: String = "ypz"
  }

  case object Yerakai extends Iso639_3 {
    final val value: String = "yra"
  }

  case object Yareba extends Iso639_3 {
    final val value: String = "yrb"
  }

  case object Yaoure extends Iso639_3 {
    final val value: String = "yre"
  }

  case object Nenets extends Iso639_3 {
    final val value: String = "yrk"
  }

  case object Nhengatu extends Iso639_3 {
    final val value: String = "yrl"
  }

  case object YirrkMel extends Iso639_3 {
    final val value: String = "yrm"
  }

  case object Yerong extends Iso639_3 {
    final val value: String = "yrn"
  }

  case object Yaroame extends Iso639_3 {
    final val value: String = "yro"
  }

  case object Yarsun extends Iso639_3 {
    final val value: String = "yrs"
  }

  case object Yarawata extends Iso639_3 {
    final val value: String = "yrw"
  }

  case object Yarluyandi extends Iso639_3 {
    final val value: String = "yry"
  }

  case object Samatao extends Iso639_3 {
    final val value: String = "ysd"
  }

  case object Sonaga extends Iso639_3 {
    final val value: String = "ysg"
  }

  case object YugoslavianSignLanguage extends Iso639_3 {
    final val value: String = "ysl"
  }

  case object Sani extends Iso639_3 {
    final val value: String = "ysn"
  }

  case object ChineseNisi extends Iso639_3 {
    final val value: String = "yso"
  }

  case object SouthernLolopo extends Iso639_3 {
    final val value: String = "ysp"
  }

  case object YessanMayo extends Iso639_3 {
    final val value: String = "yss"
  }

  case object Sanie extends Iso639_3 {
    final val value: String = "ysy"
  }

  case object Talu extends Iso639_3 {
    final val value: String = "yta"
  }

  case object Tanglang extends Iso639_3 {
    final val value: String = "ytl"
  }

  case object Thopho extends Iso639_3 {
    final val value: String = "ytp"
  }

  case object YoutWam extends Iso639_3 {
    final val value: String = "ytw"
  }

  case object Yucateco extends Iso639_3 {
    final val value: String = "yua"
  }

  case object Yuchi extends Iso639_3 {
    final val value: String = "yuc"
  }

  case object TripolitanianArabic extends Iso639_3 {
    final val value: String = "yud"
  }

  case object YueChinese extends Iso639_3 {
    final val value: String = "yue"
  }

  case object HavasupaiWalapaiYavapai extends Iso639_3 {
    final val value: String = "yuf"
  }

  case object Yuruti extends Iso639_3 {
    final val value: String = "yui"
  }

  case object KarkarYuri extends Iso639_3 {
    final val value: String = "yuj"
  }

  case object Yulu extends Iso639_3 {
    final val value: String = "yul"
  }

  case object Quechan extends Iso639_3 {
    final val value: String = "yum"
  }

  case object NigerianBena extends Iso639_3 {
    final val value: String = "yun"
  }

  case object Yukpa extends Iso639_3 {
    final val value: String = "yup"
  }

  case object Yuqui extends Iso639_3 {
    final val value: String = "yuq"
  }

  case object Yurok extends Iso639_3 {
    final val value: String = "yur"
  }

  case object Yopno extends Iso639_3 {
    final val value: String = "yut"
  }

  case object MorobeYau extends Iso639_3 {
    final val value: String = "yuw"
  }

  case object SouthernYukaghir extends Iso639_3 {
    final val value: String = "yux"
  }

  case object EastYugur extends Iso639_3 {
    final val value: String = "yuy"
  }

  case object Yuracare extends Iso639_3 {
    final val value: String = "yuz"
  }

  case object Yawa extends Iso639_3 {
    final val value: String = "yva"
  }

  case object Kalou extends Iso639_3 {
    final val value: String = "ywa"
  }

  case object Yinhawangka extends Iso639_3 {
    final val value: String = "ywg"
  }

  case object WesternLalu extends Iso639_3 {
    final val value: String = "ywl"
  }

  case object Yawanawa extends Iso639_3 {
    final val value: String = "ywn"
  }

  case object LuquanYi extends Iso639_3 {
    final val value: String = "ywq"
  }

  case object Yawuru extends Iso639_3 {
    final val value: String = "ywr"
  }

  case object XishanbaLalo extends Iso639_3 {
    final val value: String = "ywt"
  }

  case object WumengNasu extends Iso639_3 {
    final val value: String = "ywu"
  }

  case object SanduanYau extends Iso639_3 {
    final val value: String = "yyu"
  }

  case object Ayizi extends Iso639_3 {
    final val value: String = "yyz"
  }

  case object EmaBuyang extends Iso639_3 {
    final val value: String = "yzg"
  }

  case object Zokhuo extends Iso639_3 {
    final val value: String = "yzk"
  }

  case object SierraDeJuarezZapotec extends Iso639_3 {
    final val value: String = "zaa"
  }

  case object TlacolulaValleyZapotec extends Iso639_3 {
    final val value: String = "zab"
  }

  case object OcotlanZapotec extends Iso639_3 {
    final val value: String = "zac"
  }

  case object CajonosZapotec extends Iso639_3 {
    final val value: String = "zad"
  }

  case object YareniZapotec extends Iso639_3 {
    final val value: String = "zae"
  }

  case object AyoquescoZapotec extends Iso639_3 {
    final val value: String = "zaf"
  }

  case object Zaghawa extends Iso639_3 {
    final val value: String = "zag"
  }

  case object Zangwal extends Iso639_3 {
    final val value: String = "zah"
  }

  case object IsthmusZapotec extends Iso639_3 {
    final val value: String = "zai"
  }

  case object Zaramo extends Iso639_3 {
    final val value: String = "zaj"
  }

  case object Zanaki extends Iso639_3 {
    final val value: String = "zak"
  }

  case object Zauzou extends Iso639_3 {
    final val value: String = "zal"
  }

  case object MiahuatlanZapotec extends Iso639_3 {
    final val value: String = "zam"
  }

  case object OzolotepecZapotec extends Iso639_3 {
    final val value: String = "zao"
  }

  case object Zapotec extends Iso639_3 {
    final val value: String = "zap"
  }

  case object AloapamZapotec extends Iso639_3 {
    final val value: String = "zaq"
  }

  case object RinconZapotec extends Iso639_3 {
    final val value: String = "zar"
  }

  case object DomingoAlbarradasZapotec extends Iso639_3 {
    final val value: String = "zas"
  }

  case object TabaaZapotec extends Iso639_3 {
    final val value: String = "zat"
  }

  case object Zangskari extends Iso639_3 {
    final val value: String = "zau"
  }

  case object YatzachiZapotec extends Iso639_3 {
    final val value: String = "zav"
  }

  case object MitlaZapotec extends Iso639_3 {
    final val value: String = "zaw"
  }

  case object XadaniZapotec extends Iso639_3 {
    final val value: String = "zax"
  }

  case object ZayseZergulla extends Iso639_3 {
    final val value: String = "zay"
  }

  case object Zari extends Iso639_3 {
    final val value: String = "zaz"
  }

  case object CentralBerawan extends Iso639_3 {
    final val value: String = "zbc"
  }

  case object EastBerawan extends Iso639_3 {
    final val value: String = "zbe"
  }

  case object Batui extends Iso639_3 {
    final val value: String = "zbt"
  }

  case object WestBerawan extends Iso639_3 {
    final val value: String = "zbw"
  }

  case object AltasZapotec extends Iso639_3 {
    final val value: String = "zca"
  }

  case object HongshuiheZhuang extends Iso639_3 {
    final val value: String = "zch"
  }

  case object NgazidjaComorian extends Iso639_3 {
    final val value: String = "zdj"
  }

  case object Zeeuws extends Iso639_3 {
    final val value: String = "zea"
  }

  case object Zenag extends Iso639_3 {
    final val value: String = "zeg"
  }

  case object EasternHongshuiheZhuang extends Iso639_3 {
    final val value: String = "zeh"
  }

  case object Zenaga extends Iso639_3 {
    final val value: String = "zen"
  }

  case object Kinga extends Iso639_3 {
    final val value: String = "zga"
  }

  case object GuibeiZhuang extends Iso639_3 {
    final val value: String = "zgb"
  }

  case object MoroccanTamazight extends Iso639_3 {
    final val value: String = "zgh"
  }

  case object MinzZhuang extends Iso639_3 {
    final val value: String = "zgm"
  }

  case object GuibianZhuang extends Iso639_3 {
    final val value: String = "zgn"
  }

  case object Magori extends Iso639_3 {
    final val value: String = "zgr"
  }

  case object Zhuang extends Iso639_3 {
    final val value: String = "zha"
  }

  case object Zhaba extends Iso639_3 {
    final val value: String = "zhb"
  }

  case object DaiZhuang extends Iso639_3 {
    final val value: String = "zhd"
  }

  case object Zhire extends Iso639_3 {
    final val value: String = "zhi"
  }

  case object NongZhuang extends Iso639_3 {
    final val value: String = "zhn"
  }

  case object Chinese extends Iso639_3 {
    final val value: String = "zho"
  }

  case object Zhoa extends Iso639_3 {
    final val value: String = "zhw"
  }

  case object Zia extends Iso639_3 {
    final val value: String = "zia"
  }

  case object ZimbabweSignLanguage extends Iso639_3 {
    final val value: String = "zib"
  }

  case object Zimakani extends Iso639_3 {
    final val value: String = "zik"
  }

  case object Zialo extends Iso639_3 {
    final val value: String = "zil"
  }

  case object Mesme extends Iso639_3 {
    final val value: String = "zim"
  }

  case object Zinza extends Iso639_3 {
    final val value: String = "zin"
  }

  case object Zigula extends Iso639_3 {
    final val value: String = "ziw"
  }

  case object Zizilivakan extends Iso639_3 {
    final val value: String = "ziz"
  }

  case object Kaimbulawa extends Iso639_3 {
    final val value: String = "zka"
  }

  case object Kadu extends Iso639_3 {
    final val value: String = "zkd"
  }

  case object Kanan extends Iso639_3 {
    final val value: String = "zkn"
  }

  case object Zakhring extends Iso639_3 {
    final val value: String = "zkr"
  }

  case object LiujiangZhuang extends Iso639_3 {
    final val value: String = "zlj"
  }

  case object Malay extends Iso639_3 {
    final val value: String = "zlm"
  }

  case object LianshanZhuang extends Iso639_3 {
    final val value: String = "zln"
  }

  case object LiuqianZhuang extends Iso639_3 {
    final val value: String = "zlq"
  }

  case object AustralianManda extends Iso639_3 {
    final val value: String = "zma"
  }

  case object Zimba extends Iso639_3 {
    final val value: String = "zmb"
  }

  case object Maridan extends Iso639_3 {
    final val value: String = "zmd"
  }

  case object Mfinu extends Iso639_3 {
    final val value: String = "zmf"
  }

  case object MartiKe extends Iso639_3 {
    final val value: String = "zmg"
  }

  case object SembilanMalay extends Iso639_3 {
    final val value: String = "zmi"
  }

  case object Maridjabin extends Iso639_3 {
    final val value: String = "zmj"
  }

  case object Marimanindji extends Iso639_3 {
    final val value: String = "zmm"
  }

  case object Mbangwe extends Iso639_3 {
    final val value: String = "zmn"
  }

  case object Molo extends Iso639_3 {
    final val value: String = "zmo"
  }

  case object Mpuono extends Iso639_3 {
    final val value: String = "zmp"
  }

  case object Mituku extends Iso639_3 {
    final val value: String = "zmq"
  }

  case object Maranunggu extends Iso639_3 {
    final val value: String = "zmr"
  }

  case object Mbesa extends Iso639_3 {
    final val value: String = "zms"
  }

  case object Maringarr extends Iso639_3 {
    final val value: String = "zmt"
  }

  case object DemocraticRepublicOfCongoeseMbo extends Iso639_3 {
    final val value: String = "zmw"
  }

  case object Bomitaba extends Iso639_3 {
    final val value: String = "zmx"
  }

  case object Mariyedi extends Iso639_3 {
    final val value: String = "zmy"
  }

  case object Mbandja extends Iso639_3 {
    final val value: String = "zmz"
  }

  case object ZanGula extends Iso639_3 {
    final val value: String = "zna"
  }

  case object Zande extends Iso639_3 {
    final val value: String = "zne"
  }

  case object Mang extends Iso639_3 {
    final val value: String = "zng"
  }

  case object Mangas extends Iso639_3 {
    final val value: String = "zns"
  }

  case object CopainalaZoque extends Iso639_3 {
    final val value: String = "zoc"
  }

  case object ChimalapaZoque extends Iso639_3 {
    final val value: String = "zoh"
  }

  case object Zou extends Iso639_3 {
    final val value: String = "zom"
  }

  case object AsuncionMixtepecZapotec extends Iso639_3 {
    final val value: String = "zoo"
  }

  case object TabascoZoque extends Iso639_3 {
    final val value: String = "zoq"
  }

  case object RayonZoque extends Iso639_3 {
    final val value: String = "zor"
  }

  case object FranciscoLeonZoque extends Iso639_3 {
    final val value: String = "zos"
  }

  case object LachiguiriZapotec extends Iso639_3 {
    final val value: String = "zpa"
  }

  case object YautepecZapotec extends Iso639_3 {
    final val value: String = "zpb"
  }

  case object ChoapanZapotec extends Iso639_3 {
    final val value: String = "zpc"
  }

  case object SoutheasternIxtlanZapotec extends Iso639_3 {
    final val value: String = "zpd"
  }

  case object PetapaZapotec extends Iso639_3 {
    final val value: String = "zpe"
  }

  case object PedroQuiatoniZapotec extends Iso639_3 {
    final val value: String = "zpf"
  }

  case object DeHumboldtZapotec extends Iso639_3 {
    final val value: String = "zpg"
  }

  case object TotomachapanZapotec extends Iso639_3 {
    final val value: String = "zph"
  }

  case object SantaMariaQuiegolaniZapotec extends Iso639_3 {
    final val value: String = "zpi"
  }

  case object QuiavicuzasZapotec extends Iso639_3 {
    final val value: String = "zpj"
  }

  case object TlacolulitaZapotec extends Iso639_3 {
    final val value: String = "zpk"
  }

  case object LachixioZapotec extends Iso639_3 {
    final val value: String = "zpl"
  }

  case object MixtepecZapotec extends Iso639_3 {
    final val value: String = "zpm"
  }

  case object SantaInesYatzechiZapotec extends Iso639_3 {
    final val value: String = "zpn"
  }

  case object AmatlanZapotec extends Iso639_3 {
    final val value: String = "zpo"
  }

  case object ElAltoZapotec extends Iso639_3 {
    final val value: String = "zpp"
  }

  case object ZoogochoZapotec extends Iso639_3 {
    final val value: String = "zpq"
  }

  case object SantiagoXanicaZapotec extends Iso639_3 {
    final val value: String = "zpr"
  }

  case object CoatlanZapotec extends Iso639_3 {
    final val value: String = "zps"
  }

  case object SanVicenteCoatlanZapotec extends Iso639_3 {
    final val value: String = "zpt"
  }

  case object YalalagZapotec extends Iso639_3 {
    final val value: String = "zpu"
  }

  case object ChichicapanZapotec extends Iso639_3 {
    final val value: String = "zpv"
  }

  case object ZanizaZapotec extends Iso639_3 {
    final val value: String = "zpw"
  }

  case object SanBaltazarLoxichaZapotec extends Iso639_3 {
    final val value: String = "zpx"
  }

  case object MazaltepecZapotec extends Iso639_3 {
    final val value: String = "zpy"
  }

  case object TexmelucanZapotec extends Iso639_3 {
    final val value: String = "zpz"
  }

  case object QiubeiZhuang extends Iso639_3 {
    final val value: String = "zqe"
  }

  case object Mirgan extends Iso639_3 {
    final val value: String = "zrg"
  }

  case object Zerenkel extends Iso639_3 {
    final val value: String = "zrn"
  }

  case object Zaparo extends Iso639_3 {
    final val value: String = "zro"
  }

  case object Mairasi extends Iso639_3 {
    final val value: String = "zrs"
  }

  case object Sarasira extends Iso639_3 {
    final val value: String = "zsa"
  }

  case object ZambianSignLanguage extends Iso639_3 {
    final val value: String = "zsl"
  }

  case object StandardMalay extends Iso639_3 {
    final val value: String = "zsm"
  }

  case object SouthernRinconZapotec extends Iso639_3 {
    final val value: String = "zsr"
  }

  case object Sukurum extends Iso639_3 {
    final val value: String = "zsu"
  }

  case object ElotepecZapotec extends Iso639_3 {
    final val value: String = "zte"
  }

  case object XanaguiaZapotec extends Iso639_3 {
    final val value: String = "ztg"
  }

  case object LapaguiaGuiviniZapotec extends Iso639_3 {
    final val value: String = "ztl"
  }

  case object SanAgustinMixtepecZapotec extends Iso639_3 {
    final val value: String = "ztm"
  }

  case object SantaCatarinaAlbarradasZapotec extends Iso639_3 {
    final val value: String = "ztn"
  }

  case object LoxichaZapotec extends Iso639_3 {
    final val value: String = "ztp"
  }

  case object QuioquitaniQuieriZapotec extends Iso639_3 {
    final val value: String = "ztq"
  }

  case object TilquiapanZapotec extends Iso639_3 {
    final val value: String = "zts"
  }

  case object TejalapanZapotec extends Iso639_3 {
    final val value: String = "ztt"
  }

  case object GuilaZapotec extends Iso639_3 {
    final val value: String = "ztu"
  }

  case object ZaachilaZapotec extends Iso639_3 {
    final val value: String = "ztx"
  }

  case object YateeZapotec extends Iso639_3 {
    final val value: String = "zty"
  }

  case object Zeem extends Iso639_3 {
    final val value: String = "zua"
  }

  case object Tokano extends Iso639_3 {
    final val value: String = "zuh"
  }

  case object Zulu extends Iso639_3 {
    final val value: String = "zul"
  }

  case object Kumzari extends Iso639_3 {
    final val value: String = "zum"
  }

  case object Zuni extends Iso639_3 {
    final val value: String = "zun"
  }

  case object Zumaya extends Iso639_3 {
    final val value: String = "zuy"
  }

  case object Zay extends Iso639_3 {
    final val value: String = "zwa"
  }

  case object YongbeiZhuang extends Iso639_3 {
    final val value: String = "zyb"
  }

  case object YangZhuang extends Iso639_3 {
    final val value: String = "zyg"
  }

  case object YoujiangZhuang extends Iso639_3 {
    final val value: String = "zyj"
  }

  case object YongnanZhuang extends Iso639_3 {
    final val value: String = "zyn"
  }

  case object ZypheChin extends Iso639_3 {
    final val value: String = "zyp"
  }

  case object Zaza extends Iso639_3 {
    final val value: String = "zza"
  }

  case object ZuojiangZhuang extends Iso639_3 {
    final val value: String = "zzj"
  }

}