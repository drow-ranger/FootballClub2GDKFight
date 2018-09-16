package com.deonico.footballclub2gdk_fight.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class Event(
        @SerializedName("idEvent")
        val eventId: String? = null,

        @SerializedName("idHomeTeam")
        val homeTeamId: String? = null,

        @SerializedName("idAwayTeam")
        val awayTeamId: String? = null,

        @SerializedName("dateEvent")
        val eventDate: String? = null,

        @SerializedName("strDate")
        val strDate: String? = null,

        @SerializedName("strTime")
        val strTime: String? = null,


        @SerializedName("intHomeScore")
        val intHomeScore: String? = null,

        @SerializedName("strHomeYellowCards")
        val strHomeYellowCards: String? = null,

        @SerializedName("strHomeRedCards")
        val strHomeRedCards: String? = null,

        @SerializedName("strHomeGoalDetails")
        val strHomeGoal: String? = null,

        @SerializedName("intHomeShots")
        val intHomeShot: Any? = null,

        @SerializedName("strHomeTeam")
        val strHomeTeam: String? = null,

        @SerializedName("strHomeFormation")
        val strHomeFormation: String? = null,

        @SerializedName("strHomeLineupGoalkeeper")
        val strHomeGoalkeeper: String? = null,

        @SerializedName("strHomeLineupDefense")
        val strHomeDefense: String? = null,

        @SerializedName("strHomeLineupMidfield")
        val strHomeMidfield: String? = null,

        @SerializedName("strHomeLineupForward")
        val strHomeForward: String? = null,

        @SerializedName("strHomeLineupSubstitutes")
        val strHomeSubstitutes: String? = null,


        @SerializedName("intAwayScore")
        val intAwayScore: String? = null,

        @SerializedName("strAwayYellowCards")
        val strAwayYellowCards: String? = null,

        @SerializedName("strAwayRedCards")
        val strAwayRedCards: String? = null,

        @SerializedName("strAwayGoalDetails")
        val strAwayGoal: String? = null,

        @SerializedName("intAwayShots")
        val intAwayShot: Any? = null,

        @SerializedName("strAwayTeam")
        val strAwayTeam: String? = null,

        @SerializedName("strAwayFormation")
        val strAwayFormation: String? = null,

        @SerializedName("strAwayLineupGoalkeeper")
        val strAwayGoalkeeper: String? = null,

        @SerializedName("strAwayLineupDefense")
        val strAwayDefense: String? = null,

        @SerializedName("strAwayLineupMidfield")
        val strAwayMidfield: String? = null,

        @SerializedName("strAwayLineupForward")
        val strAwayForward: String? = null,

        @SerializedName("strAwayLineupSubstitutes")
        val strAwaySubstitutes: String? = null

) : Serializable

data class EventResponse(val events: List<Event>)