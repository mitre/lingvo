/*
 * Copyright (c) 2018 The MITRE Corporation. All rights reserved.
 */

package org.mitre.lingvo.languages

import org.scalatest.{ Matchers, WordSpecLike }
import play.api.libs.json.{ JsSuccess, Json }

class Iso639_3Spec extends WordSpecLike with Matchers {
  "An ISO 639-3 language" should {
    "be JSON serializable and deserializable" in {

      Iso639_3.values.foreach { lang =>
        val json = Json.toJson(lang)

        Json.fromJson[Iso639_3](json) match {
          case JsSuccess(`lang`, _) => `lang` should ===(lang)
          case _                    => fail(s"Language '${}' did not (de)serialize correctly.")
        }
      }
    }

    "throw when an enumeration is gotten with a value that does not exist" in {
      assertThrows[NoSuchElementException](Iso639_3.withValue("invalid"))
    }

    "get enumerations by value" in {
      Iso639_3.values.foreach { lang =>
        Iso639_3.withValue(lang.value) should ===(lang)
      }
    }
  }
}
