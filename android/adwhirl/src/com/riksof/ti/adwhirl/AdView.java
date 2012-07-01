/**
 * Copyright (c) 2012, RIKSOF (Private) Limited
 *
 * This file is part of com.riksof.ti.adwhirl module.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.riksof.ti.adwhirl;

import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.util.Log;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;

import com.adwhirl.AdWhirlLayout;
import com.adwhirl.AdWhirlLayout.AdWhirlInterface;

/**
 * This class actually instantiates the AdWhirl view to be displayed.
 */
public class AdView extends TiUIView {

	// Standard Debugging variables
	private static final String LCAT = "AdView";
		
	/**
	 * This constructor is required. We do not really use it, as
	 * we need the other constructor with Activity.
	 * 
	 * @param proxy
	 */
	public AdView(final TiViewProxy proxy) {
		super(proxy);
		Log.d(LCAT, "AdView Constructor");
		Log.d(LCAT, "AdWhirl Key: " + (String)proxy.getProperty("applicationKey"));
	}
	
	/**
	 * Set up the AdWhirlLayout and add it to the parent view.
	 * 
	 * @param proxy
	 * @param activity
	 */
	public AdView(final TiViewProxy proxy, Activity activity) {
		this(proxy);
		
		// Create the new adview.
		AdWhirlLayout adWhirlLayout = new AdWhirlLayout(activity, 
						(String)proxy.getProperty("applicationKey"));
		
		// Add it to the native view.
		setNativeView(adWhirlLayout);
	}
}
