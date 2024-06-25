import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
private fun VectorPreview() {
    Image(Logout, null)
}

private var _Logout: ImageVector? = null

val Logout: ImageVector
		get() {
			if (_Logout != null) {
				return _Logout!!
			}
_Logout = ImageVector.Builder(
                name = "Logout",
                defaultWidth = 800.dp,
                defaultHeight = 800.dp,
                viewportWidth = 25f,
                viewportHeight = 25f
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
					moveTo(11.75f, 9.874f)
					curveTo(11.75f, 10.2882f, 12.0858f, 10.624f, 12.5f, 10.624f)
					curveTo(12.9142f, 10.624f, 13.25f, 10.2882f, 13.25f, 9.874f)
					horizontalLineTo(11.75f)
					close()
					moveTo(13.25f, 4f)
					curveTo(13.25f, 3.5858f, 12.9142f, 3.25f, 12.5f, 3.25f)
					curveTo(12.0858f, 3.25f, 11.75f, 3.5858f, 11.75f, 4f)
					horizontalLineTo(13.25f)
					close()
					moveTo(9.81082f, 6.66156f)
					curveTo(10.1878f, 6.4899f, 10.3542f, 6.0451f, 10.1826f, 5.6682f)
					curveTo(10.0109f, 5.2912f, 9.5662f, 5.1248f, 9.1892f, 5.2964f)
					lineTo(9.81082f, 6.66156f)
					close()
					moveTo(5.5f, 12.16f)
					lineTo(4.7499f, 12.1561f)
					lineTo(4.75005f, 12.1687f)
					lineTo(5.5f, 12.16f)
					close()
					moveTo(12.5f, 19f)
					lineTo(12.5086f, 18.25f)
					curveTo(12.5029f, 18.25f, 12.4971f, 18.25f, 12.4914f, 18.25f)
					lineTo(12.5f, 19f)
					close()
					moveTo(19.5f, 12.16f)
					lineTo(20.2501f, 12.1687f)
					lineTo(20.25f, 12.1561f)
					lineTo(19.5f, 12.16f)
					close()
					moveTo(15.8108f, 5.29644f)
					curveTo(15.4338f, 5.1248f, 14.9891f, 5.2912f, 14.8174f, 5.6682f)
					curveTo(14.6458f, 6.0451f, 14.8122f, 6.4899f, 15.1892f, 6.6616f)
					lineTo(15.8108f, 5.29644f)
					close()
					moveTo(13.25f, 9.874f)
					verticalLineTo(4f)
					horizontalLineTo(11.75f)
					verticalLineTo(9.874f)
					horizontalLineTo(13.25f)
					close()
					moveTo(9.18918f, 5.29644f)
					curveTo(6.4984f, 6.5217f, 4.7655f, 9.1995f, 4.75f, 12.1561f)
					lineTo(6.24999f, 12.1639f)
					curveTo(6.2624f, 9.7924f, 7.6525f, 7.6444f, 9.8108f, 6.6616f)
					lineTo(9.18918f, 5.29644f)
					close()
					moveTo(4.75005f, 12.1687f)
					curveTo(4.7993f, 16.4046f, 8.2728f, 19.7986f, 12.5086f, 19.75f)
					lineTo(12.4914f, 18.25f)
					curveTo(9.0838f, 18.2892f, 6.2896f, 15.5588f, 6.25f, 12.1513f)
					lineTo(4.75005f, 12.1687f)
					close()
					moveTo(12.4914f, 19.75f)
					curveTo(16.7272f, 19.7986f, 20.2007f, 16.4046f, 20.2499f, 12.1687f)
					lineTo(18.7501f, 12.1513f)
					curveTo(18.7104f, 15.5588f, 15.9162f, 18.2892f, 12.5086f, 18.25f)
					lineTo(12.4914f, 19.75f)
					close()
					moveTo(20.25f, 12.1561f)
					curveTo(20.2345f, 9.1995f, 18.5016f, 6.5217f, 15.8108f, 5.2964f)
					lineTo(15.1892f, 6.66156f)
					curveTo(17.3475f, 7.6444f, 18.7376f, 9.7924f, 18.75f, 12.1639f)
					lineTo(20.25f, 12.1561f)
					close()
}
}.build()
return _Logout!!
		}

