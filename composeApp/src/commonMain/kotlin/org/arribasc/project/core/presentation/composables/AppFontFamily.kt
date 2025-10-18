package  org.arribasc.project.core.presentation.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import emer.composeapp.generated.resources.FontBlack
import emer.composeapp.generated.resources.FontBold
import emer.composeapp.generated.resources.FontExtraBold
import emer.composeapp.generated.resources.FontLight
import emer.composeapp.generated.resources.FontMedium
import emer.composeapp.generated.resources.FontRegular
import emer.composeapp.generated.resources.FontThin
import emer.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font as ResFont

@Composable
fun AppFontFamily(): FontFamily = FontFamily(
    ResFont(Res.font.FontThin, weight = FontWeight.Thin),
    ResFont(Res.font.FontLight, weight = FontWeight.Light),
    ResFont(Res.font.FontRegular, weight = FontWeight.Normal),
    ResFont(Res.font.FontMedium, weight = FontWeight.Medium),
    ResFont(Res.font.FontBold, weight = FontWeight.Bold),
    ResFont(Res.font.FontExtraBold, weight = FontWeight.ExtraBold),
    ResFont(Res.font.FontBlack, weight = FontWeight.Black)
)