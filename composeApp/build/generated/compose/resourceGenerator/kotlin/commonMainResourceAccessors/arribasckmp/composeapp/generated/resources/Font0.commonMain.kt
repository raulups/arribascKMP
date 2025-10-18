@file:OptIn(InternalResourceApi::class)

package arribasckmp.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.FontResource
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.ResourceItem

private const val MD: String = "composeResources/arribasckmp.composeapp.generated.resources/"

internal val Res.font.FontBlack: FontResource by lazy {
      FontResource("font:FontBlack", setOf(
        ResourceItem(setOf(), "${MD}font/FontBlack.ttf", -1, -1),
      ))
    }

internal val Res.font.FontBold: FontResource by lazy {
      FontResource("font:FontBold", setOf(
        ResourceItem(setOf(), "${MD}font/FontBold.ttf", -1, -1),
      ))
    }

internal val Res.font.FontExtraBold: FontResource by lazy {
      FontResource("font:FontExtraBold", setOf(
        ResourceItem(setOf(), "${MD}font/FontExtraBold.ttf", -1, -1),
      ))
    }

internal val Res.font.FontLight: FontResource by lazy {
      FontResource("font:FontLight", setOf(
        ResourceItem(setOf(), "${MD}font/FontLight.ttf", -1, -1),
      ))
    }

internal val Res.font.FontMedium: FontResource by lazy {
      FontResource("font:FontMedium", setOf(
        ResourceItem(setOf(), "${MD}font/FontMedium.ttf", -1, -1),
      ))
    }

internal val Res.font.FontRegular: FontResource by lazy {
      FontResource("font:FontRegular", setOf(
        ResourceItem(setOf(), "${MD}font/FontRegular.ttf", -1, -1),
      ))
    }

internal val Res.font.FontThin: FontResource by lazy {
      FontResource("font:FontThin", setOf(
        ResourceItem(setOf(), "${MD}font/FontThin.ttf", -1, -1),
      ))
    }

@InternalResourceApi
internal fun _collectCommonMainFont0Resources(map: MutableMap<String, FontResource>) {
  map.put("FontBlack", Res.font.FontBlack)
  map.put("FontBold", Res.font.FontBold)
  map.put("FontExtraBold", Res.font.FontExtraBold)
  map.put("FontLight", Res.font.FontLight)
  map.put("FontMedium", Res.font.FontMedium)
  map.put("FontRegular", Res.font.FontRegular)
  map.put("FontThin", Res.font.FontThin)
}
