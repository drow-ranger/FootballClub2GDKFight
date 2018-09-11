package com.deonico.footballclub2gdk_fight

import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class DetailPresenter(val view: DetailView) {

    val repository = ApiRepository()
    val gson = Gson()

    fun getTeamBadge(teamName: String?) {
        doAsync {
            val team: List<Team> = gson.fromJson(repository.doRequest(TheSportDBApi.getSpecificTeam(teamName)),
                    TeamResponse::class.java).teams

            uiThread {
                team?.let { view.showTeamLogo(it[0]) }
            }
        }
    }

}