package com.example.rdiegofoodapp.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


public val CircleUserRound: ImageVector
    get() {
        if (_CircleUserRound != null) {
            return _CircleUserRound!!
        }
        _CircleUserRound = ImageVector.Builder(
            name = "CircleUserRound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(18f, 20f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 0f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(16f, 10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 10f)
                close()
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                close()
            }
        }.build()
        return _CircleUserRound!!
    }

private lateinit var _CircleUserRound: ImageVector




public val UserCircle: ImageVector

    get() {
        if (_UserCircle != null) {
            return _UserCircle!!
        }
        _UserCircle = ImageVector.Builder(
            name = "UserCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF0F172A)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(17.9815f, 18.7248f)
                curveTo(16.6121f, 16.9175f, 14.4424f, 15.75f, 12f, 15.75f)
                curveTo(9.5576f, 15.75f, 7.3879f, 16.9175f, 6.0185f, 18.7248f)
                moveTo(17.9815f, 18.7248f)
                curveTo(19.8335f, 17.0763f, 21f, 14.6744f, 21f, 12f)
                curveTo(21f, 7.0294f, 16.9706f, 3f, 12f, 3f)
                curveTo(7.0294f, 3f, 3f, 7.0294f, 3f, 12f)
                curveTo(3f, 14.6744f, 4.1665f, 17.0763f, 6.0185f, 18.7248f)
                moveTo(17.9815f, 18.7248f)
                curveTo(16.3915f, 20.1401f, 14.2962f, 21f, 12f, 21f)
                curveTo(9.7038f, 21f, 7.6085f, 20.1401f, 6.0185f, 18.7248f)
                moveTo(15f, 9.75f)
                curveTo(15f, 11.4069f, 13.6569f, 12.75f, 12f, 12.75f)
                curveTo(10.3431f, 12.75f, 9f, 11.4069f, 9f, 9.75f)
                curveTo(9f, 8.0931f, 10.3431f, 6.75f, 12f, 6.75f)
                curveTo(13.6569f, 6.75f, 15f, 8.0931f, 15f, 9.75f)

                close()
            }
        }.build()
        return _UserCircle!!
    }

private var _UserCircle: ImageVector? = null



public val Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Logout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, -160f)
                lineToRelative(-55f, -58f)
                lineToRelative(102f, -102f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(585f, 338f)
                lineToRelative(55f, -58f)
                lineToRelative(200f, 200f)
                close()
            }
        }.build()
        return _Logout!!
    }

private var _Logout: ImageVector? = null




public val StarFull: ImageVector
    get() {
        if (_StarFull != null) {
            return _StarFull!!
        }
        _StarFull = ImageVector.Builder(
            name = "StarFull",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.595f, 6.252f)
                lineTo(8f, 1f)
                lineTo(6.405f, 6.252f)
                horizontalLineTo(1f)
                lineToRelative(4.373f, 3.4f)
                lineTo(3.75f, 15f)
                lineTo(8f, 11.695f)
                lineTo(12.25f, 15f)
                lineToRelative(-1.623f, -5.348f)
                lineTo(15f, 6.252f)
                horizontalLineTo(9.595f)
                close()
            }
        }.build()
        return _StarFull!!
    }

private var _StarFull: ImageVector? = null


