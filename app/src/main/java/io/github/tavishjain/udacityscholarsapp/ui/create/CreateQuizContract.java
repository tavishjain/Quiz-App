package io.github.tavishjain.udacityscholarsapp.ui.create;

import io.github.tavishjain.udacityscholarsapp.ui.BasePresenter;
import io.github.tavishjain.udacityscholarsapp.ui.BaseView;

/**
 * Create Quiz Contract. Keeps Create Quiz View and Presenter interfaces in one place.
 */
public interface CreateQuizContract {

    /**
     * Create Quiz view
     */
    interface View extends BaseView<Presenter> {

    }

    /**
     * Create Quiz presenter
     */
    interface Presenter extends BasePresenter {

    }

}
