/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

#import "ComRiksofTiAdwhirlAdView.h"

#import "TiUtils.h"
#import "TiApp.h"

@implementation ComRiksofTiAdwhirlAdView

-(void)dealloc
{
	if ( adWhirlView != nil ) {
		adWhirlView.delegate = nil;
		[adWhirlView removeFromSuperview];
		RELEASE_TO_NIL(adWhirlView);
	}
	
	[super dealloc];
}

-(UIView*)adWhirlView
{
	if (adWhirlView==nil)
	{
		adWhirlView = [[AdWhirlView requestAdWhirlViewWithDelegate:self] retain];
		[self addSubview:adWhirlView];
	}
	return adWhirlView;
}

-(void)frameSizeChanged:(CGRect)frame bounds:(CGRect)bounds
{
	if (adWhirlView!=nil)
	{
		[TiUtils setView:adWhirlView positionRect:bounds];
	}
}

-(UIDeviceOrientation) adWhirlCurrentOrientation {
	NSLog(@"[INFO] Device orientation to be passed to adhwirl %u", currentOrientation);
	if ( currentOrientation ) {
		return currentOrientation;
	} else {
		return [UIDevice currentDevice].orientation;
	}
}

-(void)setCurrentOrientation_:(id)orientation {	
	currentOrientation = [TiUtils intValue:orientation];

	NSLog(@"[INFO] Fixed orientation set to %u", UIDeviceOrientationPortrait);
}

- (UIDeviceOrientation)currentOrientation {
	return currentOrientation;
}

-(void)setApplicationKey_:(id)key {	
	applicationKey = [TiUtils stringValue:key];
	UIView *s = [self adWhirlView];
}

- (NSString *)adWhirlApplicationKey {
	return applicationKey;
}

- (UIViewController *)viewControllerForPresentingModalView {
	return [[TiApp app] controller];
}



@end
