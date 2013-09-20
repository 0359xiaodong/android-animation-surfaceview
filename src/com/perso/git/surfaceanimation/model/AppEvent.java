package com.perso.git.surfaceanimation.model;

import com.perso.git.surfaceanimation.engine.GameClock;

/**
 * Parent of all apps events.
 * @author cedric
 *
 */
public class AppEvent {
	public long eventTime;
	public AppEvent() {
		eventTime = GameClock.getInstance().getCurrentMilli();
	}
}