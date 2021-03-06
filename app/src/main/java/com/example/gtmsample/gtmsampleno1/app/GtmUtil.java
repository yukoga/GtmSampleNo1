/*
 * Copyright 2014. yukoga@gmail.com. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.gtmsample.gtmsampleno1.app;

import android.content.Context;

import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.gms.tagmanager.TagManager;


public class GtmUtil {
    // constructor
    private GtmUtil() {}
    // push openScreen event.
    public static void pushOpenScreenEvent(Context context, String screenName) {
        TagManager tagManager = TagManager.getInstance(context);
        DataLayer dataLayer = tagManager.getDataLayer();
        dataLayer.pushEvent("openScreen", DataLayer.mapOf("screenName", screenName));
    }

    // push custom event.
    public static void pushCustomEvent(Context context, String eventCategory, String eventAction, String eventLabel, Long eventValue) {
        TagManager tagManager = TagManager.getInstance(context);
        DataLayer dataLayer = tagManager.getDataLayer();
        dataLayer.push(DataLayer.mapOf("eventCategory", eventCategory, "eventAction", eventAction, "eventLabel", eventLabel, "eventValue", eventValue));
        tagManager.dispatch();

    }

    // push a closeScreen event.
//    public static void pushCloseScreenEvent(Context context, String screenName) {
//        DataLayer dataLayer = TagManager.getInstance(context).getDataLayer();
//        dataLayer.pushEvent("closeScreen", DataLayer.mapOf("screenName", screenName));
//    }
}
