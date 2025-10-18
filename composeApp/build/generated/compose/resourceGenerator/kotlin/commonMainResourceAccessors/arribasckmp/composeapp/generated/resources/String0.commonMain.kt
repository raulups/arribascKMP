@file:OptIn(InternalResourceApi::class)

package arribasckmp.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.ResourceItem
import org.jetbrains.compose.resources.StringResource

private const val MD: String = "composeResources/arribasckmp.composeapp.generated.resources/"

internal val Res.string.book_cover: StringResource by lazy {
      StringResource("string:book_cover", "book_cover", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 10, 34),
      ))
    }

internal val Res.string.close_hint: StringResource by lazy {
      StringResource("string:close_hint", "close_hint", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 45, 34),
      ))
    }

internal val Res.string.description_unavailable: StringResource by lazy {
      StringResource("string:description_unavailable", "description_unavailable", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 80, 67),
      ))
    }

internal val Res.string.error_disk_full: StringResource by lazy {
      StringResource("string:error_disk_full", "error_disk_full", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 148, 75),
      ))
    }

internal val Res.string.error_no_internet: StringResource by lazy {
      StringResource("string:error_no_internet", "error_no_internet", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 224, 109),
      ))
    }

internal val Res.string.error_request_timeout: StringResource by lazy {
      StringResource("string:error_request_timeout", "error_request_timeout", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 334, 61),
      ))
    }

internal val Res.string.error_serialization: StringResource by lazy {
      StringResource("string:error_serialization", "error_serialization", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 396, 55),
      ))
    }

internal val Res.string.error_too_many_requests: StringResource by lazy {
      StringResource("string:error_too_many_requests", "error_too_many_requests", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 452, 75),
      ))
    }

internal val Res.string.error_unknown: StringResource by lazy {
      StringResource("string:error_unknown", "error_unknown", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 528, 57),
      ))
    }

internal val Res.string.favorites: StringResource by lazy {
      StringResource("string:favorites", "favorites", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 586, 29),
      ))
    }

internal val Res.string.go_back: StringResource by lazy {
      StringResource("string:go_back", "go_back", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 616, 27),
      ))
    }

internal val Res.string.languages: StringResource by lazy {
      StringResource("string:languages", "languages", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 644, 29),
      ))
    }

internal val Res.string.mark_as_favorite: StringResource by lazy {
      StringResource("string:mark_as_favorite", "mark_as_favorite", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 674, 48),
      ))
    }

internal val Res.string.no_favorite_books: StringResource by lazy {
      StringResource("string:no_favorite_books", "no_favorite_books", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 723, 57),
      ))
    }

internal val Res.string.no_search_results: StringResource by lazy {
      StringResource("string:no_search_results", "no_search_results", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 781, 93),
      ))
    }

internal val Res.string.pages: StringResource by lazy {
      StringResource("string:pages", "pages", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 875, 21),
      ))
    }

internal val Res.string.rating: StringResource by lazy {
      StringResource("string:rating", "rating", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 897, 22),
      ))
    }

internal val Res.string.remove_from_favorites: StringResource by lazy {
      StringResource("string:remove_from_favorites", "remove_from_favorites", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 920, 57),
      ))
    }

internal val Res.string.search_hint: StringResource by lazy {
      StringResource("string:search_hint", "search_hint", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 978, 31),
      ))
    }

internal val Res.string.search_results: StringResource by lazy {
      StringResource("string:search_results", "search_results", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 1010, 42),
      ))
    }

internal val Res.string.synopsis: StringResource by lazy {
      StringResource("string:synopsis", "synopsis", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 1053, 28),
      ))
    }

@InternalResourceApi
internal fun _collectCommonMainString0Resources(map: MutableMap<String, StringResource>) {
  map.put("book_cover", Res.string.book_cover)
  map.put("close_hint", Res.string.close_hint)
  map.put("description_unavailable", Res.string.description_unavailable)
  map.put("error_disk_full", Res.string.error_disk_full)
  map.put("error_no_internet", Res.string.error_no_internet)
  map.put("error_request_timeout", Res.string.error_request_timeout)
  map.put("error_serialization", Res.string.error_serialization)
  map.put("error_too_many_requests", Res.string.error_too_many_requests)
  map.put("error_unknown", Res.string.error_unknown)
  map.put("favorites", Res.string.favorites)
  map.put("go_back", Res.string.go_back)
  map.put("languages", Res.string.languages)
  map.put("mark_as_favorite", Res.string.mark_as_favorite)
  map.put("no_favorite_books", Res.string.no_favorite_books)
  map.put("no_search_results", Res.string.no_search_results)
  map.put("pages", Res.string.pages)
  map.put("rating", Res.string.rating)
  map.put("remove_from_favorites", Res.string.remove_from_favorites)
  map.put("search_hint", Res.string.search_hint)
  map.put("search_results", Res.string.search_results)
  map.put("synopsis", Res.string.synopsis)
}
