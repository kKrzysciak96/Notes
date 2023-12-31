package com.eltescode.notes.features.note.presentation.notes.comopnents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.eltescode.notes.features.note.domain.model.NoteDomain

@Composable
fun NoteItem(
    note: NoteDomain,
    modifier: Modifier = Modifier,
    cornerRadius: Dp = 16.dp,
    onDeleteClick: () -> Unit
) {
    Box(
        modifier = modifier.background(
            shape = RoundedCornerShape(
                topStart = cornerRadius,
                bottomEnd = cornerRadius
            ), color = Color(note.color)
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(end = 32.dp)
        ) {
            Text(
                text = note.title,
                style = MaterialTheme.typography.h6,
                color = MaterialTheme.colors.onSurface,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = note.content,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface,
                maxLines = 10,
                overflow = TextOverflow.Ellipsis
            )
        }
        IconButton(
            onClick = onDeleteClick,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(8.dp)
        ) {
            Icon(imageVector = Icons.Default.Delete, contentDescription = null)
        }
    }
}