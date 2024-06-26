package com.cydeo.repository;

import com.cydeo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public interface DBCommentRepository implements CommentRepository{

    @Override
    public default void storeComment(Comment comment) {
        System.out.println("Storing comment:" + comment.getText());
    }
}
