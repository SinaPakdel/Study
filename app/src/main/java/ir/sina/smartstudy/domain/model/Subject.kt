package ir.sina.smartstudy.domain.model

import androidx.compose.ui.graphics.Color
import ir.sina.smartstudy.presentation.theme.gradient1
import ir.sina.smartstudy.presentation.theme.gradient2
import ir.sina.smartstudy.presentation.theme.gradient3
import ir.sina.smartstudy.presentation.theme.gradient4
import ir.sina.smartstudy.presentation.theme.gradient5

data class Subject(
    val name: String,
    val goalHours: Float,
    val colors: List<Color>
) {
    companion object {
        val subjectCardColors = listOf(gradient1, gradient2, gradient3, gradient4, gradient5)
    }
}