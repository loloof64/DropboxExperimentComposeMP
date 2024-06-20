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
    Image(Pc, null)
}

private var _Pc: ImageVector? = null

val Pc: ImageVector
		get() {
			if (_Pc != null) {
				return _Pc!!
			}
_Pc = ImageVector.Builder(
                name = "Pc",
                defaultWidth = 800.dp,
                defaultHeight = 800.dp,
                viewportWidth = 1024f,
                viewportHeight = 1024f
            ).apply {
				path(
    				fill = SolidColor(Color(0xFFB3B3B3)),
    				fillAlpha = 1.0f,
    				stroke = null,
    				strokeAlpha = 1.0f,
    				strokeLineWidth = 1.0f,
    				strokeLineCap = StrokeCap.Butt,
    				strokeLineJoin = StrokeJoin.Miter,
    				strokeLineMiter = 1.0f,
    				pathFillType = PathFillType.NonZero
				) {
					moveTo(640f, 960f)
					horizontalLineTo(384f)
					lineToRelative(21.333333f, -149.333333f)
					horizontalLineToRelative(213.333334f)
					close()
}
				path(
    				fill = SolidColor(Color(0xFF444444)),
    				fillAlpha = 1.0f,
    				stroke = null,
    				strokeAlpha = 1.0f,
    				strokeLineWidth = 1.0f,
    				strokeLineCap = StrokeCap.Butt,
    				strokeLineJoin = StrokeJoin.Miter,
    				strokeLineMiter = 1.0f,
    				pathFillType = PathFillType.NonZero
				) {
					moveTo(938.666667f, 21.333333f)
					horizontalLineTo(85.333333f)
					arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 64f)
					verticalLineToRelative(597.333334f)
					horizontalLineToRelative(981.333334f)
					verticalLineTo(85.333333f)
					arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, -64f)
					close()
}
				path(
    				fill = SolidColor(Color(0xFFE6E6E6)),
    				fillAlpha = 1.0f,
    				stroke = null,
    				strokeAlpha = 1.0f,
    				strokeLineWidth = 1.0f,
    				strokeLineCap = StrokeCap.Butt,
    				strokeLineJoin = StrokeJoin.Miter,
    				strokeLineMiter = 1.0f,
    				pathFillType = PathFillType.NonZero
				) {
					moveTo(21.333333f, 682.666667f)
					verticalLineToRelative(106.666666f)
					arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
					horizontalLineToRelative(853.333334f)
					arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
					verticalLineToRelative(-106.666666f)
					horizontalLineTo(21.333333f)
					close()
}
				path(
    				fill = SolidColor(Color(0xFF43A6DD)),
    				fillAlpha = 1.0f,
    				stroke = null,
    				strokeAlpha = 1.0f,
    				strokeLineWidth = 1.0f,
    				strokeLineCap = StrokeCap.Butt,
    				strokeLineJoin = StrokeJoin.Miter,
    				strokeLineMiter = 1.0f,
    				pathFillType = PathFillType.NonZero
				) {
					moveTo(85.333333f, 85.333333f)
					horizontalLineToRelative(853.333334f)
					verticalLineToRelative(533.333334f)
					horizontalLineTo(85.333333f)
					close()
}
				path(
    				fill = SolidColor(Color(0xFFE6E6E6)),
    				fillAlpha = 1.0f,
    				stroke = null,
    				strokeAlpha = 1.0f,
    				strokeLineWidth = 1.0f,
    				strokeLineCap = StrokeCap.Butt,
    				strokeLineJoin = StrokeJoin.Miter,
    				strokeLineMiter = 1.0f,
    				pathFillType = PathFillType.NonZero
				) {
					moveTo(746.666667f, 1024f)
					horizontalLineTo(277.333333f)
					arcToRelative(85.333333f, 85.333333f, 0f, isMoreThanHalf = false, isPositiveArc = true, 85.333334f, -85.333333f)
					horizontalLineToRelative(298.666666f)
					arcToRelative(85.333333f, 85.333333f, 0f, isMoreThanHalf = false, isPositiveArc = true, 85.333334f, 85.333333f)
					close()
}
}.build()
return _Pc!!
		}

