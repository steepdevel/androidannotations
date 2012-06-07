/**
 * Copyright (C) 2010-2012 eBusiness Information, Excilys Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.androidannotations.test15;

import static org.fest.assertions.Assertions.assertThat;
import android.os.Build;
import android.view.KeyEvent;

//@RunWith(AndroidAnnotationsTestRunner.class)
public class BackpressedActivityTestSkipped {

	/**
	 * Test skipped because {@link Build.VERSION#RELEASE} is set to null in
	 * robolectric
	 */
	// @Test
	public void backKeyHandled() {

		BackpressedActivity_ activity = new BackpressedActivity_();
		activity.onCreate(null);

		assertThat(activity.backPressed).isFalse();

		activity.onKeyDown(KeyEvent.KEYCODE_BACK, new KeyEvent(null));

		assertThat(activity.backPressed).isTrue();

	}

}
