package com.lihang.dagger2stu.study.mforandroid;


import android.app.Application;

import com.lihang.dagger2stu.MyApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;


/**
 * Created by leo
 * on 2019/8/30.
 */

@Component(modules = {
        AndroidSupportInjectionModule.class,
        NeedInjectModules.class,
})

public interface AppComponent extends AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

}
