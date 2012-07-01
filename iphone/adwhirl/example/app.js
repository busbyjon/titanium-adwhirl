// This is a test harness for your module
// You should do something interesting in this harness 
// to test out the module and to provide instructions 
// to users on how to use it by example.


// open a single window
var window = Ti.UI.createWindow({
	backgroundColor:'white'
});
var label = Ti.UI.createLabel();
window.add(label);
window.open();

// TODO: write your module tests here
var adwhirl = require('com.riksof.ti.adwhirl');
Ti.API.info("module is => " + adwhirl);

label.text = adwhirl.example();

Ti.API.info("module exampleProp is => " + adwhirl.exampleProp);
adwhirl.exampleProp = "This is a test value";

if (Ti.Platform.name == "android") {
	var proxy = adwhirl.createExample({message: "Creating an example Proxy"});
	proxy.printMessage("Hello world!");
}