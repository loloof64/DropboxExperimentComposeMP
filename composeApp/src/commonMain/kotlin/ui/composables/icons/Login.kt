import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
private fun VectorPreview() {
    Image(Login, null)
}

private var _Login: ImageVector? = null

val Login: ImageVector
		get() {
			if (_Login != null) {
				return _Login!!
			}
_Login = ImageVector.Builder(
                name = "Login",
                defaultWidth = 800.dp,
                defaultHeight = 800.dp,
                viewportWidth = 256f,
                viewportHeight = 241f
            ).apply {
				path(
    				fill = SolidColor(Color(0xFF000000)),
    				fillAlpha = 1.0f,
    				stroke = null,
    				strokeAlpha = 1.0f,
    				strokeLineWidth = 1.0f,
    				strokeLineCap = StrokeCap.Butt,
    				strokeLineJoin = StrokeJoin.Miter,
    				strokeLineMiter = 1.0f,
    				pathFillType = PathFillType.NonZero
				) {
					moveTo(254f, 188f)
					verticalLineTo(2f)
					horizontalLineTo(2f)
					verticalLineToRelative(186f)
					horizontalLineToRelative(111f)
					verticalLineToRelative(29f)
					horizontalLineTo(75f)
					verticalLineToRelative(22f)
					horizontalLineToRelative(106f)
					verticalLineToRelative(-22f)
					horizontalLineToRelative(-38f)
					verticalLineToRelative(-29f)
					horizontalLineTo(254f)
					close()
					moveTo(19f, 19f)
					horizontalLineToRelative(217f)
					verticalLineToRelative(151f)
					horizontalLineTo(19f)
					lineTo(19f, 19f)
					close()
					moveTo(100.59f, 138.49f)
					lineToRelative(-1.447f, -13.313f)
					lineToRelative(11.757f, 3.003f)
					lineToRelative(-1.519f, -13.096f)
					lineToRelative(11.395f, 2.93f)
					lineToRelative(-1.519f, -13.24f)
					lineToRelative(14.868f, 3.003f)
					lineToRelative(9.08f, -9.08f)
					curveToRelative(8.791f, 1.917f, 18.377f, -0.506f, 25.25f, -7.38f)
					curveToRelative(10.708f, -10.708f, 10.744f, -28.036f, 0f, -38.78f)
					reflectiveCurveToRelative(-28f, -10.636f, -38.672f, 0.036f)
					curveToRelative(-6.801f, 6.801f, -9.297f, 16.315f, -7.452f, 25.033f)
					lineTo(79.5f, 120.438f)
					lineToRelative(0.506f, 19.535f)
					lineTo(100.59f, 138.49f)
					close()
					moveTo(155.143f, 65.922f)
					curveToRelative(-2.351f, -2.351f, -2.388f, -6.222f, 0f, -8.61f)
					curveToRelative(2.388f, -2.388f, 6.222f, -2.388f, 8.61f, 0f)
					curveToRelative(2.388f, 2.388f, 2.388f, 6.222f, 0f, 8.61f)
					curveTo(161.329f, 68.345f, 157.494f, 68.273f, 155.143f, 65.922f)
					close()
}
}.build()
return _Login!!
		}

