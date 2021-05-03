package ftl.environment

import ftl.api.Locale
import ftl.run.exception.FlankGeneralError
import ftl.util.applyColorsUsing
import ftl.util.buildTable

fun List<Locale>.toCliTable() = createTestEnvironment().createLocalesTable()

fun List<Locale>.createTestEnvironment() =
    fold(mutableMapOf<String, MutableList<String>>()) { allLocales, locale ->
        allLocales.apply {
            getOrCreateList(LOCALE).add(locale.id.orEmpty())
            getOrCreateList(NAME).add(locale.name.orEmpty())
            getOrCreateList(REGION).add(locale.region.orEmpty())
            getOrCreateList(TAGS).add(locale.tags.joinToString().orEmpty())
        }
    }

fun TestEnvironmentInfo.createLocalesTable() = buildTable(
    createTableColumnFor(LOCALE),
    createTableColumnFor(NAME),
    createTableColumnFor(REGION),
    createTableColumnFor(ftl.environment.TAGS).applyColorsUsing(tagToSystemOutColorMapper)
)

private const val LOCALE = "LOCALE"
private const val NAME = "NAME"
private const val REGION = "REGION"

fun List<Locale>.getLocaleDescription(localeId: String) =
    findLocales(localeId)?.prepareDescription().orErrorMessage(localeId).plus("\n")

private fun List<Locale>.findLocales(localeId: String) = find { it.id == localeId }

private fun Locale.prepareDescription() = """
    id: $id
    name: $name
""".trimIndent().addRegionIfExist(region).addTagsIfExists(this)

private fun String.addRegionIfExist(region: String?) =
    if (!region.isNullOrEmpty()) StringBuilder(this).appendLine("\nregion: $region").trim().toString()
    else this

private fun String.addTagsIfExists(locale: Locale) =
    if (!locale.tags.isNullOrEmpty()) StringBuilder(this).appendLine("\ntags:").appendTagsToList(locale)
    else this

private fun StringBuilder.appendTagsToList(locale: Locale) = apply {
    locale.tags.filterNotNull().forEach { tag -> appendLine("- $tag") }
}.trim().toString()

private fun String?.orErrorMessage(locale: String) =
    this ?: throw FlankGeneralError("ERROR: '$locale' is not a valid locale")