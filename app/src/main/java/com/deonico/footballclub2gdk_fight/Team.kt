package com.deonico.footballclub2gdk_fight

import com.google.gson.annotations.SerializedName

data class Team(
        @SerializedName("idTeam")
        val teamMain: String? = null,

        @SerializedName("strTeam")
        val teamNameMain: String? = null,

        @SerializedName("strTeamBadge")
        val teamLogo: String? = null
)

data class TeamResponse(val teams: List<Team>)