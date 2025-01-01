import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ClickablePngIcon(
    iconResource: Int,
    contentDescription: String?,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = iconResource),
            contentDescription = contentDescription,
            modifier = Modifier
                .size(35.dp) // Set size for the icon
                .clickable { onClick() } // Make it clickable
                .align(Alignment.TopEnd) // Align within the Box
        )
    }
}
