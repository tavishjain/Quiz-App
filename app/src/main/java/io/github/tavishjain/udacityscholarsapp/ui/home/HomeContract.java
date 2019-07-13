package io.github.tavishjain.udacityscholarsapp.ui.home;

import io.github.tavishjain.udacityscholarsapp.data.models.Quiz;
import io.github.tavishjain.udacityscholarsapp.ui.BasePresenter;
import io.github.tavishjain.udacityscholarsapp.ui.BaseView;

import java.util.List;

/**
 * Home screen contract. Keeps Home Screen View and Presenter interfaces in one place.
 */
public interface HomeContract {

    int NAVIGATION_SCOREBOARD = 0;
    int NAVIGATION_CREATE_QUIZ = 1;
    int NAVIGATION_NOTIFICATIONS = 2;
    int NAVIGATION_RESOURCES = 3;
    int NAVIGATION_SETTINGS = 4;
    int NAVIGATION_ABOUT = 5;
    int NAVIGATION_EDIT_PROFILE = 6;
    String BOOKMARKED_QUIZZES = "bookmarked-quizzes";
    String ATTEMPTED_QUIZZES = "attempted-quizzes";
    String UNATTEMPTED_QUIZZES = "un-attempted-quizzes";

    /**
     * Home View
     */
    interface View extends BaseView<Presenter> {
        void loadQuizzes(List<Quiz> quizzes);

        void onQuizLoadError();

        void loadUserImageInDrawer(String imageUrl);

        void loadUserNameInDrawer(String username);

        void loadSlackHandleInDrawer(String slackHandle);

        void navigateToQuizDesc(Quiz quiz);

        void navigateToScoreboard();

        void navigateToCreateQuiz();

        void navigateToNotifications();

        void navigateToResources();

        void navigateToSettings();

        void navigateToAboutScreen();

        void navigateToEditProfile();

        void navigateToQuizDiscussion(String quizId);

        void navigateToQuizDetails(String quizId);

        void handleEmptyView(String selectedFilter);
    }

    /**
     * Home Presenter
     */
    interface Presenter extends BasePresenter {
        void onQuizClicked(Quiz quiz);

        void onNavigationItemSelected(int navItemSpecifier);

        void onLogoutClicked();

        void onAllQuizSelected();

        void onAttemptedQuizSelected();

        void onUnAttemptedQuizSelected();

        void onBookmarkSelected();

        void onBookmarkStatusChange(Quiz quiz);
    }

}
