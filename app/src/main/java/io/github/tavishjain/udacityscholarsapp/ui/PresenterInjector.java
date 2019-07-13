package io.github.tavishjain.udacityscholarsapp.ui;

import io.github.tavishjain.udacityscholarsapp.ui.discussion.QuizDiscussionContract;
import io.github.tavishjain.udacityscholarsapp.ui.discussion.QuizDiscussionPresenter;
import io.github.tavishjain.udacityscholarsapp.ui.home.HomeContract;
import io.github.tavishjain.udacityscholarsapp.ui.home.HomePresenter;
import io.github.tavishjain.udacityscholarsapp.ui.profile.ProfileContract;
import io.github.tavishjain.udacityscholarsapp.ui.profile.ProfilePresenter;
import io.github.tavishjain.udacityscholarsapp.ui.quizattempt.AttemptQuizContract;
import io.github.tavishjain.udacityscholarsapp.ui.quizattempt.AttemptQuizPresenter;
import io.github.tavishjain.udacityscholarsapp.ui.signin.SignInContract;
import io.github.tavishjain.udacityscholarsapp.ui.signin.SignInPresenter;

/**
 * Encapsulates creation of all Presenters
 */
public class PresenterInjector {

    public static void injectSignInPresenter(SignInContract.View signInView) {
        new SignInPresenter(signInView);
    }

    public static void injectProfilePresenter(ProfileContract.View profileView) {
        new ProfilePresenter(profileView);
    }

    public static void injectHomePresenter(HomeContract.View homeView) {
        new HomePresenter(homeView);
    }

    public static void injectQuizDiscussionPresenter(QuizDiscussionContract.View quizDiscussionView) {
        new QuizDiscussionPresenter(quizDiscussionView);
    }

    public static void injectQuizAttemptPresenter(AttemptQuizContract.View attemptQuizView) {
        new AttemptQuizPresenter(attemptQuizView);

    }
}
