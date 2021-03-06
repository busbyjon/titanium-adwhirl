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
 
// open a single window
var window = Ti.UI.createWindow({
	backgroundColor:'white'
});

var label = Ti.UI.createLabel();
label.text = "Hello World";
window.add(label);

// Add a parent view at the top to hold the ad.
var view = Titanium.UI.createView({
   width:'320dp',
   height:'50dp',
   top: 0,
   left: 0,
   backgroundColor: 'black'
});

// Add the view and open the window.
window.add(view);
window.open();

// Setup the ad on the created view.
var adwhirl = require('com.riksof.ti.adwhirl');
Ti.API.info("module is => " + adwhirl);

// Please replace with your application key.
var adView = adwhirl.createAdView({
	"applicationKey":""
});
view.add(adView);
