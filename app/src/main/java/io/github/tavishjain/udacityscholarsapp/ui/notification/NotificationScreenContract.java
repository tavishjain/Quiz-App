package io.github.tavishjain.udacityscholarsapp.ui.notification;

import io.github.tavishjain.udacityscholarsapp.ui.BasePresenter;
import io.github.tavishjain.udacityscholarsapp.ui.BaseView;

/**
 * Notification screen contract. Keeps Notification View and Presenter interfaces in one place.
 */
public interface NotificationScreenContract {

    /**
     * Notification Screen view
     */
    interface View extends BaseView<Presenter> {

    }

    /**
     * Notification Screen presenter
     */
    interface Presenter extends BasePresenter {

    }

}
