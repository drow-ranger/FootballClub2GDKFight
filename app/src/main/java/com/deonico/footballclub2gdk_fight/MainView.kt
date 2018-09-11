package com.deonico.footballclub2gdk_fight

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showLeagueList(leagues: List<League>)
    fun showTeamList(teams: List<Team>)
    fun showMatchList(events: List<Event>)
}