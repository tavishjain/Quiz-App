package io.github.tavishjain.udacityscholarsapp.ui.discussion;


import io.github.tavishjain.udacityscholarsapp.data.models.Comment;
import io.github.tavishjain.udacityscholarsapp.ui.BasePresenter;
import io.github.tavishjain.udacityscholarsapp.ui.BaseView;

import java.util.List;

/**
 * Discussion screen contract. Keeps Discussion Screen View and Presenter interfaces in one place.
 */
public interface QuizDiscussionContract {

    String KEY_QUIZ_ID = "quiz_id";

    /**
     * Discussion View
     */
    interface View extends BaseView<QuizDiscussionContract.Presenter> {
        void loadComments(List<Comment> discussions);

        void onCommentsLoadError();

        void loadComment(Comment comment);

        void showInvalidInput();
    }

    /**
     * Discussion Presenter
     */
    interface Presenter extends BasePresenter {
        void onClickedSendComment(String comment);
    }
}