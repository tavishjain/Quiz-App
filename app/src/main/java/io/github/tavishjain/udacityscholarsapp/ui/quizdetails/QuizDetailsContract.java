package io.github.tavishjain.udacityscholarsapp.ui.quizdetails;

import io.github.tavishjain.udacityscholarsapp.ui.BasePresenter;
import io.github.tavishjain.udacityscholarsapp.ui.BaseView;

public interface QuizDetailsContract {

    /**
     * Quiz Details View
     */
    interface View extends BaseView<Presenter> {

        void enableStartButton(boolean isAttempted);

        void showTitle(String quizTitle);

        void showAuthor(String quizAuthor);

        void showReleaseDate(String releaseDate);

        void showDeadline(String quizDeadline);

        void showDescription(String quizDescription);

        void showUserScore(String scoreOutOfMaxMarks);

        void navigateToDiscussion();

        void dismissView();

    }

    /**
     * Quiz Details Presenter
     */
    interface Presenter extends BasePresenter {
        void onDiscussionClicked();

        void startQuizClicked();
    }

}
