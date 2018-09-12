package com.deonico.footballclub2gdk_fight

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.match_detail.*
import kotlinx.android.synthetic.main.match_list.view.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlin.coroutines.experimental.coroutineContext

class MainAdapter(private val context: Context, private val events: List<Event>, private val listener: (Event) -> Unit) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.match_list, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return events.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(events[position], listener)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(event: Event, listener: (Event) -> Unit) {
            itemView.dateMatch.text = event.eventDate
            itemView.homeTeam.text = event.strHomeTeam
            itemView.homeScore.text = event.intHomeScore
            itemView.awayTeam.text = event.strAwayTeam
            itemView.awayScore.text = event.intAwayScore
            Glide.with(itemView.context).load(event.strHomeTeam).into(itemView.homeLogo)
            itemView.setOnClickListener {
                listener(event)
            }
        }
    }
}