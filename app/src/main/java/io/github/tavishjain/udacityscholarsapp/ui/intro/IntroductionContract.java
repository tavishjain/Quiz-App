package io.github.tavishjain.udacityscholarsapp.ui.intro;

import io.github.tavishjain.udacityscholarsapp.ui.BasePresenter;
import io.github.tavishjain.udacityscholarsapp.ui.BaseView;

/**
 * Introduction screen contract. Keeps Introduction View and Presenter interfaces in one place.
 */
public interface IntroductionContract {

    /**
     * Introduction view
     */
    interface View extends BaseView<Presenter> {

    }

    /**
     * Introduction presenter
     */
    interface Presenter extends BasePresenter {

    }

}
