package com.sqisland.android.test_demo;

import org.joda.time.DateTime;

import javax.inject.Singleton;

@Singleton
public class Clock {
  // clock
  // yalive commit
  //hr
  public DateTime getNow() {
    return new DateTime();
  }
}