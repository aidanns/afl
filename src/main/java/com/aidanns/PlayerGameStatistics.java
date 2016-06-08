/*
 * Copyright 2016 Aidan Nagorcka-Smith. All rights reserved.
 */

package com.aidanns;

import org.immutables.value.Value;

/**
 * @author Aidan Nagorcka-Smith (aidanns@gmail.com)
 */
@Value.Immutable
public interface PlayerGameStatistics {

    int getDisposals();
    int getKicks();
    int getMarks();
    int getHandballs();
    int getGoals();
    int getBehinds();
    int getHitOuts();
    int getTackles();
    int getReboundFifty();
    int getInsideFifty();
    int getClearances();
    int getClangers();
    int getFreeKicksFor();
    int getFreeKicksAgainst();
    int getBrownlowVotes();
    int getContestedPossessions();
    int getUncontestedPossessions();
    int getContestedMarks();
    int getMarksInsideFifty();
    int getOnePercenters();
    int getBounces();
    int getGoalAssists();
    double getPercentagePlayed();
    boolean getSubbedOn();
    boolean getSubbedOff();
}
