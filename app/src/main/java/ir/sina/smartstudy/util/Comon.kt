package ir.sina.smartstudy.util

import androidx.compose.ui.graphics.Color

enum class Priority(val title: String, val color: Color, val value: Int) {
    LOW("Low", Color.Green, 0),
    MEDIUM("Medium", Color.Yellow, 1),
    HIGH("High", Color.Red, 2);

    companion object {
        fun fromInt(value: Int) = entries.firstOrNull { it.value == value } ?: MEDIUM
    }
}