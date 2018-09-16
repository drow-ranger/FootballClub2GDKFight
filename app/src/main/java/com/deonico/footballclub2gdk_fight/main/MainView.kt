package com.deonico.footballclub2gdk_fight.main

import com.deonico.footballclub2gdk_fight.model.Event
import com.deonico.footballclub2gdk_fight.model.League
import com.deonico.footballclub2gdk_fight.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showLeagueList(leagues: List<League>)
    fun showTeamList(teams: List<Team>)
    fun showMatchList(events: List<Event>)
}