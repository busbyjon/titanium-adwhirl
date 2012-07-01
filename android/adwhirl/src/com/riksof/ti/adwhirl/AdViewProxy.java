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

import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.util.Log;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;

/**
 * This proxy can be created by calling Adwhirl.createAdView()
 * We only have the applicationKey as the current property.
 */
@Kroll.proxy(creatableInModule=AdwhirlModule.class, propertyAccessors = {
	"applicationKey"
})
public class AdViewProxy extends TiViewProxy {
	
	// Standard Debugging variables
	private static final String LCAT = "AdViewProxy";

	/**
	 * Constructor.
	 * 
	 * @param tiContext
	 */
	public AdViewProxy(TiContext tiContext) {
		super(tiContext);
		Log.d(LCAT, "AdView Proxy Constructor");
	}

	/**
	 * Instantiate the AdView and return it.
	 */
	@Override
	public TiUIView createView(Activity activity) {
		Log.d(LCAT, "Creating AdView!");
		return new AdView(this, activity);
	}
}
