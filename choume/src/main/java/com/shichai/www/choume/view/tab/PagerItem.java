/**
 * Copyright (C) 2015 ogaclejapan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.shichai.www.choume.view.tab;

public abstract class PagerItem {

    protected static final float DEFAULT_WIDTH = 1.f;

    private final CharSequence mTitle;
    private final float mWidth;

    protected PagerItem(CharSequence title, float width) {
        mTitle = title;
        mWidth = width;
    }

    public CharSequence getTitle() {
        return mTitle;
    }

    public float getWidth() {
        return mWidth;
    }

}
