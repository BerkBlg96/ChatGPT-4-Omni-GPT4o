package com.scut.itpm.umo.core.Main.NavBar;

import com.scut.itpm.umo.BasePresenter;
import com.scut.itpm.umo.BaseView;

/**
 * Created by DELL on 2016/11/2.
 */

public interface NavBarContract {
    interface View extends BaseView {
        void setCurrentTitle(String titleTobe);

    }

    interface Presenter extends BasePresenter {
        void setCurrentTitle(String currTitle);
        void informMapFragmentShouldShow();
        void informFeelingFragmentShouldShow();
        void informRequirementFragmentShouldShow();
    }

}
