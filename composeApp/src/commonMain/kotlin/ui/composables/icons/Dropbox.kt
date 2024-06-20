import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
private fun VectorPreview() {
    Image(Dropbox, null)
}

private var _Dropbox: ImageVector? = null

val Dropbox: ImageVector
		get() {
			if (_Dropbox != null) {
				return _Dropbox!!
			}
_Dropbox = ImageVector.Builder(
                name = "Dropbox",
                defaultWidth = 800.dp,
                defaultHeight = 800.dp,
                viewportWidth = 48f,
                viewportHeight = 48f
            ).apply {
				group {
					group(
						scaleX = 1f,
						scaleY = 1f,
						translationX = -800f,
						translationY = -363f,
						pivotX = 0f,
						pivotY = 0f,
) {
						path(
    						fill = SolidColor(Color(0xFF0F82E2)),
    						fillAlpha = 1.0f,
    						stroke = null,
    						strokeAlpha = 1.0f,
    						strokeLineWidth = 1f,
    						strokeLineCap = StrokeCap.Butt,
    						strokeLineJoin = StrokeJoin.Miter,
    						strokeLineMiter = 1.0f,
    						pathFillType = PathFillType.EvenOdd
						) {
							moveTo(824f, 389.033255f)
							lineTo(814.1195f, 397.34573f)
							lineTo(800f, 388.053538f)
							lineTo(809.7635f, 380.17347f)
							lineTo(823.999971f, 389.033238f)
							lineTo(838.2362f, 380.172109f)
							lineTo(847.9997f, 388.05369f)
							lineTo(833.8802f, 397.345881f)
							lineTo(823.9997f, 389.033406f)
							close()
							moveTo(814.1198f, 363f)
							lineTo(800.0003f, 372.292191f)
							lineTo(809.7638f, 380.17226f)
							lineTo(824.0003f, 371.312475f)
							lineTo(814.1198f, 363f)
							close()
							moveTo(824.02895f, 390.821692f)
							lineTo(814.11995f, 399.109976f)
							lineTo(809.87945f, 396.318993f)
							lineTo(809.87945f, 399.447132f)
							lineTo(824.02895f, 408f)
							lineTo(838.17845f, 399.447132f)
							lineTo(838.17845f, 396.318993f)
							lineTo(833.93795f, 399.109976f)
							lineTo(824.02895f, 390.821692f)
							close()
							moveTo(848f, 372.292343f)
							lineTo(833.8805f, 363.000151f)
							lineTo(824f, 371.312626f)
							lineTo(838.2365f, 380.172411f)
							lineTo(848f, 372.292343f)
							close()
}
}
}
}.build()
return _Dropbox!!
		}

