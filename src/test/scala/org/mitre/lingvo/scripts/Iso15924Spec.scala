/*
 * Copyright (c) 2018 The MITRE Corporation. All rights reserved.
 */

package org.mitre.lingvo.scripts

import org.scalatest.{Matchers, WordSpecLike}
import play.api.libs.json.{JsSuccess, Json}

class Iso15924Spec extends WordSpecLike with Matchers {
  "An ISO 15924 script" should {
    "be JSON serializable and deserializable" in {

      Iso15924.values.foreach { script =>
        val json = Json.toJson(script)

        Json.fromJson[Iso15924](json) match {
          case JsSuccess(`script`, _) => `script` should ===(script)
          case _ => fail(s"Script '${}' did not (de)serialize correctly.")
        }
      }
    }

    "throw when an enumeration is gotten with a value that does not exist" in {
      assertThrows[NoSuchElementException](Iso15924.withName("invalid"))
    }

    "get enumerations by value" in {
      Iso15924.values.foreach { script =>
        Iso15924.withValue(script.value) should===(script)
      }
    }
  }
}
