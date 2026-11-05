package com.loomverse.app.data.repository

import com.loomverse.app.data.model.Comment
import com.loomverse.app.data.model.UserProfile

interface CommentRepository {
    fun addComment(charId: String, user: UserProfile, text: String, onResult: (Boolean) -> Unit)
    fun getComments(charId: String, onResult: (List<Comment>) -> Unit)
}
