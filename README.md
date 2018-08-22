# lingvo

Lingvo is a package containing enumerations of various ISO codes related to language, including a considerable amount of the ISO 639-3 and ISO 15924 standards.

Lingvo enumerations are:

## Type safe

Language codes used in programs are typically handled one of two ways:

1. stringified representation
2. closed-source enumerations of language codes

Both of these leave a lot to be desired. By using a stringified representation, a consumer needs to validate that a string is a valid code. By using made-to-order enumerations of ISO codes, a consumer is unlikely to be able to use these codes to consume results. 

Lingvo hopes to remedy this by making the enumerations an open-source standard in which a non-existent ISO code is an invalid ISO code. 

For example, consider the notional interface for a language identification tool:

```scala
import org.mitre.lingvo.languages.Iso639_3

trait LanguageIdentifier {
  def identify(text: String): Iso639_3
}
```

In this example, there is no way an invalid language code could be returned from the identification method: the returned value is strictly a valid `Iso639_3` -- a consuming client does not need to worry about checking the validity.

## JSON (de)serializable 

Lingvo enumerations are JSON serializable using play-json. Because of this, lingvo enumerations can be used in web services.

```scala
import play.api.libs.json.Json
import org.mitre.lingvo.languages.Iso639_3 
println(Json.toJson(Iso639_3.English)) // {"value": "eng"}
```

### Authors

- [Elijah Rippeth](mailto:erippeth@mitre.org)

### Disclaimers

Approved for Public Release; Distribution Unlimited. Case Number 18-2247.

The authors' affiliations with the MITRE Corporation is provided for identification purposes only, and is not intended to convey or imply MITRE's concurrence with, or support for, the positions, opinions or viewpoints expressed by the authors.
