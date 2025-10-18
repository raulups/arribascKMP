package  org.arribasc.project.core.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import  org.arribasc.project.core.presentation.darkBackground

@Composable
fun DarkBackground() {
    val bg = Brush.verticalGradient(
        0f to darkBackground,
        0.5f to darkBackground.copy(alpha = 0.98f),
        1f to darkBackground.copy(alpha = 0.92f)
    )

    Box(
        Modifier
            .fillMaxSize()
            .background(bg)
            .blur(24.dp)
    )
}