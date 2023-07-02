package com.reem.taskscompose.data.models

import androidx.compose.ui.graphics.Color
import com.reem.taskscompose.ui.theme.HighPriorityColor
import com.reem.taskscompose.ui.theme.LowPriorityColor
import com.reem.taskscompose.ui.theme.MediumPriorityColor
import com.reem.taskscompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}