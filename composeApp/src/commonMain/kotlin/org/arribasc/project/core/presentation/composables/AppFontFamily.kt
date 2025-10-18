package  org.arribasc.project.core.presentation.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import arribasckmp.composeapp.generated.resources.FontBlack
import arribasckmp.composeapp.generated.resources.FontBold
import arribasckmp.composeapp.generated.resources.FontExtraBold
import arribasckmp.composeapp.generated.resources.FontLight
import arribasckmp.composeapp.generated.resources.FontMedium
import arribasckmp.composeapp.generated.resources.FontRegular
import arribasckmp.composeapp.generated.resources.FontThin
import arribasckmp.composeapp.generated.resources.Res
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